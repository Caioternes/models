package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Produto ao qual o cartão está vinculado.")
public class Product  {
  
  @ApiModelProperty(value = "Identificação do produto")
  private Integer id = null;
  @ApiModelProperty(value = "Nome do produto")
  private String name = null;
  @ApiModelProperty(value = "Permite embossing")
  private Boolean embossable = null;

 /**
   * Identificação do produto
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Product id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Nome do produto
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Permite embossing
   * @return embossable
  **/
  public Boolean getEmbossable() {
    return embossable;
  }

  public void setEmbossable(Boolean embossable) {
    this.embossable = embossable;
  }

  public Product embossable(Boolean embossable) {
    this.embossable = embossable;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    embossable: ").append(toIndentedString(embossable)).append("\n");
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

