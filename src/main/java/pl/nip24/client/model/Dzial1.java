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
import pl.nip24.client.model.DanePodmiotu;
import pl.nip24.client.model.EmisjeAkcji;
import pl.nip24.client.model.JednostkiTerenoweOddzialy;
import pl.nip24.client.model.JedynyAkcjonariusz;
import pl.nip24.client.model.Kapital;
import pl.nip24.client.model.OrganSprawujacyNadzor;
import pl.nip24.client.model.PozostaleInformacje;
import pl.nip24.client.model.SiedzibaIAdres;
import pl.nip24.client.model.SposobPowstaniaPodmiotu;
import pl.nip24.client.model.UmowaStatut;
import pl.nip24.client.model.WspolnicySpzoo;
import pl.nip24.client.model.WzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych;
import pl.nip24.client.model.WzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych;
/**
 * Dzial1
 */


public class Dzial1 {
  @JsonProperty("organSprawujacyNadzor")
  private OrganSprawujacyNadzor organSprawujacyNadzor = null;

  @JsonProperty("danePodmiotu")
  private DanePodmiotu danePodmiotu = null;

  @JsonProperty("siedzibaIAdres")
  private SiedzibaIAdres siedzibaIAdres = null;

  @JsonProperty("jednostkiTerenoweOddzialy")
  private List<JednostkiTerenoweOddzialy> jednostkiTerenoweOddzialy = null;

  @JsonProperty("umowaStatut")
  private UmowaStatut umowaStatut = null;

  @JsonProperty("pozostaleInformacje")
  private PozostaleInformacje pozostaleInformacje = null;

  @JsonProperty("wspolnicySpzoo")
  private List<WspolnicySpzoo> wspolnicySpzoo = null;

  @JsonProperty("jedynyAkcjonariusz")
  private List<JedynyAkcjonariusz> jedynyAkcjonariusz = null;

  @JsonProperty("sposobPowstaniaPodmiotu")
  private SposobPowstaniaPodmiotu sposobPowstaniaPodmiotu = null;

  @JsonProperty("kapital")
  private Kapital kapital = null;

  @JsonProperty("emisjeAkcji")
  private List<EmisjeAkcji> emisjeAkcji = null;

  @JsonProperty("wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych")
  private WzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych = null;

  @JsonProperty("wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych")
  private WzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych = null;

  public Dzial1 organSprawujacyNadzor(OrganSprawujacyNadzor organSprawujacyNadzor) {
    this.organSprawujacyNadzor = organSprawujacyNadzor;
    return this;
  }

   /**
   * Get organSprawujacyNadzor
   * @return organSprawujacyNadzor
  **/
  @Schema(description = "")
  public OrganSprawujacyNadzor getOrganSprawujacyNadzor() {
    return organSprawujacyNadzor;
  }

  public void setOrganSprawujacyNadzor(OrganSprawujacyNadzor organSprawujacyNadzor) {
    this.organSprawujacyNadzor = organSprawujacyNadzor;
  }

  public Dzial1 danePodmiotu(DanePodmiotu danePodmiotu) {
    this.danePodmiotu = danePodmiotu;
    return this;
  }

   /**
   * Get danePodmiotu
   * @return danePodmiotu
  **/
  @Schema(description = "")
  public DanePodmiotu getDanePodmiotu() {
    return danePodmiotu;
  }

  public void setDanePodmiotu(DanePodmiotu danePodmiotu) {
    this.danePodmiotu = danePodmiotu;
  }

  public Dzial1 siedzibaIAdres(SiedzibaIAdres siedzibaIAdres) {
    this.siedzibaIAdres = siedzibaIAdres;
    return this;
  }

   /**
   * Get siedzibaIAdres
   * @return siedzibaIAdres
  **/
  @Schema(description = "")
  public SiedzibaIAdres getSiedzibaIAdres() {
    return siedzibaIAdres;
  }

  public void setSiedzibaIAdres(SiedzibaIAdres siedzibaIAdres) {
    this.siedzibaIAdres = siedzibaIAdres;
  }

  public Dzial1 jednostkiTerenoweOddzialy(List<JednostkiTerenoweOddzialy> jednostkiTerenoweOddzialy) {
    this.jednostkiTerenoweOddzialy = jednostkiTerenoweOddzialy;
    return this;
  }

  public Dzial1 addJednostkiTerenoweOddzialyItem(JednostkiTerenoweOddzialy jednostkiTerenoweOddzialyItem) {
    if (this.jednostkiTerenoweOddzialy == null) {
      this.jednostkiTerenoweOddzialy = new ArrayList<JednostkiTerenoweOddzialy>();
    }
    this.jednostkiTerenoweOddzialy.add(jednostkiTerenoweOddzialyItem);
    return this;
  }

