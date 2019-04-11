package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Origem comercial vinculada a conta do portador")
public class CommercialOrigin  {
  
  @ApiModelProperty(value = "Identificação da origem comercial")
  private Integer id = null;
  @ApiModelProperty(value = "Nome da origem comercial")
  private String name = null;
  @ApiModelProperty(value = "Status da origem comercial")
  private String status = null;
  @ApiModelProperty(value = "")
  private Group group = null;
  @ApiModelProperty(value = "")
  private Product product = null;
  @ApiModelProperty(value = "")
  private Establishment establishment = null;

 /**
   * Identificação da origem comercial
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CommercialOrigin id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Nome da origem comercial
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CommercialOrigin name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Status da origem comercial
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CommercialOrigin status(String status) {
    this.status = status;
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

  public CommercialOrigin group(Group group) {
    this.group = group;
    return this;
  }

 /**
   * Get product
   * @return product
  **/
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public CommercialOrigin product(Product product) {
    this.product = product;
    return this;
  }

 /**
   * Get establishment
   * @return establishment
  **/
  public Establishment getEstablishment() {
    return establishment;
  }

  public void setEstablishment(Establishment establishment) {
    this.establishment = establishment;
  }

  public CommercialOrigin establishment(Establishment establishment) {
    this.establishment = establishment;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommercialOrigin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    establishment: ").append(toIndentedString(establishment)).append("\n");
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

