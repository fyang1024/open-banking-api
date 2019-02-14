package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

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

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public interface BankingApiService {
      Response getAccountDetail(String accountId,SecurityContext securityContext) throws NotFoundException;
      Response getPayeeDetail(String payeeId,SecurityContext securityContext) throws NotFoundException;
      Response getProductDetail(String productId,SecurityContext securityContext) throws NotFoundException;
      Response getTransactionDetail(String accountId,String transactionId,SecurityContext securityContext) throws NotFoundException;
      Response getTransactions(String accountId,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listAccounts(String openStatus,String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listBalancesBulk(String openStatus,String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listBalancesSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException;
      Response listDirectDebits(String accountId,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listDirectDebitsBulk(String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listDirectDebitsSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException;
      Response listPayees(String type,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listProducts(String effective,String updatedSince,String brand,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listTransactionsBulk(String openStatus,String isOwned,String productCategory,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
      Response listTransactionsSpecificAccounts(RequestAccountIds body,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException;
}
