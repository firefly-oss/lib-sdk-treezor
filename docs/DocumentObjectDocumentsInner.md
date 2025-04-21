

# DocumentObjectDocumentsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentId** | **Integer** | The unique identifier of the Document. |  [optional] |
|**documentTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User the document belongs to. |  [optional] |
|**userFirstname** | **String** |  |  [optional] |
|**userLastname** | **String** |  |  [optional] |
|**name** | **String** | The name of the document. |  [optional] |
|**documentStatus** | [**DocumentStatusEnum**](#DocumentStatusEnum) | The status of the document. See [Document Status](/guide/user-verification/documents.html#status-documentstatus) for more information.  |  [optional] |
|**documentTypeId** | **Integer** | The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values.  |  [optional] |
|**documentType** | **String** | The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values.  |  [optional] |
|**fileName** | **String** |  |  [optional] |
|**thumbfileName** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Date and time at which the document was created.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date and time at which the document was last updated.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;  |  [optional] |
|**codeStatus** | [**CodeStatusEnum**](#CodeStatusEnum) | The status code of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information.  |  [optional] |
|**informationStatus** | **String** | Additional information about the document status, if any. |  [optional] |
|**residenceId** | **Long** | The unique identifier of the User&#39;s [Tax Residence](/guide/user-verification/tax-residence.html).   Only available for &#x60;documentTypeId&#x60; is &#x60;24&#x60; or &#x60;25&#x60;.   |  [optional] |
|**temporaryUrl** | **String** |  |  [optional] |
|**temporaryUrlThumb** | **String** |  |  [optional] |



## Enum: DocumentStatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;CANCELED&quot; |
| PENDING | &quot;PENDING&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: CodeStatusEnum

| Name | Value |
|---- | -----|
| _600001 | &quot;600001&quot; |
| _600002 | &quot;600002&quot; |
| _600003 | &quot;600003&quot; |
| _600004 | &quot;600004&quot; |
| _600005 | &quot;600005&quot; |
| _600006 | &quot;600006&quot; |
| _600007 | &quot;600007&quot; |
| _600008 | &quot;600008&quot; |
| _600009 | &quot;600009&quot; |
| _600010 | &quot;600010&quot; |
| _600011 | &quot;600011&quot; |
| _600012 | &quot;600012&quot; |
| _600013 | &quot;600013&quot; |
| _600014 | &quot;600014&quot; |
| _600015 | &quot;600015&quot; |
| _600016 | &quot;600016&quot; |
| _600017 | &quot;600017&quot; |



