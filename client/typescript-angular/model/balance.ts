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
 */import { CurrencyAmount } from './currencyAmount';
import { DepositBalance } from './depositBalance';
import { LendingBalance } from './lendingBalance';


export interface Balance { 
    /**
     * A unique ID of the account adhering to the standards for ID permanence
     */
    accountId: string;
    /**
     * The type of balance object provided for the account
     */
    balanceUType: Balance.BalanceUTypeEnum;
    deposit?: DepositBalance;
    lending?: LendingBalance;
    purses?: Array<CurrencyAmount>;
}
export namespace Balance {
    export type BalanceUTypeEnum = 'deposit' | 'lending' | 'purses';
    export const BalanceUTypeEnum = {
        Deposit: 'deposit' as BalanceUTypeEnum,
        Lending: 'lending' as BalanceUTypeEnum,
        Purses: 'purses' as BalanceUTypeEnum
    };
}