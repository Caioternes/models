package io.swagger.model.renegotiation;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimularAcordoQueryDTO  {
  
  @ApiModelProperty(required = true, value = "Identificador da Conta na Processadora")
 /**
   * Identificador da Conta na Processadora  
  **/
  private Integer idConta = null;

  @ApiModelProperty(required = true, value = "CPF")
 /**
   * CPF  
  **/
  private String cpf = null;

  @ApiModelProperty(example = "2018-03-01", required = true, value = "Data da primeira parcela")
 /**
   * Data da primeira parcela  
  **/
  private String dataPrimeiraParcela = null;
 /**
   * Identificador da Conta na Processadora
   * @return idConta
  **/
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }

  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  public SimularAcordoQueryDTO idConta(Integer idConta) {
    this.idConta = idConta;
    return this;
  }

 /**
   * CPF
   * @return cpf
  **/
  @JsonProperty("cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public SimularAcordoQueryDTO cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Data da primeira parcela
   * @return dataPrimeiraParcela
  **/
  @JsonProperty("dataPrimeiraParcela")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }

  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  public SimularAcordoQueryDTO dataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimularAcordoQueryDTO {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    dataPrimeiraParcela: ").append(toIndentedString(dataPrimeiraParcela)).append("\n");
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