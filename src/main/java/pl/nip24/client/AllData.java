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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Pełne dane firmy 
 * @author robert
 */
public class AllData extends InvoiceData {
	
	protected String type;
	protected String regon;
	
	protected String shortName;
	protected String secondName;
	
	protected String streetCode;
	protected String cityCode;
	protected String community;
	protected String communityCode;
	protected String county;
	protected String countyCode;
	protected String state;
	protected String stateCode;
	
	protected Date creationDate;
	protected Date startDate;
	protected Date registrationDate;
	protected Date holdDate;
	protected Date renevalDate;
	protected Date lastUpdateDate;
    protected Date bankruptcyDate;
    protected Date endOfBankruptcyProceedingsDate;
	protected Date endDate;
	
	protected String registryEntityCode;
	protected String registryEntityName;
	
	protected String registryCode;
	protected String registryName;
	
	protected Date recordCreationDate;
	protected String recordNumber;
	
	protected String basicLegalFormCode;
	protected String basicLegalFormName;
	
	protected String specificLegalFormCode;
	protected String specificLegalFormName;
	
	protected String ownershipFormCode;
	protected String ownershipFormName;

	protected List<BusinessPartner> businessPartner;
	protected List<PKD> pkd;

	/**
	 * Tworzy nowy obiekt
	 */
	public AllData()
	{
		businessPartner = new ArrayList<>();
		pkd = new ArrayList<>();
	}

	/**
	 * Typ firmy
	 * @return typ firmy
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Typ firmy
	 * @param type typ firmy
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * Numer REGON
	 * @return numer REGON
	 */
	public String getREGON()
	{
		return regon;
	}

	/**
	 * Numer REGON
	 * @param regon numer REGON
	 */
	public void setREGON(String regon)
	{
		this.regon = regon;
	}

	/**
	 * Krótka nazwa
	 * @return nazwa
	 */
	public String getShortName()
	{
		return shortName;
	}

	/**
	 * Krótka nazwa
	 * @param shortname nazwa
	 */
	public void setShortName(String shortname)
	{
		this.shortName = shortname;
	}

	/**
	 * Drugie imię
	 * @return imię
	 */
	public String getSecondName()
	{
		return secondName;
	}

	/**
	 * Drugie imię
	 * @param secondname imię
	 */
	public void setSecondName(String secondname)
	{
		this.secondName = secondname;
	}

	/**
	 * Kod TERYT ulicy
	 * @return kod TERYT
	 */
	public String getStreetCode()
	{
		return streetCode;
	}

	/**
	 * Kod TERYT ulicy
	 * @param streetCode kod TERYT
	 */
	public void setStreetCode(String streetCode)
	{
		this.streetCode = streetCode;
	}

	/**
	 * Kod TERYT miejscowości	
	 * @return kod TERYT
	 */
	public String getCityCode()
	{
		return cityCode;
	}

	/**
	 * Kod TERYT miejscowości
	 * @param cityCode kod TERYT
	 */
	public void setCityCode(String cityCode)
	{
		this.cityCode = cityCode;
	}

	/**
	 * Gmina
	 * @return nazwa gminy
	 */
	public String getCommunity()
	{
		return community;
	}

	/**
	 * Gmina
	 * @param community nazwa gminy
	 */
	public void setCommunity(String community)
	{
		this.community = community;
	}

	/**
	 * Kod TERYT gminy
	 * @return kod TERYT
	 */
	public String getCommunityCode()
	{
		return communityCode;
	}

	/**
	 * Kod TERYT gminy
	 * @param communityCode kod TERYT
	 */
	public void setCommunityCode(String communityCode)
	{
		this.communityCode = communityCode;
	}

	/**
	 * Powiat
	 * @return nazwa powiatu
	 */
	public String getCounty()
	{
		return county;
	}

	/**
	 * Powiat
	 * @param county nazwa powiatu
	 */
	public void setCounty(String county)
	{
		this.county = county;
	}

	/**
	 * Kod TERYT powiatu
	 * @return kod TERYT
	 */
	public String getCountyCode()
	{
		return countyCode;
	}

	/**
	 * Kod TERYT powiatu
	 * @param countyCode kod TERYT
	 */
	public void setCountyCode(String countyCode)
	{
		this.countyCode = countyCode;
	}

	/**
	 * Województwo
	 * @return nazwa województwa
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * Województwo
	 * @param state nazwa województwa
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * Kod TERYT województwa
	 * @return kod TERYT
	 */
	public String getStateCode()
	{
		return stateCode;
	}

	/**
	 * Kod TERYT województwa
	 * @param stateCode kod TERYT
	 */
	public void setStateCode(String stateCode)
	{
		this.stateCode = stateCode;
	}

	/**
	 * Data powstania firmy
	 * @return data powstania firmy
	 */
	public Date getCreationDate()
	{
		return creationDate;
	}

