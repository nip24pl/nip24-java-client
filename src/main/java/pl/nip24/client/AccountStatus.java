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

import java.util.Date;

/**
 * Dane konta użytkownika
 * @author robert
 */
public class AccountStatus {

    protected String uid;

	protected String type;
	protected Date validTo;
    protected String billingPlanName;

    protected float subscriptionPrice;
    protected float itemPrice;
    protected float itemPriceStatus;
    protected float itemPriceInvoice;
    protected float itemPriceAll;
    protected float itemPriceIBAN;
	protected float itemPriceWhitelist;
	protected float itemPriceSearchVAT;

    protected int limit;
    protected int requestDelay;
    protected int domainLimit;

	protected boolean overPlanAllowed;
    protected boolean terytCodes;
    protected boolean excelAddIn;
	protected boolean jpkVat;
	protected boolean cli;
    protected boolean stats;
    protected boolean nipMonitor;

	protected boolean searchByNIP;
	protected boolean searchByREGON;
	protected boolean searchByKRS;

    protected boolean funcIsActive;
    protected boolean funcGetInvoiceData;
    protected boolean funcGetAllData;
    protected boolean funcGetVIESData;
    protected boolean funcGetVATStatus;
	protected boolean funcGetIBANStatus;
	protected boolean funcGetWhitelistStatus;
	protected boolean funcSearchVAT;

    protected int invoiceDataCount;
    protected int allDataCount;
    protected int firmStatusCount;
    protected int vatStatusCount;
    protected int viesStatusCount;
	protected int ibanStatusCount;
	protected int whitelistStatusCount;
	protected int searchVATCount;
    protected int totalCount;
	
	/**
	 * Tworzy nowy obiekt
	 */
	public AccountStatus()
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
	 * Typ konta
	 * @return typ konta
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Typ konta
	 * @param type typ konta
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * Data ważności konta pre-paid
	 * @return data ważności
	 */
	public Date getValidTo()
	{
		return validTo;
	}

	/**
	 * Data ważności konta pre-paid
	 * @param validTo data ważności
	 */
	public void setValidTo(Date validTo)
	{
		this.validTo = validTo;
	}

	/**
	 * Nazwa bieżącego planu taryfowego
	 * @return nazwa planu
	 */
	public String getBillingPlanName()
	{
		return billingPlanName;
	}

	/**
	 * Nazwa bieżącego planu taryfowego
	 * @param billingPlanName nazwa planu
	 */
	public void setBillingPlanName(String billingPlanName)
	{
		this.billingPlanName = billingPlanName;
	}

	/**
	 * Cena netto abonamentu miesięcznego
	 * @return cena netto
	 */
	public float getSubscriptionPrice()
	{
		return subscriptionPrice;
	}

	/**
	 * Cena netto abonamentu miesięcznego
	 * @param subscriptionPrice cena netto
	 */
	public void setSubscriptionPrice(float subscriptionPrice)
	{
		this.subscriptionPrice = subscriptionPrice;
	}

	/**
	 * Koszt netto pojedynczego zapytania poza planem w planie standardowym
	 * @return cena netto
	 */
	public float getItemPrice()
	{
		return itemPrice;
	}

	/**
	 * Koszt netto pojedynczego zapytania poza planem w planie standardowym
	 * @param itemPrice cena netto
	 */
	public void setItemPrice(float itemPrice)
	{
		this.itemPrice = itemPrice;
	}

	/**
	 * Koszt netto pojedynczego zapytania - VAT/VIES/Status działalności podmiotu w planie indywidualnym
	 * @return cena netto
	 */
	public float getItemPriceStatus()
	{
		return itemPriceStatus;
	}

	/**
	 * Koszt netto pojedynczego zapytania - VAT/VIES/Status działalności podmiotu w planie indywidualnym
	 * @param itemPriceStatus cena netto
	 */
	public void setItemPriceStatus(float itemPriceStatus)
	{
		this.itemPriceStatus = itemPriceStatus;
	}

	/**
	 * Koszt netto pojedynczego zapytania - dane do faktury w planie indywidualnym
	 * @return cena netto
	 */
	public float getItemPriceInvoice()
	{
		return itemPriceInvoice;
	}

