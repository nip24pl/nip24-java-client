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

import java.time.LocalDate;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * IBANStatus
 */


public class IBANStatus {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("nip")
  private String nip = null;

  @JsonProperty("regon")
  private String regon = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("source")
  private String source = null;

  public IBANStatus uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(required = true, description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public IBANStatus nip(String nip) {
    this.nip = nip;
    return this;
  }

   /**
   * Get nip
   * @return nip
  **/
  @Schema(required = true, description = "")
  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public IBANStatus regon(String regon) {
    this.regon = regon;
    return this;
  }

   /**
   * Get regon
   * @return regon
  **/
  @Schema(description = "")
  public String getRegon() {
    return regon;
  }

  public void setRegon(String regon) {
    this.regon = regon;
  }

  public IBANStatus iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @Schema(required = true, description = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public IBANStatus valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @Schema(required = true, description = "")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public IBANStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IBANStatus date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(required = true, description = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public IBANStatus source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IBANStatus ibANStatus = (IBANStatus) o;
    return Objects.equals(this.uid, ibANStatus.uid) &&
        Objects.equals(this.nip, ibANStatus.nip) &&
        Objects.equals(this.regon, ibANStatus.regon) &&
        Objects.equals(this.iban, ibANStatus.iban) &&
        Objects.equals(this.valid, ibANStatus.valid) &&
        Objects.equals(this.id, ibANStatus.id) &&
        Objects.equals(this.date, ibANStatus.date) &&
        Objects.equals(this.source, ibANStatus.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, nip, regon, iban, valid, id, date, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IBANStatus {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    nip: ").append(toIndentedString(nip)).append("\n");
    sb.append("    regon: ").append(toIndentedString(regon)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
