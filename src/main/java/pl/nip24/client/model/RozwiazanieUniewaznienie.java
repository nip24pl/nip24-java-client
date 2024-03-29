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
 * RozwiazanieUniewaznienie
 */


public class RozwiazanieUniewaznienie {
  @JsonProperty("okreslenieOkolicznosci")
  private String okreslenieOkolicznosci = null;

  @JsonProperty("informacjaORozwiazaniuUniewaznieniu")
  private String informacjaORozwiazaniuUniewaznieniu = null;

  public RozwiazanieUniewaznienie okreslenieOkolicznosci(String okreslenieOkolicznosci) {
    this.okreslenieOkolicznosci = okreslenieOkolicznosci;
    return this;
  }

   /**
   * Get okreslenieOkolicznosci
   * @return okreslenieOkolicznosci
  **/
  @Schema(description = "")
  public String getOkreslenieOkolicznosci() {
    return okreslenieOkolicznosci;
  }

  public void setOkreslenieOkolicznosci(String okreslenieOkolicznosci) {
    this.okreslenieOkolicznosci = okreslenieOkolicznosci;
  }

  public RozwiazanieUniewaznienie informacjaORozwiazaniuUniewaznieniu(String informacjaORozwiazaniuUniewaznieniu) {
    this.informacjaORozwiazaniuUniewaznieniu = informacjaORozwiazaniuUniewaznieniu;
    return this;
  }

   /**
   * Get informacjaORozwiazaniuUniewaznieniu
   * @return informacjaORozwiazaniuUniewaznieniu
  **/
  @Schema(description = "")
  public String getInformacjaORozwiazaniuUniewaznieniu() {
    return informacjaORozwiazaniuUniewaznieniu;
  }

  public void setInformacjaORozwiazaniuUniewaznieniu(String informacjaORozwiazaniuUniewaznieniu) {
    this.informacjaORozwiazaniuUniewaznieniu = informacjaORozwiazaniuUniewaznieniu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RozwiazanieUniewaznienie rozwiazanieUniewaznienie = (RozwiazanieUniewaznienie) o;
    return Objects.equals(this.okreslenieOkolicznosci, rozwiazanieUniewaznienie.okreslenieOkolicznosci) &&
        Objects.equals(this.informacjaORozwiazaniuUniewaznieniu, rozwiazanieUniewaznienie.informacjaORozwiazaniuUniewaznieniu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(okreslenieOkolicznosci, informacjaORozwiazaniuUniewaznieniu);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RozwiazanieUniewaznienie {\n");
    
    sb.append("    okreslenieOkolicznosci: ").append(toIndentedString(okreslenieOkolicznosci)).append("\n");
    sb.append("    informacjaORozwiazaniuUniewaznieniu: ").append(toIndentedString(informacjaORozwiazaniuUniewaznieniu)).append("\n");
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
