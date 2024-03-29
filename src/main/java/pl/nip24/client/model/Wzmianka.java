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
 * Wzmianka
 */


public class Wzmianka {
  @JsonProperty("dataZlozenia")
  private String dataZlozenia = null;

  @JsonProperty("zaOkresOdDo")
  private String zaOkresOdDo = null;

  public Wzmianka dataZlozenia(String dataZlozenia) {
    this.dataZlozenia = dataZlozenia;
    return this;
  }

   /**
   * Get dataZlozenia
   * @return dataZlozenia
  **/
  @Schema(description = "")
  public String getDataZlozenia() {
    return dataZlozenia;
  }

  public void setDataZlozenia(String dataZlozenia) {
    this.dataZlozenia = dataZlozenia;
  }

  public Wzmianka zaOkresOdDo(String zaOkresOdDo) {
    this.zaOkresOdDo = zaOkresOdDo;
    return this;
  }

   /**
   * Get zaOkresOdDo
   * @return zaOkresOdDo
  **/
  @Schema(description = "")
  public String getZaOkresOdDo() {
    return zaOkresOdDo;
  }

  public void setZaOkresOdDo(String zaOkresOdDo) {
    this.zaOkresOdDo = zaOkresOdDo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Wzmianka wzmianka = (Wzmianka) o;
    return Objects.equals(this.dataZlozenia, wzmianka.dataZlozenia) &&
        Objects.equals(this.zaOkresOdDo, wzmianka.zaOkresOdDo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataZlozenia, zaOkresOdDo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Wzmianka {\n");
    
    sb.append("    dataZlozenia: ").append(toIndentedString(dataZlozenia)).append("\n");
    sb.append("    zaOkresOdDo: ").append(toIndentedString(zaOkresOdDo)).append("\n");
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
