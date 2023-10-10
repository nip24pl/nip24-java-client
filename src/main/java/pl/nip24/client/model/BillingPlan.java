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
 * BillingPlan
 */


public class BillingPlan {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subscriptionPrice")
  private Double subscriptionPrice = null;

  @JsonProperty("itemPrice")
  private Double itemPrice = null;

  @JsonProperty("itemPriceCheckStatus")
  private Double itemPriceCheckStatus = null;

  @JsonProperty("itemPriceInvoiceData")
  private Double itemPriceInvoiceData = null;

  @JsonProperty("itemPriceAllData")
  private Double itemPriceAllData = null;

  @JsonProperty("itemPriceIBANStatus")
  private Double itemPriceIBANStatus = null;

  @JsonProperty("itemPriceWLStatus")
  private Double itemPriceWLStatus = null;

  @JsonProperty("itemPriceSearchVAT")
  private Double itemPriceSearchVAT = null;

  @JsonProperty("limit")
  private Integer limit = null;

  @JsonProperty("requestDelay")
  private Integer requestDelay = null;

  @JsonProperty("domainLimit")
  private Integer domainLimit = null;

  @JsonProperty("overplanAllowed")
  private Boolean overplanAllowed = null;

  @JsonProperty("terytCodes")
  private Boolean terytCodes = null;

  @JsonProperty("excelAddin")
  private Boolean excelAddin = null;

  @JsonProperty("jpkVat")
  private Boolean jpkVat = null;

  @JsonProperty("cli")
  private Boolean cli = null;

  @JsonProperty("stats")
  private Boolean stats = null;

  @JsonProperty("nipMonitor")
  private Boolean nipMonitor = null;

  @JsonProperty("searchByNip")
  private Boolean searchByNip = null;

  @JsonProperty("searchByRegon")
  private Boolean searchByRegon = null;

  @JsonProperty("searchByKrs")
  private Boolean searchByKrs = null;

  @JsonProperty("funcIsActive")
  private Boolean funcIsActive = null;

  @JsonProperty("funcGetInvoiceData")
  private Boolean funcGetInvoiceData = null;

  @JsonProperty("funcGetAllData")
  private Boolean funcGetAllData = null;

  @JsonProperty("funcGetVIESData")
  private Boolean funcGetVIESData = null;

  @JsonProperty("funcGetVATStatus")
  private Boolean funcGetVATStatus = null;

  @JsonProperty("funcGetIBANStatus")
  private Boolean funcGetIBANStatus = null;

  @JsonProperty("funcGetWLStatus")
  private Boolean funcGetWLStatus = null;

  @JsonProperty("funcSearchVAT")
  private Boolean funcSearchVAT = null;

  public BillingPlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BillingPlan subscriptionPrice(Double subscriptionPrice) {
    this.subscriptionPrice = subscriptionPrice;
    return this;
  }

   /**
   * Get subscriptionPrice
   * @return subscriptionPrice
  **/
  @Schema(required = true, description = "")
  public Double getSubscriptionPrice() {
    return subscriptionPrice;
  }

  public void setSubscriptionPrice(Double subscriptionPrice) {
    this.subscriptionPrice = subscriptionPrice;
  }

  public BillingPlan itemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * Get itemPrice
   * @return itemPrice
  **/
  @Schema(description = "")
  public Double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public BillingPlan itemPriceCheckStatus(Double itemPriceCheckStatus) {
    this.itemPriceCheckStatus = itemPriceCheckStatus;
    return this;
  }

   /**
   * Get itemPriceCheckStatus
   * @return itemPriceCheckStatus
  **/
  @Schema(description = "")
  public Double getItemPriceCheckStatus() {
    return itemPriceCheckStatus;
  }

  public void setItemPriceCheckStatus(Double itemPriceCheckStatus) {
    this.itemPriceCheckStatus = itemPriceCheckStatus;
  }

  public BillingPlan itemPriceInvoiceData(Double itemPriceInvoiceData) {
    this.itemPriceInvoiceData = itemPriceInvoiceData;
    return this;
  }

   /**
   * Get itemPriceInvoiceData
   * @return itemPriceInvoiceData
  **/
  @Schema(description = "")
  public Double getItemPriceInvoiceData() {
    return itemPriceInvoiceData;
  }

