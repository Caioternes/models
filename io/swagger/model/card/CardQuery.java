package io.swagger.model.card;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@ApiModel(description="Critério de busca de cartões com operador AND")
public class CardQuery  {
  
  @ApiModelProperty(value = "CPF do portador do cartão")
  private String cpf = null;
  @ApiModelProperty(value = "Numero do cartão")
  private String number = null;

@XmlType(name="StatusCartaoListEnum")
@XmlEnum(String.class)
public enum StatusCartaoListEnum {

@XmlEnumValue("NORMAL") NORMAL(String.valueOf("NORMAL")), @XmlEnumValue("BLOQUEADO") BLOQUEADO(String.valueOf("BLOQUEADO")), @XmlEnumValue("CANCELADO") CANCELADO(String.valueOf("CANCELADO")), @XmlEnumValue("CANCELADO_PERDA") CANCELADO_PERDA(String.valueOf("CANCELADO_PERDA")), @XmlEnumValue("CANCELADO_ROUBO") CANCELADO_ROUBO(String.valueOf("CANCELADO_ROUBO")), @XmlEnumValue("CANCELADO_CLIENTE") CANCELADO_CLIENTE(String.valueOf("CANCELADO_CLIENTE")), @XmlEnumValue("CANCELADO_BANCO") CANCELADO_BANCO(String.valueOf("CANCELADO_BANCO")), @XmlEnumValue("CANCELADO_EXTRAVIADO") CANCELADO_EXTRAVIADO(String.valueOf("CANCELADO_EXTRAVIADO")), @XmlEnumValue("CANCELADO_DANIFICADO") CANCELADO_DANIFICADO(String.valueOf("CANCELADO_DANIFICADO")), @XmlEnumValue("CANCELADO_TARJA") CANCELADO_TARJA(String.valueOf("CANCELADO_TARJA")), @XmlEnumValue("CANCELADO_EMBOSSING") CANCELADO_EMBOSSING(String.valueOf("CANCELADO_EMBOSSING")), @XmlEnumValue("CANCELADO_SUSP_FALSO") CANCELADO_SUSP_FALSO(String.valueOf("CANCELADO_SUSP_FALSO")), @XmlEnumValue("CANCELADO_DEV_CORREIO") CANCELADO_DEV_CORREIO(String.valueOf("CANCELADO_DEV_CORREIO")), @XmlEnumValue("CANCELADO_FALEC_TITULAR") CANCELADO_FALEC_TITULAR(String.valueOf("CANCELADO_FALEC_TITULAR")), @XmlEnumValue("CANCELADO_DESATIVADO") CANCELADO_DESATIVADO(String.valueOf("CANCELADO_DESATIVADO")), @XmlEnumValue("CANCELADO_VENCIDO") CANCELADO_VENCIDO(String.valueOf("CANCELADO_VENCIDO")), @XmlEnumValue("CANCELADO_DEIXADO_LOJA") CANCELADO_DEIXADO_LOJA(String.valueOf("CANCELADO_DEIXADO_LOJA")), @XmlEnumValue("MIGRADO") MIGRADO(String.valueOf("MIGRADO")), @XmlEnumValue("MIGRADO_REEMITIDO") MIGRADO_REEMITIDO(String.valueOf("MIGRADO_REEMITIDO")), @XmlEnumValue("CANCELADO_DEFINITIVO_DANIFICADO") CANCELADO_DEFINITIVO_DANIFICADO(String.valueOf("CANCELADO_DEFINITIVO_DANIFICADO")), @XmlEnumValue("CANCELADO_DEFINITIVO_TARJA") CANCELADO_DEFINITIVO_TARJA(String.valueOf("CANCELADO_DEFINITIVO_TARJA")), @XmlEnumValue("CANCELADO_DEFINITIVO_EMBOSSING") CANCELADO_DEFINITIVO_EMBOSSING(String.valueOf("CANCELADO_DEFINITIVO_EMBOSSING")), @XmlEnumValue("CANCELADO_DEFINITIVO_MIGRADO") CANCELADO_DEFINITIVO_MIGRADO(String.valueOf("CANCELADO_DEFINITIVO_MIGRADO")), @XmlEnumValue("CANCELADO_DEFINITIVO_MIGRADO_REEMITIDO") CANCELADO_DEFINITIVO_MIGRADO_REEMITIDO(String.valueOf("CANCELADO_DEFINITIVO_MIGRADO_REEMITIDO")), @XmlEnumValue("MIGRADO_BLOQUEADO") MIGRADO_BLOQUEADO(String.valueOf("MIGRADO_BLOQUEADO")), @XmlEnumValue("MIGRADO_BLOQUEADO_REEMITIDO") MIGRADO_BLOQUEADO_REEMITIDO(String.valueOf("MIGRADO_BLOQUEADO_REEMITIDO")), @XmlEnumValue("REEMITIDO_UNIBANCO") REEMITIDO_UNIBANCO(String.valueOf("REEMITIDO_UNIBANCO")), @XmlEnumValue("CANCELADO_DEFINITIVO_REEMITIDO_UNIBANCO") CANCELADO_DEFINITIVO_REEMITIDO_UNIBANCO(String.valueOf("CANCELADO_DEFINITIVO_REEMITIDO_UNIBANCO")), @XmlEnumValue("BLOQUEADO_SENHA_INCORRETA") BLOQUEADO_SENHA_INCORRETA(String.valueOf("BLOQUEADO_SENHA_INCORRETA")), @XmlEnumValue("CANCELADO_CVV_CVV2_NAO_GERADO") CANCELADO_CVV_CVV2_NAO_GERADO(String.valueOf("CANCELADO_CVV_CVV2_NAO_GERADO")), @XmlEnumValue("CANCELADO_EMBOSSING_LOJA") CANCELADO_EMBOSSING_LOJA(String.valueOf("CANCELADO_EMBOSSING_LOJA")), @XmlEnumValue("CANCELADO_REEMISSAO_PERSONALIZADO") CANCELADO_REEMISSAO_PERSONALIZADO(String.valueOf("CANCELADO_REEMISSAO_PERSONALIZADO")), @XmlEnumValue("SUSPEITA_FRAUDE_PREVENTIVO") SUSPEITA_FRAUDE_PREVENTIVO(String.valueOf("SUSPEITA_FRAUDE_PREVENTIVO")), @XmlEnumValue("CANCELADO_CARTAO_PRE_PAGO") CANCELADO_CARTAO_PRE_PAGO(String.valueOf("CANCELADO_CARTAO_PRE_PAGO")), @XmlEnumValue("PESSOA_FISICA_BLACK_LIST") PESSOA_FISICA_BLACK_LIST(String.valueOf("PESSOA_FISICA_BLACK_LIST")), @XmlEnumValue("BLOQUEADO_PREVENCAO") BLOQUEADO_PREVENCAO(String.valueOf("BLOQUEADO_PREVENCAO")), @XmlEnumValue("CANCELADO_DEFINITIVO_FRAUDE") CANCELADO_DEFINITIVO_FRAUDE(String.valueOf("CANCELADO_DEFINITIVO_FRAUDE")), @XmlEnumValue("BLOQUEADO_PARCEIRO") BLOQUEADO_PARCEIRO(String.valueOf("BLOQUEADO_PARCEIRO")), @XmlEnumValue("CANCELADO_CARTAO_PROVISORIO") CANCELADO_CARTAO_PROVISORIO(String.valueOf("CANCELADO_CARTAO_PROVISORIO")), @XmlEnumValue("CANCELADO_REEMISSAO_MIGRACAO_PRODUTO") CANCELADO_REEMISSAO_MIGRACAO_PRODUTO(String.valueOf("CANCELADO_REEMISSAO_MIGRACAO_PRODUTO"));


    private String value;

    StatusCartaoListEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusCartaoListEnum fromValue(String v) {
        for (StatusCartaoListEnum b : StatusCartaoListEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "")
  private List<StatusCartaoListEnum> statusCartaoList = new ArrayList<StatusCartaoListEnum>();

 /**
   * CPF do portador do cartão
   * @return cpf
  **/
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public CardQuery cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Numero do cartão
   * @return number
  **/
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CardQuery number(String number) {
    this.number = number;
    return this;
  }

 /**
   * Get statusCartaoList
   * @return statusCartaoList
  **/
  public List<StatusCartaoListEnum> getStatusCartaoList() {
    return statusCartaoList;
  }

  public void setStatusCartaoList(List<StatusCartaoListEnum> statusCartaoList) {
    this.statusCartaoList = statusCartaoList;
  }

  public CardQuery statusCartaoList(List<StatusCartaoListEnum> statusCartaoList) {
    this.statusCartaoList = statusCartaoList;
    return this;
  }

  public CardQuery addStatusCartaoListItem(StatusCartaoListEnum statusCartaoListItem) {
    this.statusCartaoList.add(statusCartaoListItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardQuery {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    statusCartaoList: ").append(toIndentedString(statusCartaoList)).append("\n");
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

