/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ResponseBankingPayeeDetails;
import io.swagger.client.model.ResponseBankingPayees;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayeesApi
 */
@Ignore
public class PayeesApiTest {

    private final PayeesApi api = new PayeesApi();

    /**
     * Get Payee Detail
     *
     * Obtain detailed information on a single payee
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayeeDetailTest() throws ApiException {
        String payeeId = null;
        ResponseBankingPayeeDetails response = api.getPayeeDetail(payeeId);

        // TODO: test validations
    }
    /**
     * Get Payees
     *
     * Obtain a list of pre-registered payees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPayeesTest() throws ApiException {
        String type = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingPayees response = api.listPayees(type, page, pageSize);

        // TODO: test validations
    }
}
