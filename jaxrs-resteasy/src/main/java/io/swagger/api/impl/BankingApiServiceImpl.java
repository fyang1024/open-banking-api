package io.swagger.api.impl;

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

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class BankingApiServiceImpl implements BankingApiService {
      public Response getAccountDetail(String accountId,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getPayeeDetail(String payeeId,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getProductDetail(String productId,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getTransactionDetail(String accountId,String transactionId,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getTransactions(String accountId,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listAccounts(String openStatus,String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listBalancesBulk(String openStatus,String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listBalancesSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listDirectDebits(String accountId,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listDirectDebitsBulk(String isOwned,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listDirectDebitsSpecificAccounts(RequestAccountIds body,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listPayees(String type,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listProducts(String effective,String updatedSince,String brand,String productCategory,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listTransactionsBulk(String openStatus,String isOwned,String productCategory,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listTransactionsSpecificAccounts(RequestAccountIds body,String startTime,String endTime,String minAmount,String maxAmount,String text,Integer page,Integer pageSize,SecurityContext securityContext) throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
