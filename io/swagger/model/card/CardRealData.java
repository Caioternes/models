package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.time.LocalDate;

@ApiModel(description="Cartão Calcard")
public class CardRealData implements Serializable  {
  
  @ApiModelProperty(value = "Identificador do cartão [id_processadora]")
  private Integer id = null;
  @ApiModelProperty(value = "Status do cartão")
  private String status = null;
  @ApiModelProperty(value = "Número do cartão real")
  private String number = null;
  @ApiModelProperty(value = "Nome do portador do cartão")
  private String holderName = null;
  @ApiModelProperty(value = "Validade do cartão")
  private LocalDate validAt = null;
  @ApiModelProperty(value = "")
  private Account account = null;

 /**
   * Identificador do cartão [id_processadora]
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CardRealData id(Integer id) {
    this.id = id;
    return this;
  }

 /**
   * Status do cartão
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CardRealData status(String status) {
    this.status = status;
    return this;
  }

 /**
   * Número do cartão real
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CardRealData number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Nome do portador do cartão
   * @return holderName
  **/
  public String getHolderName() {
    return holderName;
  }

  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }

  public CardRealData holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

 /**
   * Validade do cartão
   * @return validAt
  **/
  public LocalDate getValidAt() {
    return validAt;
  }

  public void setValidAt(LocalDate validAt) {
    this.validAt = validAt;
  }

  public CardRealData validAt(LocalDate validAt) {
    this.validAt = validAt;
    return this;
  }

 /**
   * Get account
   * @return account
  **/
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public CardRealData account(Account account) {
    this.account = account;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRealData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    validAt: ").append(toIndentedString(validAt)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

