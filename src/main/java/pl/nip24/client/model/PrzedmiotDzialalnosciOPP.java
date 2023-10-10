/*
 * NIP24 Service
 * NIP24 Service
 *
 * OpenAPI spec version: 1.3.5
 * Contact: kontakt@nip24.pl
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package pl.nip24.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import pl.nip24.client.model.Dzialalnosci;
/**
 * PrzedmiotDzialalnosciOPP
 */


public class PrzedmiotDzialalnosciOPP {
  @JsonProperty("nieodplatnyPkd")
  private List<Dzialalnosci> nieodplatnyPkd = null;

  @JsonProperty("odplatnyPkd")
  private List<Dzialalnosci> odplatnyPkd = null;

  public PrzedmiotDzialalnosciOPP nieodplatnyPkd(List<Dzialalnosci> nieodplatnyPkd) {
    this.nieodplatnyPkd = nieodplatnyPkd;
    return this;
  }

  public PrzedmiotDzialalnosciOPP addNieodplatnyPkdItem(Dzialalnosci nieodplatnyPkdItem) {
    if (this.nieodplatnyPkd == null) {
      this.nieodplatnyPkd = new ArrayList<Dzialalnosci>();
    }
    this.nieodplatnyPkd.add(nieodplatnyPkdItem);
    return this;
  }

   /**
   * Get nieodplatnyPkd
   * @return nieodplatnyPkd
  **/
  @Schema(description = "")
  public List<Dzialalnosci> getNieodplatnyPkd() {
    return nieodplatnyPkd;
  }

  public void setNieodplatnyPkd(List<Dzialalnosci> nieodplatnyPkd) {
    this.nieodplatnyPkd = nieodplatnyPkd;
  }

  public PrzedmiotDzialalnosciOPP odplatnyPkd(List<Dzialalnosci> odplatnyPkd) {
    this.odplatnyPkd = odplatnyPkd;
    return this;
  }

  public PrzedmiotDzialalnosciOPP addOdplatnyPkdItem(Dzialalnosci odplatnyPkdItem) {
    if (this.odplatnyPkd == null) {
      this.odplatnyPkd = new ArrayList<Dzialalnosci>();
    }
    this.odplatnyPkd.add(odplatnyPkdItem);
    return this;
  }

   /**
   * Get odplatnyPkd
   * @return odplatnyPkd
  **/
  @Schema(description = "")
  public List<Dzialalnosci> getOdplatnyPkd() {
    return odplatnyPkd;
  }

  public void setOdplatnyPkd(List<Dzialalnosci> odplatnyPkd) {
    this.odplatnyPkd = odplatnyPkd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrzedmiotDzialalnosciOPP przedmiotDzialalnosciOPP = (PrzedmiotDzialalnosciOPP) o;
    return Objects.equals(this.nieodplatnyPkd, przedmiotDzialalnosciOPP.nieodplatnyPkd) &&
        Objects.equals(this.odplatnyPkd, przedmiotDzialalnosciOPP.odplatnyPkd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nieodplatnyPkd, odplatnyPkd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrzedmiotDzialalnosciOPP {\n");
    
    sb.append("    nieodplatnyPkd: ").append(toIndentedString(nieodplatnyPkd)).append("\n");
    sb.append("    odplatnyPkd: ").append(toIndentedString(odplatnyPkd)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}