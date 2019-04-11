package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Grupo para o qual o cartão foi emitido [Calcenter,Tenco, etc...]")
public class Group  {
  
  @ApiModelProperty(value = "Identificação do grupo")
  private Integer id = null;
  @ApiModelProperty(value = "Nome do grupo")
  private String name = null;
  @ApiModelProperty(value = "Tipo do grupo")
  private String type = null;

 /**
   * Identificação do grupo
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Group id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Nome do grupo
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Tipo do grupo
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Group type(String type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

