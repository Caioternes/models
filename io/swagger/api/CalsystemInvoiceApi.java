package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.account.ErroModel;
import io.swagger.model.invoice.Fatura;
import javax.ws.rs.*;

/**
 * AccountEngine
 *
 * <p>API de fatura fechada.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CalsystemInvoiceApi  {

    /**
     * Consulta datas e valores da fatura fechada de uma conta pelo identificador da mesma na processadora [id_processadora]
     *
     * @param id
     * @param authorization
     * @return 
     */
    @GET
    @Path("/fatura/{idConta}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta fatura fechada por idConta", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Fatura.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErroModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErroModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErroModel.class) })
    public Fatura accountIdFaturaGet(@PathParam("idConta") int id, @HeaderParam("Authorization") String authorization);
}

