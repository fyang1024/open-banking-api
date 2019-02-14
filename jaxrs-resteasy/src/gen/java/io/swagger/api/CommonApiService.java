package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.ResponseCommonCustomer;
import io.swagger.model.ResponseCommonCustomerDetailed;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public interface CommonApiService {
      Response getCustomer(SecurityContext securityContext) throws NotFoundException;
      Response getCustomerDetail(SecurityContext securityContext) throws NotFoundException;
}
