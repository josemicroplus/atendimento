/**
 * wsLoginAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package com.microplus.wsGestplus.models


/**
 * 
 * @param idCompany 
 * @param database 
 * @param contribuinte 
 * @param user 
 * @param userPosto 
 * @param pass 
 * @param armazem 
 * @param iPorigem 
 * @param origem 
 * @param licenseKey 
 */
data class LoginData (

    val idCompany: kotlin.String? = null,
    val database: kotlin.String? = null,
    val contribuinte: kotlin.String? = null,
    val user: kotlin.String? = null,
    val userPosto: kotlin.String? = null,
    val pass: kotlin.String? = null,
    val armazem: kotlin.String? = null,
    val iPorigem: kotlin.String? = null,
    val origem: kotlin.String? = null,
    val licenseKey: kotlin.String? = null
) {
}