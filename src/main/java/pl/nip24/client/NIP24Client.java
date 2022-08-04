/**
 * Copyright 2015-2022 NETCAT (www.netcat.pl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author NETCAT <firma@netcat.pl>
 * @copyright 2015-2022 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * Klient serwisu NIP24
 * @author robert
 */
public class NIP24Client {
	
	public final static String VERSION = "1.3.7";

	public final static String PRODUCTION_URL = "https://www.nip24.pl/api";
	public final static String TEST_URL = "https://www.nip24.pl/api-test";
	
	public final static String TEST_ID = "test_id";
	public final static String TEST_KEY = "test_key";

	private final static String HMAC_ALG = "HmacSHA256";
	
	private DocumentBuilderFactory dbf;
	private XPathFactory xpf;
	private XPath xp;

	private SSLSocketFactory ssf;
	private HostnameVerifier hv;
	private SecureRandom sr;
	private WebProxy wp;

	private URL url;
	private String id;
	private String key;
	
	private String err;
	private int errcode;

	/**
	 * Tworzy nowy obiekt klienta
	 * @param url adres URL serwisu NIP24
	 * @param id identyfikator klucza klienta serwisu
	 * @param key klucz klienta serwisu
	 */
	public NIP24Client(URL url, String id, String key)
	{
		this.url = url;
		this.id = id;
		this.key = key;
		
		try {
			this.dbf = DocumentBuilderFactory.newInstance();
			this.dbf.setNamespaceAware(true);

			xpf = XPathFactory.newInstance();
			xp = xpf.newXPath();

			this.sr = SecureRandom.getInstance("SHA1PRNG");
			
			String seed = (System.getProperties().toString() + new Date().toString() + this.hashCode()
				+ url + id + key);
			
			this.sr.setSeed(seed.getBytes());
		}
		catch (NoSuchAlgorithmException ignored) {
		}
	}
	
	/**
	 * Tworzy nowy obiekt klienta serwisu produkcyjnego
	 * @param id identyfikator klucza klienta serwisu
	 * @param key klucz klienta serwisu
	 */
	public NIP24Client(String id, String key)
		throws MalformedURLException
	{
		this(new URL(PRODUCTION_URL), id, key);
	}
	
	/**
	 * Tworzy nowy obiekt klienta serwisu testowego
	 */
	public NIP24Client()
		throws MalformedURLException
	{
		this(new URL(TEST_URL), TEST_ID, TEST_KEY);
	}

	/**
	 * Ustawia alternatywny adres API serwisu
	 * @param url adres URL serwisu NIP24
	 */
	public void setURL(URL url)
	{
		this.url = url;
	}
	
	/**
	 * Ustawia obiekt fabryki SSL do nawiązywania połączenia SSL
	 * @param ssf obiekt fabryki SSL
	 */
	public void setSSLSocketFactory(SSLSocketFactory ssf)
	{
		this.ssf = ssf;
	}
	
	/**
	 * Ustawia obiekt weryfikujący nazwę serwera
	 * @param hv obiekt weryfikatora
	 */
	public void setHostnameVerifier(HostnameVerifier hv)
	{
		this.hv = hv;
	}

	/**
	 * Ustawia obiekt proxy
	 * @param wp obiekt proxy
	 */
	public void setWebProxy(WebProxy wp)
	{
		this.wp = wp;
	}
	
