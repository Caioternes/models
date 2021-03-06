package io.swagger.model.card;

import io.swagger.model.card.Product;
import io.swagger.model.card.PersonAccount;
import io.swagger.model.card.Group;
import io.swagger.model.card.CommercialOrigin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

@ApiModel(description="Conta do titular do cartão")
public class Account  {
  
  @ApiModelProperty(value = "Identificação da conta [id_processadora]")
  private Integer id = null;
  @ApiModelProperty(value = "Status da conta")
  private String status = null;
  @ApiModelProperty(value = "")
  private PersonAccount person = null;
  @ApiModelProperty(value = "")
  private PersonAccount holderPerson = null;
  @ApiModelProperty(value = "")
  private Group group = null;
  @ApiModelProperty(value = "")
  private Product product = null;

 /**
   * Identificação da conta [id_processadora]
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Account id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Status da conta
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Account status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Get person
   * @return person
  **/
  public PersonAccount getPerson() {
    return person;
  }

  public void setPerson(PersonAccount person) {
    this.person = person;
  }

  public Account person(PersonAccount person) {
    this.person = person;
    return this;
  }

 /**
   * Get holderPerson
   * @return holderPerson
  **/
  public PersonAccount getHolderPerson() {
    return holderPerson;
  }

  public void setHolderPerson(PersonAccount holderPerson) {
    this.holderPerson = holderPerson;
  }

  public Account holderPerson(PersonAccount holderPerson) {
    this.holderPerson = holderPerson;
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

  public Account group(Group group) {
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

  public Account product(Product product) {
    this.product = product;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    holderPerson: ").append(toIndentedString(holderPerson)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

