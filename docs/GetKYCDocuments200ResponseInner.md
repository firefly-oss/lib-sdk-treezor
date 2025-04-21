

# GetKYCDocuments200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **UUID** | The unique identifier of the pre-review document. This is different from the Id of the Document object.  |  [optional] |
|**documentType** | **Integer** | The &#x60;documentTypeId&#x60; of the file to upload.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values.  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**userId** | **Integer** | The unique identifier of the user the document belongs to. |  [optional] |
|**createdAt** | **OffsetDateTime** | The date and time at which the pre-review document was created. |  [optional] |
|**metadata** | **List&lt;String&gt;** |  |  [optional] |
|**comment** | **String** | Mandatory comment entered by your teams when pre-reviewing the document. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