  public void setItemPriceInvoiceData(Double itemPriceInvoiceData) {
    this.itemPriceInvoiceData = itemPriceInvoiceData;
  }

  public BillingPlan itemPriceAllData(Double itemPriceAllData) {
    this.itemPriceAllData = itemPriceAllData;
    return this;
  }

   /**
   * Get itemPriceAllData
   * @return itemPriceAllData
  **/
  @Schema(description = "")
  public Double getItemPriceAllData() {
    return itemPriceAllData;
  }

  public void setItemPriceAllData(Double itemPriceAllData) {
    this.itemPriceAllData = itemPriceAllData;
  }

  public BillingPlan itemPriceIBANStatus(Double itemPriceIBANStatus) {
    this.itemPriceIBANStatus = itemPriceIBANStatus;
    return this;
  }

   /**
   * Get itemPriceIBANStatus
   * @return itemPriceIBANStatus
  **/
  @Schema(description = "")
  public Double getItemPriceIBANStatus() {
    return itemPriceIBANStatus;
  }

  public void setItemPriceIBANStatus(Double itemPriceIBANStatus) {
    this.itemPriceIBANStatus = itemPriceIBANStatus;
  }

  public BillingPlan itemPriceWLStatus(Double itemPriceWLStatus) {
    this.itemPriceWLStatus = itemPriceWLStatus;
    return this;
  }

   /**
   * Get itemPriceWLStatus
   * @return itemPriceWLStatus
  **/
  @Schema(description = "")
  public Double getItemPriceWLStatus() {
    return itemPriceWLStatus;
  }

  public void setItemPriceWLStatus(Double itemPriceWLStatus) {
    this.itemPriceWLStatus = itemPriceWLStatus;
  }

  public BillingPlan itemPriceSearchVAT(Double itemPriceSearchVAT) {
    this.itemPriceSearchVAT = itemPriceSearchVAT;
    return this;
  }

   /**
   * Get itemPriceSearchVAT
   * @return itemPriceSearchVAT
  **/
  @Schema(description = "")
  public Double getItemPriceSearchVAT() {
    return itemPriceSearchVAT;
  }

  public void setItemPriceSearchVAT(Double itemPriceSearchVAT) {
    this.itemPriceSearchVAT = itemPriceSearchVAT;
  }

