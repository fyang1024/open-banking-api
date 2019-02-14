package io.swagger.api;

import io.swagger.model.ResponseBankingPayeeDetails;
import io.swagger.model.ResponseBankingPayees;

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
public interface PayeesApi  {

    /**
     * Get Payee Detail
     *
     * Obtain detailed information on a single payee
     *
     */
    @GET
    @Path("/banking/payees/{payeeId}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Payee Detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayeeDetails.class))) })
    public ResponseBankingPayeeDetails getPayeeDetail(@PathParam("payeeId") String payeeId);

    /**
     * Get Payees
     *
     * Obtain a list of pre-registered payees
     *
     */
    @GET
    @Path("/banking/payees")
    @Produces({ "application/json" })
    @Operation(summary = "Get Payees", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayees.class))) })
    public ResponseBankingPayees listPayees(@QueryParam("type")String type, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);
}
