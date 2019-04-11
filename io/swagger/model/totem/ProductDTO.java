package io.swagger.model.totem;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductDTO  {
  
  @ApiModelProperty(required = true, value = "Código do Produto")
 /**
   * Código do Produto  
  **/
  private String code = null;

  @ApiModelProperty(required = true, value = "Identificar da Conta")
 /**
   * Identificar da Conta  
  **/
  private Integer accountId = null;

  @ApiModelProperty(value = "Id do Acordo")
 /**
   * Id do Acordo  
  **/
  private Integer agreementId = null;

  @ApiModelProperty(required = true, value = "Valor do Produto")
 /**
   * Valor do Produto  
  **/
  private BigDecimal value = null;
 /**
   * Código do Produto
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProductDTO code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Identificar da Conta
   * @return accountId
  **/
  @JsonProperty("accountId")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public ProductDTO accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

 /**
   * Id do Acordo
   * @return agreementId
  **/
  @JsonProperty("agreementId")
  public Integer getAgreementId() {
    return agreementId;
  }

  public void setAgreementId(Integer agreementId) {
    this.agreementId = agreementId;
  }

  public ProductDTO agreementId(Integer agreementId) {
    this.agreementId = agreementId;
    return this;
  }

 /**
   * Valor do Produto
   * @return value
  **/
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public ProductDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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