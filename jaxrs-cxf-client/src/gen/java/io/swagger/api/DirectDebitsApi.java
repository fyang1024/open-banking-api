package io.swagger.api;

import io.swagger.model.ErrorList;
import io.swagger.model.RequestAccountIds;
import io.swagger.model.ResponseBankingDirectDebits;

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
public interface DirectDebitsApi  {

    /**
     * Get Direct Debits For Account
     *
     * Obtain direct debit authorisations for a specific account
     *
     */
    @GET
    @Path("/banking/accounts/{accountId}/direct-debits")
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public ResponseBankingDirectDebits listDirectDebits(@PathParam("accountId") String accountId, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Bulk Direct Debits
     *
     * Obtain direct debit authorisations for multiple, filtered accounts
     *
     */
    @GET
    @Path("/banking/accounts/direct-debits")
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Direct Debits", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public ResponseBankingDirectDebits listDirectDebitsBulk(@QueryParam("is-owned")String isOwned, @QueryParam("product-category")String productCategory, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Direct Debits For Specific Accounts
     *
     * Obtain direct debit authorisations for a specified list of accounts
     *
     */
    @POST
    @Path("/banking/accounts/direct-debits")
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Specific Accounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))),
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public ResponseBankingDirectDebits listDirectDebitsSpecificAccounts(RequestAccountIds body);
}
