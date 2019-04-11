package io.swagger.model.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.List;
import org.joda.time.LocalDate;

/**
  * Dados do beleto da conta
 **/
@ApiModel(description="Dados do beleto da conta")
public class InvoiceData  {
  
  @ApiModelProperty(value = "Numero do documento")
 /**
   * Numero do documento  
  **/
  private String numeroDoDocumento = null;

  @ApiModelProperty(value = "Data do processamento")
 /**
   * Data do processamento  
  **/
  private LocalDate dataProcessamento = null;

  @ApiModelProperty(value = "Data do documento")
 /**
   * Data do documento  
  **/
  private LocalDate dataDocumento = null;

  @ApiModelProperty(value = "Data do Vencimento")
 /**
   * Data do Vencimento  
  **/
  private LocalDate dataVencimento = null;

  @ApiModelProperty(value = "Valor do boleto")
 /**
   * Valor do boleto  
  **/
  private BigDecimal valorBoleto = null;

  @ApiModelProperty(value = "Nome do beneficiario")
 /**
   * Nome do beneficiario  
  **/
  private String nomeBeneficiario = null;

  @ApiModelProperty(value = "Documento do beneficiario")
 /**
   * Documento do beneficiario  
  **/
  private String documentoBeneficiario = null;

  @ApiModelProperty(value = "Agencia")
 /**
   * Agencia  
  **/
  private String agencia = null;

  @ApiModelProperty(value = "Numero do convenio")
 /**
   * Numero do convenio  
  **/
  private String numeroConvenio = null;

  @ApiModelProperty(value = "Carteira")
 /**
   * Carteira  
  **/
  private String carteira = null;

  @ApiModelProperty(value = "Nosso numero")
 /**
   * Nosso numero  
  **/
  private String nossoNumero = null;

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

  @ApiModelProperty(value = "Instrucoes")
 /**
   * Instrucoes  
  **/
  private List<String> instrucoes = null;

  @ApiModelProperty(value = "Locais de pagamento")
 /**
   * Locais de pagamento  
  **/
  private List<String> locaisDePagamento = null;

  @ApiModelProperty(value = "Nome do pagador")
 /**
   * Nome do pagador  
  **/
  private String nomePagador = null;

  @ApiModelProperty(value = "Documento do pagador")
 /**
   * Documento do pagador  
  **/
  private String documentoPagador = null;

  @ApiModelProperty(value = "Logradouro do pagador")
 /**
   * Logradouro do pagador  
  **/
  private String logradouroPagador = null;

  @ApiModelProperty(value = "Bairro pagador")
 /**
   * Bairro pagador  
  **/
  private String bairroPagador = null;

  @ApiModelProperty(value = "Cep do pagador")
 /**
   * Cep do pagador  
  **/
  private String cepPagador = null;

  @ApiModelProperty(value = "Cidadedo pagador")
 /**
   * Cidadedo pagador  
  **/
  private String cidadePagador = null;

  @ApiModelProperty(value = "Uf do pagador")
 /**
   * Uf do pagador  
  **/
  private String ufPagador = null;

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

  public InvoiceData numeroDoDocumento(String numeroDoDocumento) {
    this.numeroDoDocumento = numeroDoDocumento;
    return this;
  }

 /**
   * Data do processamento
   * @return dataProcessamento
  **/
  @JsonProperty("dataProcessamento")
  public LocalDate getDataProcessamento() {
    return dataProcessamento;
  }

  public void setDataProcessamento(LocalDate dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  public InvoiceData dataProcessamento(LocalDate dataProcessamento) {
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

  public InvoiceData dataDocumento(LocalDate dataDocumento) {
    this.dataDocumento = dataDocumento;
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

  public InvoiceData dataVencimento(LocalDate dataVencimento) {
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

  public InvoiceData valorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
    return this;
  }

 /**
   * Nome do beneficiario
   * @return nomeBeneficiario
  **/
  @JsonProperty("nomeBeneficiario")
  public String getNomeBeneficiario() {
    return nomeBeneficiario;
  }

  public void setNomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
  }

  public InvoiceData nomeBeneficiario(String nomeBeneficiario) {
    this.nomeBeneficiario = nomeBeneficiario;
    return this;
  }

 /**
   * Documento do beneficiario
   * @return documentoBeneficiario
  **/
  @JsonProperty("documentoBeneficiario")
  public String getDocumentoBeneficiario() {
    return documentoBeneficiario;
  }

  public void setDocumentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
  }

  public InvoiceData documentoBeneficiario(String documentoBeneficiario) {
    this.documentoBeneficiario = documentoBeneficiario;
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

  public InvoiceData agencia(String agencia) {
    this.agencia = agencia;
    return this;
  }

 /**
   * Numero do convenio
   * @return numeroConvenio
  **/
  @JsonProperty("numeroConvenio")
  public String getNumeroConvenio() {
    return numeroConvenio;
  }

  public void setNumeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
  }

  public InvoiceData numeroConvenio(String numeroConvenio) {
    this.numeroConvenio = numeroConvenio;
    return this;
  }

 /**
   * Carteira
   * @return carteira
  **/
  @JsonProperty("carteira")
  public String getCarteira() {
    return carteira;
  }

  public void setCarteira(String carteira) {
    this.carteira = carteira;
  }

  public InvoiceData carteira(String carteira) {
    this.carteira = carteira;
    return this;
  }

 /**
   * Nosso numero
   * @return nossoNumero
  **/
  @JsonProperty("nossoNumero")
  public String getNossoNumero() {
    return nossoNumero;
  }

  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  public InvoiceData nossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
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

  public InvoiceData aceite(Boolean aceite) {
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

  public InvoiceData especieDoDocumento(String especieDoDocumento) {
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

  public InvoiceData especie(String especie) {
    this.especie = especie;
    return this;
  }

 /**
   * Instrucoes
   * @return instrucoes
  **/
  @JsonProperty("instrucoes")
  public List<String> getInstrucoes() {
    return instrucoes;
  }

  public void setInstrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
  }

  public InvoiceData instrucoes(List<String> instrucoes) {
    this.instrucoes = instrucoes;
    return this;
  }

  public InvoiceData addInstrucoesItem(String instrucoesItem) {
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

  public InvoiceData locaisDePagamento(List<String> locaisDePagamento) {
    this.locaisDePagamento = locaisDePagamento;
    return this;
  }

  public InvoiceData addLocaisDePagamentoItem(String locaisDePagamentoItem) {
    this.locaisDePagamento.add(locaisDePagamentoItem);
    return this;
  }

 /**
   * Nome do pagador
   * @return nomePagador
  **/
  @JsonProperty("nomePagador")
  public String getNomePagador() {
    return nomePagador;
  }

  public void setNomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
  }

  public InvoiceData nomePagador(String nomePagador) {
    this.nomePagador = nomePagador;
    return this;
  }

 /**
   * Documento do pagador
   * @return documentoPagador
  **/
  @JsonProperty("documentoPagador")
  public String getDocumentoPagador() {
    return documentoPagador;
  }

  public void setDocumentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
  }

  public InvoiceData documentoPagador(String documentoPagador) {
    this.documentoPagador = documentoPagador;
    return this;
  }

 /**
   * Logradouro do pagador
   * @return logradouroPagador
  **/
  @JsonProperty("logradouroPagador")
  public String getLogradouroPagador() {
    return logradouroPagador;
  }

  public void setLogradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
  }

