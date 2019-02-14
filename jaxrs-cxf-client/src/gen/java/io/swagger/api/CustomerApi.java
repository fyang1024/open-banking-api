package io.swagger.api;

import io.swagger.model.ResponseCommonCustomer;
import io.swagger.model.ResponseCommonCustomerDetailed;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Consumer Data Standards
 *
 * <p>API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 */
@Path("/")
public interface CustomerApi  {

    /**
     * Get Customer
     *
     * Obtain basic information on the customer that has authorised the current session
     *
     */
    @GET
    @Path("/common/customer")
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomer.class))) })
    public ResponseCommonCustomer getCustomer();

    /**
     * Get Customer Detail
     *
     * Obtain detailed information on the authorised customer within the current session.
     *
     */
    @GET
    @Path("/common/customer/detail")
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer Detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomerDetailed.class))) })
    public ResponseCommonCustomerDetailed getCustomerDetail();
}
