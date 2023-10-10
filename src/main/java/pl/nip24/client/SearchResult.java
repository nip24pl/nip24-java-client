/**
 * Copyright 2015-2023 NETCAT (www.netcat.pl)
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
 * @copyright 2015-2023 NETCAT (www.netcat.pl)
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */

package pl.nip24.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Wynik wyszukiwania danych
 * @author robert
 */
public class SearchResult {

    protected String uid;

    protected List<Object> results;

	protected String id;
	protected Date date;
	protected String source;

	/**
	 * Tworzy nowy obiekt
	 */
	public SearchResult()
	{
		results = new ArrayList<>();
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
	 * Wyszukane dane
	 * @return lista wyników
	 */
	public List<Object> getResults()
	{
		return results;
	}

	/**
	 * Identyfikator odpowiedzi z rejestru referencyjnego
	 * @return identyfikator
	 */
	public String getID()
	{
		return id;
	}

	/**
	 * Identyfikator odpowiedzi z rejestru referencyjnego
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
		return "SearchResult: [uid = " + uid
			+ ", results = " + results
			+ ", id = " + id
			+ ", date = " + (date != null ? date.toString() : "")
			+ ", source = " + source
			+ "]";
	}
}
