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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets RodzajOdpisu
 */
public enum RodzajOdpisu {
  PE_NY("Pełny"),
  AKTUALNY("Aktualny");

  private String value;

  RodzajOdpisu(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RodzajOdpisu fromValue(String input) {
    for (RodzajOdpisu b : RodzajOdpisu.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
}
