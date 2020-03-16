/**
 * Copyright 2015-2020 NETCAT (www.netcat.pl)
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
 * @copyright 2015-2020 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

import java.util.Date;

/**
 * Dane firmy z systemu VIES
 * @author robert
 */
public class VIESData {
	
	protected String uid;
	
	protected String countryCode;
	protected String vatNumber;
	
	protected boolean valid;
	
	protected String traderName;
	protected String traderCompanyType;
	protected String traderAddress;

	protected String id;
	protected Date date;
	protected String source;

	/**
	 * Tworzy nowy obiekt
	 */
	public VIESData()
	{
	}

	/**
	 * Unikalny identyfikator odpowiedzi
	 * @return id
	 */
	public String getUID()
	{
		return uid;
	}

	/**
	 * Unikalny identyfikator odpowiedzi
	 * @param uid id
	 */
	public void setUID(String uid)
	{
		this.uid = uid;
	}

	/**
	 * Kod kraju
	 * @return kod kraju
	 */
	public String getCountryCode()
	{
		return countryCode;
	}

	/**
	 * Kod kraju
	 * @param countryCode kod kraju
	 */
	public void setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
	}

	/**
	 * Numer VAT ID
	 * @return numer VAT ID
	 */
	public String getVatNumber()
	{
		return vatNumber;
	}

	/**
	 * Numer VAT ID
	 * @param vatNumber numer VAT ID
	 */
	public void setVatNumber(String vatNumber)
	{
		this.vatNumber = vatNumber;
	}

	/**
	 * Flaga aktywności firmy
	 * @return flaga aktywności firmy
	 */
	public boolean isValid()
	{
		return valid;
	}

	/**
	 * Flaga aktywności firmy
	 * @param valid flaga aktywności firmy
	 */
	public void setValid(boolean valid)
	{
		this.valid = valid;
	}

	/**
	 * Nazwa firmy
	 * @return nazwa firmy
	 */
	public String getTraderName()
	{
		return traderName;
	}

	/**
	 * Nazwa firmy
	 * @param traderName nazwa firmy
	 */
	public void setTraderName(String traderName)
	{
		this.traderName = traderName;
	}

	/**
	 * Typ firmy
	 * @return typ firmy
	 */
	public String getTraderCompanyType()
	{
		return traderCompanyType;
	}

	/**
	 * Typ firmy
	 * @param traderCompanyType typ firmy
	 */
	public void setTraderCompanyType(String traderCompanyType)
	{
		this.traderCompanyType = traderCompanyType;
	}

	/**
	 * Adres siedziby
	 * @return adres siedziby
	 */
	public String getTraderAddress()
	{
		return traderAddress;
	}

	/**
	 * Adres siedziby
	 * @param traderAddress adres siedziby
	 */
	public void setTraderAddress(String traderAddress)
	{
		this.traderAddress = traderAddress;
	}

	/**
	 * Identyfikator sprawdzenia w systemie VIES
	 * @return identyfikator
	 */
	public String getID()
	{
		return id;
	}

	/**
	 * Identyfikator sprawdzenia w systemie VIES
	 * @param id identyfikator
	 */
	public void setID(String id)
	{
		this.id = id;
	}

	/**
	 * Data sprawdzenia
	 * @return data sprawdzenia
	 */
	public Date getDate()
	{
		return date;
	}

	/**
	 * Data sprawdzenia
	 * @param date data sprawdzenia
	 */
	public void setDate(Date date)
	{
		this.date = date;
	}

	/**
	 * Źródło informacji o statusie
	 * @return źródło
	 */
	public String getSource()
	{
		return source;
	}

	/**
	 * Źródło informacji o statusie
	 * @param source źródło
	 */
	public void setSource(String source)
	{
		this.source = source;
	}

	@Override
	public String toString()
	{
		return "VIESData: [uid = " + uid
			+ ", countryCode = " + countryCode
			+ ", vatNumber = " + vatNumber
			+ ", valid = " + valid
			+ ", traderName = " + traderName
			+ ", traderCompanyType = " + traderCompanyType
			+ ", traderAddress = " + traderAddress
			+ ", id = " + id
			+ ", date = " + (date != null ? date.toString() : "")
			+ ", source = " + source
			+ "]";
	}
}
