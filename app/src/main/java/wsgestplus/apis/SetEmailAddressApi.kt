/**
 * wsGestplusAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.microplus.wsGestplus.apis

import com.microplus.wsGestplus.models.ContactEmailAddress
import com.microplus.wsGestplus.models.ResultSetEmailAddress

import com.microplus.wsGestplus.infrastructure.*

class SetEmailAddressApi(basePath: kotlin.String = "/") : ApiClient(basePath) {

    /**
     * 
     * 
     * @param body  (optional)
     * @return ResultSetEmailAddress
     */
    @Suppress("UNCHECKED_CAST")
    fun setEmailAddress(body: ContactEmailAddress? = null): ResultSetEmailAddress {
        val localVariableBody: kotlin.Any? = body
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/setEmailAddress"
        )
        val response = request<ResultSetEmailAddress>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as ResultSetEmailAddress
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}