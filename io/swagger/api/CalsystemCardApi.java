package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.card.Card;
import io.swagger.model.card.CardQuery;
import javax.ws.rs.*;

@Path("/")
@Api(value = "/", description = "")
public interface CalsystemCardApi  {

    @GET
    @Path("/{id}/real-data")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Consultar dados reais do cartão por id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Status 400", response = String.class),
        @ApiResponse(code = 401, message = "Status 401", response = String.class),
        @ApiResponse(code = 404, message = "Status 404", response = String.class),
        @ApiResponse(code = 500, message = "Status 500", response = String.class) })
    public String idRealDataGet(@PathParam("id") int id, @HeaderParam("Authorization") String authorization);

    @POST
    @Path("/query")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Consulta de cartões por critério", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = Card.class),
        @ApiResponse(code = 400, message = "Status 400", response = String.class),
        @ApiResponse(code = 401, message = "Status 401", response = String.class),
        @ApiResponse(code = 500, message = "Status 500", response = String.class)})
    public String queryPost(CardQuery body, @HeaderParam("Authorization") String authorization);
}