	/**
	 * Koszt netto pojedynczego zapytania - dane do faktury w planie indywidualnym
	 * @param itemPriceInvoice cena netto
	 */
	public void setItemPriceInvoice(float itemPriceInvoice)
	{
		this.itemPriceInvoice = itemPriceInvoice;
	}

	/**
	 * Koszt netto pojedynczego zapytania - pełne dane podmiotu w planie indywidualnym
	 * @return cena netto
	 */
	public float getItemPriceAll()
	{
		return itemPriceAll;
	}

	/**
	 * Koszt netto pojedynczego zapytania - pełne dane podmiotu w planie indywidualnym
	 * @param itemPriceAll cena netto
	 */
	public void setItemPriceAll(float itemPriceAll)
	{
		this.itemPriceAll = itemPriceAll;
	}

	/**
	 * Koszt netto pojedynczego zapytania - status rachunku bankowego firmy
	 * @return cena netto
	 */
	public float getItemPriceIBAN()
	{
		return itemPriceIBAN;
	}

	/**
	 * Koszt netto pojedynczego zapytania - status rachunku bankowego firmy
	 * @param itemPriceIBAN cena netto
	 */
	public void setItemPriceIBAN(float itemPriceIBAN)
	{
		this.itemPriceIBAN = itemPriceIBAN;
	}

	/**
	 * Koszt netto pojedynczego zapytania - status podmiotu na białej liście podatników VAT
	 * @return cena netto
	 */
	public float getItemPriceWhitelist()
	{
		return itemPriceWhitelist;
	}

	/**
	 * Koszt netto pojedynczego zapytania - status podmiotu na białej liście podatników VAT
	 * @param itemPriceWhitelist cena netto
	 */
	public void setItemPriceWhitelist(float itemPriceWhitelist)
	{
		this.itemPriceWhitelist = itemPriceWhitelist;
	}

	/**
	 * Koszt netto pojedynczego zapytania - wyszukiwanie danych w rejestrze VAT
	 * @return cena netto
	 */
	public float getItemPriceSearchVAT()
	{
		return itemPriceSearchVAT;
	}

	/**
	 * Koszt netto pojedynczego zapytania - wyszukiwanie danych w rejestrze VAT
	 * @param itemPriceSearchVAT cena netto
	 */
	public void setItemPriceSearchVAT(float itemPriceSearchVAT)
	{
		this.itemPriceSearchVAT = itemPriceSearchVAT;
	}

	/**
	 * Maksymalna liczba zapytań w planie
	 * @return liczba zapytań
	 */
	public int getLimit()
	{
		return limit;
	}

	/**
	 * Maksymalna liczba zapytań w planie
	 * @param limit liczba zapytań
	 */
	public void setLimit(int limit)
	{
		this.limit = limit;
	}

	/**
	 * Minimalny odstęp czasu między zapytaniami
	 * @return liczba sekund
	 */
	public int getRequestDelay()
	{
		return requestDelay;
	}

	/**
	 * Minimalny odstęp czasu między zapytaniami
	 * @param requestDelay liczba sekund
	 */
	public void setRequestDelay(int requestDelay)
	{
		this.requestDelay = requestDelay;
	}

	/**
	 * Maksymalna ilość domen (kluczy API)
	 * @return ilość domen
	 */
	public int getDomainLimit()
	{
		return domainLimit;
	}

	/**
	 * Maksymalna ilość domen (kluczy API)
	 * @param domainLimit ilość domen
	 */
	public void setDomainLimit(int domainLimit)
	{
		this.domainLimit = domainLimit;
	}

	/**
	 * Możliwość przekroczenia maksymalnej liczby zapytań w planie
	 * @return true jeżeli można przekroczyć plan
	 */
	public boolean isOverPlanAllowed()
	{
		return overPlanAllowed;
	}

	/**
	 * Możliwość przekroczenia maksymalnej liczby zapytań w planie
	 * @param overPlanAllowed true jeżeli można przekroczyć plan
	 */
	public void setOverPlanAllowed(boolean overPlanAllowed)
	{
		this.overPlanAllowed = overPlanAllowed;
	}

	/**
	 * Dostęp do kodów TERYT
	 * @return true jeżeli kody są dostępne
	 */
	public boolean isTerytCodes()
	{
		return terytCodes;
	}

	/**
	 * Dostęp do kodów TERYT
	 * @param terytCodes true jeżeli kody są dostępne
	 */
	public void setTerytCodes(boolean terytCodes)
	{
		this.terytCodes = terytCodes;
	}

