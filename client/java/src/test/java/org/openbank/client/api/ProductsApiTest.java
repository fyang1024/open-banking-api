/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.api;

import org.openbanking.client.ApiException;
import org.openbanking.client.api.ProductsApi;
import org.openbanking.client.model.ResponseBankingProduct;
import org.openbanking.client.model.ResponseBankingProducts;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for ProductsApi
 */
@Ignore
public class ProductsApiTest {

    private final ProductsApi api = new ProductsApi();

    
    /**
     * Get Product Detail
     *
     * Obtain detailed information on a single product offered openly to the market
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProductDetailTest() throws ApiException {
        String productId = null;
        ResponseBankingProduct response = api.getProductDetail(productId);

        // TODO: test validations
    }
    
    /**
     * Get Products
     *
     * Obtain a list of products that are currently openly offered to the market
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProductsTest() throws ApiException {
        String effective = null;
        String updatedSince = null;
        String brand = null;
        String productCategory = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingProducts response = api.listProducts(effective, updatedSince, brand, productCategory, page, pageSize);

        // TODO: test validations
    }
    
}
