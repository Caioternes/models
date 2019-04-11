package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimularAcordoDTO  {

  @ApiModelProperty(value = "Lista de Planos")
 /**
   * Lista de Planos  
  **/
  private List<PlanoDTO> planos = null;


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
