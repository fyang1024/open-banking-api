package io.swagger.api;

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
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
@Controller
public class BankingApiController implements BankingApi {

    private static final Logger log = LoggerFactory.getLogger(BankingApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BankingApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseBankingAccount> getAccountDetail(@ApiParam(value = "A tokenised identifier for the account which is unique but not shareable",required=true) @PathVariable("accountId") String accountId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingAccount>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingPayeeDetails> getPayeeDetail(@ApiParam(value = "The ID used to locate the details of a particular payee",required=true) @PathVariable("payeeId") String payeeId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingPayeeDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingProduct> getProductDetail(@ApiParam(value = "ID of the specific product requested",required=true) @PathVariable("productId") String productId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingProduct>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingTransactionDetail> getTransactionDetail(@ApiParam(value = "The account id token that is used to uniquely represent the account",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = "The unique identifier for the specific transaction for which details are being requested",required=true) @PathVariable("transactionId") String transactionId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingTransactionDetail>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingTransactions> getTransactions(@ApiParam(value = "ID of the account to get transactions for.  Must have previously been returned by one of the account list end points.",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "start-time", required = false) String startTime,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "end-time", required = false) String endTime,@ApiParam(value = "Filter transactions to only transactions with amounts higher or equal to than this amount") @Valid @RequestParam(value = "min-amount", required = false) String minAmount,@ApiParam(value = "Filter transactions to only transactions with amounts less than or equal to than this amount") @Valid @RequestParam(value = "max-amount", required = false) String maxAmount,@ApiParam(value = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @Valid @RequestParam(value = "text", required = false) String text,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingTransactions>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingAccounts> listAccounts(@ApiParam(value = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", allowableValues = "OPEN, CLOSED, ALL") @Valid @RequestParam(value = "open-status", required = false) String openStatus,@ApiParam(value = "Filters accounts based on whether they are owned by the authorised customer", allowableValues = "OWNED, NOT_OWNED, ALL") @Valid @RequestParam(value = "is-owned", required = false) String isOwned,@ApiParam(value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", allowableValues = "PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD") @Valid @RequestParam(value = "product-category", required = false) String productCategory,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingAccounts>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingAccountsBalances> listBalancesBulk(@ApiParam(value = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", allowableValues = "OPEN, CLOSED, ALL") @Valid @RequestParam(value = "open-status", required = false) String openStatus,@ApiParam(value = "Filters accounts based on whether they are owned by the authorised customer", allowableValues = "OWNED, NOT_OWNED, ALL") @Valid @RequestParam(value = "is-owned", required = false) String isOwned,@ApiParam(value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", allowableValues = "PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD") @Valid @RequestParam(value = "product-category", required = false) String productCategory,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingAccountsBalances>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingAccountsBalances> listBalancesSpecificAccounts(@ApiParam(value = "The list of account IDs to obtain information for" ,required=true )  @Valid @RequestBody RequestAccountIds body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingAccountsBalances>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingDirectDebits> listDirectDebits(@ApiParam(value = "ID of the account to get direct debit authorisations for.  Must have previously been returned by one of the account list end points.",required=true) @PathVariable("accountId") String accountId,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingDirectDebits>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingDirectDebits> listDirectDebitsBulk(@ApiParam(value = "Filters accounts based on whether they are owned by the authorised customer", allowableValues = "OWNED, NOT_OWNED, ALL") @Valid @RequestParam(value = "is-owned", required = false) String isOwned,@ApiParam(value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", allowableValues = "PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD") @Valid @RequestParam(value = "product-category", required = false) String productCategory,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingDirectDebits>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingDirectDebits> listDirectDebitsSpecificAccounts(@ApiParam(value = "The list of account IDs to obtain information for" ,required=true )  @Valid @RequestBody RequestAccountIds body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingDirectDebits>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingPayees> listPayees(@ApiParam(value = "Filter on the payee type field.  In addition to normal type field values, ALL can be specified to retrieve all payees.  If absent the assumed value is ALL", allowableValues = "DOMESTIC, INTERNATIONAL, BILLER") @Valid @RequestParam(value = "type", required = false) String type,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingPayees>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingProducts> listProducts(@ApiParam(value = "Allows for the filtering of products based on whether the current time is within the period of time defined as effective by the effectiveFrom and effectiveTo fields.  If absent defaults to 'CURRENT'", allowableValues = "CURRENT, FUTURE, ALL") @Valid @RequestParam(value = "effective", required = false) String effective,@ApiParam(value = "Only include products that have been updated after the specified date and time. If absent defaults to include all products") @Valid @RequestParam(value = "updated-since", required = false) String updatedSince,@ApiParam(value = "Filter results based on a specific brand") @Valid @RequestParam(value = "brand", required = false) String brand,@ApiParam(value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", allowableValues = "PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD") @Valid @RequestParam(value = "product-category", required = false) String productCategory,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingProducts>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingTransactions> listTransactionsBulk(@ApiParam(value = "Used to filter results according to open/closed status. Values can be OPEN, CLOSED or ALL. If absent then ALL is assumed", allowableValues = "OPEN, CLOSED, ALL") @Valid @RequestParam(value = "open-status", required = false) String openStatus,@ApiParam(value = "Filters accounts based on whether they are owned by the authorised customer", allowableValues = "OWNED, NOT_OWNED, ALL") @Valid @RequestParam(value = "is-owned", required = false) String isOwned,@ApiParam(value = "Used to filter results on the productCategory field applicable to accounts. Any one of the valid values for this field can be supplied. If absent then all accounts returned.", allowableValues = "PERS_AT_CALL_DEPOSITS, BUS_AT_CALL_DEPOSITS, TERM_DEPOSITS, RESIDENTIAL_MORTGAGES, PERS_CRED_AND_CHRG_CARDS, BUS_CRED_AND_CHRG_CARDS, PERS_LOANS, PERS_LEASING, BUS_LEASING, TRADE_FINANCE, PERS_OVERDRAFT, BUS_OVERDRAFT, BUS_LOANS, FOREIGN_CURR_AT_CALL_DEPOSITS, FOREIGN_CURR_TERM_DEPOSITS, FOREIGN_CURR_LOAN, FOREIGN_CURRRENCT_OVERDRAFT, TRAVEL_CARD") @Valid @RequestParam(value = "product-category", required = false) String productCategory,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "start-time", required = false) String startTime,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "end-time", required = false) String endTime,@ApiParam(value = "Filter transactions to only transactions with amounts higher or equal to than this amount") @Valid @RequestParam(value = "min-amount", required = false) String minAmount,@ApiParam(value = "Filter transactions to only transactions with amounts less than or equal to than this amount") @Valid @RequestParam(value = "max-amount", required = false) String maxAmount,@ApiParam(value = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @Valid @RequestParam(value = "text", required = false) String text,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingTransactions>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseBankingTransactions> listTransactionsSpecificAccounts(@ApiParam(value = "The list of account IDs to obtain information for" ,required=true )  @Valid @RequestBody RequestAccountIds body,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or after this date/time. If absent defaults to current time. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "start-time", required = false) String startTime,@ApiParam(value = "Constrain the transaction history request to transactions with effective time at or before this date/time. If absent defaults to start-time plus 100 days. Format is aligned to DateTimeString common type") @Valid @RequestParam(value = "end-time", required = false) String endTime,@ApiParam(value = "Filter transactions to only transactions with amounts higher or equal to than this amount") @Valid @RequestParam(value = "min-amount", required = false) String minAmount,@ApiParam(value = "Filter transactions to only transactions with amounts less than or equal to than this amount") @Valid @RequestParam(value = "max-amount", required = false) String maxAmount,@ApiParam(value = "Filter transactions to only transactions where this string value is found as a substring of either the reference or description fields. Format is arbitrary ASCII string") @Valid @RequestParam(value = "text", required = false) String text,@ApiParam(value = "Page of results to request (standard pagination)") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "Page size to request. Default is 25 (standard pagination)") @Valid @RequestParam(value = "page-size", required = false) Integer pageSize) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ResponseBankingTransactions>(HttpStatus.NOT_IMPLEMENTED);
    }

}
