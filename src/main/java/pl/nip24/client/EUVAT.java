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

import java.util.HashMap;
import java.util.Map;

/**
 * Weryfikator numeru EU VAT ID
 * @author robert
 */
public class EUVAT {
	
	private static final Map<String,String> map = new HashMap<>();

	/**
	 * Konwertuje podany numer EU VAT do postaci znormalizowanej
	 * @param nip numer EU VAT w dowolnym formacie
	 * @return znormalizowany numer EU VAT
	 */
	public static String normalize(String nip)
	{
		if (nip == null || nip.length() == 0) {
			return null;
		}

		nip = nip.replaceAll("-", "");
		nip = nip.replaceAll(" ", "");
		nip = nip.trim().toUpperCase();

		if (!nip.matches("[A-Z]{2}[A-Z0-9]{2,12}")) {
			return null;
		}

		return nip;
	}

	/**
	 * Sprawdza poprawnoœæ numeru EU VAT
	 * @param nip numer EU VAT
	 * @return true jeżeli podany numer jest prawidłowy
	 */
	public static boolean isValid(String nip)
	{
		if ((nip = normalize(nip)) == null) {
			return false;
		}

		String cc = nip.substring(0, 2).toUpperCase();
		String num = nip.substring(2).toUpperCase();

		if (!map.containsKey(cc)) {
			return false;
		}

		if (!nip.matches(map.get(cc))) {
			return false;
		}

		if (cc.equals("PL")) {
			return NIP.isValid(num);
		}

		return true;
	}
	
	static {
		map.put("AT", "ATU\\d{8}");
		map.put("BE", "BE0\\d{9}");
		map.put("BG", "BG\\d{9,10}");
		map.put("CY", "CY\\d{8}[A-Z]{1}");
		map.put("CZ", "CZ\\d{8,10}");
		map.put("DE", "DE\\d{9}");
		map.put("DK", "DK\\d{8}");
		map.put("EE", "EE\\d{9}");
		map.put("EL", "EL\\d{9}");
		map.put("ES", "ES[A-Z0-9]{9}");
		map.put("FI", "FI\\d{8}");
		map.put("FR", "FR[A-Z0-9]{2}\\d{9}");
		map.put("GB", "GB[A-Z0-9]{5,12}");
		map.put("HR", "HR\\d{11}");
		map.put("HU", "HU\\d{8}");
		map.put("IE", "IE[A-Z0-9]{8,9}");
		map.put("IT", "IT\\d{11}");
		map.put("LT", "LT\\d{9,12}");
		map.put("LU", "LU\\d{8}");
		map.put("LV", "LV\\d{11}");
		map.put("MT", "MT\\d{8}");
		map.put("NL", "NL\\d{9}B\\d{2}");
		map.put("PL", "PL\\d{10}");
		map.put("PT", "PT\\d{9}");
		map.put("RO", "RO\\d{2,10}");
		map.put("SE", "SE\\d{12}");
		map.put("SI", "SI\\d{8}");
		map.put("SK", "SK\\d{10}");
	}
}
