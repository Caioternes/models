package io.swagger.model.renegotiation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AcordoDTO  {
  
  @ApiModelProperty(value = "Identificador do Acordo")
 /**
   * Identificador do Acordo  
  **/
  private Integer idAcordo = null;

  @ApiModelProperty(value = "Parcelas do acordo")
 /**
   * Parcelas do acordo  
  **/
  private List<ParcelasDTO> parcelas = null;
 /**
   * Identificador do Acordo
   * @return idAcordo
  **/
  @JsonProperty("idAcordo")
  public Integer getIdAcordo() {
    return idAcordo;
  }

  public void setIdAcordo(Integer idAcordo) {
    this.idAcordo = idAcordo;
  }

  public AcordoDTO idAcordo(Integer idAcordo) {
    this.idAcordo = idAcordo;
    return this;
  }

 /**
   * Parcelas do acordo
   * @return parcelas
  **/
  @JsonProperty("parcelas")
  public List<ParcelasDTO> getParcelas() {
    return parcelas;
  }

  public void setParcelas(List<ParcelasDTO> parcelas) {
    this.parcelas = parcelas;
  }

  public AcordoDTO parcelas(List<ParcelasDTO> parcelas) {
    this.parcelas = parcelas;
    return this;
  }

  public AcordoDTO addParcelasItem(ParcelasDTO parcelasItem) {
    this.parcelas.add(parcelasItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoDTO {\n");
    
    sb.append("    idAcordo: ").append(toIndentedString(idAcordo)).append("\n");
    sb.append("    parcelas: ").append(toIndentedString(parcelas)).append("\n");
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
