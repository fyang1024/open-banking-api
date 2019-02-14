package io.swagger.api;

import io.swagger.model.ResponseBankingProduct;
import io.swagger.model.ResponseBankingProducts;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Consumer Data Standards
 *
 * <p>API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 */
@Path("/")
public interface ProductsApi  {

    /**
     * Get Product Detail
     *
     * Obtain detailed information on a single product offered openly to the market
     *
     */
    @GET
    @Path("/banking/products/{productId}")
    @Produces({ "application/json" })
    @Operation(summary = "Get Product Detail", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProduct.class))) })
    public ResponseBankingProduct getProductDetail(@PathParam("productId") String productId);

    /**
     * Get Products
     *
     * Obtain a list of products that are currently openly offered to the market
     *
     */
    @GET
    @Path("/banking/products")
    @Produces({ "application/json" })
    @Operation(summary = "Get Products", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = ResponseBankingProducts.class))) })
    public ResponseBankingProducts listProducts(@QueryParam("effective")String effective, @QueryParam("updated-since")String updatedSince, @QueryParam("brand")String brand, @QueryParam("product-category")String productCategory, @QueryParam("page")Integer page, @QueryParam("page-size")Integer pageSize);
}
