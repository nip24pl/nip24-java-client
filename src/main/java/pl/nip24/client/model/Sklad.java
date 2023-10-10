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
import pl.nip24.client.model.IdentyfikatorOsoby;
import pl.nip24.client.model.ImionaOsoby;
import pl.nip24.client.model.NazwiskoOsoby;
/**
 * Sklad
 */


public class Sklad {
  @JsonProperty("nazwisko")
  private NazwiskoOsoby nazwisko = null;

  @JsonProperty("imiona")
  private ImionaOsoby imiona = null;

  @JsonProperty("identyfikator")
  private IdentyfikatorOsoby identyfikator = null;

  @JsonProperty("funkcjaWOrganie")
  private String funkcjaWOrganie = null;

  @JsonProperty("czyZawieszona")
  private Boolean czyZawieszona = null;

  public Sklad nazwisko(NazwiskoOsoby nazwisko) {
    this.nazwisko = nazwisko;
    return this;
  }

   /**
   * Get nazwisko
   * @return nazwisko
  **/
  @Schema(description = "")
  public NazwiskoOsoby getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(NazwiskoOsoby nazwisko) {
    this.nazwisko = nazwisko;
  }

  public Sklad imiona(ImionaOsoby imiona) {
    this.imiona = imiona;
    return this;
  }

   /**
   * Get imiona
   * @return imiona
  **/
  @Schema(description = "")
  public ImionaOsoby getImiona() {
    return imiona;
  }

  public void setImiona(ImionaOsoby imiona) {
    this.imiona = imiona;
  }

  public Sklad identyfikator(IdentyfikatorOsoby identyfikator) {
    this.identyfikator = identyfikator;
    return this;
  }

   /**
   * Get identyfikator
   * @return identyfikator
  **/
  @Schema(description = "")
  public IdentyfikatorOsoby getIdentyfikator() {
    return identyfikator;
  }

  public void setIdentyfikator(IdentyfikatorOsoby identyfikator) {
    this.identyfikator = identyfikator;
  }

  public Sklad funkcjaWOrganie(String funkcjaWOrganie) {
    this.funkcjaWOrganie = funkcjaWOrganie;
    return this;
  }

   /**
   * Get funkcjaWOrganie
   * @return funkcjaWOrganie
  **/
  @Schema(description = "")
  public String getFunkcjaWOrganie() {
    return funkcjaWOrganie;
  }

  public void setFunkcjaWOrganie(String funkcjaWOrganie) {
    this.funkcjaWOrganie = funkcjaWOrganie;
  }

  public Sklad czyZawieszona(Boolean czyZawieszona) {
    this.czyZawieszona = czyZawieszona;
    return this;
  }

   /**
   * Get czyZawieszona
   * @return czyZawieszona
  **/
  @Schema(description = "")
  public Boolean isCzyZawieszona() {
    return czyZawieszona;
  }

  public void setCzyZawieszona(Boolean czyZawieszona) {
    this.czyZawieszona = czyZawieszona;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sklad sklad = (Sklad) o;
    return Objects.equals(this.nazwisko, sklad.nazwisko) &&
        Objects.equals(this.imiona, sklad.imiona) &&
        Objects.equals(this.identyfikator, sklad.identyfikator) &&
        Objects.equals(this.funkcjaWOrganie, sklad.funkcjaWOrganie) &&
        Objects.equals(this.czyZawieszona, sklad.czyZawieszona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nazwisko, imiona, identyfikator, funkcjaWOrganie, czyZawieszona);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sklad {\n");
    
    sb.append("    nazwisko: ").append(toIndentedString(nazwisko)).append("\n");
    sb.append("    imiona: ").append(toIndentedString(imiona)).append("\n");
    sb.append("    identyfikator: ").append(toIndentedString(identyfikator)).append("\n");
    sb.append("    funkcjaWOrganie: ").append(toIndentedString(funkcjaWOrganie)).append("\n");
    sb.append("    czyZawieszona: ").append(toIndentedString(czyZawieszona)).append("\n");
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