	/**
	 * Dostęp z wykorzystaniem dodatku MS Excel
	 * @return true jeżeli dodatek jest dostępny
	 */
	public boolean isExcelAddIn()
	{
		return excelAddIn;
	}

	/**
	 * Dostęp z wykorzystaniem dodatku MS Excel
	 * @param excelAddIn true jeżeli dodatek jest dostępny
	 */
	public void setExcelAddIn(boolean excelAddIn)
	{
		this.excelAddIn = excelAddIn;
	}

	/**
	 * Dostęp z aplikacji JPK_VAT
	 * @return true jeżeli aplikacja jest dostępna
	 */
	public boolean isJPKVAT()
	{
		return jpkVat;
	}

	/**
	 * Dostęp z aplikacji JPK_VAT
	 * @param jpkVat true jeżeli aplikacja jest dostępna
	 */
	public void setJPKVAT(boolean jpkVat)
	{
		this.jpkVat = jpkVat;
	}

	/**
	 * Dostęp z aplikacji CLI/CMD
	 * @return true jeżeli aplikacja jest dostępna
	 */
	public boolean isCLI()
	{
		return cli;
	}

	/**
	 * Dostęp z aplikacji CLI/CMD
	 * @param cli true jeżeli aplikacja jest dostępna
	 */
	public void setCLI(boolean cli)
	{
		this.cli = cli;
	}

	/**
	 * Dostęp do statystyk wykonanych zapytań
	 * @return true jeżeli statystyki są dostępne
	 */
	public boolean isStats()
	{
		return stats;
	}

	/**
	 * Dostęp do statystyk wykonanych zapytań
	 * @param stats true jeżeli statystyki są dostępne
	 */
	public void setStats(boolean stats)
	{
		this.stats = stats;
	}

	/**
	 * Dostęp do monitorowania statusów podmiotów: VAT/VIES/Status działalności
	 * @return true jeżeli monitor jest dostępny
	 */
	public boolean isNIPMonitor()
	{
		return nipMonitor;
	}

	/**
	 * Dostęp do monitorowania statusów podmiotów: VAT/VIES/Status działalności
	 * @param nipMonitor true jeżeli monitor jest dostępny
	 */
	public void setNIPMonitor(boolean nipMonitor)
	{
		this.nipMonitor = nipMonitor;
	}

	/**
	 * Wyszukiwanie po numerze NIP
	 * @return true jeżeli można wyszukiwać po NIP
	 */
	public boolean isSearchByNIP()
	{
		return searchByNIP;
	}

	/**
	 * Wyszukiwanie po numerze NIP
	 * @param searchByNIP true jeżeli można wyszukiwać po NIP
	 */
	public void setSearchByNIP(boolean searchByNIP)
	{
		this.searchByNIP = searchByNIP;
	}

	/**
	 * Wyszukiwanie po numerze REGON
	 * @return true jeżeli można wyszukiwać po REGON
	 */
	public boolean isSearchByREGON()
	{
		return searchByREGON;
	}

	/**
	 * Wyszukiwanie po numerze REGON
	 * @param searchByREGON true jeżeli można szukać po REGON
	 */
	public void setSearchByREGON(boolean searchByREGON)
	{
		this.searchByREGON = searchByREGON;
	}

	/**
	 * Wyszukiwanie po numerze KRS
	 * @return true jeżeli można wyszukiwać po KRS
	 */
	public boolean isSearchByKRS()
	{
		return searchByKRS;
	}

	/**
	 * Wyszukiwanie po numerze KRS
	 * @param searchByKRS true jeżeli można szukać po KRS
	 */
	public void setSearchByKRS(boolean searchByKRS)
	{
		this.searchByKRS = searchByKRS;
	}

	/**
	 * Dostęp do funkcji sprawdzających status działalności podmiotu
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncIsActive()
	{
		return funcIsActive;
	}

	/**
	 * Dostęp do funkcji sprawdzających status działalności podmiotu
	 * @param funcIsActive true jeżeli funkcja jest dostępna
	 */
	public void setFuncIsActive(boolean funcIsActive)
	{
		this.funcIsActive = funcIsActive;
	}

