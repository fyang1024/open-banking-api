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

export interface DomesticPayeePayId { 
    /**
     * The name assigned to the PayID by the owner of the PayID
     */
    name?: string;
    /**
     * The identifier of the PayID (dependent on type)
     */
    identifier: string;
    /**
     * The type of the PayID
     */
    type: DomesticPayeePayId.TypeEnum;
}
export namespace DomesticPayeePayId {
    export type TypeEnum = 'EMAIL' | 'MOBILE' | 'ORG_NUMBER' | 'ORG_NAME';
    export const TypeEnum = {
        EMAIL: 'EMAIL' as TypeEnum,
        MOBILE: 'MOBILE' as TypeEnum,
        ORGNUMBER: 'ORG_NUMBER' as TypeEnum,
        ORGNAME: 'ORG_NAME' as TypeEnum
    };
}