package io.swagger.api;

import io.swagger.model.ErrorList;
import io.swagger.model.RequestAccountIds;
import io.swagger.model.ResponseBankingAccount;
import io.swagger.model.ResponseBankingAccounts;
import io.swagger.model.ResponseBankingAccountsBalances;
import io.swagger.model.ResponseBankingTransactionDetail;
import io.swagger.model.ResponseBankingTransactions;

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
public interface AccountsApi  {

    /**
     * Get Account Detail
     *
     * Obtain detailed information on a single account
     *
     */
    @GET
    @Path("/banking/accounts/{accountId}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Account Detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccount.class))) })
    public ResponseBankingAccount getAccountDetail(@PathParam("accountId") String accountId);

    /**
     * Get Transaction Detail
     *
     * Obtain detailed information on a transaction for a specific account
     *
     */
    @GET
    @Path("/banking/accounts/{accountId}/transactions/{transactionId}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Transaction Detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactionDetail.class))) })
    public ResponseBankingTransactionDetail getTransactionDetail(@PathParam("accountId") String accountId, @PathParam("transactionId") String transactionId);

    /**
     * Get Transactions For Account
     *
     * Obtain transactions for a specific account
     *
     */
    @GET
    @Path("/banking/accounts/{accountId}/transactions")
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Account", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public ResponseBankingTransactions getTransactions(@PathParam("accountId") String accountId, @QueryParam("start-time")String startTime, @QueryParam("end-time")String endTime, @QueryParam("min-amount")String minAmount, @QueryParam("max-amount")String maxAmount, @QueryParam("text")String text, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Accounts
     *
     * Obtain a list of accounts
     *
     */
    @GET
    @Path("/banking/accounts")
    @Produces({ "application/json" })
    @Operation(summary = "Get Accounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccounts.class))) })
    public ResponseBankingAccounts listAccounts(@QueryParam("open-status")String openStatus, @QueryParam("is-owned")String isOwned, @QueryParam("product-category")String productCategory, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Bulk Balances
     *
     * Obtain balances for multiple, filtered accounts
     *
     */
    @GET
    @Path("/banking/accounts/balances")
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Balances", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "resource listing the financial balances for the account", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))) })
    public ResponseBankingAccountsBalances listBalancesBulk(@QueryParam("open-status")String openStatus, @QueryParam("is-owned")String isOwned, @QueryParam("product-category")String productCategory, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Balances For Specific Accounts
     *
     * Obtain balances for a specified list of accounts
     *
     */
    @POST
    @Path("/banking/accounts/balances")
    @Produces({ "application/json" })
    @Operation(summary = "Get Balances For Specific Accounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))),
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public ResponseBankingAccountsBalances listBalancesSpecificAccounts(RequestAccountIds body);

    /**
     * Get Transactions For Multiple Accounts
     *
     * Obtain transactions for multiple, filtered accounts
     *
     */
    @GET
    @Path("/banking/accounts/transactions")
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Multiple Accounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public ResponseBankingTransactions listTransactionsBulk(@QueryParam("open-status")String openStatus, @QueryParam("is-owned")String isOwned, @QueryParam("product-category")String productCategory, @QueryParam("start-time")String startTime, @QueryParam("end-time")String endTime, @QueryParam("min-amount")String minAmount, @QueryParam("max-amount")String maxAmount, @QueryParam("text")String text, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);

    /**
     * Get Transactions For Specific Accounts
     *
     * Obtain transactions for a specified list of transactions.
     *
     */
    @POST
    @Path("/banking/accounts/transactions")
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Specific Accounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))),
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public ResponseBankingTransactions listTransactionsSpecificAccounts(RequestAccountIds body@QueryParam("start-time")String startTime, @QueryParam("end-time")String endTime, @QueryParam("min-amount")String minAmount, @QueryParam("max-amount")String maxAmount, @QueryParam("text")String text, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);
}
