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

/**
 * Element listy wspólników s.c.
 * @author robert
 */
public class BusinessPartner {

    private String regon;
    private String firmName;
    private String firstName;
    private String secondName;
    private String lastName;

    /**
     * Tworzy nowy obiekt
     */
    public BusinessPartner()
    {
    }

    /**
     * Numer REGON
     * @return numer REGON
     */
    public String getRegon() {
        return regon;
    }

    /**
     * Numer REGON
     * @param regon numer REGON
     */
    public void setRegon(String regon) {
        this.regon = regon;
    }

    /**
     * Nazwa firmy
     * @return nazwa firmy
     */
    public String getFirmName() {
        return firmName;
    }

    /**
     * Nazwa firmy
     * @param firmName nazwa firmy
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /**
     * Imię pierwsze
     * @return imię pierwsze
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Imię pierwsze
     * @param firstName imię pierwsze
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Imię drugie
     * @return imię drugie
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Imię drugie
     * @param secondName imię drugie
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Nazwisko
     * @return nazwisko
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Nazwisko
     * @param lastName nazwisko
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "BusinessPartner: [regon = " + regon
                + ", firmName = " + firmName
                + ", firstName = " + firstName
                + ", secondName = " + secondName
                + ", lastName = " + lastName
                + "]";
    }
}
