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

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Vector;

/**
 * Proxy HTTP
 * @author robert
 */
public class WebProxy extends Authenticator {
	
	private String host;
	private int port;
	
	private String login;
	private String password;
	
	private Vector<String> list;
	
	/**
	 * Tworzy nowy obiekt
	 * @param host adres serwera proxy
	 * @param port numer portu serwera proxy
	 * @param login login użytkownika
	 * @param password hasło użytkownika
	 * @param list lista adresów serwerów które nie wymagają serwera proxy 
	 */
	public WebProxy(String host, int port, String login, String password, String list)
	{
		this.host = host;
		this.port = port;
		this.login = login;
		this.password = password;
		this.list = new Vector<String>();
		
		if (list != null) {
			String[] hosts = list.split("[,; ]");

			for (String h: hosts) {
				this.list.add(h.toLowerCase());
			}
		}
	}

	/**
	 * Tworzy nowy obiekt
	 * @param host adres serwera proxy
	 * @param port numer portu serwera proxy
	 * @param login login użytkownika
	 * @param password hasło użytkownika
	 */
	public WebProxy(String host, int port, String login, String password)
	{
		this(host, port, login, password, null);
	}

	/**
	 * Tworzy nowy obiekt
	 */
	public WebProxy()
	{
		this(null, 0, null, null, null);
	}

	/**
	 * Adres serwera proxy
	 * @return adres serwera proxy
	 */
	public String getHost()
	{
		return host;
	}

	/**
	 * Adres serwera proxy
	 * @param host adres serwera proxy
	 */
	public void setHost(String host)
	{
		this.host = host;
	}

	/**
	 * Numer portu serwera proxy
	 * @return numer portu
	 */
	public int getPort()
	{
		return port;
	}

	/**
	 * Numer portu serwera proxy
	 * @param port numer portu
	 */
	public void setPort(int port)
	{
		this.port = port;
	}

	/**
	 * Login użytkownika
	 * @return login użytkownika
	 */
	public String getLogin()
	{
		return login;
	}

	/**
	 * Login użytkownika
	 * @param login login użytkownika
	 */
	public void setLogin(String login)
	{
		this.login = login;
	}

	/**
	 * Hasło użytkownika
	 * @return hasło użytkownika
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Hasło użytkownika
	 * @param password hasło użytkownika
	 */
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	/**
	 * Sprawdza czy podany adres serwera jest na liście wyjątków
	 * @param host adres serwera do sprawdzenia
	 * @return true jeżeli serwer nie wymaga połączenia przez proxy
	 */
	public boolean isExcluded(String host)
	{
		if (host == null) {
			return false;
		}
		
		return list.contains(host.toLowerCase());
	}
	
	@Override
	public String toString()
	{
		return "WebProxy: [host = " + host + ", port = " + port + ", login = "
			+ login + ", password = " + (password != null ? "set" : "not set") + "]";
	}
	
	@Override
	protected PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication(login, password.toCharArray());
	}
}
