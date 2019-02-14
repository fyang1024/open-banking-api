package io.swagger.api;

import io.swagger.model.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ResponseCommonCustomer;
import io.swagger.model.ResponseCommonCustomerDetailed;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
@Path("/common")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2019-02-14T03:34:59.075Z[GMT]")public interface CommonApi  {
   
    @GET
    @Path("/customer")
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer", description = "Obtain basic information on the customer that has authorised the current session", tags={ "Customer" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomer.class)))
         })
    Response getCustomer(@Context SecurityContext securityContext);

    @GET
    @Path("/customer/detail")
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer Detail", description = "Obtain detailed information on the authorised customer within the current session.", tags={ "Customer" })
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomerDetailed.class)))
         })
    Response getCustomerDetail(@Context SecurityContext securityContext);

}
