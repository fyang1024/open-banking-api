package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public abstract class BankingApiService {
    public abstract Response getAccountDetail(String accountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPayeeDetail(String payeeId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getProductDetail(String productId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTransactionDetail(String accountId,String transactionId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTransactions(String accountId, String startTime, String endTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listAccounts( String openStatus, String isOwned, String productCategory, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listBalancesBulk( String openStatus, String isOwned, String productCategory, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listBalancesSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listDirectDebits(String accountId, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listDirectDebitsBulk( String isOwned, String productCategory, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listDirectDebitsSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listPayees( String type, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listProducts( String effective, String updatedSince, String brand, String productCategory, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listTransactionsBulk( String openStatus, String isOwned, String productCategory, String startTime, String endTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listTransactionsSpecificAccounts(RequestAccountIds body, String startTime, String endTime, String minAmount, String maxAmount, String text, Integer page, Integer pageSize,SecurityContext securityContext) throws NotFoundException;
}
