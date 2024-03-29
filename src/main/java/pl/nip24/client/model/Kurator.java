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
 * Kurator
 */


public class Kurator {
  @JsonProperty("nazwisko")
  private NazwiskoOsoby nazwisko = null;

  @JsonProperty("imiona")
  private ImionaOsoby imiona = null;

  @JsonProperty("identyfikator")
  private IdentyfikatorOsoby identyfikator = null;

  @JsonProperty("podstawaPowolaniaZakresDzialania")
  private String podstawaPowolaniaZakresDzialania = null;

  @JsonProperty("dataPowolania")
  private String dataPowolania = null;

  @JsonProperty("dataDoKtorejMaDzialac")
  private String dataDoKtorejMaDzialac = null;

  public Kurator nazwisko(NazwiskoOsoby nazwisko) {
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

  public Kurator imiona(ImionaOsoby imiona) {
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

  public Kurator identyfikator(IdentyfikatorOsoby identyfikator) {
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

  public Kurator podstawaPowolaniaZakresDzialania(String podstawaPowolaniaZakresDzialania) {
    this.podstawaPowolaniaZakresDzialania = podstawaPowolaniaZakresDzialania;
    return this;
  }

   /**
   * Get podstawaPowolaniaZakresDzialania
   * @return podstawaPowolaniaZakresDzialania
  **/
  @Schema(description = "")
  public String getPodstawaPowolaniaZakresDzialania() {
    return podstawaPowolaniaZakresDzialania;
  }

  public void setPodstawaPowolaniaZakresDzialania(String podstawaPowolaniaZakresDzialania) {
    this.podstawaPowolaniaZakresDzialania = podstawaPowolaniaZakresDzialania;
  }

  public Kurator dataPowolania(String dataPowolania) {
    this.dataPowolania = dataPowolania;
    return this;
  }

   /**
   * Get dataPowolania
   * @return dataPowolania
  **/
  @Schema(description = "")
  public String getDataPowolania() {
    return dataPowolania;
  }

  public void setDataPowolania(String dataPowolania) {
    this.dataPowolania = dataPowolania;
  }

  public Kurator dataDoKtorejMaDzialac(String dataDoKtorejMaDzialac) {
    this.dataDoKtorejMaDzialac = dataDoKtorejMaDzialac;
    return this;
  }

   /**
   * Get dataDoKtorejMaDzialac
   * @return dataDoKtorejMaDzialac
  **/
  @Schema(description = "")
  public String getDataDoKtorejMaDzialac() {
    return dataDoKtorejMaDzialac;
  }

  public void setDataDoKtorejMaDzialac(String dataDoKtorejMaDzialac) {
    this.dataDoKtorejMaDzialac = dataDoKtorejMaDzialac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kurator kurator = (Kurator) o;
    return Objects.equals(this.nazwisko, kurator.nazwisko) &&
        Objects.equals(this.imiona, kurator.imiona) &&
        Objects.equals(this.identyfikator, kurator.identyfikator) &&
        Objects.equals(this.podstawaPowolaniaZakresDzialania, kurator.podstawaPowolaniaZakresDzialania) &&
        Objects.equals(this.dataPowolania, kurator.dataPowolania) &&
        Objects.equals(this.dataDoKtorejMaDzialac, kurator.dataDoKtorejMaDzialac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nazwisko, imiona, identyfikator, podstawaPowolaniaZakresDzialania, dataPowolania, dataDoKtorejMaDzialac);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kurator {\n");
    
    sb.append("    nazwisko: ").append(toIndentedString(nazwisko)).append("\n");
    sb.append("    imiona: ").append(toIndentedString(imiona)).append("\n");
    sb.append("    identyfikator: ").append(toIndentedString(identyfikator)).append("\n");
    sb.append("    podstawaPowolaniaZakresDzialania: ").append(toIndentedString(podstawaPowolaniaZakresDzialania)).append("\n");
    sb.append("    dataPowolania: ").append(toIndentedString(dataPowolania)).append("\n");
    sb.append("    dataDoKtorejMaDzialac: ").append(toIndentedString(dataDoKtorejMaDzialac)).append("\n");
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
