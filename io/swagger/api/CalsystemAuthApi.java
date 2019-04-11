package io.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.ws.rs.*;

@Path("/")
@Api(value = "/", description = "")
public interface CalsystemAuthApi  {

    @POST
    @Path("/token")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Aquisição de token client", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Status 400", response = String.class),
        @ApiResponse(code = 401, message = "Status 401", response = String.class),
        @ApiResponse(code = 500, message = "Status 500", response = String.class) })
    public String token(@HeaderParam("Authorization") String authorization);
}

