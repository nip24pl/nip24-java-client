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
 * Reprezentacja
 */


public class Reprezentacja {
  @JsonProperty("nazwaOrganu")
  private String nazwaOrganu = null;

  @JsonProperty("sposobReprezentacji")
  private String sposobReprezentacji = null;

  @JsonProperty("sklad")
  private List<Sklad> sklad = null;

  public Reprezentacja nazwaOrganu(String nazwaOrganu) {
    this.nazwaOrganu = nazwaOrganu;
    return this;
  }

   /**
   * Get nazwaOrganu
   * @return nazwaOrganu
  **/
  @Schema(description = "")
  public String getNazwaOrganu() {
    return nazwaOrganu;
  }

  public void setNazwaOrganu(String nazwaOrganu) {
    this.nazwaOrganu = nazwaOrganu;
  }

  public Reprezentacja sposobReprezentacji(String sposobReprezentacji) {
    this.sposobReprezentacji = sposobReprezentacji;
    return this;
  }

   /**
   * Get sposobReprezentacji
   * @return sposobReprezentacji
  **/
  @Schema(description = "")
  public String getSposobReprezentacji() {
    return sposobReprezentacji;
  }

  public void setSposobReprezentacji(String sposobReprezentacji) {
    this.sposobReprezentacji = sposobReprezentacji;
  }

  public Reprezentacja sklad(List<Sklad> sklad) {
    this.sklad = sklad;
    return this;
  }

  public Reprezentacja addSkladItem(Sklad skladItem) {
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
    Reprezentacja reprezentacja = (Reprezentacja) o;
    return Objects.equals(this.nazwaOrganu, reprezentacja.nazwaOrganu) &&
        Objects.equals(this.sposobReprezentacji, reprezentacja.sposobReprezentacji) &&
        Objects.equals(this.sklad, reprezentacja.sklad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nazwaOrganu, sposobReprezentacji, sklad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reprezentacja {\n");
    
    sb.append("    nazwaOrganu: ").append(toIndentedString(nazwaOrganu)).append("\n");
    sb.append("    sposobReprezentacji: ").append(toIndentedString(sposobReprezentacji)).append("\n");
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
