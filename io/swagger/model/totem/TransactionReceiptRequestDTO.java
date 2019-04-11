package io.swagger.model.totem;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionReceiptRequestDTO  {
  
  @ApiModelProperty(required = true, value = "Status da Operação")
 /**
   * Status da Operação  
  **/
  private String status = null;

  @ApiModelProperty(required = true, value = "NSU Sitef")
 /**
   * NSU Sitef  
  **/
  private String nsuSitef = null;

  @ApiModelProperty(required = true, value = "Cupom Fiscal")
 /**
   * Cupom Fiscal  
  **/
  private BigDecimal receipt = null;

  @ApiModelProperty(required = true, value = "CPF Portador")
 /**
   * CPF Portador  
  **/
  private String cpf = null;

  @ApiModelProperty(required = true, value = "Loja")
 /**
   * Loja  
  **/
  private Integer store = null;

  @ApiModelProperty(required = true, value = "Recibo do Fornecedor")
 /**
   * Recibo do Fornecedor  
  **/
  private String vendorReceipt = null;

  @ApiModelProperty(value = "Recibo do Cliente")
 /**
   * Recibo do Cliente  
  **/
  private String clientReceipt = null;

  @ApiModelProperty(value = "NSU Host")
 /**
   * NSU Host  
  **/
  private String nsuHost = null;

  @ApiModelProperty(value = "Nome da Instituição")
 /**
   * Nome da Instituição  
  **/
  private String institutionName = null;

  @ApiModelProperty(value = "Código de Operação")
 /**
   * Código de Operação  
  **/
  private String creditOperationAuthCode = null;

  @ApiModelProperty(value = "Identificador do PDV")
 /**
   * Identificador do PDV  
  **/
  private String idPDV = null;

  @ApiModelProperty(value = "Número de Serie do Dispositivo")
 /**
   * Número de Serie do Dispositivo  
  **/
  private String deviceSerialNumber = null;

  @ApiModelProperty(value = "Id da Loja do Sitef")
 /**
   * Id da Loja do Sitef  
  **/
  private String sitefStore = null;

  @ApiModelProperty(required = true, value = "")
  private ProductDTO product = null;

  @ApiModelProperty(required = true, value = "")
  private CardDTO card = null;

  @ApiModelProperty(required = true, value = "")
  private TransactionDTO transaction = null;
 /**
   * Status da Operação
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public TransactionReceiptRequestDTO status(String status) {
    this.status = status;
    return this;
  }

 /**
   * NSU Sitef
   * @return nsuSitef
  **/
  @JsonProperty("nsuSitef")
  public String getNsuSitef() {
    return nsuSitef;
  }

  public void setNsuSitef(String nsuSitef) {
    this.nsuSitef = nsuSitef;
  }

  public TransactionReceiptRequestDTO nsuSitef(String nsuSitef) {
    this.nsuSitef = nsuSitef;
    return this;
  }

 /**
   * Cupom Fiscal
   * @return receipt
  **/
  @JsonProperty("receipt")
  public BigDecimal getReceipt() {
    return receipt;
  }

  public void setReceipt(BigDecimal receipt) {
    this.receipt = receipt;
  }

  public TransactionReceiptRequestDTO receipt(BigDecimal receipt) {
    this.receipt = receipt;
    return this;
  }

 /**
   * CPF Portador
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public TransactionReceiptRequestDTO cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Loja
   * @return store
  **/
  @JsonProperty("store")
  public Integer getStore() {
    return store;
  }

  public void setStore(Integer store) {
    this.store = store;
  }

  public TransactionReceiptRequestDTO store(Integer store) {
    this.store = store;
    return this;
  }

 /**
   * Recibo do Fornecedor
   * @return vendorReceipt
  **/
  @JsonProperty("vendorReceipt")
  public String getVendorReceipt() {
    return vendorReceipt;
  }

  public void setVendorReceipt(String vendorReceipt) {
    this.vendorReceipt = vendorReceipt;
  }

  public TransactionReceiptRequestDTO vendorReceipt(String vendorReceipt) {
    this.vendorReceipt = vendorReceipt;
    return this;
  }

 /**
   * Recibo do Cliente
   * @return clientReceipt
  **/
  @JsonProperty("clientReceipt")
  public String getClientReceipt() {
    return clientReceipt;
  }

  public void setClientReceipt(String clientReceipt) {
    this.clientReceipt = clientReceipt;
  }

  public TransactionReceiptRequestDTO clientReceipt(String clientReceipt) {
    this.clientReceipt = clientReceipt;
    return this;
  }

 /**
   * NSU Host
   * @return nsuHost
  **/
  @JsonProperty("nsuHost")
  public String getNsuHost() {
    return nsuHost;
  }

  public void setNsuHost(String nsuHost) {
    this.nsuHost = nsuHost;
  }

  public TransactionReceiptRequestDTO nsuHost(String nsuHost) {
    this.nsuHost = nsuHost;
    return this;
  }

 /**
   * Nome da Instituição
   * @return institutionName
  **/
  @JsonProperty("institutionName")
  public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }

  public TransactionReceiptRequestDTO institutionName(String institutionName) {
    this.institutionName = institutionName;
    return this;
  }

 /**
   * Código de Operação
   * @return creditOperationAuthCode
  **/
  @JsonProperty("creditOperationAuthCode")
  public String getCreditOperationAuthCode() {
    return creditOperationAuthCode;
  }

  public void setCreditOperationAuthCode(String creditOperationAuthCode) {
    this.creditOperationAuthCode = creditOperationAuthCode;
  }

  public TransactionReceiptRequestDTO creditOperationAuthCode(String creditOperationAuthCode) {
    this.creditOperationAuthCode = creditOperationAuthCode;
    return this;
  }

 /**
   * Identificador do PDV
   * @return idPDV
  **/
  @JsonProperty("idPDV")
  public String getIdPDV() {
    return idPDV;
  }

  public void setIdPDV(String idPDV) {
    this.idPDV = idPDV;
  }

  public TransactionReceiptRequestDTO idPDV(String idPDV) {
    this.idPDV = idPDV;
    return this;
  }

 /**
   * Número de Serie do Dispositivo
   * @return deviceSerialNumber
  **/
  @JsonProperty("deviceSerialNumber")
  public String getDeviceSerialNumber() {
    return deviceSerialNumber;
  }

  public void setDeviceSerialNumber(String deviceSerialNumber) {
    this.deviceSerialNumber = deviceSerialNumber;
  }

  public TransactionReceiptRequestDTO deviceSerialNumber(String deviceSerialNumber) {
    this.deviceSerialNumber = deviceSerialNumber;
    return this;
  }

 /**
   * Id da Loja do Sitef
   * @return sitefStore
  **/
  @JsonProperty("sitefStore")
  public String getSitefStore() {
    return sitefStore;
  }

  public void setSitefStore(String sitefStore) {
    this.sitefStore = sitefStore;
  }

  public TransactionReceiptRequestDTO sitefStore(String sitefStore) {
    this.sitefStore = sitefStore;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  @JsonProperty("product")
  public ProductDTO getProduct() {
    return product;
  }

  public void setProduct(ProductDTO product) {
    this.product = product;
  }

  public TransactionReceiptRequestDTO product(ProductDTO product) {
    this.product = product;
    return this;
  }

 /**
   * Get card
   * @return card
  **/
  @JsonProperty("card")
  public CardDTO getCard() {
    return card;
  }

  public void setCard(CardDTO card) {
    this.card = card;
  }

  public TransactionReceiptRequestDTO card(CardDTO card) {
    this.card = card;
    return this;
  }

 /**
   * Get transaction
   * @return transaction
  **/
  @JsonProperty("transaction")
  public TransactionDTO getTransaction() {
    return transaction;
  }

  public void setTransaction(TransactionDTO transaction) {
    this.transaction = transaction;
  }

  public TransactionReceiptRequestDTO transaction(TransactionDTO transaction) {
    this.transaction = transaction;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReceiptRequestDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    nsuSitef: ").append(toIndentedString(nsuSitef)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    vendorReceipt: ").append(toIndentedString(vendorReceipt)).append("\n");
    sb.append("    clientReceipt: ").append(toIndentedString(clientReceipt)).append("\n");
    sb.append("    nsuHost: ").append(toIndentedString(nsuHost)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    creditOperationAuthCode: ").append(toIndentedString(creditOperationAuthCode)).append("\n");
    sb.append("    idPDV: ").append(toIndentedString(idPDV)).append("\n");
    sb.append("    deviceSerialNumber: ").append(toIndentedString(deviceSerialNumber)).append("\n");
    sb.append("    sitefStore: ").append(toIndentedString(sitefStore)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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