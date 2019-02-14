# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**productId** | [**kotlin.String**](.md) | A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines. | 
**effectiveFrom** | [**kotlin.String**](.md) | The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate |  [optional]
**effectiveTo** | [**kotlin.String**](.md) | The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products |  [optional]
**lastUpdated** | [**kotlin.String**](.md) | The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered) | 
**productCategory** | [**EnumProductCategory**](EnumProductCategory.md) |  | 
**name** | [**kotlin.String**](.md) | The display name of the product | 
**description** | [**kotlin.String**](.md) | A description of the product | 
**brand** | [**kotlin.String**](.md) | A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required | 
**brandName** | [**kotlin.String**](.md) | An optional display name of the brand |  [optional]
**applicationUri** | [**kotlin.String**](.md) | A link to the an application web page where this product can be applied for. |  [optional]
**isTailored** | [**kotlin.Boolean**](.md) | Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable | 
**additionalInformation** | [**ProductAdditionalInformation**](ProductAdditionalInformation.md) |  |  [optional]
