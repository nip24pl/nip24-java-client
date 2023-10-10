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
import pl.nip24.client.model.VIESData;
/**
 * VIESDataResult
 */


public class VIESDataResult {
  @JsonProperty("vies")
  private VIESData vies = null;

  public VIESDataResult vies(VIESData vies) {
    this.vies = vies;
    return this;
  }

   /**
   * Get vies
   * @return vies
  **/
  @Schema(required = true, description = "")
  public VIESData getVies() {
    return vies;
  }

  public void setVies(VIESData vies) {
    this.vies = vies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIESDataResult viESDataResult = (VIESDataResult) o;
    return Objects.equals(this.vies, viESDataResult.vies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIESDataResult {\n");
    
    sb.append("    vies: ").append(toIndentedString(vies)).append("\n");
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
