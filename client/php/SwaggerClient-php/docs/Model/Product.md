# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_id** | **string** | A provider specific unique identifier for this product. This identifier must be unique to a product but does not otherwise need to adhere to ID permanence guidelines. | 
**effective_from** | **string** | The date and time from which this product is effective (ie. is available for origination).  Used to enable the articulation of products to the regime before they are available for customers to originate | [optional] 
**effective_to** | **string** | The date and time at which this product will be retired and will no longer be offered.  Used to enable the managed deprecation of products | [optional] 
**last_updated** | **string** | The last date and time that the information for this product was changed (or the creation date for the product if it has never been altered) | 
**product_category** | [**\Swagger\Client\Model\EnumProductCategory**](EnumProductCategory.md) |  | 
**name** | **string** | The display name of the product | 
**description** | **string** | A description of the product | 
**brand** | **string** | A label of the brand for the product. Able to be used for filtering. For data providers with single brands this value is still required | 
**brand_name** | **string** | An optional display name of the brand | [optional] 
**application_uri** | **string** | A link to the an application web page where this product can be applied for. | [optional] 
**is_tailored** | **bool** | Indicates whether the product is specifically tailored to a circumstance.  In this case fees and prices are significantly negotiated depending on context. While all products are open to a degree of tailoring this flag indicates that tailoring is expected and thus that the provision of specific fees and rates is not applicable | 
**additional_information** | [**\Swagger\Client\Model\ProductAdditionalInformation**](ProductAdditionalInformation.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

