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
import pl.nip24.client.model.SearchResult;
/**
 * SearchResultResult
 */


public class SearchResultResult {
  @JsonProperty("search")
  private SearchResult search = null;

  public SearchResultResult search(SearchResult search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
  @Schema(required = true, description = "")
  public SearchResult getSearch() {
    return search;
  }

  public void setSearch(SearchResult search) {
    this.search = search;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultResult searchResultResult = (SearchResultResult) o;
    return Objects.equals(this.search, searchResultResult.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(search);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultResult {\n");
    
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
