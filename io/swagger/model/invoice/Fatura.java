package io.swagger.model.invoice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
  * Dados do boleto da conta
 **/
@ApiModel(description="Dados da fatura fechada")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fatura  {
  
  @ApiModelProperty(value = "Identificador da conta")
 /**
   * Identificador da conta  
  **/
  private BigDecimal idConta = null;  
    
  @ApiModelProperty(value = "Data de vencimento da fatura")
 /**
   * Data de vencimento da fatura  
  **/
  private LocalDate dataVencimento = null;  
  
  @ApiModelProperty(value = "Data de fechamento")
 /**
   * Data de fechamento (corte) da fatura  
  **/
  private LocalDate dataFechamento = null;

  @ApiModelProperty(value = "Valor total da fatura")
 /**
   * Valor total da fatura  
  **/
  private BigDecimal valorFatura = null;
  
  @ApiModelProperty(value = "Valor mínimo para pagamento da fatura")
 /**
   * Valor mínimo para pagamento da fatura  
  **/
  private BigDecimal valorMinimo = null;
  
  @ApiModelProperty(value = "Valor em aberto da fatura")
 /**
   * Valor em aberto da fatura (valor total descontando os pagamentos já realizados)  
  **/
  private BigDecimal valorEmAberto = null;
  
  @ApiModelProperty(value = "Status de pagamento atual da fatura")
 /**
   * Retorna uma string com o status de pagamento atual da fatura
   * Paga - Fatura quitada\n* Parcialmente Paga - Fatura paga parcialmente
   * Em aberto - Fatura ainda não recebeu nenhum pagamento  
  **/
  private String statusPagamentoFatura = null;
  
    
    
    
  
 /**
   * Identificador da conta
   * @return idConta
  **/
  @JsonProperty("idConta")
  public BigDecimal getIdConta() {
    return idConta;
  }

  public void setIdConta(BigDecimal idConta) {
    this.idConta = idConta;
  }

  public Fatura idConta(BigDecimal idConta) {
    this.idConta = idConta;
    return this;
  } 


 /**
   * Data de fechamento
   * @return dataFechamento
  **/
  @JsonProperty("dataFechamento")
  public LocalDate getDataFechamento() {
    return dataFechamento;
  }

  public void setDataFechamento(LocalDate dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  public Fatura dataFechamento(LocalDate dataFechamento) {
    this.dataFechamento = dataFechamento;
    return this;
  }

 /**
   * Data do Vencimento
   * @return dataVencimento
  **/
  @JsonProperty("dataVencimento")
  public LocalDate getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(LocalDate dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public Fatura dataVencimento(LocalDate dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }


 /**
   * Valor total da fatura
   * @return valorFatura
  **/
  @JsonProperty("valorFatura")
  public BigDecimal getValorFatura() {
    return valorFatura;
  }

  public void setValorFatura(BigDecimal valorFatura) {
    this.valorFatura = valorFatura;
  }

  public Fatura valorFatura(BigDecimal valorFatura) {
    this.valorFatura = valorFatura;
    return this;
  }
  
  /**
   * Valor mínimo para pagamento da fatura
   * @return valorMinimo
  **/
  @JsonProperty("valorMinimo")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  public Fatura valorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }
  
  /**
   * Valor em aberto da fatura
   * @return valorEmAberto
  **/
  @JsonProperty("valorEmAberto")
  public BigDecimal getValorEmAberto() {
    return valorEmAberto;
  }

  public void setValorEmAberto(BigDecimal valorEmAberto) {
    this.valorEmAberto = valorEmAberto;
  }

  public Fatura valorEmAberto(BigDecimal valorEmAberto) {
    this.valorEmAberto = valorEmAberto;
    return this;
  }
  
  /**
   * Status de pagamento atual da fatura
   * @return statusPagamentoFatura
  **/
  @JsonProperty("statusPagamentoFatura")
  public String getStatusPagamentoFatura() {
    return statusPagamentoFatura;
  }

  public void setStatusPagamentoFatura(String statusPagamentoFatura) {
    this.statusPagamentoFatura = statusPagamentoFatura;
  }

  public Fatura statusPagamentoFatura(String statusPagamentoFatura) {
    this.statusPagamentoFatura = statusPagamentoFatura;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fatura {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    dataFechamento: ").append(toIndentedString(dataFechamento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    valorFatura: ").append(toIndentedString(valorFatura)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorEmAberto: ").append(toIndentedString(valorEmAberto)).append("\n");
    sb.append("    statusPagamentoFatura: ").append(toIndentedString(statusPagamentoFatura)).append("\n");
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