package io.swagger.api;

import io.swagger.model.renegotiation.AcordoDTO;
import io.swagger.model.renegotiation.BoletoDTO;
import io.swagger.model.renegotiation.ConfirmarAcordoQueryDTO;
import io.swagger.model.renegotiation.ErrorModel;
import io.swagger.model.renegotiation.SimularAcordoDTO;
import io.swagger.model.renegotiation.SimularAcordoQueryDTO;

import javax.ws.rs.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Renegotiation Engine
 *
 * <p>API de renegociação de contas
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CalsystemRenegotiationApi  {

    /**
     * Busca os dados do acordo
     *
     */
    @GET
    @Path("/acordo")
    @Produces({ "application/json" })
    @ApiOperation(value = "Busca os dados do acordo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = AcordoDTO.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErrorModel.class) })
    public AcordoDTO acordoGet(@QueryParam("cpf")String cpf, @QueryParam("idConta")Integer idConta, @HeaderParam("Authorization") String authorization);

    /**
     * Efetivar um acordo
     *
     */
    @POST
    @Path("/acordo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Efetivar um acordo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = AcordoDTO.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErrorModel.class) })
    public AcordoDTO acordoPost(ConfirmarAcordoQueryDTO body, @HeaderParam("Authorization") String authorization);

    /**
     * Busca os dados do boleto do acordo
     *
     */
    @GET
    @Path("/boleto")
    @Produces({ "application/json" })
    @ApiOperation(value = "Busca os dados do boleto do acordo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = BoletoDTO.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErrorModel.class) })
    public BoletoDTO boletoGet(@QueryParam("cpf")String cpf, @QueryParam("idConta")Integer idConta, @QueryParam("parcela")Integer parcela, @HeaderParam("Authorization") String authorization);

    /**
     * Realiza a simulação de um acordo
     *
     */
    @POST
    @Path("/simular-acordo")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Realiza a simulação de um acordo", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = SimularAcordoDTO.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErrorModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErrorModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErrorModel.class) })
    public SimularAcordoDTO simularAcordoPost(SimularAcordoQueryDTO body, @HeaderParam("Authorization") String authorization);
}