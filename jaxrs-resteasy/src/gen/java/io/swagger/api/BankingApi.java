package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BankingApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ErrorList;
import io.swagger.model.RequestAccountIds;
import io.swagger.model.ResponseBankingAccount;
import io.swagger.model.ResponseBankingAccounts;
import io.swagger.model.ResponseBankingAccountsBalances;
import io.swagger.model.ResponseBankingDirectDebits;
import io.swagger.model.ResponseBankingPayeeDetails;
import io.swagger.model.ResponseBankingPayees;
import io.swagger.model.ResponseBankingProduct;
import io.swagger.model.ResponseBankingProducts;
import io.swagger.model.ResponseBankingTransactionDetail;
import io.swagger.model.ResponseBankingTransactions;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/banking")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class BankingApi  {

    @Inject BankingApiService service;

    @GET
    @Path("/accounts/{accountId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Account Detail", description = "Obtain detailed information on a single account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccount.class))) })
    public Response getAccountDetail( @PathParam("accountId") String accountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAccountDetail(accountId,securityContext);
    }
    @GET
    @Path("/payees/{payeeId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Payee Detail", description = "Obtain detailed information on a single payee", tags={ "Payees" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayeeDetails.class))) })
    public Response getPayeeDetail( @PathParam("payeeId") String payeeId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPayeeDetail(payeeId,securityContext);
    }
    @GET
    @Path("/products/{productId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Product Detail", description = "Obtain detailed information on a single product offered openly to the market", tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProduct.class))) })
    public Response getProductDetail( @PathParam("productId") String productId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getProductDetail(productId,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/transactions/{transactionId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transaction Detail", description = "Obtain detailed information on a transaction for a specific account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactionDetail.class))) })
    public Response getTransactionDetail( @PathParam("accountId") String accountId, @PathParam("transactionId") String transactionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTransactionDetail(accountId,transactionId,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Account", description = "Obtain transactions for a specific account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public Response getTransactions( @PathParam("accountId") String accountId,  @QueryParam("start-time") String startTime,  @QueryParam("end-time") String endTime,  @QueryParam("min-amount") String minAmount,  @QueryParam("max-amount") String maxAmount,  @QueryParam("text") String text,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTransactions(accountId,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Accounts", description = "Obtain a list of accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccounts.class))) })
    public Response listAccounts(  @QueryParam("open-status") String openStatus,  @QueryParam("is-owned") String isOwned,  @QueryParam("product-category") String productCategory,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listAccounts(openStatus,isOwned,productCategory,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/balances")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Balances", description = "Obtain balances for multiple, filtered accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "resource listing the financial balances for the account", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))) })
    public Response listBalancesBulk(  @QueryParam("open-status") String openStatus,  @QueryParam("is-owned") String isOwned,  @QueryParam("product-category") String productCategory,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listBalancesBulk(openStatus,isOwned,productCategory,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/balances")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Balances For Specific Accounts", description = "Obtain balances for a specified list of accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listBalancesSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listBalancesSpecificAccounts(body,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Account", description = "Obtain direct debit authorisations for a specific account", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public Response listDirectDebits( @PathParam("accountId") String accountId,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listDirectDebits(accountId,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Direct Debits", description = "Obtain direct debit authorisations for multiple, filtered accounts", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public Response listDirectDebitsBulk(  @QueryParam("is-owned") String isOwned,  @QueryParam("product-category") String productCategory,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listDirectDebitsBulk(isOwned,productCategory,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Specific Accounts", description = "Obtain direct debit authorisations for a specified list of accounts", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listDirectDebitsSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listDirectDebitsSpecificAccounts(body,securityContext);
    }
    @GET
    @Path("/payees")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Payees", description = "Obtain a list of pre-registered payees", tags={ "Payees" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayees.class))) })
    public Response listPayees(  @QueryParam("type") String type,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listPayees(type,page,pageSize,securityContext);
    }
    @GET
    @Path("/products")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Products", description = "Obtain a list of products that are currently openly offered to the market", tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProducts.class))) })
    public Response listProducts(  @QueryParam("effective") String effective,  @QueryParam("updated-since") String updatedSince,  @QueryParam("brand") String brand,  @QueryParam("product-category") String productCategory,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listProducts(effective,updatedSince,brand,productCategory,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Multiple Accounts", description = "Obtain transactions for multiple, filtered accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public Response listTransactionsBulk(  @QueryParam("open-status") String openStatus,  @QueryParam("is-owned") String isOwned,  @QueryParam("product-category") String productCategory,  @QueryParam("start-time") String startTime,  @QueryParam("end-time") String endTime,  @QueryParam("min-amount") String minAmount,  @QueryParam("max-amount") String maxAmount,  @QueryParam("text") String text,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listTransactionsBulk(openStatus,isOwned,productCategory,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Specific Accounts", description = "Obtain transactions for a specified list of transactions.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listTransactionsSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body,  @QueryParam("start-time") String startTime,  @QueryParam("end-time") String endTime,  @QueryParam("min-amount") String minAmount,  @QueryParam("max-amount") String maxAmount,  @QueryParam("text") String text,  @QueryParam("page") Integer page,  @QueryParam("page-size") Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listTransactionsSpecificAccounts(body,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
}
