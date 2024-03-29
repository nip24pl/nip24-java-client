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
import pl.nip24.client.model.OtwarciePostepowaniaUkladowego;
import pl.nip24.client.model.ZakonczeniePostepowaniaUkladowego;
/**
 * PostepowanieUkladowe
 */


public class PostepowanieUkladowe {
  @JsonProperty("uchylenieUkladu")
  private String uchylenieUkladu = null;

  @JsonProperty("otwarciePostepowaniaUkladowego")
  private OtwarciePostepowaniaUkladowego otwarciePostepowaniaUkladowego = null;

  @JsonProperty("zakonczeniePostepowaniaUkladowego")
  private ZakonczeniePostepowaniaUkladowego zakonczeniePostepowaniaUkladowego = null;

  public PostepowanieUkladowe uchylenieUkladu(String uchylenieUkladu) {
    this.uchylenieUkladu = uchylenieUkladu;
    return this;
  }

   /**
   * Get uchylenieUkladu
   * @return uchylenieUkladu
  **/
  @Schema(description = "")
  public String getUchylenieUkladu() {
    return uchylenieUkladu;
  }

  public void setUchylenieUkladu(String uchylenieUkladu) {
    this.uchylenieUkladu = uchylenieUkladu;
  }

  public PostepowanieUkladowe otwarciePostepowaniaUkladowego(OtwarciePostepowaniaUkladowego otwarciePostepowaniaUkladowego) {
    this.otwarciePostepowaniaUkladowego = otwarciePostepowaniaUkladowego;
    return this;
  }

   /**
   * Get otwarciePostepowaniaUkladowego
   * @return otwarciePostepowaniaUkladowego
  **/
  @Schema(description = "")
  public OtwarciePostepowaniaUkladowego getOtwarciePostepowaniaUkladowego() {
    return otwarciePostepowaniaUkladowego;
  }

  public void setOtwarciePostepowaniaUkladowego(OtwarciePostepowaniaUkladowego otwarciePostepowaniaUkladowego) {
    this.otwarciePostepowaniaUkladowego = otwarciePostepowaniaUkladowego;
  }

  public PostepowanieUkladowe zakonczeniePostepowaniaUkladowego(ZakonczeniePostepowaniaUkladowego zakonczeniePostepowaniaUkladowego) {
    this.zakonczeniePostepowaniaUkladowego = zakonczeniePostepowaniaUkladowego;
    return this;
  }

   /**
   * Get zakonczeniePostepowaniaUkladowego
   * @return zakonczeniePostepowaniaUkladowego
  **/
  @Schema(description = "")
  public ZakonczeniePostepowaniaUkladowego getZakonczeniePostepowaniaUkladowego() {
    return zakonczeniePostepowaniaUkladowego;
  }

  public void setZakonczeniePostepowaniaUkladowego(ZakonczeniePostepowaniaUkladowego zakonczeniePostepowaniaUkladowego) {
    this.zakonczeniePostepowaniaUkladowego = zakonczeniePostepowaniaUkladowego;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostepowanieUkladowe postepowanieUkladowe = (PostepowanieUkladowe) o;
    return Objects.equals(this.uchylenieUkladu, postepowanieUkladowe.uchylenieUkladu) &&
        Objects.equals(this.otwarciePostepowaniaUkladowego, postepowanieUkladowe.otwarciePostepowaniaUkladowego) &&
        Objects.equals(this.zakonczeniePostepowaniaUkladowego, postepowanieUkladowe.zakonczeniePostepowaniaUkladowego);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uchylenieUkladu, otwarciePostepowaniaUkladowego, zakonczeniePostepowaniaUkladowego);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostepowanieUkladowe {\n");
    
    sb.append("    uchylenieUkladu: ").append(toIndentedString(uchylenieUkladu)).append("\n");
    sb.append("    otwarciePostepowaniaUkladowego: ").append(toIndentedString(otwarciePostepowaniaUkladowego)).append("\n");
    sb.append("    zakonczeniePostepowaniaUkladowego: ").append(toIndentedString(zakonczeniePostepowaniaUkladowego)).append("\n");
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
