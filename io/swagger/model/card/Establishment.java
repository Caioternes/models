package io.swagger.model.card;

import io.swagger.model.card.Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Estabelecimento a origem comercial")
public class Establishment  {
  
  @ApiModelProperty(value = "Identificação do estabelecimento")
  private Integer id = null;
  @ApiModelProperty(value = "Nome do estabelecimento")
  private String name = null;
  @ApiModelProperty(value = "")
  private Group group = null;

 /**
   * Identificação do estabelecimento
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Establishment id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Nome do estabelecimento
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Establishment name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get group
   * @return group
  **/
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Establishment group(Group group) {
    this.group = group;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Establishment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

