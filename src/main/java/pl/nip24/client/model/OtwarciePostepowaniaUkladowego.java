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
/**
 * OtwarciePostepowaniaUkladowego
 */


public class OtwarciePostepowaniaUkladowego {
  @JsonProperty("organWydajacy")
  private String organWydajacy = null;

  @JsonProperty("sygnatura")
  private String sygnatura = null;

  @JsonProperty("dataNadaniaKlauzuliWykonalnosci")
  private String dataNadaniaKlauzuliWykonalnosci = null;

  public OtwarciePostepowaniaUkladowego organWydajacy(String organWydajacy) {
    this.organWydajacy = organWydajacy;
    return this;
  }

   /**
   * Get organWydajacy
   * @return organWydajacy
  **/
  @Schema(description = "")
  public String getOrganWydajacy() {
    return organWydajacy;
  }

  public void setOrganWydajacy(String organWydajacy) {
    this.organWydajacy = organWydajacy;
  }

  public OtwarciePostepowaniaUkladowego sygnatura(String sygnatura) {
    this.sygnatura = sygnatura;
    return this;
  }

   /**
   * Get sygnatura
   * @return sygnatura
  **/
  @Schema(description = "")
  public String getSygnatura() {
    return sygnatura;
  }

  public void setSygnatura(String sygnatura) {
    this.sygnatura = sygnatura;
  }

  public OtwarciePostepowaniaUkladowego dataNadaniaKlauzuliWykonalnosci(String dataNadaniaKlauzuliWykonalnosci) {
    this.dataNadaniaKlauzuliWykonalnosci = dataNadaniaKlauzuliWykonalnosci;
    return this;
  }

   /**
   * Get dataNadaniaKlauzuliWykonalnosci
   * @return dataNadaniaKlauzuliWykonalnosci
  **/
  @Schema(description = "")
  public String getDataNadaniaKlauzuliWykonalnosci() {
    return dataNadaniaKlauzuliWykonalnosci;
  }

  public void setDataNadaniaKlauzuliWykonalnosci(String dataNadaniaKlauzuliWykonalnosci) {
    this.dataNadaniaKlauzuliWykonalnosci = dataNadaniaKlauzuliWykonalnosci;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtwarciePostepowaniaUkladowego otwarciePostepowaniaUkladowego = (OtwarciePostepowaniaUkladowego) o;
    return Objects.equals(this.organWydajacy, otwarciePostepowaniaUkladowego.organWydajacy) &&
        Objects.equals(this.sygnatura, otwarciePostepowaniaUkladowego.sygnatura) &&
        Objects.equals(this.dataNadaniaKlauzuliWykonalnosci, otwarciePostepowaniaUkladowego.dataNadaniaKlauzuliWykonalnosci);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organWydajacy, sygnatura, dataNadaniaKlauzuliWykonalnosci);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtwarciePostepowaniaUkladowego {\n");
    
    sb.append("    organWydajacy: ").append(toIndentedString(organWydajacy)).append("\n");
    sb.append("    sygnatura: ").append(toIndentedString(sygnatura)).append("\n");
    sb.append("    dataNadaniaKlauzuliWykonalnosci: ").append(toIndentedString(dataNadaniaKlauzuliWykonalnosci)).append("\n");
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