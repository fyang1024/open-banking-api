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
 */import { EnumProductCategory } from './enumProductCategory';
import { ProductAdditionalInformation } from './productAdditionalInformation';


export interface Product { 
    /**
     * A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines.
     */
    productId: string;
    /**
     * The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate
     */
    effectiveFrom?: string;
    /**
     * The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products
     */
    effectiveTo?: string;
    /**
     * The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered)
     */
    lastUpdated: string;
    productCategory: EnumProductCategory;
    /**
     * The display name of the product
     */
    name: string;
    /**
     * A description of the product
     */
    description: string;
    /**
     * A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required
     */
    brand: string;
    /**
     * An optional display name of the brand
     */
    brandName?: string;
    /**
     * A link to the an application web page where this product can be applied for.
     */
    applicationUri?: string;
    /**
     * Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable
     */
    isTailored: boolean;
    additionalInformation?: ProductAdditionalInformation;
}