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
 * WszczecieEgzekucji
 */


public class WszczecieEgzekucji {
  @JsonProperty("organWydajacyTytulWykonawczy")
  private String organWydajacyTytulWykonawczy = null;

  @JsonProperty("numerTytuluWykonawczego")
  private String numerTytuluWykonawczego = null;

  @JsonProperty("dataWszczeciaEgzekucji")
  private String dataWszczeciaEgzekucji = null;

  public WszczecieEgzekucji organWydajacyTytulWykonawczy(String organWydajacyTytulWykonawczy) {
    this.organWydajacyTytulWykonawczy = organWydajacyTytulWykonawczy;
    return this;
  }

   /**
   * Get organWydajacyTytulWykonawczy
   * @return organWydajacyTytulWykonawczy
  **/
  @Schema(description = "")
  public String getOrganWydajacyTytulWykonawczy() {
    return organWydajacyTytulWykonawczy;
  }

  public void setOrganWydajacyTytulWykonawczy(String organWydajacyTytulWykonawczy) {
    this.organWydajacyTytulWykonawczy = organWydajacyTytulWykonawczy;
  }

  public WszczecieEgzekucji numerTytuluWykonawczego(String numerTytuluWykonawczego) {
    this.numerTytuluWykonawczego = numerTytuluWykonawczego;
    return this;
  }

   /**
   * Get numerTytuluWykonawczego
   * @return numerTytuluWykonawczego
  **/
  @Schema(description = "")
  public String getNumerTytuluWykonawczego() {
    return numerTytuluWykonawczego;
  }

  public void setNumerTytuluWykonawczego(String numerTytuluWykonawczego) {
    this.numerTytuluWykonawczego = numerTytuluWykonawczego;
  }

  public WszczecieEgzekucji dataWszczeciaEgzekucji(String dataWszczeciaEgzekucji) {
    this.dataWszczeciaEgzekucji = dataWszczeciaEgzekucji;
    return this;
  }

   /**
   * Get dataWszczeciaEgzekucji
   * @return dataWszczeciaEgzekucji
  **/
  @Schema(description = "")
  public String getDataWszczeciaEgzekucji() {
    return dataWszczeciaEgzekucji;
  }

  public void setDataWszczeciaEgzekucji(String dataWszczeciaEgzekucji) {
    this.dataWszczeciaEgzekucji = dataWszczeciaEgzekucji;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WszczecieEgzekucji wszczecieEgzekucji = (WszczecieEgzekucji) o;
    return Objects.equals(this.organWydajacyTytulWykonawczy, wszczecieEgzekucji.organWydajacyTytulWykonawczy) &&
        Objects.equals(this.numerTytuluWykonawczego, wszczecieEgzekucji.numerTytuluWykonawczego) &&
        Objects.equals(this.dataWszczeciaEgzekucji, wszczecieEgzekucji.dataWszczeciaEgzekucji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organWydajacyTytulWykonawczy, numerTytuluWykonawczego, dataWszczeciaEgzekucji);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WszczecieEgzekucji {\n");
    
    sb.append("    organWydajacyTytulWykonawczy: ").append(toIndentedString(organWydajacyTytulWykonawczy)).append("\n");
    sb.append("    numerTytuluWykonawczego: ").append(toIndentedString(numerTytuluWykonawczego)).append("\n");
    sb.append("    dataWszczeciaEgzekucji: ").append(toIndentedString(dataWszczeciaEgzekucji)).append("\n");
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