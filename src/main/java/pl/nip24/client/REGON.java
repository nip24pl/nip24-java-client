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

/**
 * Weryfikator numeru REGON
 * @author robert
 */
public class REGON {

	/**
	 * Konwertuje podany numer REGON do postaci znormalizowanej
	 * @param regon numer REGON w dowolnym formacie
	 * @return znormalizowany numer REGON
	 */
	public static String normalize(String regon)
	{
		if (regon == null || regon.length() == 0) {
			return null;
		}

		regon = regon.trim();

		if (!regon.matches("[0-9]{9,14}")) {
			return null;
		}
		
		if (regon.length() != 9 && regon.length() != 14) {
			return null;
		}
		
		return regon;
	}

	/**
	 * Sprawdza poprawność numeru REGON
	 * @param regon numer REGON
	 * @return true jeżeli podany numer jest prawidłowy
	 */
	public static boolean isValid(String regon)
	{
		if ((regon = normalize(regon)) == null) {
			return false;
		}
		
		if (regon.length() == 9) {
			return isValidR9(regon);
		}
		else {
			if (!isValidR9(regon.substring(0, 9))) {
				return false;
			}
			
			return isValidR14(regon);
		}
	}
	
	/**
	 * Sprawdza poprawność 9-cyfrowego numeru REGON
	 * @param regon numer REGON
	 * @return true jeżeli podany numer jest prawidłowy
	 */
	private static boolean isValidR9(String regon)
	{
		int w[] = {
			8, 9, 2, 3, 4, 5, 6, 7
		};

		int sum = 0;

		for (int i = 0; i < w.length; i++) {
			sum += Character.digit(regon.charAt(i), 10) * w[i];
		}

		sum %= 11;
		
		if (sum == 10) {
			sum = 0;
		}

		if (sum != Character.digit(regon.charAt(8), 10)) {
			return false;
		}

		return true;
	}

	/**
	 * Sprawdza poprawność 14-cyfrowego numeru REGON
	 * @param regon numer REGON
	 * @return true jeżeli podany numer jest prawidłowy
	 */
	private static boolean isValidR14(String regon)
	{
		int w[] = {
			2, 4, 8, 5, 0, 9, 7, 3, 6, 1, 2, 4, 8
		};

		int sum = 0;

		for (int i = 0; i < w.length; i++) {
			sum += Character.digit(regon.charAt(i), 10) * w[i];
		}

		sum %= 11;
		
		if (sum == 10) {
			sum = 0;
		}

		if (sum != Character.digit(regon.charAt(13), 10)) {
			return false;
		}

		return true;
	}
}
