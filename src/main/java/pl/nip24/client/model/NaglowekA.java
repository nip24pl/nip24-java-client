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
import pl.nip24.client.model.Rejestr;
/**
 * NaglowekA
 */


public class NaglowekA {
  @JsonProperty("rejestr")
  private Rejestr rejestr = null;

  @JsonProperty("numerKRS")
  private String numerKRS = null;

  @JsonProperty("dataCzasOdpisu")
  private String dataCzasOdpisu = null;

  @JsonProperty("stanZDnia")
  private String stanZDnia = null;

  @JsonProperty("dataRejestracjiWKRS")
  private String dataRejestracjiWKRS = null;

  @JsonProperty("numerOstatniegoWpisu")
  private Integer numerOstatniegoWpisu = null;

  @JsonProperty("dataOstatniegoWpisu")
  private String dataOstatniegoWpisu = null;

  @JsonProperty("sygnaturaAktSprawyDotyczacejOstatniegoWpisu")
  private String sygnaturaAktSprawyDotyczacejOstatniegoWpisu = null;

  @JsonProperty("oznaczenieSaduDokonujacegoOstatniegoWpisu")
  private String oznaczenieSaduDokonujacegoOstatniegoWpisu = null;

  @JsonProperty("stanPozycji")
  private Integer stanPozycji = null;

  public NaglowekA rejestr(Rejestr rejestr) {
    this.rejestr = rejestr;
    return this;
  }

   /**
   * Get rejestr
   * @return rejestr
  **/
  @Schema(description = "")
  public Rejestr getRejestr() {
    return rejestr;
  }

  public void setRejestr(Rejestr rejestr) {
    this.rejestr = rejestr;
  }

  public NaglowekA numerKRS(String numerKRS) {
    this.numerKRS = numerKRS;
    return this;
  }

   /**
   * Get numerKRS
   * @return numerKRS
  **/
  @Schema(description = "")
  public String getNumerKRS() {
    return numerKRS;
  }

  public void setNumerKRS(String numerKRS) {
    this.numerKRS = numerKRS;
  }

  public NaglowekA dataCzasOdpisu(String dataCzasOdpisu) {
    this.dataCzasOdpisu = dataCzasOdpisu;
    return this;
  }

   /**
   * Get dataCzasOdpisu
   * @return dataCzasOdpisu
  **/
  @Schema(description = "")
  public String getDataCzasOdpisu() {
    return dataCzasOdpisu;
  }

  public void setDataCzasOdpisu(String dataCzasOdpisu) {
    this.dataCzasOdpisu = dataCzasOdpisu;
  }

  public NaglowekA stanZDnia(String stanZDnia) {
    this.stanZDnia = stanZDnia;
    return this;
  }

   /**
   * Get stanZDnia
   * @return stanZDnia
  **/
  @Schema(description = "")
  public String getStanZDnia() {
    return stanZDnia;
  }

  public void setStanZDnia(String stanZDnia) {
    this.stanZDnia = stanZDnia;
  }

  public NaglowekA dataRejestracjiWKRS(String dataRejestracjiWKRS) {
    this.dataRejestracjiWKRS = dataRejestracjiWKRS;
    return this;
  }

   /**
   * Get dataRejestracjiWKRS
   * @return dataRejestracjiWKRS
  **/
  @Schema(description = "")
  public String getDataRejestracjiWKRS() {
    return dataRejestracjiWKRS;
  }

  public void setDataRejestracjiWKRS(String dataRejestracjiWKRS) {
    this.dataRejestracjiWKRS = dataRejestracjiWKRS;
  }

  public NaglowekA numerOstatniegoWpisu(Integer numerOstatniegoWpisu) {
    this.numerOstatniegoWpisu = numerOstatniegoWpisu;
    return this;
  }

   /**
   * Get numerOstatniegoWpisu
   * @return numerOstatniegoWpisu
  **/
  @Schema(description = "")
  public Integer getNumerOstatniegoWpisu() {
    return numerOstatniegoWpisu;
  }

  public void setNumerOstatniegoWpisu(Integer numerOstatniegoWpisu) {
    this.numerOstatniegoWpisu = numerOstatniegoWpisu;
  }

  public NaglowekA dataOstatniegoWpisu(String dataOstatniegoWpisu) {
    this.dataOstatniegoWpisu = dataOstatniegoWpisu;
    return this;
  }

   /**
   * Get dataOstatniegoWpisu
   * @return dataOstatniegoWpisu
  **/
  @Schema(description = "")
  public String getDataOstatniegoWpisu() {
    return dataOstatniegoWpisu;
  }

  public void setDataOstatniegoWpisu(String dataOstatniegoWpisu) {
    this.dataOstatniegoWpisu = dataOstatniegoWpisu;
  }

  public NaglowekA sygnaturaAktSprawyDotyczacejOstatniegoWpisu(String sygnaturaAktSprawyDotyczacejOstatniegoWpisu) {
    this.sygnaturaAktSprawyDotyczacejOstatniegoWpisu = sygnaturaAktSprawyDotyczacejOstatniegoWpisu;
    return this;
  }

