package io.swagger.model.totem;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDTO  {
  
  @ApiModelProperty(required = true, value = "Nome da Autorizadora da Transação")
 /**
   * Nome da Autorizadora da Transação  
  **/
  private String authorizerName = null;

  @ApiModelProperty(value = "Id da Autorizadora")
 /**
   * Id da Autorizadora  
  **/
  private String authorizerId = null;

  @ApiModelProperty(required = true, value = "Tipo de Transação")
 /**
   * Tipo de Transação  
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "Código do Tipo de Transação")
 /**
   * Código do Tipo de Transação  
  **/
  private String typeCode = null;

  @ApiModelProperty(required = true, value = "Data da Transação")
 /**
   * Data da Transação  
  **/
  private Date date = null;

  @ApiModelProperty(required = true, value = "Valor da Transação")
 /**
   * Valor da Transação  
  **/
  private BigDecimal value = null;
 /**
   * Nome da Autorizadora da Transação
   * @return authorizerName
  **/
  @JsonProperty("authorizerName")
  public String getAuthorizerName() {
    return authorizerName;
  }

  public void setAuthorizerName(String authorizerName) {
    this.authorizerName = authorizerName;
  }

  public TransactionDTO authorizerName(String authorizerName) {
    this.authorizerName = authorizerName;
    return this;
  }

 /**
   * Id da Autorizadora
   * @return authorizerId
  **/
  @JsonProperty("authorizerId")
  public String getAuthorizerId() {
    return authorizerId;
  }

  public void setAuthorizerId(String authorizerId) {
    this.authorizerId = authorizerId;
  }

  public TransactionDTO authorizerId(String authorizerId) {
    this.authorizerId = authorizerId;
    return this;
  }

 /**
   * Tipo de Transação
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionDTO type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Código do Tipo de Transação
   * @return typeCode
  **/
  @JsonProperty("typeCode")
  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public TransactionDTO typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

 /**
   * Data da Transação
   * @return date
  **/
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public TransactionDTO date(Date date) {
    this.date = date;
    return this;
  }

 /**
   * Valor da Transação
   * @return value
  **/
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public TransactionDTO value(BigDecimal value) {
    this.value = value;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDTO {\n");
    
    sb.append("    authorizerName: ").append(toIndentedString(authorizerName)).append("\n");
    sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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