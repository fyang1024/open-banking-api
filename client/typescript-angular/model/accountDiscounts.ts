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

export interface AccountDiscounts { 
    /**
     * Description of the discount
     */
    description: string;
    /**
     * The type of discount. See the next section for an overview of valid values and their meaning
     */
    discountType: AccountDiscounts.DiscountTypeEnum;
    /**
     * Value of the discount. Note that the currency of the fee discount is expected to be the same as the currency of the fee itself
     */
    amount: string;
    /**
     * Generic field containing additional information relevant to the discountType specified. Whether mandatory or not is dependent on the value of discountType
     */
    additionalValue?: string;
}
export namespace AccountDiscounts {
    export type DiscountTypeEnum = 'BALANCE' | 'DEPOSITS' | 'PAYMENTS' | 'BUNDLE';
    export const DiscountTypeEnum = {
        BALANCE: 'BALANCE' as DiscountTypeEnum,
        DEPOSITS: 'DEPOSITS' as DiscountTypeEnum,
        PAYMENTS: 'PAYMENTS' as DiscountTypeEnum,
        BUNDLE: 'BUNDLE' as DiscountTypeEnum
    };
}