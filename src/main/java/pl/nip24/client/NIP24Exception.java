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
 * Wyjątek API NIP24
 * @author robert
 */
public class NIP24Exception extends Exception {

	private static final long serialVersionUID = 8635354206003254125L;

	/**
	 * Konstruktor.
	 */
	public NIP24Exception()
	{
	}

	/**
	 * Konstruktor.
	 * @param msg treść wyjątku
	 */
	public NIP24Exception(String msg)
	{
		super(msg);
	}
	
	/**
	 * Konstruktor.
	 * @param cause treść wyjątku
	 */
	public NIP24Exception(Throwable cause)
	{
		super(cause);
	}
}
