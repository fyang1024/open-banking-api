package io.swagger.api.factories;

import io.swagger.api.BankingApiService;
import io.swagger.api.impl.BankingApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class BankingApiServiceFactory {
    private final static BankingApiService service = new BankingApiServiceImpl();

    public static BankingApiService getBankingApi() {
        return service;
    }
}