  public InvoiceData logradouroPagador(String logradouroPagador) {
    this.logradouroPagador = logradouroPagador;
    return this;
  }

 /**
   * Bairro pagador
   * @return bairroPagador
  **/
  @JsonProperty("bairroPagador")
  public String getBairroPagador() {
    return bairroPagador;
  }

  public void setBairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
  }

  public InvoiceData bairroPagador(String bairroPagador) {
    this.bairroPagador = bairroPagador;
    return this;
  }

 /**
   * Cep do pagador
   * @return cepPagador
  **/
  @JsonProperty("cepPagador")
  public String getCepPagador() {
    return cepPagador;
  }

  public void setCepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
  }

  public InvoiceData cepPagador(String cepPagador) {
    this.cepPagador = cepPagador;
    return this;
  }

 /**
   * Cidadedo pagador
   * @return cidadePagador
  **/
  @JsonProperty("cidadePagador")
  public String getCidadePagador() {
    return cidadePagador;
  }

  public void setCidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
  }

  public InvoiceData cidadePagador(String cidadePagador) {
    this.cidadePagador = cidadePagador;
    return this;
  }

 /**
   * Uf do pagador
   * @return ufPagador
  **/
  @JsonProperty("ufPagador")
  public String getUfPagador() {
    return ufPagador;
  }

  public void setUfPagador(String ufPagador) {
    this.ufPagador = ufPagador;
  }

  public InvoiceData ufPagador(String ufPagador) {
    this.ufPagador = ufPagador;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceData {\n");
    
    sb.append("    numeroDoDocumento: ").append(toIndentedString(numeroDoDocumento)).append("\n");
    sb.append("    dataProcessamento: ").append(toIndentedString(dataProcessamento)).append("\n");
    sb.append("    dataDocumento: ").append(toIndentedString(dataDocumento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    valorBoleto: ").append(toIndentedString(valorBoleto)).append("\n");
    sb.append("    nomeBeneficiario: ").append(toIndentedString(nomeBeneficiario)).append("\n");
    sb.append("    documentoBeneficiario: ").append(toIndentedString(documentoBeneficiario)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    numeroConvenio: ").append(toIndentedString(numeroConvenio)).append("\n");
    sb.append("    carteira: ").append(toIndentedString(carteira)).append("\n");
    sb.append("    nossoNumero: ").append(toIndentedString(nossoNumero)).append("\n");
    sb.append("    aceite: ").append(toIndentedString(aceite)).append("\n");
    sb.append("    especieDoDocumento: ").append(toIndentedString(especieDoDocumento)).append("\n");
    sb.append("    especie: ").append(toIndentedString(especie)).append("\n");
    sb.append("    instrucoes: ").append(toIndentedString(instrucoes)).append("\n");
    sb.append("    locaisDePagamento: ").append(toIndentedString(locaisDePagamento)).append("\n");
    sb.append("    nomePagador: ").append(toIndentedString(nomePagador)).append("\n");
    sb.append("    documentoPagador: ").append(toIndentedString(documentoPagador)).append("\n");
    sb.append("    logradouroPagador: ").append(toIndentedString(logradouroPagador)).append("\n");
    sb.append("    bairroPagador: ").append(toIndentedString(bairroPagador)).append("\n");
    sb.append("    cepPagador: ").append(toIndentedString(cepPagador)).append("\n");
    sb.append("    cidadePagador: ").append(toIndentedString(cidadePagador)).append("\n");
    sb.append("    ufPagador: ").append(toIndentedString(ufPagador)).append("\n");
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