	/**
	 * Dostęp do funkcji pobierających dane podmiotu do faktury
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetInvoiceData()
	{
		return funcGetInvoiceData;
	}

	/**
	 * Dostęp do funkcji pobierających dane podmiotu do faktury
	 * @param funcGetInvoiceData true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetInvoiceData(boolean funcGetInvoiceData)
	{
		this.funcGetInvoiceData = funcGetInvoiceData;
	}

	/**
	 * Dostęp do funkcji pobierających pełne dane podmiotu
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetAllData()
	{
		return funcGetAllData;
	}

	/**
	 * Dostęp do funkcji pobierających pełne dane podmiotu
	 * @param funcGetAllData true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetAllData(boolean funcGetAllData)
	{
		this.funcGetAllData = funcGetAllData;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu w systemie VIES
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetVIESData()
	{
		return funcGetVIESData;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu w systemie VIES
	 * @param funcGetVIESData true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetVIESData(boolean funcGetVIESData)
	{
		this.funcGetVIESData = funcGetVIESData;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu w rejestrze VAT
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetVATStatus()
	{
		return funcGetVATStatus;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu w rejestrze VAT
	 * @param funcGetVATStatus true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetVATStatus(boolean funcGetVATStatus)
	{
		this.funcGetVATStatus = funcGetVATStatus;
	}

	/**
	 * Dostęp do funkcji sprawdzających status rachunku bankowego firmy
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetIBANStatus()
	{
		return funcGetIBANStatus;
	}

	/**
	 * Dostęp do funkcji sprawdzających status rachunku bankowego firmy
	 * @param funcGetIBANStatus true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetIBANStatus(boolean funcGetIBANStatus)
	{
		this.funcGetIBANStatus = funcGetIBANStatus;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu na białej liście podatników VAT
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncGetWhitelistStatus()
	{
		return funcGetWhitelistStatus;
	}

	/**
	 * Dostęp do funkcji sprawdzających status podmiotu na białej liście podatników VAT
	 * @param funcGetWhitelistStatus true jeżeli funkcja jest dostępna
	 */
	public void setFuncGetWhitelistStatus(boolean funcGetWhitelistStatus)
	{
		this.funcGetWhitelistStatus = funcGetWhitelistStatus;
	}

	/**
	 * Dostęp do funkcji wyszukującej dane w rejestrze VAT
	 * @return true jeżeli funkcja jest dostępna
	 */
	public boolean isFuncSearchVAT()
	{
		return funcSearchVAT;
	}

	/**
	 * Dostęp do funkcji wyszukującej dane w rejestrze VAT
	 * @param funcSearchVAT true jeżeli funkcja jest dostępna
	 */
	public void setFuncSearchVAT(boolean funcSearchVAT)
	{
		this.funcSearchVAT = funcSearchVAT;
	}

	/**
	 * Ilość wykonanych zapytań o dane podmiotu do faktury
	 * @return ilość zapytań
	 */
	public int getInvoiceDataCount()
	{
		return invoiceDataCount;
	}

	/**
	 * Ilość wykonanych zapytań o dane podmiotu do faktury
	 * @param invoiceDataCount ilość zapytań
	 */
	public void setInvoiceDataCount(int invoiceDataCount)
	{
		this.invoiceDataCount = invoiceDataCount;
	}

	/**
	 * Ilość wykonanych zapytań o pełne dane podmiotu
	 * @return ilość zapytań
	 */
	public int getAllDataCount()
	{
		return allDataCount;
	}

	/**
	 * Ilość wykonanych zapytań o pełne dane podmiotu
	 * @param allDataCount ilość zapytań
	 */
	public void setAllDataCount(int allDataCount)
	{
		this.allDataCount = allDataCount;
	}

