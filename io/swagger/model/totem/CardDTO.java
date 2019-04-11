package io.swagger.model.totem;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Cartão
 **/
@ApiModel(description="Cartão")
public class CardDTO  {
  
  @ApiModelProperty(value = "Tipo da Categoria do Cartão")
 /**
   * Tipo da Categoria do Cartão  
  **/
  private String typeCategory = null;

  @ApiModelProperty(required = true, value = "Identificador do Tipo de Cartão")
 /**
   * Identificador do Tipo de Cartão  
  **/
  private String typeId = null;

  @ApiModelProperty(required = true, value = "Tipo de Cartão")
 /**
   * Tipo de Cartão  
  **/
  private String type = null;

  @ApiModelProperty(required = true, value = "Seis Primeiros Dígitos do Cartão")
 /**
   * Seis Primeiros Dígitos do Cartão  
  **/
  private String binNumber = null;
 /**
   * Tipo da Categoria do Cartão
   * @return typeCategory
  **/
  @JsonProperty("typeCategory")
  public String getTypeCategory() {
    return typeCategory;
  }

  public void setTypeCategory(String typeCategory) {
    this.typeCategory = typeCategory;
  }

  public CardDTO typeCategory(String typeCategory) {
    this.typeCategory = typeCategory;
    return this;
  }

 /**
   * Identificador do Tipo de Cartão
   * @return typeId
  **/
  @JsonProperty("typeId")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public CardDTO typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

 /**
   * Tipo de Cartão
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CardDTO type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Seis Primeiros Dígitos do Cartão
   * @return binNumber
  **/
  @JsonProperty("binNumber")
  public String getBinNumber() {
    return binNumber;
  }

  public void setBinNumber(String binNumber) {
    this.binNumber = binNumber;
  }

  public CardDTO binNumber(String binNumber) {
    this.binNumber = binNumber;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDTO {\n");
    
    sb.append("    typeCategory: ").append(toIndentedString(typeCategory)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    binNumber: ").append(toIndentedString(binNumber)).append("\n");
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