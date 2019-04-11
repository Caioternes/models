package io.swagger.model.account;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Dados de limite da conta
 **/
@ApiModel(description="Dados de limite da conta")
public class Limit  {
  
  @ApiModelProperty(value = "Limite Global")
 /**
   * Limite Global  
  **/
  private Double limitGlobal = null;

  @ApiModelProperty(value = "Limite Compra")
 /**
   * Limite Compra  
  **/
  private Double limitBuy = null;

  @ApiModelProperty(value = "Limite Parcelado")
 /**
   * Limite Parcelado  
  **/
  private Double limitParceled = null;

  @ApiModelProperty(value = "Limite Parcelas")
 /**
   * Limite Parcelas  
  **/
  private Double limitPlots = null;

  @ApiModelProperty(value = "Limite Saque Global")
 /**
   * Limite Saque Global  
  **/
  private Double limitWithdrawGlobal = null;

  @ApiModelProperty(value = "Limite Saque Período")
 /**
   * Limite Saque Período  
  **/
  private Double limitWithdrawPeriod = null;

  @ApiModelProperty(value = "Limite Consignado")
 /**
   * Limite Consignado  
  **/
  private Double limitPayroll = null;

  @ApiModelProperty(value = "Limite Internacional Compra")
 /**
   * Limite Internacional Compra  
  **/
  private Double limitBuyInternational = null;

  @ApiModelProperty(value = "Limite Internacional Parcelado")
 /**
   * Limite Internacional Parcelado  
  **/
  private Double limitParceledInternational = null;

  @ApiModelProperty(value = "Limite Internacional Parcelas")
 /**
   * Limite Internacional Parcelas  
  **/
  private Double limitPlotsInternational = null;

  @ApiModelProperty(value = "Limite Internacional Saque Global")
 /**
   * Limite Internacional Saque Global  
  **/
  private Double limitWithdrawGlobalInternational = null;

  @ApiModelProperty(value = "Limite Internacional Saque Período")
 /**
   * Limite Internacional Saque Período  
  **/
  private Double limitWithdrawPeriodInternational = null;

  @ApiModelProperty(value = "Saldo Disponível Global")
 /**
   * Saldo Disponível Global  
  **/
  private Double availableBalanceGlobal = null;

  @ApiModelProperty(value = "Saldo Disponível Compra")
 /**
   * Saldo Disponível Compra  
  **/
  private Double availableBalanceBuy = null;

  @ApiModelProperty(value = "Saldo Disponível Parcelado")
 /**
   * Saldo Disponível Parcelado  
  **/
  private Double availableBalanceParceled = null;

  @ApiModelProperty(value = "Saldo Disponível Parcelas")
 /**
   * Saldo Disponível Parcelas  
  **/
  private Double availableBalancePlots = null;

  @ApiModelProperty(value = "Saldo Disponível Saque")
 /**
   * Saldo Disponível Saque  
  **/
  private Double availableBalanceWithdraw = null;

  @ApiModelProperty(value = "Saldo Pontos Fidelidade")
 /**
   * Saldo Pontos Fidelidade  
  **/
  private Double balanceLoyaltyPoints = null;

  @ApiModelProperty(value = "Saldo Disponível Compra Internacional")
 /**
   * Saldo Disponível Compra Internacional  
  **/
  private Double availableBalanceBuyInternational = null;

  @ApiModelProperty(value = "Saldo Disponível Saque Internacional")
 /**
   * Saldo Disponível Saque Internacional  
  **/
  private Double availableBalanceWithdrawInternational = null;
 /**
   * Limite Global
   * @return limitGlobal
  **/
  @JsonProperty("limitGlobal")
  public Double getLimitGlobal() {
    return limitGlobal;
  }

  public void setLimitGlobal(Double limitGlobal) {
    this.limitGlobal = limitGlobal;
  }

  public Limit limitGlobal(Double limitGlobal) {
    this.limitGlobal = limitGlobal;
    return this;
  }

 /**
   * Limite Compra
   * @return limitBuy
  **/
  @JsonProperty("limitBuy")
  public Double getLimitBuy() {
    return limitBuy;
  }

  public void setLimitBuy(Double limitBuy) {
    this.limitBuy = limitBuy;
  }

  public Limit limitBuy(Double limitBuy) {
    this.limitBuy = limitBuy;
    return this;
  }

 /**
   * Limite Parcelado
   * @return limitParceled
  **/
  @JsonProperty("limitParceled")
  public Double getLimitParceled() {
    return limitParceled;
  }

  public void setLimitParceled(Double limitParceled) {
    this.limitParceled = limitParceled;
  }

  public Limit limitParceled(Double limitParceled) {
    this.limitParceled = limitParceled;
    return this;
  }

 /**
   * Limite Parcelas
   * @return limitPlots
  **/
  @JsonProperty("limitPlots")
  public Double getLimitPlots() {
    return limitPlots;
  }

