package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoletoDTO  {
  
  @ApiModelProperty(value = "Data de processamento")
 /**
   * Data de processamento  
  **/
  private LocalDate dataProcessamento = null;

  @ApiModelProperty(value = "Data do documento")
 /**
   * Data do documento  
  **/
  private LocalDate dataDocumento = null;

  @ApiModelProperty(value = "Data Vencimento")
 /**
   * Data Vencimento  
  **/
  private LocalDate dataVencimento = null;

  @ApiModelProperty(value = "Valor do boleto")
 /**
   * Valor do boleto  
  **/
  private BigDecimal valorBoleto = null;

  @ApiModelProperty(value = "Numero do documento")
 /**
   * Numero do documento  
  **/
  private String numeroDoDocumento = null;

  @ApiModelProperty(value = "Nome Beneficiario")
 /**
   * Nome Beneficiario  
  **/
  private String nomeBeneficiario = null;

  @ApiModelProperty(value = "Agencia")
 /**
   * Agencia  
  **/
  private String agencia = null;

  @ApiModelProperty(value = "Numero do Convénio")
 /**
   * Numero do Convénio  
  **/
  private String numeroConvenio = null;

  @ApiModelProperty(value = "Numero da carteira")
 /**
   * Numero da carteira  
  **/
  private String carteira = null;

  @ApiModelProperty(value = "Nosso Numero")
 /**
   * Nosso Numero  
  **/
  private String nossoNumero = null;

  @ApiModelProperty(value = "Digito Nosso Numero")
 /**
   * Digito Nosso Numero  
  **/
  private String digitoNossoNumero = null;

  @ApiModelProperty(value = "Código do Banco")
 /**
   * Código do Banco  
  **/
  private String banco = null;

  @ApiModelProperty(value = "Aceite")
 /**
   * Aceite  
  **/
  private Boolean aceite = null;

  @ApiModelProperty(value = "Especie do Documento")
 /**
   * Especie do Documento  
  **/
  private String especieDoDocumento = null;

  @ApiModelProperty(value = "Especie")
 /**
   * Especie  
  **/
  private String especie = null;

  @ApiModelProperty(value = "Instrucões")
 /**
   * Instrucões  
  **/
  private List<String> instrucoes = null;

  @ApiModelProperty(value = "Locais de pagamento")
 /**
   * Locais de pagamento  
  **/
  private List<String> locaisDePagamento = null;

  @ApiModelProperty(value = "Instrucões do Recibo")
 /**
   * Instrucões do Recibo  
  **/
  private List<String> instrucoesRecibo = null;

  @ApiModelProperty(value = "Sacado")
 /**
   * Sacado  
  **/
  private String nomePagador = null;

  @ApiModelProperty(value = "CPF")
 /**
   * CPF  
  **/
  private String documentoPagador = null;

  @ApiModelProperty(value = "Endereço")
 /**
   * Endereço  
  **/
  private String logradouroPagador = null;

  @ApiModelProperty(value = "Bairro")
 /**
   * Bairro  
  **/
  private String bairroPagador = null;

  @ApiModelProperty(value = "CEP")
 /**
   * CEP  
  **/
  private String cepPagador = null;

  @ApiModelProperty(value = "Cidade")
 /**
   * Cidade  
  **/
  private String cidadePagador = null;

  @ApiModelProperty(value = "UF")
 /**
   * UF  
  **/
  private String ufPagador = null;

  @ApiModelProperty(value = "Codigo de barras")
 /**
   * Codigo de barras  
  **/
  private String codigoDeBarras = null;

  @ApiModelProperty(value = "Linha digitavel")
 /**
   * Linha digitavel  
  **/
  private String linhaDigitavel = null;
 /**
   * Data de processamento
   * @return dataProcessamento
  **/
  @JsonProperty("dataProcessamento")
  public LocalDate getDataProcessamento() {
    return dataProcessamento;
  }

  public void setDataProcessamento(LocalDate dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  public BoletoDTO dataProcessamento(LocalDate dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
    return this;
  }

 /**
   * Data do documento
   * @return dataDocumento
  **/
  @JsonProperty("dataDocumento")
  public LocalDate getDataDocumento() {
    return dataDocumento;
  }

  public void setDataDocumento(LocalDate dataDocumento) {
    this.dataDocumento = dataDocumento;
  }

  public BoletoDTO dataDocumento(LocalDate dataDocumento) {
    this.dataDocumento = dataDocumento;
    return this;
  }

 /**
   * Data Vencimento
   * @return dataVencimento
  **/
  @JsonProperty("dataVencimento")
  public LocalDate getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(LocalDate dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public BoletoDTO dataVencimento(LocalDate dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

 /**
   * Valor do boleto
   * @return valorBoleto
  **/
  @JsonProperty("valorBoleto")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }

  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  public BoletoDTO valorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
    return this;
  }

 /**
   * Numero do documento
   * @return numeroDoDocumento
  **/
  @JsonProperty("numeroDoDocumento")
  public String getNumeroDoDocumento() {
    return numeroDoDocumento;
  }

  public void setNumeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
  }

  public BoletoDTO numeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
    return this;
  }

 /**
   * Nome Beneficiario
   * @return nomeBeneficiario
  **/
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }

  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  public BoletoDTO nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }

 /**
   * Agencia
   * @return agencia
  **/
  @JsonProperty("agencia")
  public String getAgencia() {
    return agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public BoletoDTO agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }

 /**
   * Numero do Convénio
   * @return numeroConvenio
  **/
  @JsonProperty("numeroConvenio")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }

  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  public BoletoDTO numeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }

 /**
   * Numero da carteira
   * @return carteira
  **/
  @JsonProperty("carteira")
  public String getCarteira() {
    return carteira;
  }

  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  public BoletoDTO carteira(String carteira) {
    this.carteira = carteira;
    return this;
  }

 /**
   * Nosso Numero
   * @return nossoNumero
  **/
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }

  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  public BoletoDTO nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
    return this;
  }

 /**
   * Digito Nosso Numero
   * @return digitoNossoNumero
  **/
  @JsonProperty("digitoNossoNumero")
  public String getDigitoNossoNumero() {
    return digitoNossoNumero;
  }

  public void setDigitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
  }

  public BoletoDTO digitoNossoNumero(String digitoNossoNumero) {
    this.digitoNossoNumero = digitoNossoNumero;
    return this;
  }

 /**
   * Código do Banco
   * @return banco
  **/
  @JsonProperty("banco")
  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public BoletoDTO banco(String banco) {
    this.banco = banco;
    return this;
  }

 /**
   * Aceite
   * @return aceite
  **/
  @JsonProperty("aceite")
  public Boolean isAceite() {
    return aceite;
  }

  public void setAceite(Boolean aceite) {
    this.aceite = aceite;
  }

  public BoletoDTO aceite(Boolean aceite) {
    this.aceite = aceite;
    return this;
  }

 /**
   * Especie do Documento
   * @return especieDoDocumento
  **/
  @JsonProperty("especieDoDocumento")
  public String getEspecieDoDocumento() {
    return especieDoDocumento;
  }

  public void setEspecieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
  }

  public BoletoDTO especieDoDocumento(String especieDoDocumento) {
    this.especieDoDocumento = especieDoDocumento;
    return this;
  }

 /**
   * Especie
   * @return especie
  **/
  @JsonProperty("especie")
  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public BoletoDTO especie(String especie) {
    this.especie = especie;
    return this;
  }

 /**
   * Instrucões
   * @return instrucoes
  **/
  @JsonProperty("instrucoes")
  public List<String> getInstrucoes() {
    return instrucoes;
  }

  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  public BoletoDTO instrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }

  public BoletoDTO addInstrucoesItem(String instrucoesItem) {
    this.instrucoes.add(instrucoesItem);
    return this;
  }

 /**
   * Locais de pagamento
   * @return locaisDePagamento
  **/
  @JsonProperty("locaisDePagamento")
  public List<String> getLocaisDePagamento() {
    return locaisDePagamento;
  }

  public void setLocaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
  }

  public BoletoDTO locaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
    return this;
  }

  public BoletoDTO addLocaisDePagamentoItem(String locaisDePagamentoItem) {
    this.locaisDePagamento.add(locaisDePagamentoItem);
    return this;
  }

 /**
   * Instrucões do Recibo
   * @return instrucoesRecibo
  **/
  @JsonProperty("instrucoesRecibo")
  public List<String> getInstrucoesRecibo() {
    return instrucoesRecibo;
  }

  public void setInstrucoesRecibo(List<String> instrucoesRecibo) {
    this.instrucoesRecibo = instrucoesRecibo;
  }

  public BoletoDTO instrucoesRecibo(List<String> instrucoesRecibo) {
    this.instrucoesRecibo = instrucoesRecibo;
    return this;
  }

  public BoletoDTO addInstrucoesReciboItem(String instrucoesReciboItem) {
    this.instrucoesRecibo.add(instrucoesReciboItem);
    return this;
  }

 /**
   * Sacado
   * @return nomePagador
  **/
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }

  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  public BoletoDTO nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }

 /**
   * CPF
   * @return documentoPagador
  **/
  @JsonProperty("documentoPagador")
  public String getDocumentoPagador() {
    return documentoPagador;
  }

  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  public BoletoDTO documentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
    return this;
  }

 /**
   * Endereço
   * @return logradouroPagador
  **/
  @JsonProperty("logradouroPagador")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }

  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  public BoletoDTO logradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
    return this;
  }

 /**
   * Bairro
   * @return bairroPagador
  **/
  @JsonProperty("bairroPagador")
  public String getBairroPagador() {
    return bairroPagador;
  }

  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  public BoletoDTO bairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
    return this;
  }

 /**
   * CEP
   * @return cepPagador
  **/
  @JsonProperty("cepPagador")
  public String getCepPagador() {
    return cepPagador;
  }

  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  public BoletoDTO cepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
    return this;
  }

 /**
   * Cidade
   * @return cidadePagador
  **/
  @JsonProperty("cidadePagador")
  public String getCidadePagador() {
    return cidadePagador;
  }

  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  public BoletoDTO cidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
    return this;
  }

 /**
   * UF
   * @return ufPagador
  **/
  @JsonProperty("ufPagador")
  public String getUfPagador() {
    return ufPagador;
  }

  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  public BoletoDTO ufPagador(String ufPagador) {
    this.ufPagador = ufPagador;
    return this;
  }

 /**
   * Codigo de barras
   * @return codigoDeBarras
  **/
  @JsonProperty("codigoDeBarras")
  public String getCodigoDeBarras() {
    return codigoDeBarras;
  }

  public void setCodigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
  }

  public BoletoDTO codigoDeBarras(String codigoDeBarras) {
    this.codigoDeBarras = codigoDeBarras;
    return this;
  }

 /**
   * Linha digitavel
   * @return linhaDigitavel
  **/
  @JsonProperty("linhaDigitavel")
  public String getLinhaDigitavel() {
    return linhaDigitavel;
  }

  public void setLinhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
  }

  public BoletoDTO linhaDigitavel(String linhaDigitavel) {
    this.linhaDigitavel = linhaDigitavel;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoDTO {\n");
    
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    dataDocumento: ").append(toIndentedString(dataDocumento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    valorBoleto: ").append(toIndentedString(valorBoleto)).append("\n");
    sb.append("    numeroDoDocumento: ").append(toIndentedString(numeroDoDocumento)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    numeroConvenio: ").append(toIndentedString(numeroConvenio)).append("\n");
    sb.append("    carteira: ").append(toIndentedString(carteira)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    digitoNossoNumero: ").append(toIndentedString(digitoNossoNumero)).append("\n");
    sb.append("    banco: ").append(toIndentedString(banco)).append("\n");
    sb.append("    aceite: ").append(toIndentedString(aceite)).append("\n");
    sb.append("    especieDoDocumento: ").append(toIndentedString(especieDoDocumento)).append("\n");
    sb.append("    especie: ").append(toIndentedString(especie)).append("\n");
    sb.append("    instrucoes: ").append(toIndentedString(instrucoes)).append("\n");
    sb.append("    locaisDePagamento: ").append(toIndentedString(locaisDePagamento)).append("\n");
    sb.append("    instrucoesRecibo: ").append(toIndentedString(instrucoesRecibo)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    documentoPagador: ").append(toIndentedString(documentoPagador)).append("\n");
    sb.append("    logradouroPagador: ").append(toIndentedString(logradouroPagador)).append("\n");
    sb.append("    bairroPagador: ").append(toIndentedString(bairroPagador)).append("\n");
    sb.append("    cepPagador: ").append(toIndentedString(cepPagador)).append("\n");
    sb.append("    cidadePagador: ").append(toIndentedString(cidadePagador)).append("\n");
    sb.append("    ufPagador: ").append(toIndentedString(ufPagador)).append("\n");
    sb.append("    codigoDeBarras: ").append(toIndentedString(codigoDeBarras)).append("\n");
    sb.append("    linhaDigitavel: ").append(toIndentedString(linhaDigitavel)).append("\n");
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