   /**
   * Get sygnaturaAktSprawyDotyczacejOstatniegoWpisu
   * @return sygnaturaAktSprawyDotyczacejOstatniegoWpisu
  **/
  @Schema(description = "")
  public String getSygnaturaAktSprawyDotyczacejOstatniegoWpisu() {
    return sygnaturaAktSprawyDotyczacejOstatniegoWpisu;
  }

  public void setSygnaturaAktSprawyDotyczacejOstatniegoWpisu(String sygnaturaAktSprawyDotyczacejOstatniegoWpisu) {
    this.sygnaturaAktSprawyDotyczacejOstatniegoWpisu = sygnaturaAktSprawyDotyczacejOstatniegoWpisu;
  }

  public NaglowekA oznaczenieSaduDokonujacegoOstatniegoWpisu(String oznaczenieSaduDokonujacegoOstatniegoWpisu) {
    this.oznaczenieSaduDokonujacegoOstatniegoWpisu = oznaczenieSaduDokonujacegoOstatniegoWpisu;
    return this;
  }

   /**
   * Get oznaczenieSaduDokonujacegoOstatniegoWpisu
   * @return oznaczenieSaduDokonujacegoOstatniegoWpisu
  **/
  @Schema(description = "")
  public String getOznaczenieSaduDokonujacegoOstatniegoWpisu() {
    return oznaczenieSaduDokonujacegoOstatniegoWpisu;
  }

  public void setOznaczenieSaduDokonujacegoOstatniegoWpisu(String oznaczenieSaduDokonujacegoOstatniegoWpisu) {
    this.oznaczenieSaduDokonujacegoOstatniegoWpisu = oznaczenieSaduDokonujacegoOstatniegoWpisu;
  }

  public NaglowekA stanPozycji(Integer stanPozycji) {
    this.stanPozycji = stanPozycji;
    return this;
  }

   /**
   * Get stanPozycji
   * @return stanPozycji
  **/
  @Schema(description = "")
  public Integer getStanPozycji() {
    return stanPozycji;
  }

  public void setStanPozycji(Integer stanPozycji) {
    this.stanPozycji = stanPozycji;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NaglowekA naglowekA = (NaglowekA) o;
    return Objects.equals(this.rejestr, naglowekA.rejestr) &&
        Objects.equals(this.numerKRS, naglowekA.numerKRS) &&
        Objects.equals(this.dataCzasOdpisu, naglowekA.dataCzasOdpisu) &&
        Objects.equals(this.stanZDnia, naglowekA.stanZDnia) &&
        Objects.equals(this.dataRejestracjiWKRS, naglowekA.dataRejestracjiWKRS) &&
        Objects.equals(this.numerOstatniegoWpisu, naglowekA.numerOstatniegoWpisu) &&
        Objects.equals(this.dataOstatniegoWpisu, naglowekA.dataOstatniegoWpisu) &&
        Objects.equals(this.sygnaturaAktSprawyDotyczacejOstatniegoWpisu, naglowekA.sygnaturaAktSprawyDotyczacejOstatniegoWpisu) &&
        Objects.equals(this.oznaczenieSaduDokonujacegoOstatniegoWpisu, naglowekA.oznaczenieSaduDokonujacegoOstatniegoWpisu) &&
        Objects.equals(this.stanPozycji, naglowekA.stanPozycji);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejestr, numerKRS, dataCzasOdpisu, stanZDnia, dataRejestracjiWKRS, numerOstatniegoWpisu, dataOstatniegoWpisu, sygnaturaAktSprawyDotyczacejOstatniegoWpisu, oznaczenieSaduDokonujacegoOstatniegoWpisu, stanPozycji);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NaglowekA {\n");
    
    sb.append("    rejestr: ").append(toIndentedString(rejestr)).append("\n");
    sb.append("    numerKRS: ").append(toIndentedString(numerKRS)).append("\n");
    sb.append("    dataCzasOdpisu: ").append(toIndentedString(dataCzasOdpisu)).append("\n");
    sb.append("    stanZDnia: ").append(toIndentedString(stanZDnia)).append("\n");
    sb.append("    dataRejestracjiWKRS: ").append(toIndentedString(dataRejestracjiWKRS)).append("\n");
    sb.append("    numerOstatniegoWpisu: ").append(toIndentedString(numerOstatniegoWpisu)).append("\n");
    sb.append("    dataOstatniegoWpisu: ").append(toIndentedString(dataOstatniegoWpisu)).append("\n");
    sb.append("    sygnaturaAktSprawyDotyczacejOstatniegoWpisu: ").append(toIndentedString(sygnaturaAktSprawyDotyczacejOstatniegoWpisu)).append("\n");
    sb.append("    oznaczenieSaduDokonujacegoOstatniegoWpisu: ").append(toIndentedString(oznaczenieSaduDokonujacegoOstatniegoWpisu)).append("\n");
    sb.append("    stanPozycji: ").append(toIndentedString(stanPozycji)).append("\n");
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