	/**
	 * Sprawdzenie czy firma prowadzi aktywną działalność
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return true jeżeli firma prowadzi aktywną działalność, false jeżeli firma zakończyła działalność
	 */
	public boolean isActive(Number type, String number)
	{
		try {
			// clear error
			clear();
			
	        // validate number and construct path
			String suffix = null;
			
	        if ((suffix = getPathSuffix(type, number)) == null) {
	            return false;
	        }
			
			// prepare url
			String url = (this.url.toString() + "/check/firm/" + suffix);
			
			// prepare request
			byte[] b = get(url);
			
			if (b == null) {
				set(Error.CLI_CONNECT);
				return false;
			}
			
			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));
			
			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return false;
			}
			
			String code = getString(doc, "/result/error/code", null);
			
			if (code != null) {
				if (code.equals("9")) {
					// not active
					clear();
					return false;
				}
				else {
					set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
					return false;
				}
			}
			
			// active
			return true;
		}
		catch (Exception ignored) {
		}
		
		return false;
	}

	/**
	 * Sprawdzenie czy firma prowadzi aktywną działalność
	 * @param nip numer NIP
	 * @return true jeżeli firma prowadzi aktywną działalność, false jeżeli firma zakończyła działalność
	 */
	public boolean isActive(String nip)
	{
		return isActive(Number.NIP, nip);
	}
	
	/**
	 * Pobranie podstawowych danych firmy do faktury
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getInvoiceData(Number, String)}
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param force parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return dane firmy lub null w przypadku błędu
	 */
	public InvoiceData getInvoiceData(Number type, String number, boolean force)
	{
		return getInvoiceData(type, number);
	}
	
	/**
	 * Pobranie podstawowych danych firmy do faktury
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return dane firmy lub null w przypadku błędu
	 */
	public InvoiceData getInvoiceData(Number type, String number)
	{
		try {
			// clear error
			clear();

			// validate number and construct path
			String suffix = null;

			if ((suffix = getPathSuffix(type, number)) == null) {
				return null;
			}

			// prepare url
			String url = (this.url.toString() + "/get/invoice/" + suffix);

			// prepare request
			byte[] b = get(url);

			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}

			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));

			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}

			String code = getString(doc, "/result/error/code", null);

			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			InvoiceData id = new InvoiceData();

			id.setUID(getString(doc, "/result/firm/uid", null));
			id.setNIP(getString(doc, "/result/firm/nip", null));

			id.setName(getString(doc, "/result/firm/name", null));
			id.setFirstName(getString(doc, "/result/firm/firstname", null));
			id.setLastName(getString(doc, "/result/firm/lastname", null));

			id.setStreet(getString(doc, "/result/firm/street", null));
			id.setStreetNumber(getString(doc, "/result/firm/streetNumber", null));
			id.setHouseNumber(getString(doc, "/result/firm/houseNumber", null));
			id.setCity(getString(doc, "/result/firm/city", null));
			id.setPostCode(getString(doc, "/result/firm/postCode", null));
			id.setPostCity(getString(doc, "/result/firm/postCity", null));

			id.setPhone(getString(doc, "/result/firm/phone", null));
			id.setEmail(getString(doc, "/result/firm/email", null));
			id.setWWW(getString(doc, "/result/firm/www", null));

			return id;
		}
		catch (Exception ignored) {
		}

		return null;
	}
	
	/**
	 * Pobranie podstawowych danych firmy do faktury
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getInvoiceData(String)}
	 * @param nip numer NIP
	 * @param force parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return dane firmy lub null w przypadku błędu
	 */
	public InvoiceData getInvoiceData(String nip, boolean force)
	{
		return getInvoiceData(Number.NIP, nip);
	}
	
	/**
	 * Pobranie danych firmy na podstawie podanego numeru NIP
	 * @param nip numer NIP
	 * @return dane firmy lub null w przypadku błędu
	 */
	public InvoiceData getInvoiceData(String nip)
	{
		return getInvoiceData(Number.NIP, nip);
	}

	/**
	 * Pobranie szczegółowych danych firmy
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getAllData(Number, String)}
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param force parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return dane firmy lub null w przypadku błędu
	 */
	public AllData getAllData(Number type, String number, boolean force)
	{
		return getAllData(type, number);
	}

	/**
	 * Pobranie szczegółowych danych firmy
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return dane firmy lub null w przypadku błędu
	 */
	public AllData getAllData(Number type, String number)
	{
		try {
			// clear error
			clear();
			
	        // validate number and construct path
			String suffix = null;
			
	        if ((suffix = getPathSuffix(type, number)) == null) {
	            return null;
	        }
			
			// prepare url
			String url = (this.url.toString() + "/get/all/" + suffix);
			
			// prepare request
			byte[] b = get(url);
			
			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}
			
			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));
			
			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}
			
			String code = getString(doc, "/result/error/code", null);
			
			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			AllData ad = new AllData();
			
			ad.setUID(getString(doc, "/result/firm/uid", null));
			ad.setType(getString(doc, "/result/firm/type", null));
			ad.setNIP(getString(doc, "/result/firm/nip", null));
			ad.setREGON(getString(doc, "/result/firm/regon", null));
			
			ad.setName(getString(doc, "/result/firm/name", null));
			ad.setShortName(getString(doc, "/result/firm/shortname", null));
			ad.setFirstName(getString(doc, "/result/firm/firstname", null));
			ad.setSecondName(getString(doc, "/result/firm/secondname", null));
			ad.setLastName(getString(doc, "/result/firm/lastname", null));

			ad.setStreet(getString(doc, "/result/firm/street", null));
			ad.setStreetCode(getString(doc, "/result/firm/streetCode", null));
			ad.setStreetNumber(getString(doc, "/result/firm/streetNumber", null));
			ad.setHouseNumber(getString(doc, "/result/firm/houseNumber", null));
			ad.setCity(getString(doc, "/result/firm/city", null));
			ad.setCityCode(getString(doc, "/result/firm/cityCode", null));
			ad.setCommunity(getString(doc, "/result/firm/community", null));
			ad.setCommunityCode(getString(doc, "/result/firm/communityCode", null));
			ad.setCounty(getString(doc, "/result/firm/county", null));
			ad.setCountyCode(getString(doc, "/result/firm/countyCode", null));
			ad.setState(getString(doc, "/result/firm/state", null));
			ad.setStateCode(getString(doc, "/result/firm/stateCode", null));
			ad.setPostCode(getString(doc, "/result/firm/postCode", null));
			ad.setPostCity(getString(doc, "/result/firm/postCity", null));
			
			ad.setPhone(getString(doc, "/result/firm/phone", null));
			ad.setEmail(getString(doc, "/result/firm/email", null));
			ad.setWWW(getString(doc, "/result/firm/www", null));
			
			ad.setCreationDate(getDateTime(doc, "/result/firm/creationDate"));
			ad.setStartDate(getDateTime(doc, "/result/firm/startDate"));
			ad.setRegistrationDate(getDateTime(doc, "/result/firm/registrationDate"));
			ad.setHoldDate(getDateTime(doc, "/result/firm/holdDate"));
			ad.setRenevalDate(getDateTime(doc, "/result/firm/renevalDate"));
			ad.setLastUpdateDate(getDateTime(doc, "/result/firm/lastUpdateDate"));
			ad.setEndDate(getDateTime(doc, "/result/firm/endDate"));
			
			ad.setRegistryEntityCode(getString(doc, "/result/firm/registryEntity/code", null));
			ad.setRegistryEntityName(getString(doc, "/result/firm/registryEntity/name", null));
			
			ad.setRegistryCode(getString(doc, "/result/firm/registry/code", null));
			ad.setRegistryName(getString(doc, "/result/firm/registry/name", null));
			
			ad.setRecordCreationDate(getDateTime(doc, "/result/firm/record/created"));
			ad.setRecordNumber(getString(doc, "/result/firm/record/number", null));
			
			ad.setBasicLegalFormCode(getString(doc, "/result/firm/basicLegalForm/code", null));
			ad.setBasicLegalFormName(getString(doc, "/result/firm/basicLegalForm/name", null));
			
			ad.setSpecificLegalFormCode(getString(doc, "/result/firm/specificLegalForm/code", null));
			ad.setSpecificLegalFormName(getString(doc, "/result/firm/specificLegalForm/name", null));
			
			ad.setOwnershipFormCode(getString(doc, "/result/firm/ownershipForm/code", null));
			ad.setOwnershipFormName(getString(doc, "/result/firm/ownershipForm/name", null));
			
			for (int i = 1; ; i++) {
				String pkdcode = getString(doc, "/result/firm/PKDs/PKD[" + i + "]/code", null);
				
				if (pkdcode == null) {
					break;
				}
				
				String descr = getString(doc, "/result/firm/PKDs/PKD[" + i + "]/description", null);
				String pri = getString(doc, "/result/firm/PKDs/PKD[" + i + "]/primary", "false");
				
				PKD pkd = new PKD();
				
				pkd.setCode(pkdcode);
				pkd.setDescription(descr);
				pkd.setPrimary(pri.equals("true"));
				
				ad.addPKD(pkd);
			}

			return ad;
		}
		catch (Exception ignored) {
		}
		
		return null;
	}

	/**
	 * Pobranie szczegółowych danych firmy
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getAllData(String)}
	 * @param nip numer NIP
	 * @param force parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return dane firmy lub null w przypadku błędu
	 */
	public AllData getAllData(String nip, boolean force)
	{
		return getAllData(Number.NIP, nip);
	}
	
	/**
	 * Pobranie szczegółowych danych firmy
	 * @param nip numer NIP
	 * @return dane firmy lub null w przypadku błędu
	 */
	public AllData getAllData(String nip)
	{
		return getAllData(Number.NIP, nip);
	}
	
	/**
	 * Pobranie danych firmy z systemu VIES
	 * @param euvat numer EU VAT ID
	 * @return dane firmy lub null w przypadku błędu
	 */
	public VIESData getVIESData(String euvat)
	{
		try {
			// clear error
			clear();

	        // validate number and construct path
			String suffix = null;
			
	        if ((suffix = getPathSuffix(Number.EUVAT, euvat)) == null) {
	            return null;
	        }
			
			// prepare url
			String url = (this.url.toString() + "/get/vies/" + suffix);
			
			// prepare request
			byte[] b = get(url);
			
			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}
			
			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));
			
			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}
			
			String code = getString(doc, "/result/error/code", null);
			
			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			VIESData vies = new VIESData();
			
			vies.setUID(getString(doc, "/result/vies/uid", null));
			vies.setCountryCode(getString(doc, "/result/vies/countryCode", null));
			vies.setVatNumber(getString(doc, "/result/vies/vatNumber", null));
			
			vies.setValid(getString(doc, "/result/vies/valid", "false").equals("true"));
			
			vies.setTraderName(getString(doc, "/result/vies/traderName", null));
			vies.setTraderCompanyType(getString(doc, "/result/vies/traderCompanyType", null));
			vies.setTraderAddress(getString(doc, "/result/vies/traderAddress", null));

			vies.setID(getString(doc, "/result/vies/id", null));
			vies.setDate(getDate(doc, "/result/vies/date"));
			vies.setSource(getString(doc, "/result/vies/source", null));

			return vies;
		}
		catch (Exception ignored) {
		}
		
		return null;
	}
	
	/**
	 * Sprawdzenie statusu firmy w rejestrze VAT
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getVATStatus(Number, String)}
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param direct parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return bieżący status firmy lub null w przypadku błędu
	 */
	public VATStatus getVATStatus(Number type, String number, boolean direct)
	{
		return getVATStatus(type, number);
	}

	/**
	 * Sprawdzenie statusu firmy w rejestrze VAT
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return bieżący status firmy lub null w przypadku błędu
	 */
	public VATStatus getVATStatus(Number type, String number)
	{
		try {
			// clear error
			clear();
			
	        // validate number and construct path
			String suffix = null;
			
	        if ((suffix = getPathSuffix(type, number)) == null) {
	            return null;
	        }
			
			// prepare url
			String url = (this.url.toString()  + "/check/vat/direct/" + suffix);
			
			// prepare request
			byte[] b = get(url);
			
			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}
			
			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));
			
			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}
			
			String code = getString(doc, "/result/error/code", null);
			
			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			VATStatus vs = new VATStatus();
			
			vs.setUID(getString(doc, "/result/vat/uid", null));
			vs.setNIP(getString(doc, "/result/vat/nip", null));
			vs.setREGON(getString(doc, "/result/vat/regon", null));
			vs.setName(getString(doc, "/result/vat/name", null));
			
			vs.setStatus(Integer.parseInt(getString(doc, "/result/vat/status", "0")));
			vs.setResult(getString(doc, "/result/vat/result", null));

			vs.setID(getString(doc, "/result/vat/id", null));
			vs.setDate(getDate(doc, "/result/vat/date"));
			vs.setSource(getString(doc, "/result/vat/source", null));
			
			return vs;
		}
		catch (Exception ignored) {
		}
		
		return null;
	}
	
	/**
	 * Sprawdzenie statusu firmy w rejestrze VAT
	 * @deprecated funkcja zostanie usunięta w kolejnych wersjach, proszę używać {@link #getVATStatus(String)}
	 * @param nip numer NIP
	 * @param direct parametr ignorowany, zostawiony dla zachowania kompatybilności wstecznej
	 * @return bieżący status firmy lub null w przypadku błędu
	 */
	public VATStatus getVATStatus(String nip, boolean direct)
	{
		return getVATStatus(Number.NIP, nip);
	}

	/**
	 * Sprawdzenie statusu firmy bezpośrednio w rejestrze VAT PPU MF
	 * @param nip numer NIP
	 * @return bieżący status firmy lub null w przypadku błędu
	 */
	public VATStatus getVATStatus(String nip)
	{
		return getVATStatus(Number.NIP, nip);
	}

	/**
	 * Sprawdzenie statusu rachunku bankowego firmy
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @param date dzień, którego ma dotyczyć sprawdzenie statusu (null - bieżący dzień)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public IBANStatus getIBANStatus(Number type, String number, String iban, Date date)
	{
		try {
			// clear error
			clear();

			// validate number and construct path
			String suffix = null;

			if ((suffix = getPathSuffix(type, number)) == null) {
				return null;
			}

			if (!IBAN.isValid(iban)) {
				iban = "PL" + iban;

				if (!IBAN.isValid(iban)) {
					set(Error.CLI_IBAN);
					return null;
				}
			}

			if (date == null) {
				date = new Date();
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// prepare url
			String url = (this.url.toString()  + "/check/iban/" + suffix + "/" + IBAN.normalize(iban) + "/" + sdf.format(date));

			// prepare request
			byte[] b = get(url);

			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}

			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));

			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}

			String code = getString(doc, "/result/error/code", null);

			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			IBANStatus is = new IBANStatus();

			is.setUID(getString(doc, "/result/iban/uid", null));
			is.setNIP(getString(doc, "/result/iban/nip", null));
			is.setREGON(getString(doc, "/result/iban/regon", null));
			is.setIBAN(getString(doc, "/result/iban/iban", null));

			is.setValid(getString(doc, "/result/iban/valid", "false").equals("true"));

			is.setID(getString(doc, "/result/iban/id", null));
			is.setDate(getDate(doc, "/result/iban/date"));
			is.setSource(getString(doc, "/result/iban/source", null));

			return is;
		}
		catch (Exception ignored) {
		}

		return null;
	}

	/**
	 * Sprawdzenie statusu rachunku bankowego firmy dla bieżącego dnia
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public IBANStatus getIBANStatus(Number type, String number, String iban)
	{
		return getIBANStatus(type, number, iban, null);
	}

	/**
	 * Sprawdzenie statusu rachunku bankowego firmy dla bieżącego dnia
	 * @param nip numer NIP
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public IBANStatus getIBANStatus(String nip, String iban)
	{
		return getIBANStatus(Number.NIP, nip, iban, null);
	}

	/**
	 * Sprawdzenie statusu firmy na podstawie pliku białej listy podatników VAT
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @param date dzień, którego ma dotyczyć sprawdzenie statusu (null - bieżący dzień)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public WLStatus getWhitelistStatus(Number type, String number, String iban, Date date)
	{
		try {
			// clear error
			clear();

			// validate number and construct path
			String suffix = null;

			if ((suffix = getPathSuffix(type, number)) == null) {
				return null;
			}

			if (!IBAN.isValid(iban)) {
				iban = "PL" + iban;

				if (!IBAN.isValid(iban)) {
					set(Error.CLI_IBAN);
					return null;
				}
			}

			if (date == null) {
				date = new Date();
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// prepare url
			String url = (this.url.toString()  + "/check/whitelist/" + suffix + "/" + IBAN.normalize(iban) + "/" + sdf.format(date));

			// prepare request
			byte[] b = get(url);

			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}

			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));

			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}

			String code = getString(doc, "/result/error/code", null);

			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			WLStatus wl = new WLStatus();

			wl.setUID(getString(doc, "/result/whitelist/uid", null));

			wl.setNIP(getString(doc, "/result/whitelist/nip", null));
			wl.setIBAN(getString(doc, "/result/whitelist/iban", null));

			wl.setValid(getString(doc, "/result/whitelist/valid", "false").equals("true"));
			wl.setVirtual(getString(doc, "/result/whitelist/virtual", "false").equals("true"));

			wl.setStatus(Integer.parseInt(getString(doc, "/result/whitelist/vatStatus", "0")));
			wl.setResult(getString(doc, "/result/whitelist/vatResult", null));

			wl.setHashIndex(Integer.parseInt(getString(doc, "/result/whitelist/hashIndex", "-1")));
			wl.setMaskIndex(Integer.parseInt(getString(doc, "/result/whitelist/maskIndex", "-1")));
			wl.setDate(getDate(doc, "/result/whitelist/date"));
			wl.setSource(getString(doc, "/result/whitelist/source", null));

			return wl;
		}
		catch (Exception ignored) {
		}

		return null;
	}

	/**
	 * Sprawdzenie statusu firmy na podstawie pliku białej listy podatników VAT dla bieżącego dnia
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public WLStatus getWhitelistStatus(Number type, String number, String iban)
	{
		return getWhitelistStatus(type, number, iban, null);
	}

	/**
	 * Sprawdzenie statusu firmy na podstawie pliku białej listy podatników VAT dla bieżącego dnia
	 * @param nip numer NIP
	 * @param iban numer IBAN rachunku do sprawdzenia (polskie rachunki mogą być bez prefiksu PL)
	 * @return bieżący status rachunku bankowego lub null w przypadku błędu
	 */
	public WLStatus getWhitelistStatus(String nip, String iban)
	{
		return getWhitelistStatus(Number.NIP, nip, iban, null);
	}

	/**
	 * Wyszukiwanie danych w rejestrze VAT
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @param date dzień, którego ma dotyczyć wyszukiwanie (null - bieżący dzień)
	 * @return wyszukane dane lub null w przypadku błędu
	 */
	public SearchResult searchVATRegistry(Number type, String number, Date date)
	{
		try {
			// clear error
			clear();

			// validate number and construct path
			String suffix = null;

			if ((suffix = getPathSuffix(type, number)) == null) {
				return null;
			}

			if (date == null) {
				date = new Date();
			}

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

			// prepare url
			String url = (this.url.toString()  + "/search/vat/" + suffix + "/" + sdf.format(date));

			// prepare request
			byte[] b = get(url);

			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}

			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));

			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}

			String code = getString(doc, "/result/error/code", null);

			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			SearchResult sr = new SearchResult();

			sr.setUID(getString(doc, "/result/search/uid", null));

			for (int i = 1; ; i++) {
				String nip = getString(doc, "/result/search/entities/entity[" + i + "]/nip", null);

				if (nip == null) {
					break;
				}

				VATEntity ve = new VATEntity();

				ve.setName(getString(doc, "/result/search/entities/entity[" + i + "]/name", null));
				ve.setNIP(NIP.normalize(nip));
				ve.setREGON(REGON.normalize(getString(doc, "/result/search/entities/entity[" + i + "]/regon", null)));
				ve.setKRS(KRS.normalize(getString(doc, "/result/search/entities/entity[" + i + "]/krs", null)));
				ve.setResidenceAddress(getString(doc, "/result/search/entities/entity[" + i + "]/residenceAddress", null));
				ve.setWorkingAddress(getString(doc, "/result/search/entities/entity[" + i + "]/workingAddress", null));
				ve.setVATStatus(Integer.parseInt(getString(doc, "/result/search/entities/entity[" + i + "]/vat/status", "0")));
				ve.setVATResult(getString(doc, "/result/search/entities/entity[" + i + "]/vat/result", null));

				getVATPerson(doc, "/result/search/entities/entity[" + i + "]/representatives", ve.getRepresentatives());
				getVATPerson(doc, "/result/search/entities/entity[" + i + "]/authorizedClerks", ve.getAuthorizedClerks());
				getVATPerson(doc, "/result/search/entities/entity[" + i + "]/partners", ve.getPartners());

				for (int k = 1; ; k++) {
					String iban = getString(doc, "/result/search/entities/entity[" + i + "]/ibans/iban[" + k + "]", null);

					if (iban == null) {
						break;
					}

					ve.getIBANs().add(iban);
				}

				ve.setHasVirtualAccounts(getString(doc, "/result/search/entities/entity[" + i + "]/hasVirtualAccounts", "false").equals("true"));
				ve.setRegistrationLegalDate(getDate(doc, "/result/search/entities/entity[" + i + "]/registrationLegalDate"));
				ve.setRegistrationDenialDate(getDate(doc, "/result/search/entities/entity[" + i + "]/registrationDenialDate"));
				ve.setRegistrationDenialBasis(getString(doc, "/result/search/entities/entity[" + i + "]/registrationDenialBasis", null));
				ve.setRestorationDate(getDate(doc, "/result/search/entities/entity[" + i + "]/restorationDate"));
				ve.setRestorationBasis(getString(doc, "/result/search/entities/entity[" + i + "]/restorationBasis", null));
				ve.setRemovalDate(getDate(doc, "/result/search/entities/entity[" + i + "]/removalDate"));
				ve.setRemovalBasis(getString(doc, "/result/search/entities/entity[" + i + "]/removalBasis", null));

				sr.getResults().add(ve);
			}

			sr.setID(getString(doc, "/result/search/id", null));
			sr.setDate(getDate(doc, "/result/search/date"));
			sr.setSource(getString(doc, "/result/search/source", null));

			return sr;
		}
		catch (Exception ignored) {
		}

		return null;
	}

	/**
	 * Wyszukiwanie danych w rejestrze VAT
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return wyszukane dane lub null w przypadku błędu
	 */
	public SearchResult searchVATRegistry(Number type, String number)
	{
		return searchVATRegistry(type, number, null);
	}

	/**
	 * Wyszukiwanie danych w rejestrze VAT
	 * @param nip numer NIP
	 * @return wyszukane dane lub null w przypadku błędu
	 */
	public SearchResult searchVATRegistry(String nip)
	{
		return searchVATRegistry(Number.NIP, nip, null);
	}

	/**
	 * Sprawdzenie bieżącego stanu konta użytkownika
	 * @return status konta lub null w przypadku błędu
	 */
	public AccountStatus getAccountStatus()
	{
		try {
			// clear error
			clear();
			
			// prepare url
			String url = (this.url.toString()  + "/check/account/status");
			
			// prepare request
			byte[] b = get(url);
			
			if (b == null) {
				set(Error.CLI_CONNECT);
				return null;
			}
			
			// parse response
			Document doc = dbf.newDocumentBuilder().parse(new ByteArrayInputStream(b));
			
			if (doc == null) {
				set(Error.CLI_RESPONSE);
				return null;
			}
			
			String code = getString(doc, "/result/error/code", null);
			
			if (code != null) {
				set(Integer.parseInt(code), getString(doc, "/result/error/description", null));
				return null;
			}

			AccountStatus status = new AccountStatus();
			
			status.setUID(getString(doc, "/result/account/uid", null));
			status.setType(getString(doc, "/result/account/type", null));
			status.setValidTo(getDateTime(doc, "/result/account/validTo"));
			status.setBillingPlanName(getString(doc, "/result/account/billingPlan/name", null));

			status.setSubscriptionPrice(Float.parseFloat(getString(doc, "/result/account/billingPlan/subscriptionPrice", "0")));
			status.setItemPrice(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPrice", "0")));
			status.setItemPriceStatus(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceCheckStatus", "0")));
			status.setItemPriceInvoice(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceInvoiceData", "0")));
			status.setItemPriceAll(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceAllData", "0")));
			status.setItemPriceIBAN(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceIBANStatus", "0")));
			status.setItemPriceWhitelist(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceWLStatus", "0")));
			status.setItemPriceSearchVAT(Float.parseFloat(getString(doc, "/result/account/billingPlan/itemPriceSearchVAT", "0")));

			status.setLimit(Integer.parseInt(getString(doc, "/result/account/billingPlan/limit", "0")));
			status.setRequestDelay(Integer.parseInt(getString(doc, "/result/account/billingPlan/requestDelay", "0")));
			status.setDomainLimit(Integer.parseInt(getString(doc, "/result/account/billingPlan/domainLimit", "0")));

			status.setOverPlanAllowed(getString(doc, "/result/account/billingPlan/overplanAllowed", "false").equals("true"));
			status.setTerytCodes(getString(doc, "/result/account/billingPlan/terytCodes", "false").equals("true"));
			status.setExcelAddIn(getString(doc, "/result/account/billingPlan/excelAddin", "false").equals("true"));
			status.setJPKVAT(getString(doc, "/result/account/billingPlan/jpkVat", "false").equals("true"));
			status.setCLI(getString(doc, "/result/account/billingPlan/cli", "false").equals("true"));
			status.setStats(getString(doc, "/result/account/billingPlan/stats", "false").equals("true"));
			status.setNIPMonitor(getString(doc, "/result/account/billingPlan/nipMonitor", "false").equals("true"));

			status.setSearchByNIP(getString(doc, "/result/account/billingPlan/searchByNip", "false").equals("true"));
			status.setSearchByREGON(getString(doc, "/result/account/billingPlan/searchByRegon", "false").equals("true"));
			status.setSearchByKRS(getString(doc, "/result/account/billingPlan/searchByKrs", "false").equals("true"));

			status.setFuncIsActive(getString(doc, "/result/account/billingPlan/funcIsActive", "false").equals("true"));
			status.setFuncGetInvoiceData(getString(doc, "/result/account/billingPlan/funcGetInvoiceData", "false").equals("true"));
			status.setFuncGetAllData(getString(doc, "/result/account/billingPlan/funcGetAllData", "false").equals("true"));
			status.setFuncGetVIESData(getString(doc, "/result/account/billingPlan/funcGetVIESData", "false").equals("true"));
			status.setFuncGetVATStatus(getString(doc, "/result/account/billingPlan/funcGetVATStatus", "false").equals("true"));
			status.setFuncGetIBANStatus(getString(doc, "/result/account/billingPlan/funcGetIBANStatus", "false").equals("true"));
			status.setFuncGetWhitelistStatus(getString(doc, "/result/account/billingPlan/funcGetWLStatus", "false").equals("true"));
			status.setFuncSearchVAT(getString(doc, "/result/account/billingPlan/funcSearchVAT", "false").equals("true"));

			status.setInvoiceDataCount(Integer.parseInt(getString(doc, "/result/account/requests/invoiceData", "0")));
			status.setAllDataCount(Integer.parseInt(getString(doc, "/result/account/requests/allData", "0")));
			status.setFirmStatusCount(Integer.parseInt(getString(doc, "/result/account/requests/firmStatus", "0")));
			status.setVATStatusCount(Integer.parseInt(getString(doc, "/result/account/requests/vatStatus", "0")));
			status.setVIESStatusCount(Integer.parseInt(getString(doc, "/result/account/requests/viesStatus", "0")));
			status.setIBANStatusCount(Integer.parseInt(getString(doc, "/result/account/requests/ibanStatus", "0")));
			status.setWhitelistStatusCount(Integer.parseInt(getString(doc, "/result/account/requests/wlStatus", "0")));
			status.setSearchVATCount(Integer.parseInt(getString(doc, "/result/account/requests/searchVAT", "0")));
			status.setTotalCount(Integer.parseInt(getString(doc, "/result/account/requests/total", "0")));
			
			return status;
		}
		catch (Exception ignored) {
		}
		
		return null;
	}

	/**
	 * Ostatni kod błędu
	 * @return kod błędu
	 */
	public int getLastErrorCode()
	{
		return errcode;
	}

	/**
	 * Ostatni komunikat błędu
	 * @return opis błędu
	 */
	public String getLastError()
	{
		return err;
	}

	/**
	 * Wyzerowanie informacji o błędzie
	 */
	private void clear()
	{
		errcode = 0;
		err = null;
	}

	/**
	 * Ustawienie kodu błędu
	 * @param code kod błędu
	 * @param err komunikat
	 */
	private void set(int code, String err)
	{
		errcode = code;
		this.err = (err == null ? Error.message(code) : err);
	}

	/**
	 * Ustawienie kodu błędu
	 * @param code kod błędu
	 */
	private void set(int code)
	{
		set(code, null);
	}

	/**
	 * Przygotowanie nagłówka z danymi do autoryzacji zapytania
	 * @param method metoda HTTP
	 * @param url docelowy adres URL
	 * @return nagłówki HTTP lub null
	 */
	private Properties auth(String method, URL url)
	{
		try {
			// prepare auth header
			String nonce = getRandom(8);

			long ts = (new Date().getTime() / 1000);
			
			String str = "" + ts + "\n"
				+ nonce + "\n"
				+ method + "\n"
				+ url.getPath() + "\n"
				+ url.getHost() + "\n"
				+ (url.getPort() == -1 ? url.getProtocol().equals("http") ? 80 : 443 : url.getPort()) + "\n"
				+ "\n";
			
			String mac = getMac(str);
			
			if (mac == null) {
				return null;
			}
			
			// prepare request
			Properties p = new Properties();
			
			p.setProperty("Authorization", "MAC id=\"" + id + "\", ts=\"" + ts + "\", nonce=\""
				+ nonce + "\", mac=\"" + mac + "\"");
			
			return p;
		}
		catch (Exception ignored) {
		}
		
		return null;
	}

	/**
	 * Przygotowanie nagłówka z danymi o kliencie
	 * @param headers obiekt z nagłówkami HTTP
	 */
	private void userAgent(Properties headers)
	{
		headers.setProperty("User-Agent", "NIP24Client/" + VERSION + " Java/" + System.getProperty("java.version"));
	}

	/**
	 * Metoda HTTP GET
	 * @param url adres URL
	 * @return pobrana odpowiedź lub null
	 */
	private byte[] get(String url)
	{
		boolean set = false;
		
		try {
			if (url == null || url.length() == 0) {
				return null;
			}
			
			URL u = new URL(url);
			Proxy p = null;
			
			byte[] out = null;

			if (wp != null && !wp.isExcluded(u.getHost())) {
				p = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(wp.getHost(), wp.getPort()));
				
				Authenticator.setDefault(wp);
				set = true;
			}
			
			// auth
			Properties headers = auth("GET", u);
			
			if (headers == null) {
				return null;
			}

			userAgent(headers);

			// connect
			HttpURLConnection huc = null;

			if (url.toLowerCase().startsWith("https://")) {
				// https
				if (p != null) {
					huc = (HttpsURLConnection)u.openConnection(p);
				}
				else {
					huc = (HttpsURLConnection)u.openConnection();
				}
	
				if (hv != null) {
					((HttpsURLConnection)huc).setHostnameVerifier(hv);
				}
				
				if (ssf != null) {
					((HttpsURLConnection)huc).setSSLSocketFactory(ssf);
				}
			}
			else if (url.toLowerCase().startsWith("http://")) {
				// http
				if (p != null) {
					huc = (HttpURLConnection)u.openConnection(p);
				}
				else {
					huc = (HttpURLConnection)u.openConnection();
				}
			}
			else {
				return null;
			}
				
			huc.setRequestMethod("GET");

			Enumeration<?> keys = headers.keys();

			while (keys.hasMoreElements()) {
				String key = (String)keys.nextElement();
				huc.setRequestProperty(key, headers.getProperty(key));
			}

			huc.setUseCaches(false);
			huc.setDoInput(true);
			huc.setDoOutput(false);
			
			// response
			int code = huc.getResponseCode();
			
			if (code != 200) {
				return null;
			}
			
			out = read(huc.getInputStream(), true);

			return out;
		}
		catch (Exception ignored) {
		}
		finally {
    		if (set) {
    			Authenticator.setDefault(null);
    		}
		}
		
		return null;
	}

	/**
	 * Odczyt zawartosci calego strumienia do tablicy
	 * @param stream strumien wejsciowy
	 * @param close jezeli true, strumien zostanie zamkniety po odczytaniu danych
	 * @return dane odczytane ze strumienia
	 */
	private byte[] read(InputStream stream, boolean close)
		throws IOException
	{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		copy(stream, baos, close);
		
		return baos.toByteArray();
	}

	/**
	 * Skopiowanie zawartosci strumienia in do strumienia out
	 * @param in strumien wejsciowy
	 * @param out strumien wyjsciowy
	 * @param close jeżeli true, oba strumienie zostana zamknięte po skopiowaniu danych
	 */
	private void copy(InputStream in, OutputStream out, boolean close)
		throws IOException
	{
		byte[] b = new byte[8192];

		int read;

		while ((read = in.read(b)) > 0) {
			out.write(b, 0, read);
		}

		if (close) {
			in.close();
			out.close();
		}
	}
	
	/**
	 * Zwraca losowy ciąg w postaci heksadecymalnej
	 * @param length długość ciągu
	 * @return losowy ciąg
	 */
	private String getRandom(int length)
	{
		byte[] b = new byte[length / 2];
		
		sr.nextBytes(b);
		
		return DatatypeConverter.printHexBinary(b).toLowerCase();
	}
	
	/**
	 * Oblicza HMAC z podanego ciągu
	 * @param str ciąg wejściowy
	 * @return obliczony HMAC jako ciąg Base64 lub null
	 */
	private String getMac(String str)
	{
		try {
			SecretKeySpec sks = new SecretKeySpec(key.getBytes(), HMAC_ALG);
			Mac m = Mac.getInstance(HMAC_ALG);
			
			m.init(sks);
			
			byte[] b = m.doFinal(str.getBytes());
			
			return DatatypeConverter.printBase64Binary(b);
		}
		catch (Exception ignored) {
		}
		
		return null;
	}

	/**
	 * Pobiera węzeł XML z podanego dokumentu
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające węzeł
	 * @return obiekt węzła lub null
	 */
	private Node getNode(Node node, String path)
	{
		try {
			return (Node)xp.evaluate(path, node, XPathConstants.NODE);
		}
		catch (Exception ignored) {
		}
		
		return null;
	}

	/**
	 * Zwraca wartość węzła XML jako ciąg tekstowy
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające wartość
	 * @return ciąg tekstowy lub null
	 */
	private String getValue(Node node, String path)
	{
		Node n = getNode(node, path);
		
		if (n != null) {
			return (n.getTextContent() == null ? "" : n.getTextContent());
		}
		
		return null;
	}

	/**
	 * Zwraca wartość węzła XML jako ciąg tekstowy
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające wartość
	 * @param def wartość domyślna zwracana w przypadku braku wartości w XML
	 * @return ciąg tekstowy
	 */
	private String getString(Node node, String path, String def)
	{
		String val = getValue(node, path);
		
		if (val != null) {
			return val;
		}

		return def;
	}

	/**
	 * Zwraca wartość węzła XML jako obiekt daty
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające wartość
	 * @return ciąg tekstowy
	 */
	private Date getDateTime(Node node, String path)
	{
		try {
			String val = getValue(node, path);
			
			if (val == null) {
				return null;
			}

			Calendar c = DatatypeConverter.parseDateTime(val);
			
			return c.getTime();
		}
		catch (Exception ignored) {
		}

		return null;
	}

	/**
	 * Zwraca wartość węzła XML jako obiekt daty
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające wartość
	 * @return ciąg tekstowy
	 */
	private Date getDate(Node node, String path)
	{
		try {
			String val = getValue(node, path);
			
			if (val == null) {
				return null;
			}

			Calendar c = DatatypeConverter.parseDate(val);
			
			return c.getTime();
		}
		catch (Exception ignored) {
		}

		return null;
	}

	/**
	 * Dodaje wartość węzła XML jako obiekt VATPerson do podanej listy
	 * @param node element bazowy
	 * @param path wyrażenie XPath wybierające wartość
	 * @param list lista osób
	 */
	private void getVATPerson(Node node, String path, List<VATPerson> list)
	{
		try {
			for (int i = 1; ; i++) {
				String nip = getString(node, path +  "/person[" + i + "]/nip", null);

				if (nip == null) {
					break;
				}

				VATPerson vp = new VATPerson();

				vp.setNIP(NIP.normalize(nip));
				vp.setCompanyName(getString(node, path + "/person[" + i + "]/companyName", null));
				vp.setFirstName(getString(node, path + "/person[" + i + "]/firstName", null));
				vp.setLastName(getString(node, path + "/person[" + i + "]/lastName", null));

				list.add(vp);
			}
		}
		catch (Exception ignored) {
		}
	}

	/**
	 * Pobranie sufiksu ścieżki
	 * @param type typ numeru identyfikującego firmę
	 * @param number numer określonego typu
	 * @return fragment ścieżki lub null
	 */
	private String getPathSuffix(Number type, String number)
	{
	    String path = "";
	
		if (type.equals(Number.NIP)) {
		    if (!NIP.isValid(number)) {
				set(Error.CLI_NIP);
		        return null;
		    }
		
		    path = "nip/" + NIP.normalize(number);
		}
		else if (type.equals(Number.REGON)) {
		    if (!REGON.isValid(number)) {
				set(Error.CLI_REGON);
		        return null;
		    }
		
		    path = "regon/" + REGON.normalize(number);
		}
		else if (type.equals(Number.KRS)) {
		    if (!KRS.isValid(number)) {
				set(Error.CLI_KRS);
		        return null;
		    }
		
		    path = "krs/" + KRS.normalize(number);
		}
		else if (type.equals(Number.EUVAT)) {
		    if (!EUVAT.isValid(number)) {
				set(Error.CLI_EUVAT);
		        return null;
		    }
		
		    path = "euvat/" + EUVAT.normalize(number);
		}
		else if (type.equals(Number.IBAN)) {
			if (!IBAN.isValid(number)) {
				number = "PL" + number;

				if (!IBAN.isValid(number)) {
					set(Error.CLI_IBAN);
					return null;
				}
			}

			path = "iban/" + IBAN.normalize(number);
		}
		else {
			set(Error.CLI_NUMBER);
			return null;
		}
		    
		return path;
	}
}
