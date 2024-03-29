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
import pl.nip24.client.model.Sklad;
/**
 * OrganNadzoru
 */


public class OrganNadzoru {
  @JsonProperty("nazwa")
  private String nazwa = null;

  @JsonProperty("sklad")
  private List<Sklad> sklad = null;

  public OrganNadzoru nazwa(String nazwa) {
    this.nazwa = nazwa;
    return this;
  }

   /**
   * Get nazwa
   * @return nazwa
  **/
  @Schema(description = "")
  public String getNazwa() {
    return nazwa;
  }

  public void setNazwa(String nazwa) {
    this.nazwa = nazwa;
  }

  public OrganNadzoru sklad(List<Sklad> sklad) {
    this.sklad = sklad;
    return this;
  }

  public OrganNadzoru addSkladItem(Sklad skladItem) {
    if (this.sklad == null) {
      this.sklad = new ArrayList<Sklad>();
    }
    this.sklad.add(skladItem);
    return this;
  }

   /**
   * Get sklad
   * @return sklad
  **/
  @Schema(description = "")
  public List<Sklad> getSklad() {
    return sklad;
  }

  public void setSklad(List<Sklad> sklad) {
    this.sklad = sklad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganNadzoru organNadzoru = (OrganNadzoru) o;
    return Objects.equals(this.nazwa, organNadzoru.nazwa) &&
        Objects.equals(this.sklad, organNadzoru.sklad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nazwa, sklad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganNadzoru {\n");
    
    sb.append("    nazwa: ").append(toIndentedString(nazwa)).append("\n");
    sb.append("    sklad: ").append(toIndentedString(sklad)).append("\n");
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