	/**
	 * Data powstania firmy
	 * @param creationDate data powstania firmy
	 */
	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}

	/**
	 * Data rozpoczęcia działalności
	 * @return data
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * Data rozpoczęcia działalności
	 * @param startDate data
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}

	/**
	 * Data wpisu do rejestru REGON
	 * @return data
	 */
	public Date getRegistrationDate()
	{
		return registrationDate;
	}

	/**
	 * Data wpisu do rejestru REGON
	 * @param registrationDate data
	 */
	public void setRegistrationDate(Date registrationDate)
	{
		this.registrationDate = registrationDate;
	}

	/**
	 * Data zawieszenia działalności
	 * @return data
	 */
	public Date getHoldDate()
	{
		return holdDate;
	}

	/**
	 * Data zawieszenia działalności
	 * @param holdDate data
	 */
	public void setHoldDate(Date holdDate)
	{
		this.holdDate = holdDate;
	}

	/**
	 * Data wznowienia działalności
	 * @return data
	 */
	public Date getRenevalDate()
	{
		return renevalDate;
	}

	/**
	 * Data wznowienia działalności
	 * @param renevalDate data
	 */
	public void setRenevalDate(Date renevalDate)
	{
		this.renevalDate = renevalDate;
	}

	/**
	 * Data zaistnienia ostatniej zmiany we wpisie
	 * @return data
	 */
	public Date getLastUpdateDate()
	{
		return lastUpdateDate;
	}

	/**
	 * Data zaistnienia ostatniej zmiany we wpisie
	 * @param lastUpdateDate data
	 */
	public void setLastUpdateDate(Date lastUpdateDate)
	{
		this.lastUpdateDate = lastUpdateDate;
	}

    /**
     * Data orzeczenia o upadłości
     * @return data
     */
    public Date getBankruptcyDate()
    {
        return bankruptcyDate;
    }

    /**
     * Data orzeczenia o upadłości
     * @param bankruptcyDate data
     */
    public void setBankruptcyDate(Date bankruptcyDate)
    {
        this.bankruptcyDate = bankruptcyDate;
    }

    /**
     * Data zakończenia postępowania upadłościowego
     * @return data
     */
    public Date getEndOfBankruptcyProceedingsDate()
    {
        return endOfBankruptcyProceedingsDate;
    }

    /**
     * Data zakończenia postępowania upadłościowego
     * @param endOfBankruptcyProceedingsDate data
     */
    public void setEndOfBankruptcyProceedingsDate(Date endOfBankruptcyProceedingsDate)
    {
        this.endOfBankruptcyProceedingsDate = endOfBankruptcyProceedingsDate;
    }

    /**
	 * Data zakończenia działalności
	 * @return data
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * Data zakończenia działalności
	 * @param endDate data
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	/**
	 * Kod organu rejestrowego
	 * @return kod
	 */
	public String getRegistryEntityCode()
	{
		return registryEntityCode;
	}

	/**
	 * Kod organu rejestrowego
	 * @param registryEntityCode kod
	 */
	public void setRegistryEntityCode(String registryEntityCode)
	{
		this.registryEntityCode = registryEntityCode;
	}

	/**
	 * Nazwa organu rejestrowego
	 * @return nazwa
	 */
	public String getRegistryEntityName()
	{
		return registryEntityName;
	}

	/**
	 * Nazwa organu rejestrowego
	 * @param registryEntityName nazwa
	 */
	public void setRegistryEntityName(String registryEntityName)
	{
		this.registryEntityName = registryEntityName;
	}

	/**
	 * Kod rodzaju rejestru ewidencji
	 * @return kod
	 */
	public String getRegistryCode()
	{
		return registryCode;
	}

	/**
	 * Kod rodzaju rejestru ewidencji
	 * @param registryCode kod
	 */
	public void setRegistryCode(String registryCode)
	{
		this.registryCode = registryCode;
	}

	/**
	 * Nazwa rodzaju rejestru ewidencji
	 * @return nazwa
	 */
	public String getRegistryName()
	{
		return registryName;
	}

	/**
	 * Nazwa rodzaju rejestru ewidencji
	 * @param registryName nazwa
	 */
	public void setRegistryName(String registryName)
	{
		this.registryName = registryName;
	}

	/**
	 * Data wpisu do rejestru ewidencji
	 * @return data
	 */
	public Date getRecordCreationDate()
	{
		return recordCreationDate;
	}

	/**
	 * Data wpisu do rejestru ewidencji
	 * @param recordCreationDate data
	 */
	public void setRecordCreationDate(Date recordCreationDate)
	{
		this.recordCreationDate = recordCreationDate;
	}

	/**
	 * Numer w rejestrze ewidencji
	 * @return numer
	 */
	public String getRecordNumber()
	{
		return recordNumber;
	}

	/**
	 * Numer w rejestrze ewidencji
	 * @param recordNumber numer
	 */
	public void setRecordNumber(String recordNumber)
	{
		this.recordNumber = recordNumber;
	}

	/**
	 * Kod podstawowej formy prawnej
	 * @return kod
	 */
	public String getBasicLegalFormCode()
	{
		return basicLegalFormCode;
	}

	/**
	 * Kod podstawowej formy prawnej
	 * @param basicLegalFormCode kod
	 */
	public void setBasicLegalFormCode(String basicLegalFormCode)
	{
		this.basicLegalFormCode = basicLegalFormCode;
	}

	/**
	 * Nazwa podstawowej formy prawnej
	 * @return nazwa
	 */
	public String getBasicLegalFormName()
	{
		return basicLegalFormName;
	}

	/**
	 * Nazwa podstawowej formy prawnej
	 * @param basicLegalFormName nazwa
	 */
	public void setBasicLegalFormName(String basicLegalFormName)
	{
		this.basicLegalFormName = basicLegalFormName;
	}

	/**
	 * Kod szczególnej formy prawnej
	 * @return kod
	 */
	public String getSpecificLegalFormCode()
	{
		return specificLegalFormCode;
	}

	/**
	 * Kod szczególnej formy prawnej
	 * @param specificLegalFormCode kod
	 */
	public void setSpecificLegalFormCode(String specificLegalFormCode)
	{
		this.specificLegalFormCode = specificLegalFormCode;
	}

	/**
	 * Nazwa szczególnej formy prawnej
	 * @return nazwa
	 */
	public String getSpecificLegalFormName()
	{
		return specificLegalFormName;
	}

	/**
	 * Nazwa szczególnej formy prawnej
	 * @param specificLegalFormName nazwa
	 */
	public void setSpecificLegalFormName(String specificLegalFormName)
	{
		this.specificLegalFormName = specificLegalFormName;
	}

	/**
	 * Kod formy własności
	 * @return kod
	 */
	public String getOwnershipFormCode()
	{
		return ownershipFormCode;
	}

	/**
	 * Kod formy własności
	 * @param ownershipFormCode kod
	 */
	public void setOwnershipFormCode(String ownershipFormCode)
	{
		this.ownershipFormCode = ownershipFormCode;
	}

	/**
	 * Nazwa formy własności
	 * @return nazwa
	 */
	public String getOwnershipFormName()
	{
		return ownershipFormName;
	}

	/**
	 * Nazwa formy własności
	 * @param ownershipFormName nazwa
	 */
	public void setOwnershipFormName(String ownershipFormName)
	{
		this.ownershipFormName = ownershipFormName;
	}

	/**
	 * Lista wspólników s.c.
	 * @return lista wspólników s.c.
	 */
	public List<BusinessPartner> getBusinessPartner()
	{
		return businessPartner;
	}

	/**
	 * Dodanie wspólnika s.c.
	 * @param bp wspólnik s.c.
	 */
	public void addBusinessPartner(BusinessPartner bp)
	{
		this.businessPartner.add(bp);
	}

	/**
	 * Lista kodów PKD
	 * @return lista kodów
	 */
	public List<PKD> getPKD()
	{
		return pkd;
	}

	/**
	 * Dodanie kodu PKD
	 * @param pkd kod PKD
	 */
	public void addPKD(PKD pkd)
	{
		this.pkd.add(pkd);
	}

	@Override
	public String toString()
	{
		return "AllData: [uid = " + uid
			+ ", nip = " + nip
			+ ", regon = " + regon
			+ ", type = " + type

			+ ", name = " + name
			+ ", shortName = " + shortName
			+ ", firstName = " + firstName
			+ ", secondName = " + secondName
			+ ", lastName = " + lastName
			
			+ ", street = " + street
			+ ", streetCode = " + streetCode
			+ ", streetNumber = " + streetNumber
			+ ", houseNumber = " + houseNumber
			+ ", city = " + city
			+ ", cityCode = " + cityCode
			+ ", community = " + community
			+ ", communityCode = " + communityCode
			+ ", county = " + county
			+ ", countyCode = " + countyCode
			+ ", state = " + state
			+ ", stateCode = " + stateCode
			+ ", postCode = " + postCode
			+ ", postCity = " + postCity
			
			+ ", phone = " + phone
			+ ", email = " + email
			+ ", www = " + www

			+ ", creationDate = " + creationDate
			+ ", startDate = " + startDate
			+ ", registrationDate = " + registrationDate
			+ ", holdDate = " + holdDate
			+ ", renevalDate = " + renevalDate
			+ ", lastUpdateDate = " + lastUpdateDate
            + ", bankruptcyDate = " + bankruptcyDate
            + ", endOfBankruptcyProceedingsDate = " + endOfBankruptcyProceedingsDate
			+ ", endDate = " + endDate

			+ ", registryEntityCode = " + registryEntityCode
			+ ", registryEntityName = " + registryEntityName

			+ ", registryCode = " + registryCode
			+ ", registryName = " + registryName

			+ ", recordCreationDate = " + recordCreationDate
			+ ", recordNumber = " + recordNumber

			+ ", basicLegalFormCode = " + basicLegalFormCode
			+ ", basicLegalFormName = " + basicLegalFormName

			+ ", specificLegalFormCode = " + specificLegalFormCode
			+ ", specificLegalFormName = " + specificLegalFormName

			+ ", ownershipFormCode = " + ownershipFormCode
			+ ", ownershipFormName = " + ownershipFormName

			+ ", businessPartner = " + businessPartner
			+ ", pkd = " + pkd
			+ "]";
	}
}
