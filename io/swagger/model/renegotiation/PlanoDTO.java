package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanoDTO  {
  
  @ApiModelProperty(value = "Numero do plano")
 /**
   * Numero do plano  
  **/
  private Integer plano = null;

  @ApiModelProperty(value = "Valor máximo de entrada")
 /**
   * Valor máximo de entrada  
  **/
  private BigDecimal valorEntrada = null;

  @ApiModelProperty(value = "Valor máximo da parcela")
 /**
   * Valor máximo da parcela  
  **/
  private BigDecimal valorParcela = null;

  @ApiModelProperty(value = "Data mínima entrada")
 /**
   * Data mínima entrada  
  **/
  private String dataMinimaEntrada = null;

  @ApiModelProperty(value = "Data máxima entrada")
 /**
   * Data máxima entrada  
  **/
  private String dataMaximaEntrada = null;

 /**
   * Numero do plano
   * @return plano
  **/
  @JsonProperty("plano")
  public Integer getPlano() {
    return plano;
  }

  public void setPlano(Integer plano) {
    this.plano = plano;
  }

  public PlanoDTO plano(Integer plano) {
    this.plano = plano;
    return this;
  }

 /**
   * Valor máximo de entrada
   * @return valorMaximoEntrada
  **/
  @JsonProperty("valorEntrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }

  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  public PlanoDTO valorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
    return this;
  }

 /**
   * Valor máximo da parcela
   * @return valorMaximoParcela
  **/
  @JsonProperty("valorParcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  public PlanoDTO valorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }

 /**
   * Data mínima entrada
   * @return dataMinimaEntrada
  **/
  @JsonProperty("dataMinimaEntrada")
  public String getDataMinimaEntrada() {
    return dataMinimaEntrada;
  }

  public void setDataMinimaEntrada(String dataMinimaEntrada) {
    this.dataMinimaEntrada = dataMinimaEntrada;
  }

  public PlanoDTO dataMinimaEntrada(String dataMinimaEntrada) {
    this.dataMinimaEntrada = dataMinimaEntrada;
    return this;
  }

 /**
   * Data máxima entrada
   * @return dataMaximaEntrada
  **/
  @JsonProperty("dataMaximaEntrada")
  public String getDataMaximaEntrada() {
    return dataMaximaEntrada;
  }

  public void setDataMaximaEntrada(String dataMaximaEntrada) {
    this.dataMaximaEntrada = dataMaximaEntrada;
  }

  public PlanoDTO dataMaximaEntrada(String dataMaximaEntrada) {
    this.dataMaximaEntrada = dataMaximaEntrada;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoDTO {\n");
    
    sb.append("    plano: ").append(toIndentedString(plano)).append("\n");
    sb.append("    valorEntrada: ").append(toIndentedString(valorEntrada)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    dataMinimaEntrada: ").append(toIndentedString(dataMinimaEntrada)).append("\n");
    sb.append("    dataMaximaEntrada: ").append(toIndentedString(dataMaximaEntrada)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

