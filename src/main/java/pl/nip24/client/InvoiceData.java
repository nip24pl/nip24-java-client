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

/**
 * Dane firmy wymagane do wystawienia faktury
 * @author robert
 */
public class InvoiceData {

    protected String uid;

    protected String nip;
	
	protected String name;
	protected String firstName;
	protected String lastName;
	
	protected String street;
	protected String streetNumber;
	protected String houseNumber;
	protected String city;
	protected String postCode;
	protected String postCity;
	
	protected String phone;
	protected String email;
	protected String www;
	
	/**
	 * Tworzy nowy obiekt
	 */
	public InvoiceData()
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
	 * Nazwa firmy
	 * @return nazwa firmy
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Nazwa firmy
	 * @param name nazwa firmy
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Imię osoby prowadzącej działalność gospodarczą
	 * @return imię osoby
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * Imię osoby prowadzącej działalność gospodarczą
	 * @param firstName ustawia imię osoby
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * Nazwisko osoby prowadzącej działalność gospodarczą
	 * @return nazwisko osoby
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * Nazwisko osoby prowadzącej działalność gospodarczą
	 * @param lastName ustawia nazwisko osoby
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * Nazwa ulicy
	 * @return nazwa ulicy
	 */
	public String getStreet()
	{
		return street;
	}
	
	/**
	 * Nazwa ulicy
	 * @param street nazwa ulicy
	 */
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	/**
	 * Numer budynku
	 * @return numer budynku
	 */
	public String getStreetNumber()
	{
		return streetNumber;
	}
	
	/**
	 * Numer budynku
	 * @param streetNumber numer budynku
	 */
	public void setStreetNumber(String streetNumber)
	{
		this.streetNumber = streetNumber;
	}
	
	/**
	 * Numer lokalu
	 * @return numer lokalu
	 */
	public String getHouseNumber()
	{
		return houseNumber;
	}
	
	/**
	 * Numer lokalu
	 * @param houseNumber numer lokalu
	 */
	public void setHouseNumber(String houseNumber)
	{
		this.houseNumber = houseNumber;
	}
	
	/**
	 * Miejscowość
	 * @return miejscowość
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Miejscowość
	 * @param city miejscowość
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Kod pocztowy
	 * @return kod pocztowy
	 */
	public String getPostCode()
	{
		return postCode;
	}
	
	/**
	 * Kod pocztowy
	 * @param postCode kod pocztowy
	 */
	public void setPostCode(String postCode)
	{
		this.postCode = postCode;
	}
	
	/**
	 * Miejscowość poczty
	 * @return miejscowość poczty
	 */
	public String getPostCity()
	{
		return postCity;
	}
	
	/**
	 * Miejscowość poczty
	 * @param postCity miejscowość poczty
	 */
	public void setPostCity(String postCity)
	{
		this.postCity = postCity;
	}
	
	/**
	 * Telefon kontaktowy firmy
	 * @return telefon kontaktowy
	 */
	public String getPhone()
	{
		return phone;
	}

	/**
	 * Telefon kontaktowy firmy
	 * @param phone telefon kontaktowy
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	/**
	 * Adres email firmy
	 * @return email firmy
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Adres email firmy
	 * @param email email firmy
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * Adres strony internetowej firmy
	 * @return adres WWW
	 */
	public String getWWW()
	{
		return www;
	}

	/**
	 * Adres strony internetowej firmy
	 * @param www adres WWW
	 */
	public void setWWW(String www)
	{
		this.www = www;
	}

	@Override
	public String toString()
	{
		return "InvoiceData: [uid = " + uid
			+ ", nip = " + nip
			+ ", name = " + name
			+ ", firstName = " + firstName
			+ ", lastName = " + lastName
			
			+ ", street = " + street
			+ ", streetNumber = " + streetNumber
			+ ", houseNumber = " + houseNumber
			+ ", city = " + city
			+ ", postCode = " + postCode
			+ ", postCity = " + postCity
			
			+ ", phone = " + phone
			+ ", email = " + email
			+ ", www = " + www
			+ "]";
	}
}
