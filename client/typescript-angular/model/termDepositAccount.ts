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

export interface TermDepositAccount { 
    /**
     * The lodgement date of the original deposit
     */
    lodgementDate: string;
    /**
     * Maturity date for the term deposit
     */
    maturityDate: string;
    /**
     * Amount to be paid upon maturity. If absent it implies the amount to paid is variable and cannot currently be calculated
     */
    maturityAmount?: string;
    /**
     * If absent assumes AUD
     */
    maturityCurrency?: string;
    /**
     * Current instructions on action to be taken at maturity
     */
    maturityInstructions: TermDepositAccount.MaturityInstructionsEnum;
}
export namespace TermDepositAccount {
    export type MaturityInstructionsEnum = 'ROLLED_OVER' | 'PAID_OUT_AT_MATURITY';
    export const MaturityInstructionsEnum = {
        ROLLEDOVER: 'ROLLED_OVER' as MaturityInstructionsEnum,
        PAIDOUTATMATURITY: 'PAID_OUT_AT_MATURITY' as MaturityInstructionsEnum
    };
}