	/**
	 * Ilość wykonanych zapytań o status działalności podmiotu
	 * @return ilość zapytań
	 */
	public int getFirmStatusCount()
	{
		return firmStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status działalności podmiotu
	 * @param firmStatusCount ilość zapytań
	 */
	public void setFirmStatusCount(int firmStatusCount)
	{
		this.firmStatusCount = firmStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu w rejestrze VAT
	 * @return ilość zapytań
	 */
	public int getVATStatusCount()
	{
		return vatStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu w rejestrze VAT
	 * @param vatStatusCount ilość zapytań
	 */
	public void setVATStatusCount(int vatStatusCount)
	{
		this.vatStatusCount = vatStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu w systemie VIES
	 * @return ilość zapytań
	 */
	public int getVIESStatusCount()
	{
		return viesStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu w systemie VIES
	 * @param viesStatusCount ilość zapytań
	 */
	public void setVIESStatusCount(int viesStatusCount)
	{
		this.viesStatusCount = viesStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status rachunku bankowego firmy
	 * @return ilość zapytań
	 */
	public int getIBANStatusCount()
	{
		return ibanStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status rachunku bankowego firmy
	 * @param ibanStatusCount ilość zapytań
	 */
	public void setIBANStatusCount(int ibanStatusCount)
	{
		this.ibanStatusCount = ibanStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu na białej liście
	 * @return ilość zapytań
	 */
	public int getWhitelistStatusCount()
	{
		return whitelistStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań o status podmiotu na białej liście
	 * @param whitelistStatusCount ilość zapytań
	 */
	public void setWhitelistStatusCount(int whitelistStatusCount)
	{
		this.whitelistStatusCount = whitelistStatusCount;
	}

	/**
	 * Ilość wykonanych zapytań wyszukiwania danych w rejestrze VAT
	 * @return ilość zapytań
	 */
	public int getSearchVATCount()
	{
		return searchVATCount;
	}

	/**
	 * Ilość wykonanych zapytań wyszukiwania danych w rejestrze VAT
	 * @param searchVATCount ilość zapytań
	 */
	public void setSearchVATCount(int searchVATCount)
	{
		this.searchVATCount = searchVATCount;
	}

	/**
	 * Całkowita ilość wykonanych zapytań w bieżącym miesiącu
	 * @return ilość zapytań
	 */
	public int getTotalCount()
	{
		return totalCount;
	}

	/**
	 * Całkowita ilość wykonanych zapytań w bieżącym miesiącu
	 * @param totalCount ilość zapytań
	 */
	public void setTotalCount(int totalCount)
	{
		this.totalCount = totalCount;
	}
	
	@Override
	public String toString()
	{
		return "AccountStatus: [uid = " + uid
			+ ", type = " + type
			+ ", validTo = " + (validTo != null ? validTo.toString() : "")
			+ ", billingPlanName = " + billingPlanName

			+ ", subscriptionPrice = " + subscriptionPrice
			+ ", itemPrice = " + itemPrice
			+ ", itemPriceStatus = " + itemPriceStatus
			+ ", itemPriceInvoice = " + itemPriceInvoice
			+ ", itemPriceAll = " + itemPriceAll
			+ ", itemPriceIBAN = " + itemPriceIBAN
			+ ", itemPriceWhitelist = " + itemPriceWhitelist
			+ ", itemPriceSearchVAT = " + itemPriceSearchVAT

			+ ", limit = " + limit
			+ ", requestDelay = " + requestDelay
			+ ", domainLimit = " + domainLimit

			+ ", overPlanAllowed = " + overPlanAllowed
			+ ", terytCodes = " + terytCodes
			+ ", excelAddIn = " + excelAddIn
			+ ", jpkVat = " + jpkVat
			+ ", cli = " + cli
			+ ", stats = " + stats
			+ ", NIPMonitor = " + nipMonitor

			+ ", searchByNIP = " + searchByNIP
			+ ", searchByREGON = " + searchByREGON
			+ ", searchByKRS = " + searchByKRS

			+ ", funcIsActive = " + funcIsActive
			+ ", funcGetInvoiceData = " + funcGetInvoiceData
			+ ", funcGetAllData = " + funcGetAllData
			+ ", funcGetVIESData = " + funcGetVIESData
			+ ", funcGetVATStatus = " + funcGetVATStatus
			+ ", funcGetIBANStatus = " + funcGetIBANStatus
			+ ", funcGetWhitelistStatus = " + funcGetWhitelistStatus
			+ ", funcSearchVAT = " + funcSearchVAT

			+ ", invoiceDataCount = " + invoiceDataCount
			+ ", allDataCount = " + allDataCount
			+ ", firmStatusCount = " + firmStatusCount
			+ ", VATStatusCount = " + vatStatusCount
			+ ", VIESStatusCount = " + viesStatusCount
			+ ", IBANStatusCount = " + ibanStatusCount
			+ ", whitelistStatusCount = " + whitelistStatusCount
			+ ", searchVATCount = " + searchVATCount
			+ ", totalCount = " + totalCount
			+ "]";
	}
}
