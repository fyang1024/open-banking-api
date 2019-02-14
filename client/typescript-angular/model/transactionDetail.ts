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
 */import { Transaction } from './transaction';
import { TransactionDetailExtendedData } from './transactionDetailExtendedData';


export interface TransactionDetail extends Transaction { 
    extendedData: TransactionDetailExtendedData;
}
export namespace TransactionDetail {
}