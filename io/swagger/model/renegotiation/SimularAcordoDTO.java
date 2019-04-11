package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimularAcordoDTO  {
  
  @ApiModelProperty(value = "Identificador da Conta na Processaora")
 /**
   * Identificador da Conta na Processaora  
  **/
  private Integer idConta = null;

  @ApiModelProperty(value = "CPF")
 /**
   * CPF  
  **/
  private String cpf = null;

  @ApiModelProperty(value = "Lista de Planos")
 /**
   * Lista de Planos  
  **/
  private List<PlanoDTO> planos = null;
 /**
   * Identificador da Conta na Processaora
   * @return idConta
  **/
  @JsonProperty("idConta")
  public Integer getIdConta() {
    return idConta;
  }

  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  public SimularAcordoDTO idConta(Integer idConta) {
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

  public SimularAcordoDTO cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

 /**
   * Lista de Planos
   * @return planos
  **/
  @JsonProperty("planos")
  public List<PlanoDTO> getPlanos() {
    return planos;
  }

  public void setPlanos(List<PlanoDTO> planos) {
    this.planos = planos;
  }

  public SimularAcordoDTO planos(List<PlanoDTO> planos) {
    this.planos = planos;
    return this;
  }

  public SimularAcordoDTO addPlanosItem(PlanoDTO planosItem) {
    this.planos.add(planosItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimularAcordoDTO {\n");
    
    sb.append("    idConta: ").append(toIndentedString(idConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    planos: ").append(toIndentedString(planos)).append("\n");
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