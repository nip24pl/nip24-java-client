/**
 * Copyright 2015-2024 NETCAT (www.netcat.pl)
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
 * @copyright 2015-2024 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

/**
 * Wynik wyszukiwania danych
 * @author robert
 */
public class VATPerson {

    protected String companyName;
	protected String firstName;
	protected String lastName;
	protected String nip;

	/**
	 * Tworzy nowy obiekt
	 */
	public VATPerson()
	{
	}

	/**
	 * Nazwa firmy
	 * @return nazwa firmy
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/**
	 * Nazwa firmy
	 * @param companyName nazwa firmy
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}

	/**
	 * Imię
	 * @return imię
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Imię
	 * @param firstName imię
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * Nazwisko
	 * @return nazwisko
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Nazwisko
	 * @param lastName nazwisko
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
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

	@Override
	public String toString()
	{
		return "VATPerson: [companyName = " + companyName
			+ ", firstName = " + firstName
			+ ", lastName = " + lastName
			+ ", nip = " + nip
			+ "]";
	}
}
