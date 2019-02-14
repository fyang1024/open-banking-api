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

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BankingApiControllerIntegrationTest {

    @Autowired
    private BankingApi api;

    @Test
    public void getAccountDetailTest() throws Exception {
        String accountId = "accountId_example";
        ResponseEntity<ResponseBankingAccount> responseEntity = api.getAccountDetail(accountId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getPayeeDetailTest() throws Exception {
        String payeeId = "payeeId_example";
        ResponseEntity<ResponseBankingPayeeDetails> responseEntity = api.getPayeeDetail(payeeId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getProductDetailTest() throws Exception {
        String productId = "productId_example";
        ResponseEntity<ResponseBankingProduct> responseEntity = api.getProductDetail(productId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getTransactionDetailTest() throws Exception {
        String accountId = "accountId_example";
        String transactionId = "transactionId_example";
        ResponseEntity<ResponseBankingTransactionDetail> responseEntity = api.getTransactionDetail(accountId, transactionId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void getTransactionsTest() throws Exception {
        String accountId = "accountId_example";
        String startTime = "startTime_example";
        String endTime = "endTime_example";
        String minAmount = "minAmount_example";
        String maxAmount = "maxAmount_example";
        String text = "text_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingTransactions> responseEntity = api.getTransactions(accountId, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listAccountsTest() throws Exception {
        String openStatus = "openStatus_example";
        String isOwned = "isOwned_example";
        String productCategory = "productCategory_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingAccounts> responseEntity = api.listAccounts(openStatus, isOwned, productCategory, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listBalancesBulkTest() throws Exception {
        String openStatus = "openStatus_example";
        String isOwned = "isOwned_example";
        String productCategory = "productCategory_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingAccountsBalances> responseEntity = api.listBalancesBulk(openStatus, isOwned, productCategory, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listBalancesSpecificAccountsTest() throws Exception {
        RequestAccountIds body = new RequestAccountIds();
        ResponseEntity<ResponseBankingAccountsBalances> responseEntity = api.listBalancesSpecificAccounts(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listDirectDebitsTest() throws Exception {
        String accountId = "accountId_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingDirectDebits> responseEntity = api.listDirectDebits(accountId, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listDirectDebitsBulkTest() throws Exception {
        String isOwned = "isOwned_example";
        String productCategory = "productCategory_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingDirectDebits> responseEntity = api.listDirectDebitsBulk(isOwned, productCategory, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listDirectDebitsSpecificAccountsTest() throws Exception {
        RequestAccountIds body = new RequestAccountIds();
        ResponseEntity<ResponseBankingDirectDebits> responseEntity = api.listDirectDebitsSpecificAccounts(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listPayeesTest() throws Exception {
        String type = "type_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingPayees> responseEntity = api.listPayees(type, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listProductsTest() throws Exception {
        String effective = "effective_example";
        String updatedSince = "updatedSince_example";
        String brand = "brand_example";
        String productCategory = "productCategory_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingProducts> responseEntity = api.listProducts(effective, updatedSince, brand, productCategory, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listTransactionsBulkTest() throws Exception {
        String openStatus = "openStatus_example";
        String isOwned = "isOwned_example";
        String productCategory = "productCategory_example";
        String startTime = "startTime_example";
        String endTime = "endTime_example";
        String minAmount = "minAmount_example";
        String maxAmount = "maxAmount_example";
        String text = "text_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingTransactions> responseEntity = api.listTransactionsBulk(openStatus, isOwned, productCategory, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void listTransactionsSpecificAccountsTest() throws Exception {
        RequestAccountIds body = new RequestAccountIds();
        String startTime = "startTime_example";
        String endTime = "endTime_example";
        String minAmount = "minAmount_example";
        String maxAmount = "maxAmount_example";
        String text = "text_example";
        Integer page = 56;
        Integer pageSize = 56;
        ResponseEntity<ResponseBankingTransactions> responseEntity = api.listTransactionsSpecificAccounts(body, startTime, endTime, minAmount, maxAmount, text, page, pageSize);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
