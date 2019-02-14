package io.swagger.api.factories;

import io.swagger.api.CommonApiService;
import io.swagger.api.impl.CommonApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class CommonApiServiceFactory {
    private final static CommonApiService service = new CommonApiServiceImpl();

    public static CommonApiService getCommonApi() {
        return service;
    }
}
