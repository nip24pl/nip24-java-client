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
 * VATStatus
 */


public class VATStatus {
  @JsonProperty("uid")
  private String uid = null;

  @JsonProperty("nip")
  private String nip = null;

  @JsonProperty("regon")
  private String regon = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("source")
  private String source = null;

  public VATStatus uid(String uid) {
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

  public VATStatus nip(String nip) {
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

  public VATStatus regon(String regon) {
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

  public VATStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VATStatus status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * minimum: 1
   * maximum: 3
   * @return status
  **/
  @Schema(required = true, description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public VATStatus result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(required = true, description = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public VATStatus id(String id) {
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

  public VATStatus date(LocalDate date) {
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

  public VATStatus source(String source) {
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
    VATStatus vaTStatus = (VATStatus) o;
    return Objects.equals(this.uid, vaTStatus.uid) &&
        Objects.equals(this.nip, vaTStatus.nip) &&
        Objects.equals(this.regon, vaTStatus.regon) &&
        Objects.equals(this.name, vaTStatus.name) &&
        Objects.equals(this.status, vaTStatus.status) &&
        Objects.equals(this.result, vaTStatus.result) &&
        Objects.equals(this.id, vaTStatus.id) &&
        Objects.equals(this.date, vaTStatus.date) &&
        Objects.equals(this.source, vaTStatus.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, nip, regon, name, status, result, id, date, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VATStatus {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    nip: ").append(toIndentedString(nip)).append("\n");
    sb.append("    regon: ").append(toIndentedString(regon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
