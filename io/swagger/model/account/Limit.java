package io.swagger.model.account;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Dados de limite da conta
 **/
@ApiModel(description="Dados de limite da conta")
public class Limit  {
  
  @ApiModelProperty(value = "Limite Saque Global")
 /**
   * Limite Saque Global  
  **/
  private Double limitWithdrawGlobal = null;

  @ApiModelProperty(value = "Saldo Disponível Parcelado")
 /**
   * Saldo Disponível Parcelado  
  **/
  private Double availableBalanceParceled = null;

  @ApiModelProperty(value = "Saldo Disponível Saque")
 /**
   * Saldo Disponível Saque  
  **/
  private Double availableBalanceWithdraw = null;

 /**
   * Limite Saque Global
   * @return limitWithdrawGlobal
  **/
  @JsonProperty("limitWithdrawGlobal")
  public Double getLimitWithdrawGlobal() {
    return limitWithdrawGlobal;
  }

  public void setLimitWithdrawGlobal(Double limitWithdrawGlobal) {
    this.limitWithdrawGlobal = limitWithdrawGlobal;
  }

  public Limit limitWithdrawGlobal(Double limitWithdrawGlobal) {
    this.limitWithdrawGlobal = limitWithdrawGlobal;
    return this;
  }

 /**
   * Saldo Disponível Parcelado
   * @return availableBalanceParceled
  **/
  @JsonProperty("availableBalanceParceled")
  public Double getAvailableBalanceParceled() {
    return availableBalanceParceled;
  }

  public void setAvailableBalanceParceled(Double availableBalanceParceled) {
    this.availableBalanceParceled = availableBalanceParceled;
  }

  public Limit availableBalanceParceled(Double availableBalanceParceled) {
    this.availableBalanceParceled = availableBalanceParceled;
    return this;
  }

 /**
   * Saldo Disponível Saque
   * @return availableBalanceWithdraw
  **/
  @JsonProperty("availableBalanceWithdraw")
  public Double getAvailableBalanceWithdraw() {
    return availableBalanceWithdraw;
  }

  public void setAvailableBalanceWithdraw(Double availableBalanceWithdraw) {
    this.availableBalanceWithdraw = availableBalanceWithdraw;
  }

  public Limit availableBalanceWithdraw(Double availableBalanceWithdraw) {
    this.availableBalanceWithdraw = availableBalanceWithdraw;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    
    sb.append("    limitWithdrawGlobal: ").append(toIndentedString(limitWithdrawGlobal)).append("\n");
    sb.append("    availableBalanceParceled: ").append(toIndentedString(availableBalanceParceled)).append("\n");
    sb.append("    availableBalanceWithdraw: ").append(toIndentedString(availableBalanceWithdraw)).append("\n");
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

