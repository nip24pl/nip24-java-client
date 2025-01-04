/**
 * Copyright 2015-2025 NETCAT (www.netcat.pl)
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
 * @copyright 2015-2025 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Dane podmiotu z rejestru VAT
 * @author robert
 */
public class VATEntity {

	public final static int NOT_REGISTERED = 1;
	public final static int ACTIVE = 2;
	public final static int EXEMPTED = 3;

    protected String name;
	protected String nip;
	protected String regon;
	protected String krs;

	protected String residenceAddress;
	protected String workingAddress;

	protected int vatStatus;
	protected String vatResult;

	protected List<VATPerson> representatives;
	protected List<VATPerson> authorizedClerks;
	protected List<VATPerson> partners;

	protected List<String> ibans;
	protected boolean hasVirtualAccounts;

	protected Date registrationLegalDate;
	protected Date registrationDenialDate;
	protected String registrationDenialBasis;
	protected Date restorationDate;
	protected String restorationBasis;
	protected Date removalDate;
	protected String removalBasis;

	/**
	 * Tworzy nowy obiekt
	 */
	public VATEntity()
	{
		representatives = new ArrayList<>();
		authorizedClerks = new ArrayList<>();
		partners = new ArrayList<>();

		ibans = new ArrayList<>();
	}

	/**
	 * Firma (nazwa) lub imię i nazwisko
	 * @return nazwa
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Firma (nazwa) lub imię i nazwisko
	 * @param name nazwa
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
     * Numer NIP
	 * @return numer NIP
	 */
	public String getNIP()
	{
		return nip;
	}

	/**
     * Numer NIP
	 * @param nip numer NIP
	 */
	public void setNIP(String nip)
	{
		this.nip = nip;
	}

	/**
	 * Numer REGON
	 * @return numer REGON
	 */
	public String getREGON()
	{
		return regon;
	}

	/**
	 * Numer REGON
	 * @param regon numer REGOn
	 */
	public void setREGON(String regon)
	{
		this.regon = regon;
	}

	/**
	 * Numer KRS
	 * @return numer KRS
	 */
	public String getKRS() {
		return krs;
	}

	/**
	 * Numer KRS
	 * @param krs numer KRS
	 */
	public void setKRS(String krs)
	{
		this.krs = krs;
	}

	/**
	 * Adres siedziby
	 * @return adres
	 */
	public String getResidenceAddress()
	{
		return residenceAddress;
	}

	/**
	 * Adres siedziby
	 * @param residenceAddress adres
	 */
	public void setResidenceAddress(String residenceAddress)
	{
		this.residenceAddress = residenceAddress;
	}

	/**
	 * Adres stałego miejsca prowadzenia działalności lub adres miejsca zamieszkania w przypadku braku adresu
	 * stałego miejsca prowadzenia działalności
	 * @return adres
	 */
	public String getWorkingAddress()
	{
		return workingAddress;
	}

	/**
	 * Adres stałego miejsca prowadzenia działalności lub adres miejsca zamieszkania w przypadku braku adresu
	 * stałego miejsca prowadzenia działalności
	 * @param workingAddress adres
	 */
	public void setWorkingAddress(String workingAddress)
	{
		this.workingAddress = workingAddress;
	}

	/**
	 * Status jako jedna z wartości: NOT_REGISTERED, ACTIVE, EXEMPTED
	 * @return status
	 */
	public int getVATStatus()
	{
		return vatStatus;
	}

	/**
	 * Status jako jedna z wartości: NOT_REGISTERED, ACTIVE, EXEMPTED
	 * @param vatStatus status
	 */
	public void setVATStatus(int vatStatus) {
		this.vatStatus = vatStatus;
	}

	/**
	 * Tekstowy opis statusu VAT
	 * @return status
	 */
	public String getVATResult()
	{
		return vatResult;
	}

	/**
	 * Tekstowy opis statusu VAT
	 * @param vatResult status
	 */
	public void setVATResult(String vatResult)
	{
		this.vatResult = vatResult;
	}

	/**
	 * Imiona i nazwiska osób wchodzących w skład organu uprawnionego do reprezentowania podmiotu oraz ich numery NIP
	 * @return lista osób
	 */
	public List<VATPerson> getRepresentatives()
	{
		return representatives;
	}

	/**
	 * Imiona i nazwiska prokurentów oraz ich numery NIP
	 * @return lista osób
	 */
	public List<VATPerson> getAuthorizedClerks()
	{
		return authorizedClerks;
	}

	/**
	 * Imiona i nazwiska lub firma (nazwa) wspólnika oraz jego numer NIP
	 * @return lista osób
	 */
	public List<VATPerson> getPartners()
	{
		return partners;
	}

	/**
	 * Numery IBAN rachunków bankowych
	 * @return lista numerów
	 */
	public List<String> getIBANs()
	{
		return ibans;
	}

