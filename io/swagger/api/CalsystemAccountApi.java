package io.swagger.api;

import io.swagger.model.account.ErroModel;
import io.swagger.model.account.InvoiceData;

import javax.ws.rs.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.model.account.Invoice;
import io.swagger.model.account.Limit;
import java.util.List;

/**
 * AccountEngine
 *
 * <p>API de manutenção de contas.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CalsystemAccountApi  {

    /**
     * Busca os dados do último boleto registrado referente a fatura da conta
     *
     * @param id
     * @param authorization
     * @return 
     */
    @GET
    @Path("/account/{id}/invoice-data")
    @Produces({ "application/json" })
    @ApiOperation(value = "Busca os dados do último boleto registrado referente a fatura da conta", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = InvoiceData.class),
        @ApiResponse(code = 401, message = "Status 401", response = ErroModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErroModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErroModel.class) })
    public InvoiceData accountIdInvoiceDataGet(@PathParam("id") int id, @HeaderParam("Authorization") String authorization);
    
    /**
     * Busca as faturas de uma conta
     *
     * @param id
     * @param authorization
     * @return 
     */
    @GET
    @Path("/account/{id}/invoices")
    @Produces({ "application/json" })
    @ApiOperation(value = "Busca as faturas de uma conta", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Invoice.class, responseContainer = "array"),
        @ApiResponse(code = 401, message = "Status 401", response = ErroModel.class),
        @ApiResponse(code = 404, message = "Status 404", response = ErroModel.class),
        @ApiResponse(code = 500, message = "Status 500", response = ErroModel.class) })
    public List<Invoice> accountIdInvoicesGet(@PathParam("id") Integer id, @HeaderParam("Authorization") String authorization);

    /**
     * Busca os limites da conta.
     *
     * Retorna os limites da conta de acordo com o id da conta informado.
     *
     * @param id
     * @return 
     */
    @GET
    @Path("/account/{id}/limits")
    @Produces({ "application/json" })
    @ApiOperation(value = "Busca os limites da conta.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao buscar os dados de conta.", response = Limit.class),
        @ApiResponse(code = 400, message = "Bad request.", response = ErroModel.class),
        @ApiResponse(code = 401, message = "Autenticação não autorizada.", response = ErroModel.class),
        @ApiResponse(code = 404, message = "Id conta não encontrado.", response = ErroModel.class),
        @ApiResponse(code = 500, message = "Erro genérico.", response = ErroModel.class) })
    public Limit accountIdLimitsGet(@PathParam("id") Integer id, @HeaderParam("Authorization") String authorization);
}

