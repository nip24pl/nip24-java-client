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

import java.util.Date;

/**
 * Status podmiotu na białej liście
 * @author robert
 */
public class WLStatus {

	public final static int NOT_REGISTERED = 1;
	public final static int ACTIVE = 2;
	public final static int EXEMPTED = 3;

    protected String uid;

    protected String nip;
	protected String iban;

	protected boolean valid;
	protected boolean virtual;

	protected int status;
	protected String result;

	protected int hashIndex;
	protected int maskIndex;
	protected Date date;
	protected String source;

	/**
	 * Tworzy nowy obiekt
	 */
	public WLStatus()
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
	 * Rachunek wirtualny
	 * @return rachunek wirtualny (true - rachunek wirtualny, false - standardowy)
	 */
	public boolean isVirtual()
	{
		return virtual;
	}

	/**
	 * Rachunek wirtualny
	 * @param virtual rachunek wirtualny (true - rachunek wirtualny, false - standardowy)
	 */
	public void setVirtual(boolean virtual)
	{
		this.virtual = virtual;
	}

	/**
	 * Status jako jedna z wartości: NOT_REGISTERED, ACTIVE, EXEMPTED
	 * @return status firmy
	 */
	public int getStatus()
	{
		return status;
	}

	/**
	 * Status jako jedna z wartości: NOT_REGISTERED, ACTIVE, EXEMPTED
	 * @param status status firmy
	 */
	public void setStatus(int status)
	{
		this.status = status;
	}

	/**
	 * Tekstowy opis statusu
	 * @return opis statusu
	 */
	public String getResult()
	{
		return result;
	}

	/**
	 * Tekstowy opis statusu
	 * @param result opis statusu
	 */
	public void setResult(String result)
	{
		this.result = result;
	}

	/**
	 * Indeks znalezionego skrótu w pliku białej listy
	 * @return indeks skrótu
	 */
	public int getHashIndex()
	{
		return hashIndex;
	}

	/**
	 * Indeks znalezionego skrótu w pliku białej listy
	 * @param hashIndex indeks skrótu
	 */
	public void setHashIndex(int hashIndex)
	{
		this.hashIndex = hashIndex;
	}

	/**
	 * Indeks znalezionej maski w pliku białej listy (tylko dla rachunków wirtualnych)
	 * @return indeks maski
	 */
	public int getMaskIndex()
	{
		return maskIndex;
	}

	/**
	 * Indeks znalezionej maski w pliku białej listy (tylko dla rachunków wirtualnych)
	 * @param maskIndex indeks maski
	 */
	public void setMaskIndex(int maskIndex)
	{
		this.maskIndex = maskIndex;
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
		return "WLStatus: [uid = " + uid
			+ ", nip = " + nip
			+ ", iban = " + iban
			+ ", valid = " + valid
			+ ", virtual = " + virtual
			+ ", status = " + status
			+ ", result = " + result
			+ ", hashIndex = " + hashIndex
			+ ", maskIndex = " + maskIndex
			+ ", date = " + (date != null ? date.toString() : "")
			+ ", source = " + source
			+ "]";
	}
}
