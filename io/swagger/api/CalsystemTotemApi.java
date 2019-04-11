package io.swagger.api;

import javax.ws.rs.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.totem.ErroModel;
import io.swagger.model.totem.TransactionReceiptRequestDTO;
import io.swagger.model.totem.TransactionReceiptResponseDTO;

/**
 * Totem Engine
 *
 * <p>API de integração com os totens
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CalsystemTotemApi  {

    /**
     * Realiza a integração dos recibos do TOTEM
     *
     * @param authorization String
     * @param body TransactionReceiptRequestDTO
     * @return TransactionReceiptResponseDTO
     */
    @POST
    @Path("/transaction-receipt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Realiza a integração dos recibos do TOTEM", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = TransactionReceiptResponseDTO.class),
        @ApiResponse(code = 208, message = "Status 208", response = ErroModel.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErroModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErroModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErroModel.class) })
    public TransactionReceiptResponseDTO transactionReceiptPost(@HeaderParam("Authorization") String authorization, TransactionReceiptRequestDTO body);
}