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
import pl.nip24.client.model.KRSData;
/**
 * KRSDataResult
 */


public class KRSDataResult {
  @JsonProperty("krs")
  private KRSData krs = null;

  public KRSDataResult krs(KRSData krs) {
    this.krs = krs;
    return this;
  }

   /**
   * Get krs
   * @return krs
  **/
  @Schema(required = true, description = "")
  public KRSData getKrs() {
    return krs;
  }

  public void setKrs(KRSData krs) {
    this.krs = krs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KRSDataResult krSDataResult = (KRSDataResult) o;
    return Objects.equals(this.krs, krSDataResult.krs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(krs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KRSDataResult {\n");
    
    sb.append("    krs: ").append(toIndentedString(krs)).append("\n");
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