  public void setLimitPlots(Double limitPlots) {
    this.limitPlots = limitPlots;
  }

  public Limit limitPlots(Double limitPlots) {
    this.limitPlots = limitPlots;
    return this;
  }

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
   * Limite Saque Período
   * @return limitWithdrawPeriod
  **/
  @JsonProperty("limitWithdrawPeriod")
  public Double getLimitWithdrawPeriod() {
    return limitWithdrawPeriod;
  }

  public void setLimitWithdrawPeriod(Double limitWithdrawPeriod) {
    this.limitWithdrawPeriod = limitWithdrawPeriod;
  }

  public Limit limitWithdrawPeriod(Double limitWithdrawPeriod) {
    this.limitWithdrawPeriod = limitWithdrawPeriod;
    return this;
  }

 /**
   * Limite Consignado
   * @return limitPayroll
  **/
  @JsonProperty("limitPayroll")
  public Double getLimitPayroll() {
    return limitPayroll;
  }

  public void setLimitPayroll(Double limitPayroll) {
    this.limitPayroll = limitPayroll;
  }

  public Limit limitPayroll(Double limitPayroll) {
    this.limitPayroll = limitPayroll;
    return this;
  }

 /**
   * Limite Internacional Compra
   * @return limitBuyInternational
  **/
  @JsonProperty("limitBuyInternational")
  public Double getLimitBuyInternational() {
    return limitBuyInternational;
  }

  public void setLimitBuyInternational(Double limitBuyInternational) {
    this.limitBuyInternational = limitBuyInternational;
  }

  public Limit limitBuyInternational(Double limitBuyInternational) {
    this.limitBuyInternational = limitBuyInternational;
    return this;
  }

 /**
   * Limite Internacional Parcelado
   * @return limitParceledInternational
  **/
  @JsonProperty("limitParceledInternational")
  public Double getLimitParceledInternational() {
    return limitParceledInternational;
  }

  public void setLimitParceledInternational(Double limitParceledInternational) {
    this.limitParceledInternational = limitParceledInternational;
  }

  public Limit limitParceledInternational(Double limitParceledInternational) {
    this.limitParceledInternational = limitParceledInternational;
    return this;
  }

 /**
   * Limite Internacional Parcelas
   * @return limitPlotsInternational
  **/
  @JsonProperty("limitPlotsInternational")
  public Double getLimitPlotsInternational() {
    return limitPlotsInternational;
  }

  public void setLimitPlotsInternational(Double limitPlotsInternational) {
    this.limitPlotsInternational = limitPlotsInternational;
  }

  public Limit limitPlotsInternational(Double limitPlotsInternational) {
    this.limitPlotsInternational = limitPlotsInternational;
    return this;
  }

 /**
   * Limite Internacional Saque Global
   * @return limitWithdrawGlobalInternational
  **/
  @JsonProperty("limitWithdrawGlobalInternational")
  public Double getLimitWithdrawGlobalInternational() {
    return limitWithdrawGlobalInternational;
  }

  public void setLimitWithdrawGlobalInternational(Double limitWithdrawGlobalInternational) {
    this.limitWithdrawGlobalInternational = limitWithdrawGlobalInternational;
  }

  public Limit limitWithdrawGlobalInternational(Double limitWithdrawGlobalInternational) {
    this.limitWithdrawGlobalInternational = limitWithdrawGlobalInternational;
    return this;
  }

 /**
   * Limite Internacional Saque Período
   * @return limitWithdrawPeriodInternational
  **/
  @JsonProperty("limitWithdrawPeriodInternational")
  public Double getLimitWithdrawPeriodInternational() {
    return limitWithdrawPeriodInternational;
  }

  public void setLimitWithdrawPeriodInternational(Double limitWithdrawPeriodInternational) {
    this.limitWithdrawPeriodInternational = limitWithdrawPeriodInternational;
  }

  public Limit limitWithdrawPeriodInternational(Double limitWithdrawPeriodInternational) {
    this.limitWithdrawPeriodInternational = limitWithdrawPeriodInternational;
    return this;
  }

 /**
   * Saldo Disponível Global
   * @return availableBalanceGlobal
  **/
  @JsonProperty("availableBalanceGlobal")
  public Double getAvailableBalanceGlobal() {
    return availableBalanceGlobal;
  }

  public void setAvailableBalanceGlobal(Double availableBalanceGlobal) {
    this.availableBalanceGlobal = availableBalanceGlobal;
  }

  public Limit availableBalanceGlobal(Double availableBalanceGlobal) {
    this.availableBalanceGlobal = availableBalanceGlobal;
    return this;
  }

 /**
   * Saldo Disponível Compra
   * @return availableBalanceBuy
  **/
  @JsonProperty("availableBalanceBuy")
  public Double getAvailableBalanceBuy() {
    return availableBalanceBuy;
  }

  public void setAvailableBalanceBuy(Double availableBalanceBuy) {
    this.availableBalanceBuy = availableBalanceBuy;
  }

