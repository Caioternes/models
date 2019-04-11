package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParcelasDTO  {
  
  @ApiModelProperty(required = true, value = "Numero da parcela")
 /**
   * Numero da parcela  
  **/
  private Integer numero = null;

  @ApiModelProperty(value = "Data Original de Venciomento")
 /**
   * Data Original de Venciomento  
  **/
  private Date dataVencimento = null;

  @ApiModelProperty(value = "Data Limite de Pagamento")
 /**
   * Data Limite de Pagamento  
  **/
  private Date dataLimitePagamento = null;

  @ApiModelProperty(value = "Valor da parcela")
 /**
   * Valor da parcela  
  **/
  private BigDecimal valor = null;

  @ApiModelProperty(value = "Status da Parcela")
 /**
   * Status da Parcela  
  **/
  private String status = null;
 /**
   * Numero da parcela
   * @return numero
  **/
  @JsonProperty("numero")
  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public ParcelasDTO numero(Integer numero) {
    this.numero = numero;
    return this;
  }

 /**
   * Data Original de Venciomento
   * @return dataVencimento
  **/
  @JsonProperty("dataVencimento")
  public Date getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public ParcelasDTO dataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

 /**
   * Data Limite de Pagamento
   * @return dataLimitePagamento
  **/
  @JsonProperty("dataLimitePagamento")
  public Date getDataLimitePagamento() {
    return dataLimitePagamento;
  }

  public void setDataLimitePagamento(Date dataLimitePagamento) {
    this.dataLimitePagamento = dataLimitePagamento;
  }

  public ParcelasDTO dataLimitePagamento(Date dataLimitePagamento) {
    this.dataLimitePagamento = dataLimitePagamento;
    return this;
  }

 /**
   * Valor da parcela
   * @return valor
  **/
  @JsonProperty("valor")
  public BigDecimal getValor() {
    return valor;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  public ParcelasDTO valor(BigDecimal valor) {
    this.valor = valor;
    return this;
  }

 /**
   * Status da Parcela
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ParcelasDTO status(String status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelasDTO {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataLimitePagamento: ").append(toIndentedString(dataLimitePagamento)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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