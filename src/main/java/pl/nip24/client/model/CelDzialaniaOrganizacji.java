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
 * CelDzialaniaOrganizacji
 */


public class CelDzialaniaOrganizacji {
  @JsonProperty("celDzialania")
  private String celDzialania = null;

  public CelDzialaniaOrganizacji celDzialania(String celDzialania) {
    this.celDzialania = celDzialania;
    return this;
  }

   /**
   * Get celDzialania
   * @return celDzialania
  **/
  @Schema(description = "")
  public String getCelDzialania() {
    return celDzialania;
  }

  public void setCelDzialania(String celDzialania) {
    this.celDzialania = celDzialania;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CelDzialaniaOrganizacji celDzialaniaOrganizacji = (CelDzialaniaOrganizacji) o;
    return Objects.equals(this.celDzialania, celDzialaniaOrganizacji.celDzialania);
  }

  @Override
  public int hashCode() {
    return Objects.hash(celDzialania);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CelDzialaniaOrganizacji {\n");
    
    sb.append("    celDzialania: ").append(toIndentedString(celDzialania)).append("\n");
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
