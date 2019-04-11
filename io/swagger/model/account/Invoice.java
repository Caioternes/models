package io.swagger.model.account;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.LocalDate;

/**
  * Dados básicos de fatura
 **/
@ApiModel(description="Dados básicos de fatura")
public class Invoice  {

  @ApiModelProperty(value = "Apresenta a situação atual da fatura, podendo ser Aberta ou fechada.")
 /**
   * Apresenta a situação atual da fatura, podendo ser Aberta ou fechada.  
  **/
  private String situacaoProcessamento = null;

  @ApiModelProperty(value = "Informa verdadeiro para fatura paga e falso para fatura não paga.")
 /**
   * Informa verdadeiro para fatura paga e falso para fatura não paga.  
  **/
  private Boolean pagamentoEfetuado = null;

  @ApiModelProperty(value = "Informa verdadeiro para fatura em atraso e falso para fatura em dia.")
 /**
   * Informa verdadeiro para fatura em atraso e falso para fatura em dia.  
  **/
  private Boolean pagamentoEmAtraso = null;

  @ApiModelProperty(value = "Data de vencimento da fatura.")
 /**
   * Data de vencimento da fatura.  
  **/
  private LocalDate dataVencimentoFatura = null;

  @ApiModelProperty(value = "Data de fechamento (data de corte) da fatura.")
 /**
   * Data de fechamento (data de corte) da fatura.  
  **/
  private LocalDate dataFechamento = null;

  @ApiModelProperty(value = "Melhor dia para compras que irão cair nesta fatura. Esta informação só estará presente em faturas com a situação de processamento Aberta.")
 /**
   * Melhor dia para compras que irão cair nesta fatura. Esta informação só estará presente em faturas com a situação de processamento Aberta.  
  **/
  private LocalDate melhorDataCompra = null;

  @ApiModelProperty(value = "Valor total da fatura.")
 /**
   * Valor total da fatura.  
  **/
  private BigDecimal valorTotal = null;

  @ApiModelProperty(value = "Valor para pagamento mínimo da fatura. Esta informação só estará presente em faturas com a situação de processamento Fechada.")
 /**
   * Valor para pagamento mínimo da fatura. Esta informação só estará presente em faturas com a situação de processamento Fechada.  
  **/
  private BigDecimal valorPagamentoMinimo = null;

  @ApiModelProperty(value = "Valor do saldo devedor para faturas em atraso, anteriores a atual fatura fechada. Este valor será 0 (zero) para clientes com faturas em dia e para faturas com o situação de processamento Aberto.")
 /**
   * Valor para pagamento mínimo da fatura. Esta informação só estará presente em faturas com a situação de processamento Fechada.  
  **/
  private BigDecimal saldoFaturaAnterior = null;


 /**
   * Apresenta a situação atual da fatura, podendo ser Aberta ou fechada.
   * @return situacaoProcessamento
  **/
  @JsonProperty("situacaoProcessamento")
  public String getSituacaoProcessamento() {
    return situacaoProcessamento;
  }

  public void setSituacaoProcessamento(String situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
  }

  public Invoice situacaoProcessamento(String situacaoProcessamento) {
    this.situacaoProcessamento = situacaoProcessamento;
    return this;
  }

 /**
   * Informa verdadeiro para fatura paga e falso para fatura não paga.
   * @return pagamentoEfetuado
  **/
  @JsonProperty("pagamentoEfetuado")
  public Boolean isPagamentoEfetuado() {
    return pagamentoEfetuado;
  }

  public void setPagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
  }

  public Invoice pagamentoEfetuado(Boolean pagamentoEfetuado) {
    this.pagamentoEfetuado = pagamentoEfetuado;
    return this;
  }

 /**
   * Informa verdadeiro para fatura em atraso e falso para fatura em dia.
   * @return pagamentoEmAtraso
  **/
  @JsonProperty("pagamentoEmAtraso")
  public Boolean isPagamentoEmAtraso() {
    return pagamentoEmAtraso;
  }

  public void setPagamentoEmAtraso(Boolean pagamentoEmAtraso) {
    this.pagamentoEmAtraso = pagamentoEmAtraso;
  }

  public Invoice pagamentoEmAtraso(Boolean pagamentoEmAtraso) {
    this.pagamentoEmAtraso = pagamentoEmAtraso;
    return this;
  }

 /**
   * Data de vencimento da fatura.
   * @return dataVencimentoFatura
  **/
  @JsonProperty("dataVencimentoFatura")
  public LocalDate getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }

  public void setDataVencimentoFatura(LocalDate dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  public Invoice dataVencimentoFatura(LocalDate dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
    return this;
  }

 /**
   * Data de fechamento (data de corte) da fatura.
   * @return dataFechamento
  **/
  @JsonProperty("dataFechamento")
  public LocalDate getDataFechamento() {
    return dataFechamento;
  }

  public void setDataFechamento(LocalDate dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  public Invoice dataFechamento(LocalDate dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }

 /**
   * Melhor dia para compras que irão cair nesta fatura. Esta informação só estará presente em faturas com a situação de processamento Aberta.
   * @return melhorDataCompra
  **/
  @JsonProperty("melhorDataCompra")
  public LocalDate getMelhorDataCompra() {
    return melhorDataCompra;
  }

  public void setMelhorDataCompra(LocalDate melhorDataCompra) {
    this.melhorDataCompra = melhorDataCompra;
  }

  public Invoice melhorDataCompra(LocalDate melhorDataCompra) {
    this.melhorDataCompra = melhorDataCompra;
    return this;
  }

 /**
   * Valor total da fatura.
   * @return valorTotal
  **/
  @JsonProperty("valorTotal")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
  }

  public Invoice valorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

 /**
   * Valor para pagamento mínimo da fatura. Esta informação só estará presente em faturas com a situação de processamento Fechada.
   * @return valorPagamentoMinimo
  **/
  @JsonProperty("valorPagamentoMinimo")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }

  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  public Invoice valorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
    return this;
  }

 /**
   * Valor do saldo devedor para faturas em atraso, anteriores a atual fatura fechada. Este valor será 0 (zero) para clientes com faturas em dia e para faturas com o situação de processamento Aberto.
   * @return saldoFaturaAnterior
  **/
  @JsonProperty("saldoFaturaAnterior")
  public BigDecimal getSaldoFaturaAnterior() {
    return saldoFaturaAnterior;
  }

  public void setSaldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
  }

  public Invoice saldoFaturaAnterior(BigDecimal saldoFaturaAnterior) {
    this.saldoFaturaAnterior = saldoFaturaAnterior;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    situacaoProcessamento: ").append(toIndentedString(situacaoProcessamento)).append("\n");
    sb.append("    pagamentoEfetuado: ").append(toIndentedString(pagamentoEfetuado)).append("\n");
    sb.append("    pagamentoEmAtraso: ").append(toIndentedString(pagamentoEmAtraso)).append("\n");
    sb.append("    dataVencimentoFatura: ").append(toIndentedString(dataVencimentoFatura)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    melhorDataCompra: ").append(toIndentedString(melhorDataCompra)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    valorPagamentoMinimo: ").append(toIndentedString(valorPagamentoMinimo)).append("\n");
    sb.append("    saldoFaturaAnterior: ").append(toIndentedString(saldoFaturaAnterior)).append("\n");
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

