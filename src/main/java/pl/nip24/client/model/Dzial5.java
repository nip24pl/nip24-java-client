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
import pl.nip24.client.model.Kurator;
/**
 * Dzial5
 */


public class Dzial5 {
  @JsonProperty("kurator")
  private List<Kurator> kurator = null;

  public Dzial5 kurator(List<Kurator> kurator) {
    this.kurator = kurator;
    return this;
  }

  public Dzial5 addKuratorItem(Kurator kuratorItem) {
    if (this.kurator == null) {
      this.kurator = new ArrayList<Kurator>();
    }
    this.kurator.add(kuratorItem);
    return this;
  }

   /**
   * Get kurator
   * @return kurator
  **/
  @Schema(description = "")
  public List<Kurator> getKurator() {
    return kurator;
  }

  public void setKurator(List<Kurator> kurator) {
    this.kurator = kurator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dzial5 dzial5 = (Dzial5) o;
    return Objects.equals(this.kurator, dzial5.kurator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kurator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dzial5 {\n");
    
    sb.append("    kurator: ").append(toIndentedString(kurator)).append("\n");
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