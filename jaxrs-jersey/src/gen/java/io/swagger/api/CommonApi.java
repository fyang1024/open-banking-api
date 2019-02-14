package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CommonApiService;
import io.swagger.api.factories.CommonApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.ResponseCommonCustomer;
import io.swagger.model.ResponseCommonCustomerDetailed;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/common")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class CommonApi  {
   private final CommonApiService delegate;

   public CommonApi(@Context ServletConfig servletContext) {
      CommonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CommonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CommonApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CommonApiServiceFactory.getCommonApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/customer")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer", description = "Obtain basic information on the customer that has authorised the current session", tags={ "Customer" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomer.class))) })
    public Response getCustomer(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomer(securityContext);
    }
    @GET
    @Path("/customer/detail")
    
    @Produces({ "application/json" })
    @Operation(summary = "Get Customer Detail", description = "Obtain detailed information on the authorised customer within the current session.", tags={ "Customer" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseCommonCustomerDetailed.class))) })
    public Response getCustomerDetail(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomerDetail(securityContext);
    }
}
