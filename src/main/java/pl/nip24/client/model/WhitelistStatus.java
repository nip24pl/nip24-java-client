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
 * WhitelistStatus
 */


public class WhitelistStatus {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("nip")
  private String nip = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("virtual")
  private Boolean virtual = null;

  @JsonProperty("vatStatus")
  private Integer vatStatus = null;

  @JsonProperty("vatResult")
  private String vatResult = null;

  @JsonProperty("hashIndex")
  private Long hashIndex = null;

  @JsonProperty("maskIndex")
  private Long maskIndex = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("source")
  private String source = null;

  public WhitelistStatus uid(String uid) {
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

  public WhitelistStatus nip(String nip) {
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

  public WhitelistStatus iban(String iban) {
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

  public WhitelistStatus valid(Boolean valid) {
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

  public WhitelistStatus virtual(Boolean virtual) {
    this.virtual = virtual;
    return this;
  }

   /**
   * Get virtual
   * @return virtual
  **/
  @Schema(required = true, description = "")
  public Boolean isVirtual() {
    return virtual;
  }

  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }

  public WhitelistStatus vatStatus(Integer vatStatus) {
    this.vatStatus = vatStatus;
    return this;
  }

   /**
   * Get vatStatus
   * minimum: 1
   * maximum: 3
   * @return vatStatus
  **/
  @Schema(required = true, description = "")
  public Integer getVatStatus() {
    return vatStatus;
  }

  public void setVatStatus(Integer vatStatus) {
    this.vatStatus = vatStatus;
  }

  public WhitelistStatus vatResult(String vatResult) {
    this.vatResult = vatResult;
    return this;
  }

   /**
   * Get vatResult
   * @return vatResult
  **/
  @Schema(required = true, description = "")
  public String getVatResult() {
    return vatResult;
  }

  public void setVatResult(String vatResult) {
    this.vatResult = vatResult;
  }

  public WhitelistStatus hashIndex(Long hashIndex) {
    this.hashIndex = hashIndex;
    return this;
  }

   /**
   * Get hashIndex
   * @return hashIndex
  **/
  @Schema(required = true, description = "")
  public Long getHashIndex() {
    return hashIndex;
  }

  public void setHashIndex(Long hashIndex) {
    this.hashIndex = hashIndex;
  }

  public WhitelistStatus maskIndex(Long maskIndex) {
    this.maskIndex = maskIndex;
    return this;
  }

   /**
   * Get maskIndex
   * @return maskIndex
  **/
  @Schema(required = true, description = "")
  public Long getMaskIndex() {
    return maskIndex;
  }

  public void setMaskIndex(Long maskIndex) {
    this.maskIndex = maskIndex;
  }

  public WhitelistStatus date(LocalDate date) {
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

  public WhitelistStatus source(String source) {
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
    WhitelistStatus whitelistStatus = (WhitelistStatus) o;
    return Objects.equals(this.uid, whitelistStatus.uid) &&
        Objects.equals(this.nip, whitelistStatus.nip) &&
        Objects.equals(this.iban, whitelistStatus.iban) &&
        Objects.equals(this.valid, whitelistStatus.valid) &&
        Objects.equals(this.virtual, whitelistStatus.virtual) &&
        Objects.equals(this.vatStatus, whitelistStatus.vatStatus) &&
        Objects.equals(this.vatResult, whitelistStatus.vatResult) &&
        Objects.equals(this.hashIndex, whitelistStatus.hashIndex) &&
        Objects.equals(this.maskIndex, whitelistStatus.maskIndex) &&
        Objects.equals(this.date, whitelistStatus.date) &&
        Objects.equals(this.source, whitelistStatus.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, nip, iban, valid, virtual, vatStatus, vatResult, hashIndex, maskIndex, date, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhitelistStatus {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    nip: ").append(toIndentedString(nip)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
    sb.append("    vatStatus: ").append(toIndentedString(vatStatus)).append("\n");
    sb.append("    vatResult: ").append(toIndentedString(vatResult)).append("\n");
    sb.append("    hashIndex: ").append(toIndentedString(hashIndex)).append("\n");
    sb.append("    maskIndex: ").append(toIndentedString(maskIndex)).append("\n");
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