  public Limit availableBalanceBuy(Double availableBalanceBuy) {
    this.availableBalanceBuy = availableBalanceBuy;
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
   * Saldo Disponível Parcelas
   * @return availableBalancePlots
  **/
  @JsonProperty("availableBalancePlots")
  public Double getAvailableBalancePlots() {
    return availableBalancePlots;
  }

  public void setAvailableBalancePlots(Double availableBalancePlots) {
    this.availableBalancePlots = availableBalancePlots;
  }

  public Limit availableBalancePlots(Double availableBalancePlots) {
    this.availableBalancePlots = availableBalancePlots;
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

 /**
   * Saldo Pontos Fidelidade
   * @return balanceLoyaltyPoints
  **/
  @JsonProperty("balanceLoyaltyPoints")
  public Double getBalanceLoyaltyPoints() {
    return balanceLoyaltyPoints;
  }

  public void setBalanceLoyaltyPoints(Double balanceLoyaltyPoints) {
    this.balanceLoyaltyPoints = balanceLoyaltyPoints;
  }

  public Limit balanceLoyaltyPoints(Double balanceLoyaltyPoints) {
    this.balanceLoyaltyPoints = balanceLoyaltyPoints;
    return this;
  }

 /**
   * Saldo Disponível Compra Internacional
   * @return availableBalanceBuyInternational
  **/
  @JsonProperty("availableBalanceBuyInternational")
  public Double getAvailableBalanceBuyInternational() {
    return availableBalanceBuyInternational;
  }

  public void setAvailableBalanceBuyInternational(Double availableBalanceBuyInternational) {
    this.availableBalanceBuyInternational = availableBalanceBuyInternational;
  }

  public Limit availableBalanceBuyInternational(Double availableBalanceBuyInternational) {
    this.availableBalanceBuyInternational = availableBalanceBuyInternational;
    return this;
  }

 /**
   * Saldo Disponível Saque Internacional
   * @return availableBalanceWithdrawInternational
  **/
  @JsonProperty("availableBalanceWithdrawInternational")
  public Double getAvailableBalanceWithdrawInternational() {
    return availableBalanceWithdrawInternational;
  }

  public void setAvailableBalanceWithdrawInternational(Double availableBalanceWithdrawInternational) {
    this.availableBalanceWithdrawInternational = availableBalanceWithdrawInternational;
  }

  public Limit availableBalanceWithdrawInternational(Double availableBalanceWithdrawInternational) {
    this.availableBalanceWithdrawInternational = availableBalanceWithdrawInternational;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    
    sb.append("    limitGlobal: ").append(toIndentedString(limitGlobal)).append("\n");
    sb.append("    limitBuy: ").append(toIndentedString(limitBuy)).append("\n");
    sb.append("    limitParceled: ").append(toIndentedString(limitParceled)).append("\n");
    sb.append("    limitPlots: ").append(toIndentedString(limitPlots)).append("\n");
    sb.append("    limitWithdrawGlobal: ").append(toIndentedString(limitWithdrawGlobal)).append("\n");
    sb.append("    limitWithdrawPeriod: ").append(toIndentedString(limitWithdrawPeriod)).append("\n");
    sb.append("    limitPayroll: ").append(toIndentedString(limitPayroll)).append("\n");
    sb.append("    limitBuyInternational: ").append(toIndentedString(limitBuyInternational)).append("\n");
    sb.append("    limitParceledInternational: ").append(toIndentedString(limitParceledInternational)).append("\n");
    sb.append("    limitPlotsInternational: ").append(toIndentedString(limitPlotsInternational)).append("\n");
    sb.append("    limitWithdrawGlobalInternational: ").append(toIndentedString(limitWithdrawGlobalInternational)).append("\n");
    sb.append("    limitWithdrawPeriodInternational: ").append(toIndentedString(limitWithdrawPeriodInternational)).append("\n");
    sb.append("    availableBalanceGlobal: ").append(toIndentedString(availableBalanceGlobal)).append("\n");
    sb.append("    availableBalanceBuy: ").append(toIndentedString(availableBalanceBuy)).append("\n");
    sb.append("    availableBalanceParceled: ").append(toIndentedString(availableBalanceParceled)).append("\n");
    sb.append("    availableBalancePlots: ").append(toIndentedString(availableBalancePlots)).append("\n");
    sb.append("    availableBalanceWithdraw: ").append(toIndentedString(availableBalanceWithdraw)).append("\n");
    sb.append("    balanceLoyaltyPoints: ").append(toIndentedString(balanceLoyaltyPoints)).append("\n");
    sb.append("    availableBalanceBuyInternational: ").append(toIndentedString(availableBalanceBuyInternational)).append("\n");
    sb.append("    availableBalanceWithdrawInternational: ").append(toIndentedString(availableBalanceWithdrawInternational)).append("\n");
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

