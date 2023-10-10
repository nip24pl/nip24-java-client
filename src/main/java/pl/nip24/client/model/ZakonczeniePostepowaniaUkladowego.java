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
 * ZakonczeniePostepowaniaUkladowego
 */


public class ZakonczeniePostepowaniaUkladowego {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("opis")
  private String opis = null;

  public ZakonczeniePostepowaniaUkladowego data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ZakonczeniePostepowaniaUkladowego opis(String opis) {
    this.opis = opis;
    return this;
  }

   /**
   * Get opis
   * @return opis
  **/
  @Schema(description = "")
  public String getOpis() {
    return opis;
  }

  public void setOpis(String opis) {
    this.opis = opis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZakonczeniePostepowaniaUkladowego zakonczeniePostepowaniaUkladowego = (ZakonczeniePostepowaniaUkladowego) o;
    return Objects.equals(this.data, zakonczeniePostepowaniaUkladowego.data) &&
        Objects.equals(this.opis, zakonczeniePostepowaniaUkladowego.opis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, opis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZakonczeniePostepowaniaUkladowego {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    opis: ").append(toIndentedString(opis)).append("\n");
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