  public BillingPlan limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @Schema(required = true, description = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public BillingPlan requestDelay(Integer requestDelay) {
    this.requestDelay = requestDelay;
    return this;
  }

   /**
   * Get requestDelay
   * @return requestDelay
  **/
  @Schema(required = true, description = "")
  public Integer getRequestDelay() {
    return requestDelay;
  }

  public void setRequestDelay(Integer requestDelay) {
    this.requestDelay = requestDelay;
  }

  public BillingPlan domainLimit(Integer domainLimit) {
    this.domainLimit = domainLimit;
    return this;
  }

   /**
   * Get domainLimit
   * @return domainLimit
  **/
  @Schema(required = true, description = "")
  public Integer getDomainLimit() {
    return domainLimit;
  }

  public void setDomainLimit(Integer domainLimit) {
    this.domainLimit = domainLimit;
  }

  public BillingPlan overplanAllowed(Boolean overplanAllowed) {
    this.overplanAllowed = overplanAllowed;
    return this;
  }

   /**
   * Get overplanAllowed
   * @return overplanAllowed
  **/
  @Schema(required = true, description = "")
  public Boolean isOverplanAllowed() {
    return overplanAllowed;
  }

  public void setOverplanAllowed(Boolean overplanAllowed) {
    this.overplanAllowed = overplanAllowed;
  }

  public BillingPlan terytCodes(Boolean terytCodes) {
    this.terytCodes = terytCodes;
    return this;
  }

   /**
   * Get terytCodes
   * @return terytCodes
  **/
  @Schema(required = true, description = "")
  public Boolean isTerytCodes() {
    return terytCodes;
  }

  public void setTerytCodes(Boolean terytCodes) {
    this.terytCodes = terytCodes;
  }

  public BillingPlan excelAddin(Boolean excelAddin) {
    this.excelAddin = excelAddin;
    return this;
  }

   /**
   * Get excelAddin
   * @return excelAddin
  **/
  @Schema(required = true, description = "")
  public Boolean isExcelAddin() {
    return excelAddin;
  }

  public void setExcelAddin(Boolean excelAddin) {
    this.excelAddin = excelAddin;
  }

  public BillingPlan jpkVat(Boolean jpkVat) {
    this.jpkVat = jpkVat;
    return this;
  }

   /**
   * Get jpkVat
   * @return jpkVat
  **/
  @Schema(required = true, description = "")
  public Boolean isJpkVat() {
    return jpkVat;
  }

  public void setJpkVat(Boolean jpkVat) {
    this.jpkVat = jpkVat;
  }

  public BillingPlan cli(Boolean cli) {
    this.cli = cli;
    return this;
  }

   /**
   * Get cli
   * @return cli
  **/
  @Schema(required = true, description = "")
  public Boolean isCli() {
    return cli;
  }

  public void setCli(Boolean cli) {
    this.cli = cli;
  }

  public BillingPlan stats(Boolean stats) {
    this.stats = stats;
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @Schema(required = true, description = "")
  public Boolean isStats() {
    return stats;
  }

  public void setStats(Boolean stats) {
    this.stats = stats;
  }

  public BillingPlan nipMonitor(Boolean nipMonitor) {
    this.nipMonitor = nipMonitor;
    return this;
  }

   /**
   * Get nipMonitor
   * @return nipMonitor
  **/
  @Schema(required = true, description = "")
  public Boolean isNipMonitor() {
    return nipMonitor;
  }

  public void setNipMonitor(Boolean nipMonitor) {
    this.nipMonitor = nipMonitor;
  }

  public BillingPlan searchByNip(Boolean searchByNip) {
    this.searchByNip = searchByNip;
    return this;
  }

   /**
   * Get searchByNip
   * @return searchByNip
  **/
  @Schema(required = true, description = "")
  public Boolean isSearchByNip() {
    return searchByNip;
  }

  public void setSearchByNip(Boolean searchByNip) {
    this.searchByNip = searchByNip;
  }

  public BillingPlan searchByRegon(Boolean searchByRegon) {
    this.searchByRegon = searchByRegon;
    return this;
  }

   /**
   * Get searchByRegon
   * @return searchByRegon
  **/
  @Schema(required = true, description = "")
  public Boolean isSearchByRegon() {
    return searchByRegon;
  }

  public void setSearchByRegon(Boolean searchByRegon) {
    this.searchByRegon = searchByRegon;
  }

  public BillingPlan searchByKrs(Boolean searchByKrs) {
    this.searchByKrs = searchByKrs;
    return this;
  }

   /**
   * Get searchByKrs
   * @return searchByKrs
  **/
  @Schema(required = true, description = "")
  public Boolean isSearchByKrs() {
    return searchByKrs;
  }

  public void setSearchByKrs(Boolean searchByKrs) {
    this.searchByKrs = searchByKrs;
  }

  public BillingPlan funcIsActive(Boolean funcIsActive) {
    this.funcIsActive = funcIsActive;
    return this;
  }

   /**
   * Get funcIsActive
   * @return funcIsActive
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncIsActive() {
    return funcIsActive;
  }

  public void setFuncIsActive(Boolean funcIsActive) {
    this.funcIsActive = funcIsActive;
  }

  public BillingPlan funcGetInvoiceData(Boolean funcGetInvoiceData) {
    this.funcGetInvoiceData = funcGetInvoiceData;
    return this;
  }

   /**
   * Get funcGetInvoiceData
   * @return funcGetInvoiceData
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetInvoiceData() {
    return funcGetInvoiceData;
  }

  public void setFuncGetInvoiceData(Boolean funcGetInvoiceData) {
    this.funcGetInvoiceData = funcGetInvoiceData;
  }

  public BillingPlan funcGetAllData(Boolean funcGetAllData) {
    this.funcGetAllData = funcGetAllData;
    return this;
  }

   /**
   * Get funcGetAllData
   * @return funcGetAllData
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetAllData() {
    return funcGetAllData;
  }

  public void setFuncGetAllData(Boolean funcGetAllData) {
    this.funcGetAllData = funcGetAllData;
  }

  public BillingPlan funcGetVIESData(Boolean funcGetVIESData) {
    this.funcGetVIESData = funcGetVIESData;
    return this;
  }

   /**
   * Get funcGetVIESData
   * @return funcGetVIESData
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetVIESData() {
    return funcGetVIESData;
  }

  public void setFuncGetVIESData(Boolean funcGetVIESData) {
    this.funcGetVIESData = funcGetVIESData;
  }

  public BillingPlan funcGetVATStatus(Boolean funcGetVATStatus) {
    this.funcGetVATStatus = funcGetVATStatus;
    return this;
  }

   /**
   * Get funcGetVATStatus
   * @return funcGetVATStatus
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetVATStatus() {
    return funcGetVATStatus;
  }

  public void setFuncGetVATStatus(Boolean funcGetVATStatus) {
    this.funcGetVATStatus = funcGetVATStatus;
  }

  public BillingPlan funcGetIBANStatus(Boolean funcGetIBANStatus) {
    this.funcGetIBANStatus = funcGetIBANStatus;
    return this;
  }

   /**
   * Get funcGetIBANStatus
   * @return funcGetIBANStatus
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetIBANStatus() {
    return funcGetIBANStatus;
  }

  public void setFuncGetIBANStatus(Boolean funcGetIBANStatus) {
    this.funcGetIBANStatus = funcGetIBANStatus;
  }

  public BillingPlan funcGetWLStatus(Boolean funcGetWLStatus) {
    this.funcGetWLStatus = funcGetWLStatus;
    return this;
  }

   /**
   * Get funcGetWLStatus
   * @return funcGetWLStatus
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncGetWLStatus() {
    return funcGetWLStatus;
  }

  public void setFuncGetWLStatus(Boolean funcGetWLStatus) {
    this.funcGetWLStatus = funcGetWLStatus;
  }

  public BillingPlan funcSearchVAT(Boolean funcSearchVAT) {
    this.funcSearchVAT = funcSearchVAT;
    return this;
  }

   /**
   * Get funcSearchVAT
   * @return funcSearchVAT
  **/
  @Schema(required = true, description = "")
  public Boolean isFuncSearchVAT() {
    return funcSearchVAT;
  }

  public void setFuncSearchVAT(Boolean funcSearchVAT) {
    this.funcSearchVAT = funcSearchVAT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlan billingPlan = (BillingPlan) o;
    return Objects.equals(this.name, billingPlan.name) &&
        Objects.equals(this.subscriptionPrice, billingPlan.subscriptionPrice) &&
        Objects.equals(this.itemPrice, billingPlan.itemPrice) &&
        Objects.equals(this.itemPriceCheckStatus, billingPlan.itemPriceCheckStatus) &&
        Objects.equals(this.itemPriceInvoiceData, billingPlan.itemPriceInvoiceData) &&
        Objects.equals(this.itemPriceAllData, billingPlan.itemPriceAllData) &&
        Objects.equals(this.itemPriceIBANStatus, billingPlan.itemPriceIBANStatus) &&
        Objects.equals(this.itemPriceWLStatus, billingPlan.itemPriceWLStatus) &&
        Objects.equals(this.itemPriceSearchVAT, billingPlan.itemPriceSearchVAT) &&
        Objects.equals(this.limit, billingPlan.limit) &&
        Objects.equals(this.requestDelay, billingPlan.requestDelay) &&
        Objects.equals(this.domainLimit, billingPlan.domainLimit) &&
        Objects.equals(this.overplanAllowed, billingPlan.overplanAllowed) &&
        Objects.equals(this.terytCodes, billingPlan.terytCodes) &&
        Objects.equals(this.excelAddin, billingPlan.excelAddin) &&
        Objects.equals(this.jpkVat, billingPlan.jpkVat) &&
        Objects.equals(this.cli, billingPlan.cli) &&
        Objects.equals(this.stats, billingPlan.stats) &&
        Objects.equals(this.nipMonitor, billingPlan.nipMonitor) &&
        Objects.equals(this.searchByNip, billingPlan.searchByNip) &&
        Objects.equals(this.searchByRegon, billingPlan.searchByRegon) &&
        Objects.equals(this.searchByKrs, billingPlan.searchByKrs) &&
        Objects.equals(this.funcIsActive, billingPlan.funcIsActive) &&
        Objects.equals(this.funcGetInvoiceData, billingPlan.funcGetInvoiceData) &&
        Objects.equals(this.funcGetAllData, billingPlan.funcGetAllData) &&
        Objects.equals(this.funcGetVIESData, billingPlan.funcGetVIESData) &&
        Objects.equals(this.funcGetVATStatus, billingPlan.funcGetVATStatus) &&
        Objects.equals(this.funcGetIBANStatus, billingPlan.funcGetIBANStatus) &&
        Objects.equals(this.funcGetWLStatus, billingPlan.funcGetWLStatus) &&
        Objects.equals(this.funcSearchVAT, billingPlan.funcSearchVAT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriptionPrice, itemPrice, itemPriceCheckStatus, itemPriceInvoiceData, itemPriceAllData, itemPriceIBANStatus, itemPriceWLStatus, itemPriceSearchVAT, limit, requestDelay, domainLimit, overplanAllowed, terytCodes, excelAddin, jpkVat, cli, stats, nipMonitor, searchByNip, searchByRegon, searchByKrs, funcIsActive, funcGetInvoiceData, funcGetAllData, funcGetVIESData, funcGetVATStatus, funcGetIBANStatus, funcGetWLStatus, funcSearchVAT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlan {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionPrice: ").append(toIndentedString(subscriptionPrice)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemPriceCheckStatus: ").append(toIndentedString(itemPriceCheckStatus)).append("\n");
    sb.append("    itemPriceInvoiceData: ").append(toIndentedString(itemPriceInvoiceData)).append("\n");
    sb.append("    itemPriceAllData: ").append(toIndentedString(itemPriceAllData)).append("\n");
    sb.append("    itemPriceIBANStatus: ").append(toIndentedString(itemPriceIBANStatus)).append("\n");
    sb.append("    itemPriceWLStatus: ").append(toIndentedString(itemPriceWLStatus)).append("\n");
    sb.append("    itemPriceSearchVAT: ").append(toIndentedString(itemPriceSearchVAT)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    requestDelay: ").append(toIndentedString(requestDelay)).append("\n");
    sb.append("    domainLimit: ").append(toIndentedString(domainLimit)).append("\n");
    sb.append("    overplanAllowed: ").append(toIndentedString(overplanAllowed)).append("\n");
    sb.append("    terytCodes: ").append(toIndentedString(terytCodes)).append("\n");
    sb.append("    excelAddin: ").append(toIndentedString(excelAddin)).append("\n");
    sb.append("    jpkVat: ").append(toIndentedString(jpkVat)).append("\n");
    sb.append("    cli: ").append(toIndentedString(cli)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    nipMonitor: ").append(toIndentedString(nipMonitor)).append("\n");
    sb.append("    searchByNip: ").append(toIndentedString(searchByNip)).append("\n");
    sb.append("    searchByRegon: ").append(toIndentedString(searchByRegon)).append("\n");
    sb.append("    searchByKrs: ").append(toIndentedString(searchByKrs)).append("\n");
    sb.append("    funcIsActive: ").append(toIndentedString(funcIsActive)).append("\n");
    sb.append("    funcGetInvoiceData: ").append(toIndentedString(funcGetInvoiceData)).append("\n");
    sb.append("    funcGetAllData: ").append(toIndentedString(funcGetAllData)).append("\n");
    sb.append("    funcGetVIESData: ").append(toIndentedString(funcGetVIESData)).append("\n");
    sb.append("    funcGetVATStatus: ").append(toIndentedString(funcGetVATStatus)).append("\n");
    sb.append("    funcGetIBANStatus: ").append(toIndentedString(funcGetIBANStatus)).append("\n");
    sb.append("    funcGetWLStatus: ").append(toIndentedString(funcGetWLStatus)).append("\n");
    sb.append("    funcSearchVAT: ").append(toIndentedString(funcSearchVAT)).append("\n");
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
