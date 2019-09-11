/**
 * Copyright 2015-2019 NETCAT (www.netcat.pl)
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
 * @copyright 2015-2019 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

import java.util.Date;

/**
 * Status rachunku bankowego IBAN
 * @author robert
 */
public class IBANStatus {

    protected String uid;

    protected String nip;
	protected String regon;
	protected String iban;

	protected boolean valid;

	protected String id;
	protected Date date;
	protected String source;

	/**
	 * Tworzy nowy obiekt
	 */
	public IBANStatus()
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
	 * @param regon numer REGON
	 */
	public void setREGON(String regon)
	{
		this.regon = regon;
	}

	/**
	 * Numer rachunku bankowego
	 * @return numer rachunku
	 */
	public String getIBAN()
	{
		return iban;
	}

	/**
	 * Numer rachunku bankowego
	 * @param iban numer rachunku
	 */
	public void setIBAN(String iban)
	{
		this.iban = iban;
	}

	/**
	 * Status rachunku
	 * @return status rachunku (true - rachunek powiązany z podatnikiem, false - nie powiązany)
	 */
	public boolean isValid()
	{
		return valid;
	}

	/**
	 * Status rachunku
	 * @param valid status rachunku (true - rachunek powiązany z podatnikiem, false - nie powiązany)
	 */
	public void setValid(boolean valid)
	{
		this.valid = valid;
	}

	/**
	 * Identyfikator sprawdzenia w systemie MF
	 * @return identyfikator
	 */
	public String getID()
	{
		return id;
	}

	/**
	 * Identyfikator sprawdzenia w systemie MF
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
		return "IBANStatus: [uid = " + uid
			+ ", nip = " + nip
			+ ", regon = " + regon
			+ ", iban = " + iban
			+ ", valid = " + valid
			+ ", id = " + id
			+ ", date = " + (date != null ? date.toString() : "")
			+ ", source = " + source
			+ "]";
	}
}
