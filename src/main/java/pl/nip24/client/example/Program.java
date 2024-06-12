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

package pl.nip24.client.example;

import pl.nip24.client.Number;
import pl.nip24.client.*;
import pl.nip24.client.model.KRSData;

/**
 * Przykładowy program testowy
 */
public class Program {

	public static void main(String[] args)
	{
		try {
			// Utworzenie obiektu klienta usługi serwisu produkcyjnego
			// id – ciąg znaków reprezentujący identyfikator klucza API
			// key – ciąg znaków reprezentujący klucz API
			// NIP24Client nip24 = new NIP24Client("id", "key");

			// Utworzenie obiektu klienta usługi serwisu testowego
			NIP24Client nip24 = new NIP24Client();

			String nip = "7171642051";
			String nip_eu = "PL" + nip;
			String account_number = "49154000046458439719826658";
			String krs_number = "0000030897";

			// Sprawdzenie stanu konta
			AccountStatus account = nip24.getAccountStatus();

			if (account != null) {
				System.out.println(account);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}
			
			// Sprawdzenie statusu fimy
			boolean active = nip24.isActive(Number.NIP, nip);

			if (active) {
				System.out.println("Firma prowadzi aktywną działalność");
			}
			else {
				if (nip24.getLastError() == null) {
					System.out.println("Firma zawiesiła lub zakoñczyła działalność");
				}
				else {
					System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
				}
			}
			
			// Sprawdzenie statusu firmy w rejestrze VAT
			VATStatus vat = nip24.getVATStatus(Number.NIP, nip);
			
			if (vat != null) {
				System.out.println(vat);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}
			
			// Wywołanie metody zwracającej dane do faktury
			InvoiceData invoice = nip24.getInvoiceData(Number.NIP, nip);

			if (invoice != null) {
				System.out.println(invoice);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}
			
			// Wywołanie metody zwracającej szczegółowe dane firmy
			AllData all = nip24.getAllData(Number.NIP, nip);

			if (all != null) {
				System.out.println(all);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}
			
			// Wywołanie metody zwracającej dane z systemu VIES
			VIESData vies = nip24.getVIESData(nip_eu);

			if (vies != null) {
				System.out.println(vies);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}

			// Wywołanie metody zwracającej informacje o rachunku bankowym
			IBANStatus iban = nip24.getIBANStatus(Number.NIP, nip, account_number);

			if (iban != null) {
				System.out.println(iban);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}

			// Wywołanie metody sprawdzającej status podmiotu na białej liście podatników VAT
			WLStatus whitelist = nip24.getWhitelistStatus(Number.NIP, nip, account_number);

			if (whitelist != null) {
				System.out.println(whitelist);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}

			// Wywołanie metody wyszukującej dane w rejestrze VAT
			SearchResult result = nip24.searchVATRegistry(Number.NIP, nip);

			if (result != null) {
				System.out.println(result);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}

			// Wywołanie metody pobierającej pełne dane z KRS
			KRSData krs = nip24.getKRSData(Number.KRS, krs_number);

			if (krs != null) {
				System.out.println(krs);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}

			// Wywołanie metody pobierającej dane z KRS (tylko dział 1)
			krs = nip24.getKRSSection(Number.KRS, krs_number, 1);

			if (krs != null) {
				System.out.println(krs);
			}
			else {
				System.out.println("Błąd: " + nip24.getLastError() + " (kod: " + nip24.getLastErrorCode() + ")");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