	/**
	 * Czy podmiot posiada maski kont wirtualnych
	 * @return true jeżeli posiada konta wirtualne
	 */
	public boolean isHasVirtualAccounts()
	{
		return hasVirtualAccounts;
	}

	/**
	 * Czy podmiot posiada maski kont wirtualnych
	 * @param hasVirtualAccounts true jeżeli posiada konta wirtualne
	 */
	public void setHasVirtualAccounts(boolean hasVirtualAccounts)
	{
		this.hasVirtualAccounts = hasVirtualAccounts;
	}

	/**
	 * Data rejestracji jako podatnika VAT
	 * @return data
	 */
	public Date getRegistrationLegalDate()
	{
		return registrationLegalDate;
	}

	/**
	 * Data rejestracji jako podatnika VAT
	 * @param registrationLegalDate data
	 */
	public void setRegistrationLegalDate(Date registrationLegalDate)
	{
		this.registrationLegalDate = registrationLegalDate;
	}

	/**
	 * Data odmowy rejestracji jako podatnika VAT
	 * @return data
	 */
	public Date getRegistrationDenialDate()
	{
		return registrationDenialDate;
	}

	/**
	 * Data odmowy rejestracji jako podatnika VAT
	 * @param registrationDenialDate data
	 */
	public void setRegistrationDenialDate(Date registrationDenialDate)
	{
		this.registrationDenialDate = registrationDenialDate;
	}

	/**
	 * Podstawa prawna odmowy rejestracji
	 * @return podstawa prawna
	 */
	public String getRegistrationDenialBasis()
	{
		return registrationDenialBasis;
	}

	/**
	 * Podstawa prawna odmowy rejestracji
	 * @param registrationDenialBasis podstawa prawna
	 */
	public void setRegistrationDenialBasis(String registrationDenialBasis)
	{
		this.registrationDenialBasis = registrationDenialBasis;
	}

	/**
	 * Data przywrócenia jako podatnika VAT
	 * @return data
	 */
	public Date getRestorationDate()
	{
		return restorationDate;
	}

	/**
	 * Data przywrócenia jako podatnika VAT
	 * @param restorationDate data
	 */
	public void setRestorationDate(Date restorationDate)
	{
		this.restorationDate = restorationDate;
	}

	/**
	 * Podstawa prawna przywrócenia jako podatnika VAT
	 * @return podstawa prawna
	 */
	public String getRestorationBasis()
	{
		return restorationBasis;
	}

	/**
	 * Podstawa prawna przywrócenia jako podatnika VAT
	 * @param restorationBasis podstawa prawna
	 */
	public void setRestorationBasis(String restorationBasis)
	{
		this.restorationBasis = restorationBasis;
	}

	/**
	 * Data wykreślenia odmowy rejestracji jako podatnika VAT
	 * @return data
	 */
	public Date getRemovalDate()
	{
		return removalDate;
	}

	/**
	 * Data wykreślenia odmowy rejestracji jako podatnika VAT
	 * @param removalDate data
	 */
	public void setRemovalDate(Date removalDate)
	{
		this.removalDate = removalDate;
	}

	/**
	 * Podstawa prawna wykreślenia odmowy rejestracji jako podatnika VAT
	 * @return podstawa prawna
	 */
	public String getRemovalBasis()
	{
		return removalBasis;
	}

	/**
	 * Podstawa prawna wykreślenia odmowy rejestracji jako podatnika VAT
	 * @param removalBasis podstawa prawna
	 */
	public void setRemovalBasis(String removalBasis)
	{
		this.removalBasis = removalBasis;
	}

	@Override
	public String toString()
	{
		return "VATEntity: [name = " + name
			+ ", nip = " + nip
			+ ", regon = " + regon
			+ ", krs = " + krs
			+ ", residenceAddress = " + residenceAddress
			+ ", workingAddress = " + workingAddress
			+ ", vatStatus = " + vatStatus
			+ ", vatResult = " + vatResult
			+ ", representatives = " + representatives
			+ ", authorizedClerks = " + authorizedClerks
			+ ", partners = " + partners
			+ ", ibans = " + ibans
			+ ", hasVirtualAccounts = " + hasVirtualAccounts
			+ ", registrationLegalDate = " + (registrationLegalDate != null ? registrationLegalDate.toString() : "")
			+ ", registrationDenialDate = " + (registrationDenialDate != null ? registrationDenialDate.toString() : "")
			+ ", registrationDenialBasis = " + registrationDenialBasis
			+ ", restorationDate = " + (restorationDate != null ? restorationDate.toString() : "")
			+ ", restorationBasis = " + restorationBasis
			+ ", removalDate = " + (removalDate != null ? removalDate.toString() : "")
			+ ", removalBasis = " + removalBasis
			+ "]";
	}
}
