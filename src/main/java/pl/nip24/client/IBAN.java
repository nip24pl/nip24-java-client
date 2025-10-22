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

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Weryfikator numeru IBAN
 * @author robert
 */
public class IBAN {
	
	private static final Map<String,String> map = new HashMap<>();
	
	/**
	 * Konwertuje podany numer IBAN do postaci znormalizowanej
	 * @param iban numer IBAN w dowolnym formacie
	 * @return znormalizowany numer IBAN
	 */
	public static String normalize(String iban)
	{
		if (iban == null || iban.isEmpty()) {
			return null;
		}

		iban = iban.replaceAll(" ", "");
		iban = iban.trim().toUpperCase();

		if (!iban.matches("[A-Z]{2}[0-9A-Z]{13,30}")) {
			return null;
		}
		
		return iban;
	}
	
	/**
	 * Sprawdza poprawność numeru IBAN
	 * @param iban numer IBAN
	 * @return true, jeżeli podany numer jest prawidłowy
	 */
	public static boolean isValid(String iban)
	{
		if ((iban = normalize(iban)) == null) {
			return false;
		}

		String cc = iban.substring(0, 2).toUpperCase();
		
		if (!map.containsKey(cc)) {
			return false;
		}

		if (!iban.matches(map.get(cc))) {
			return false;
		}
		
		StringBuilder sb = new StringBuilder();
		iban = iban.substring(4) + iban.substring(0, 4);
		
		for (int i = 0; i < iban.length(); i++) {
			int n = Character.getNumericValue(iban.charAt(i));
			
			if (n <= -1) {
				return false;
			}
			
			sb.append(n);
		}
		
		BigInteger num = new BigInteger(sb.toString());
		BigInteger m = new BigInteger("97");
		
		return (num.mod(m).intValue() == 1);
	}
	
	static {
		map.put("AD", "AD\\d{10}[A-Z0-9]{12}");
		map.put("AE", "AE\\d{21}");
		map.put("AL", "AL\\d{10}[A-Z0-9]{16}");
		map.put("AT", "AT\\d{18}");
		map.put("AZ", "AZ\\d{2}[A-Z]{4}[A-Z0-9]{20}");
		map.put("BA", "BA\\d{18}");
		map.put("BE", "BE\\d{14}");
		map.put("BG", "BG\\d{2}[A-Z]{4}\\d{6}[A-Z0-9]{8}");
		map.put("BH", "BH\\d{2}[A-Z]{4}[A-Z0-9]{14}");
		map.put("BR", "BR\\d{25}[A-Z]{1}[A-Z0-9]{1}");
		map.put("BY", "BY\\d{2}[A-Z0-9]{4}\\d{4}[A-Z0-9]{16}");
		map.put("CH", "CH\\d{7}[A-Z0-9]{12}");
		map.put("CR", "CR\\d{20}");
		map.put("CY", "CY\\d{10}[A-Z0-9]{16}");
		map.put("CZ", "CZ\\d{22}");
		map.put("DE", "DE\\d{20}");
		map.put("DK", "DK\\d{16}");
		map.put("DO", "DO\\d{2}[A-Z0-9]{4}\\d{20}");
		map.put("EE", "EE\\d{18}");
		map.put("ES", "ES\\d{22}");
		map.put("FI", "FI\\d{16}");
		map.put("FO", "FO\\d{16}");
		map.put("FR", "FR\\d{12}[A-Z0-9]{11}\\d{2}");
		map.put("GB", "GB\\d{2}[A-Z]{4}\\d{14}");
		map.put("GE", "GE\\d{2}[A-Z]{2}\\d{16}");
		map.put("GI", "GI\\d{2}[A-Z]{4}[A-Z0-9]{15}");
		map.put("GL", "GL\\d{16}");
		map.put("GR", "GR\\d{9}[A-Z0-9]{16}");
		map.put("GT", "GT\\d{2}[A-Z0-9]{24}");
		map.put("HR", "HR\\d{19}");
		map.put("HU", "HU\\d{26}");
		map.put("IE", "IE\\d{2}[A-Z]{4}\\d{14}");
		map.put("IL", "IL\\d{21}");
		map.put("IQ", "IQ\\d{2}[A-Z]{4}\\d{15}");
		map.put("IS", "IS\\d{24}");
		map.put("IT", "IT\\d{2}[A-Z]{1}\\d{10}[A-Z0-9]{12}");
		map.put("JO", "JO\\d{2}[A-Z]{4}\\d{4}[A-Z0-9]{18}");
		map.put("KW", "KW\\d{2}[A-Z]{4}[A-Z0-9]{22}");
		map.put("KZ", "KZ\\d{5}[A-Z0-9]{13}");
		map.put("LB", "LB\\d{6}[A-Z0-9]{20}");
		map.put("LC", "LC\\d{2}[A-Z]{4}[A-Z0-9]{24}");
		map.put("LI", "LI\\d{7}[A-Z0-9]{12}");
		map.put("LT", "LT\\d{18}");
		map.put("LU", "LU\\d{5}[A-Z0-9]{13}");
		map.put("LV", "LV\\d{2}[A-Z]{4}[A-Z0-9]{13}");
		map.put("MC", "MC\\d{12}[A-Z0-9]{11}\\d{2}");
		map.put("MD", "MD\\d{2}[A-Z0-9]{20}");
		map.put("ME", "ME\\d{20}");
		map.put("MK", "MK\\d{5}[A-Z0-9]{10}\\d{2}");
		map.put("MR", "MR\\d{25}");
		map.put("MT", "MT\\d{2}[A-Z]{4}\\d{5}[A-Z0-9]{18}");
		map.put("MU", "MU\\d{2}[A-Z]{4}\\d{19}[A-Z]{3}");
		map.put("NL", "NL\\d{2}[A-Z]{4}\\d{10}");
		map.put("NO", "NO\\d{13}");
		map.put("PK", "PK\\d{2}[A-Z]{4}[A-Z0-9]{16}");
		map.put("PL", "PL\\d{26}");
		map.put("PS", "PS\\d{2}[A-Z]{4}[A-Z0-9]{21}");
		map.put("PT", "PT\\d{23}");
		map.put("QA", "QA\\d{2}[A-Z]{4}[A-Z0-9]{21}");
		map.put("RO", "RO\\d{2}[A-Z]{4}[A-Z0-9]{16}");
		map.put("RS", "RS\\d{20}");
		map.put("SA", "SA\\d{4}[A-Z0-9]{18}");
		map.put("SC", "SC\\d{2}[A-Z]{4}\\d{20}[A-Z]{3}");
		map.put("SE", "SE\\d{22}");
		map.put("SI", "SI\\d{17}");
		map.put("SK", "SK\\d{22}");
		map.put("SM", "SM\\d{2}[A-Z]{1}\\d{10}[A-Z0-9]{12}");
		map.put("ST", "ST\\d{23}");
		map.put("SV", "SV\\d{2}[A-Z]{4}\\d{20}");
		map.put("TL", "TL\\d{21}");
		map.put("TN", "TN\\d{22}");
		map.put("TR", "TR\\d{8}[A-Z0-9]{16}");
		map.put("UA", "UA\\d{8}[A-Z0-9]{19}");
		map.put("VG", "VG\\d{2}[A-Z]{4}\\d{16}");
		map.put("XK", "XK\\d{18}");
	}
}
