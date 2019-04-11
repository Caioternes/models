package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Dados da pessoa vinculada a conta")
public class PersonAccount  {
  
  @ApiModelProperty(value = "Identificação da pessoa")
  private Integer id = null;
  @ApiModelProperty(value = "Cpf da pessoa")
  private String cpf = null;
  @ApiModelProperty(value = "Nome da pessoa")
  private String name = null;
  @ApiModelProperty(value = "Informa se é titular da conta")
  private Boolean titular = null;

 /**
   * Identificação da pessoa
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PersonAccount id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Cpf da pessoa
   * @return cpf
  **/
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public PersonAccount cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Nome da pessoa
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonAccount name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Informa se é titular da conta
   * @return titular
  **/
  public Boolean getTitular() {
    return titular;
  }

  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  public PersonAccount titular(Boolean titular) {
    this.titular = titular;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
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

