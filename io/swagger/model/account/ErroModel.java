package io.swagger.model.account;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Erro generico.
 **/
@ApiModel(description="Erro generico.")
public class ErroModel  {
  
  @ApiModelProperty(required = true, value = "Detalhes do erro.")
 /**
   * Detalhes do erro.  
  **/
  private Object message = null;
 /**
   * Detalhes do erro.
   * @return message
  **/
  @JsonProperty("message")
  public Object getMessage() {
    return message;
  }

  public void setMessage(Object message) {
    this.message = message;
  }

  public ErroModel message(Object message) {
    this.message = message;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErroModel {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

