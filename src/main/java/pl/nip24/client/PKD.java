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

/**
 * Element słownika z rejestru PKD (Polska Klasyfikacja Działalności)
 * @author robert
 */
public class PKD {
	
	private String code;
	private String description;
	
	private boolean primary;

	/**
	 * Tworzy nowy obiekt
	 */
	public PKD()
	{
	}

	/**
	 * Kod PKD
	 * @return kod PKD
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * Kod PKD
	 * @param code kod PKD
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * Opis kodu PKD
	 * @return opis kodu
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Opis kodu
	 * @param description opis kodu
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * Znacznik przeważającej działalności
	 * @return znacznik
	 */
	public boolean isPrimary()
	{
		return primary;
	}

	/**
	 * Znacznik przeważającej działalności
	 * @param primary znacznik
	 */
	public void setPrimary(boolean primary)
	{
		this.primary = primary;
	}

	@Override
	public String toString()
	{
		return "PKD: [primary = " + primary
			+ ", code = " + code
			+ ", description = " + description
			+ "]";
	}
}
