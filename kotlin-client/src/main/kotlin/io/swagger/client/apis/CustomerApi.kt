/**
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
package io.swagger.client.apis

import io.swagger.client.models.ResponseCommonCustomer
import io.swagger.client.models.ResponseCommonCustomerDetailed

import io.swagger.client.infrastructure.*

class CustomerApi(basePath: kotlin.String = "https://data.provider.com.au/cds-au/v1") : ApiClient(basePath) {

    /**
    * Get Customer
    * Obtain basic information on the customer that has authorised the current session
    * @return ResponseCommonCustomer
    */
    @Suppress("UNCHECKED_CAST")
    fun getCustomer() : ResponseCommonCustomer {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/common/customer",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResponseCommonCustomer>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResponseCommonCustomer
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Get Customer Detail
    * Obtain detailed information on the authorised customer within the current session.
    * @return ResponseCommonCustomerDetailed
    */
    @Suppress("UNCHECKED_CAST")
    fun getCustomerDetail() : ResponseCommonCustomerDetailed {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/common/customer/detail",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<ResponseCommonCustomerDetailed>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResponseCommonCustomerDetailed
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