   /**
   * Get jednostkiTerenoweOddzialy
   * @return jednostkiTerenoweOddzialy
  **/
  @Schema(description = "")
  public List<JednostkiTerenoweOddzialy> getJednostkiTerenoweOddzialy() {
    return jednostkiTerenoweOddzialy;
  }

  public void setJednostkiTerenoweOddzialy(List<JednostkiTerenoweOddzialy> jednostkiTerenoweOddzialy) {
    this.jednostkiTerenoweOddzialy = jednostkiTerenoweOddzialy;
  }

  public Dzial1 umowaStatut(UmowaStatut umowaStatut) {
    this.umowaStatut = umowaStatut;
    return this;
  }

   /**
   * Get umowaStatut
   * @return umowaStatut
  **/
  @Schema(description = "")
  public UmowaStatut getUmowaStatut() {
    return umowaStatut;
  }

  public void setUmowaStatut(UmowaStatut umowaStatut) {
    this.umowaStatut = umowaStatut;
  }

  public Dzial1 pozostaleInformacje(PozostaleInformacje pozostaleInformacje) {
    this.pozostaleInformacje = pozostaleInformacje;
    return this;
  }

   /**
   * Get pozostaleInformacje
   * @return pozostaleInformacje
  **/
  @Schema(description = "")
  public PozostaleInformacje getPozostaleInformacje() {
    return pozostaleInformacje;
  }

  public void setPozostaleInformacje(PozostaleInformacje pozostaleInformacje) {
    this.pozostaleInformacje = pozostaleInformacje;
  }

  public Dzial1 wspolnicySpzoo(List<WspolnicySpzoo> wspolnicySpzoo) {
    this.wspolnicySpzoo = wspolnicySpzoo;
    return this;
  }

  public Dzial1 addWspolnicySpzooItem(WspolnicySpzoo wspolnicySpzooItem) {
    if (this.wspolnicySpzoo == null) {
      this.wspolnicySpzoo = new ArrayList<WspolnicySpzoo>();
    }
    this.wspolnicySpzoo.add(wspolnicySpzooItem);
    return this;
  }

   /**
   * Get wspolnicySpzoo
   * @return wspolnicySpzoo
  **/
  @Schema(description = "")
  public List<WspolnicySpzoo> getWspolnicySpzoo() {
    return wspolnicySpzoo;
  }

  public void setWspolnicySpzoo(List<WspolnicySpzoo> wspolnicySpzoo) {
    this.wspolnicySpzoo = wspolnicySpzoo;
  }

  public Dzial1 jedynyAkcjonariusz(List<JedynyAkcjonariusz> jedynyAkcjonariusz) {
    this.jedynyAkcjonariusz = jedynyAkcjonariusz;
    return this;
  }

  public Dzial1 addJedynyAkcjonariuszItem(JedynyAkcjonariusz jedynyAkcjonariuszItem) {
    if (this.jedynyAkcjonariusz == null) {
      this.jedynyAkcjonariusz = new ArrayList<JedynyAkcjonariusz>();
    }
    this.jedynyAkcjonariusz.add(jedynyAkcjonariuszItem);
    return this;
  }

   /**
   * Get jedynyAkcjonariusz
   * @return jedynyAkcjonariusz
  **/
  @Schema(description = "")
  public List<JedynyAkcjonariusz> getJedynyAkcjonariusz() {
    return jedynyAkcjonariusz;
  }

  public void setJedynyAkcjonariusz(List<JedynyAkcjonariusz> jedynyAkcjonariusz) {
    this.jedynyAkcjonariusz = jedynyAkcjonariusz;
  }

  public Dzial1 sposobPowstaniaPodmiotu(SposobPowstaniaPodmiotu sposobPowstaniaPodmiotu) {
    this.sposobPowstaniaPodmiotu = sposobPowstaniaPodmiotu;
    return this;
  }

   /**
   * Get sposobPowstaniaPodmiotu
   * @return sposobPowstaniaPodmiotu
  **/
  @Schema(description = "")
  public SposobPowstaniaPodmiotu getSposobPowstaniaPodmiotu() {
    return sposobPowstaniaPodmiotu;
  }

  public void setSposobPowstaniaPodmiotu(SposobPowstaniaPodmiotu sposobPowstaniaPodmiotu) {
    this.sposobPowstaniaPodmiotu = sposobPowstaniaPodmiotu;
  }

  public Dzial1 kapital(Kapital kapital) {
    this.kapital = kapital;
    return this;
  }

   /**
   * Get kapital
   * @return kapital
  **/
  @Schema(description = "")
  public Kapital getKapital() {
    return kapital;
  }

  public void setKapital(Kapital kapital) {
    this.kapital = kapital;
  }

