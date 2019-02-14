package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BankingApiService;
import io.swagger.api.factories.BankingApiServiceFactory;

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

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/banking")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class BankingApi  {
   private final BankingApiService delegate;

   public BankingApi(@Context ServletConfig servletContext) {
      BankingApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BankingApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BankingApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BankingApiServiceFactory.getBankingApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/accounts/{accountId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Account Detail", description = "Obtain detailed information on a single account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccount.class))) })
    public Response getAccountDetail(@Parameter(description = "A tokenised identifier for the account which is unique but not shareable",required=true) @PathParam("accountId") String accountId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountDetail(accountId,securityContext);
    }
    @GET
    @Path("/payees/{payeeId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Payee Detail", description = "Obtain detailed information on a single payee", tags={ "Payees" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayeeDetails.class))) })
    public Response getPayeeDetail(@Parameter(description = "The ID used to locate the details of a particular payee",required=true) @PathParam("payeeId") String payeeId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPayeeDetail(payeeId,securityContext);
    }
    @GET
    @Path("/products/{productId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Product Detail", description = "Obtain detailed information on a single product offered openly to the market", tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProduct.class))) })
    public Response getProductDetail(@Parameter(description = "ID of the specific product requested",required=true) @PathParam("productId") String productId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProductDetail(productId,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/transactions/{transactionId}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transaction Detail", description = "Obtain detailed information on a transaction for a specific account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactionDetail.class))) })
    public Response getTransactionDetail(@Parameter(description = "The account id token that is used to uniquely represent the account",required=true) @PathParam("accountId") String accountId
,@Parameter(description = "The unique identifier for the specific transaction for which details are being requested",required=true) @PathParam("transactionId") String transactionId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTransactionDetail(accountId,transactionId,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Account", description = "Obtain transactions for a specific account", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public Response getTransactions(@Parameter(description = "ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.",required=true) @PathParam("accountId") String accountId
,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @QueryParam("start-time") String startTime
,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @QueryParam("end-time") String endTime
,@Parameter(description = "Filter transactions to only transactions with amounts higher or equal to than this amount") @QueryParam("min-amount") String minAmount
,@Parameter(description = "Filter transactions to only transactions with amounts less than or equal to than this amount") @QueryParam("max-amount") String maxAmount
,@Parameter(description = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @QueryParam("text") String text
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTransactions(accountId,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Accounts", description = "Obtain a list of accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccounts.class))) })
    public Response listAccounts(@Parameter(description = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", schema=@Schema(allowableValues={ "OPEN", "CLOSED", "ALL" })
) @QueryParam("open-status") String openStatus
,@Parameter(description = "Filters accounts based on whether they are owned by the authorised customer", schema=@Schema(allowableValues={ "OWNED", "NOT_OWNED", "ALL" })
) @QueryParam("is-owned") String isOwned
,@Parameter(description = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", schema=@Schema(allowableValues={ "PERS_AT_CALL_DEPOSITS", "BUS_AT_CALL_DEPOSITS", "TERM_DEPOSITS", "RESIDENTIAL_MORTGAGES", "PERS_CRED_AND_CHRG_CARDS", "BUS_CRED_AND_CHRG_CARDS", "PERS_LOANS", "PERS_LEASING", "BUS_LEASING", "TRADE_FINANCE", "PERS_OVERDRAFT", "BUS_OVERDRAFT", "BUS_LOANS", "FOREIGN_CURR_AT_CALL_DEPOSITS", "FOREIGN_CURR_TERM_DEPOSITS", "FOREIGN_CURR_LOAN", "FOREIGN_CURRRENCT_OVERDRAFT", "TRAVEL_CARD" })
) @QueryParam("product-category") String productCategory
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listAccounts(openStatus,isOwned,productCategory,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/balances")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Balances", description = "Obtain balances for multiple, filtered accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "resource listing the financial balances for the account", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))) })
    public Response listBalancesBulk(@Parameter(description = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", schema=@Schema(allowableValues={ "OPEN", "CLOSED", "ALL" })
) @QueryParam("open-status") String openStatus
,@Parameter(description = "Filters accounts based on whether they are owned by the authorised customer", schema=@Schema(allowableValues={ "OWNED", "NOT_OWNED", "ALL" })
) @QueryParam("is-owned") String isOwned
,@Parameter(description = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", schema=@Schema(allowableValues={ "PERS_AT_CALL_DEPOSITS", "BUS_AT_CALL_DEPOSITS", "TERM_DEPOSITS", "RESIDENTIAL_MORTGAGES", "PERS_CRED_AND_CHRG_CARDS", "BUS_CRED_AND_CHRG_CARDS", "PERS_LOANS", "PERS_LEASING", "BUS_LEASING", "TRADE_FINANCE", "PERS_OVERDRAFT", "BUS_OVERDRAFT", "BUS_LOANS", "FOREIGN_CURR_AT_CALL_DEPOSITS", "FOREIGN_CURR_TERM_DEPOSITS", "FOREIGN_CURR_LOAN", "FOREIGN_CURRRENCT_OVERDRAFT", "TRAVEL_CARD" })
) @QueryParam("product-category") String productCategory
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBalancesBulk(openStatus,isOwned,productCategory,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/balances")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Balances For Specific Accounts", description = "Obtain balances for a specified list of accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingAccountsBalances.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listBalancesSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listBalancesSpecificAccounts(body,securityContext);
    }
    @GET
    @Path("/accounts/{accountId}/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Account", description = "Obtain direct debit authorisations for a specific account", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public Response listDirectDebits(@Parameter(description = "ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.",required=true) @PathParam("accountId") String accountId
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listDirectDebits(accountId,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Bulk Direct Debits", description = "Obtain direct debit authorisations for multiple, filtered accounts", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))) })
    public Response listDirectDebitsBulk(@Parameter(description = "Filters accounts based on whether they are owned by the authorised customer", schema=@Schema(allowableValues={ "OWNED", "NOT_OWNED", "ALL" })
) @QueryParam("is-owned") String isOwned
,@Parameter(description = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", schema=@Schema(allowableValues={ "PERS_AT_CALL_DEPOSITS", "BUS_AT_CALL_DEPOSITS", "TERM_DEPOSITS", "RESIDENTIAL_MORTGAGES", "PERS_CRED_AND_CHRG_CARDS", "BUS_CRED_AND_CHRG_CARDS", "PERS_LOANS", "PERS_LEASING", "BUS_LEASING", "TRADE_FINANCE", "PERS_OVERDRAFT", "BUS_OVERDRAFT", "BUS_LOANS", "FOREIGN_CURR_AT_CALL_DEPOSITS", "FOREIGN_CURR_TERM_DEPOSITS", "FOREIGN_CURR_LOAN", "FOREIGN_CURRRENCT_OVERDRAFT", "TRAVEL_CARD" })
) @QueryParam("product-category") String productCategory
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listDirectDebitsBulk(isOwned,productCategory,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/direct-debits")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Direct Debits For Specific Accounts", description = "Obtain direct debit authorisations for a specified list of accounts", tags={ "Direct Debits" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingDirectDebits.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listDirectDebitsSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listDirectDebitsSpecificAccounts(body,securityContext);
    }
    @GET
    @Path("/payees")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Payees", description = "Obtain a list of pre-registered payees", tags={ "Payees" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingPayees.class))) })
    public Response listPayees(@Parameter(description = "Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL", schema=@Schema(allowableValues={ "DOMESTIC", "INTERNATIONAL", "BILLER" })
) @QueryParam("type") String type
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPayees(type,page,pageSize,securityContext);
    }
    @GET
    @Path("/products")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Products", description = "Obtain a list of products that are currently openly offered to the market", tags={ "Products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProducts.class))) })
    public Response listProducts(@Parameter(description = "Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'", schema=@Schema(allowableValues={ "CURRENT", "FUTURE", "ALL" })
) @QueryParam("effective") String effective
,@Parameter(description = "Only include products that have been updated after the specified date and time. If absent defaults to include all products") @QueryParam("updated-since") String updatedSince
,@Parameter(description = "Filter results based on a specific brand") @QueryParam("brand") String brand
,@Parameter(description = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", schema=@Schema(allowableValues={ "PERS_AT_CALL_DEPOSITS", "BUS_AT_CALL_DEPOSITS", "TERM_DEPOSITS", "RESIDENTIAL_MORTGAGES", "PERS_CRED_AND_CHRG_CARDS", "BUS_CRED_AND_CHRG_CARDS", "PERS_LOANS", "PERS_LEASING", "BUS_LEASING", "TRADE_FINANCE", "PERS_OVERDRAFT", "BUS_OVERDRAFT", "BUS_LOANS", "FOREIGN_CURR_AT_CALL_DEPOSITS", "FOREIGN_CURR_TERM_DEPOSITS", "FOREIGN_CURR_LOAN", "FOREIGN_CURRRENCT_OVERDRAFT", "TRAVEL_CARD" })
) @QueryParam("product-category") String productCategory
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listProducts(effective,updatedSince,brand,productCategory,page,pageSize,securityContext);
    }
    @GET
    @Path("/accounts/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Multiple Accounts", description = "Obtain transactions for multiple, filtered accounts", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))) })
    public Response listTransactionsBulk(@Parameter(description = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", schema=@Schema(allowableValues={ "OPEN", "CLOSED", "ALL" })
) @QueryParam("open-status") String openStatus
,@Parameter(description = "Filters accounts based on whether they are owned by the authorised customer", schema=@Schema(allowableValues={ "OWNED", "NOT_OWNED", "ALL" })
) @QueryParam("is-owned") String isOwned
,@Parameter(description = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", schema=@Schema(allowableValues={ "PERS_AT_CALL_DEPOSITS", "BUS_AT_CALL_DEPOSITS", "TERM_DEPOSITS", "RESIDENTIAL_MORTGAGES", "PERS_CRED_AND_CHRG_CARDS", "BUS_CRED_AND_CHRG_CARDS", "PERS_LOANS", "PERS_LEASING", "BUS_LEASING", "TRADE_FINANCE", "PERS_OVERDRAFT", "BUS_OVERDRAFT", "BUS_LOANS", "FOREIGN_CURR_AT_CALL_DEPOSITS", "FOREIGN_CURR_TERM_DEPOSITS", "FOREIGN_CURR_LOAN", "FOREIGN_CURRRENCT_OVERDRAFT", "TRAVEL_CARD" })
) @QueryParam("product-category") String productCategory
,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @QueryParam("start-time") String startTime
,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @QueryParam("end-time") String endTime
,@Parameter(description = "Filter transactions to only transactions with amounts higher or equal to than this amount") @QueryParam("min-amount") String minAmount
,@Parameter(description = "Filter transactions to only transactions with amounts less than or equal to than this amount") @QueryParam("max-amount") String maxAmount
,@Parameter(description = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @QueryParam("text") String text
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listTransactionsBulk(openStatus,isOwned,productCategory,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
    @POST
    @Path("/accounts/transactions")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Transactions For Specific Accounts", description = "Obtain transactions for a specified list of transactions.", tags={ "Accounts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingTransactions.class))),
        
        @ApiResponse(responseCode = "422", description = "The request was well formed but was unable to be processed due to business logic specific to the request", content = @Content(schema = @Schema(implementation = ErrorList.class))) })
    public Response listTransactionsSpecificAccounts(@Parameter(description = "The list of account IDs to obtain information for" ,required=true) RequestAccountIds body

,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @QueryParam("start-time") String startTime
,@Parameter(description = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @QueryParam("end-time") String endTime
,@Parameter(description = "Filter transactions to only transactions with amounts higher or equal to than this amount") @QueryParam("min-amount") String minAmount
,@Parameter(description = "Filter transactions to only transactions with amounts less than or equal to than this amount") @QueryParam("max-amount") String maxAmount
,@Parameter(description = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @QueryParam("text") String text
,@Parameter(description = "Page of results to request (standard pagination)") @QueryParam("page") Integer page
,@Parameter(description = "Page size to request. Default is 25 (standard pagination)") @QueryParam("page-size") Integer pageSize
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listTransactionsSpecificAccounts(body,startTime,endTime,minAmount,maxAmount,text,page,pageSize,securityContext);
    }
}