  public Dzial1 emisjeAkcji(List<EmisjeAkcji> emisjeAkcji) {
    this.emisjeAkcji = emisjeAkcji;
    return this;
  }

  public Dzial1 addEmisjeAkcjiItem(EmisjeAkcji emisjeAkcjiItem) {
    if (this.emisjeAkcji == null) {
      this.emisjeAkcji = new ArrayList<EmisjeAkcji>();
    }
    this.emisjeAkcji.add(emisjeAkcjiItem);
    return this;
  }

   /**
   * Get emisjeAkcji
   * @return emisjeAkcji
  **/
  @Schema(description = "")
  public List<EmisjeAkcji> getEmisjeAkcji() {
    return emisjeAkcji;
  }

  public void setEmisjeAkcji(List<EmisjeAkcji> emisjeAkcji) {
    this.emisjeAkcji = emisjeAkcji;
  }

  public Dzial1 wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych(WzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych) {
    this.wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych = wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych;
    return this;
  }

   /**
   * Get wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych
   * @return wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych
  **/
  @Schema(description = "")
  public WzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych getWzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych() {
    return wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych;
  }

  public void setWzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych(WzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych) {
    this.wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych = wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych;
  }

  public Dzial1 wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych(WzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych) {
    this.wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych = wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych;
    return this;
  }

   /**
   * Get wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych
   * @return wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych
  **/
  @Schema(description = "")
  public WzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych getWzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych() {
    return wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych;
  }

  public void setWzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych(WzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych) {
    this.wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych = wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dzial1 dzial1 = (Dzial1) o;
    return Objects.equals(this.organSprawujacyNadzor, dzial1.organSprawujacyNadzor) &&
        Objects.equals(this.danePodmiotu, dzial1.danePodmiotu) &&
        Objects.equals(this.siedzibaIAdres, dzial1.siedzibaIAdres) &&
        Objects.equals(this.jednostkiTerenoweOddzialy, dzial1.jednostkiTerenoweOddzialy) &&
        Objects.equals(this.umowaStatut, dzial1.umowaStatut) &&
        Objects.equals(this.pozostaleInformacje, dzial1.pozostaleInformacje) &&
        Objects.equals(this.wspolnicySpzoo, dzial1.wspolnicySpzoo) &&
        Objects.equals(this.jedynyAkcjonariusz, dzial1.jedynyAkcjonariusz) &&
        Objects.equals(this.sposobPowstaniaPodmiotu, dzial1.sposobPowstaniaPodmiotu) &&
        Objects.equals(this.kapital, dzial1.kapital) &&
        Objects.equals(this.emisjeAkcji, dzial1.emisjeAkcji) &&
        Objects.equals(this.wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych, dzial1.wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych) &&
        Objects.equals(this.wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych, dzial1.wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organSprawujacyNadzor, danePodmiotu, siedzibaIAdres, jednostkiTerenoweOddzialy, umowaStatut, pozostaleInformacje, wspolnicySpzoo, jedynyAkcjonariusz, sposobPowstaniaPodmiotu, kapital, emisjeAkcji, wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych, wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dzial1 {\n");
    
    sb.append("    organSprawujacyNadzor: ").append(toIndentedString(organSprawujacyNadzor)).append("\n");
    sb.append("    danePodmiotu: ").append(toIndentedString(danePodmiotu)).append("\n");
    sb.append("    siedzibaIAdres: ").append(toIndentedString(siedzibaIAdres)).append("\n");
    sb.append("    jednostkiTerenoweOddzialy: ").append(toIndentedString(jednostkiTerenoweOddzialy)).append("\n");
    sb.append("    umowaStatut: ").append(toIndentedString(umowaStatut)).append("\n");
    sb.append("    pozostaleInformacje: ").append(toIndentedString(pozostaleInformacje)).append("\n");
    sb.append("    wspolnicySpzoo: ").append(toIndentedString(wspolnicySpzoo)).append("\n");
    sb.append("    jedynyAkcjonariusz: ").append(toIndentedString(jedynyAkcjonariusz)).append("\n");
    sb.append("    sposobPowstaniaPodmiotu: ").append(toIndentedString(sposobPowstaniaPodmiotu)).append("\n");
    sb.append("    kapital: ").append(toIndentedString(kapital)).append("\n");
    sb.append("    emisjeAkcji: ").append(toIndentedString(emisjeAkcji)).append("\n");
    sb.append("    wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych: ").append(toIndentedString(wzmiankaOPodjeciuUchwalyOEmisjachObligacjiZamiennych)).append("\n");
    sb.append("    wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych: ").append(toIndentedString(wzmiankaOUpowaznieniuDoEmisjiWarrantowSubskrypcyjnych)).append("\n");
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
