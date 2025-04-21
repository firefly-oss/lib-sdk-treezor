

# SupportUserObjectClientsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** |  |  [optional] |
|**scopes** | [**List&lt;ScopesEnum&gt;**](#List&lt;ScopesEnum&gt;) |  |  [optional] |
|**resourceSet** | **List&lt;String&gt;** |  |  [optional] |
|**lastLoginAt** | **OffsetDateTime** | The date and time at which the support user was last connected. |  [optional] |
|**acceptedAt** | **OffsetDateTime** | The date and time at which the support user was created. |  [optional] |



## Enum: List&lt;ScopesEnum&gt;

| Name | Value |
|---- | -----|
| READ_WRITE | &quot;read_write&quot; |
| READ_ONLY | &quot;read_only&quot; |
| ADMIN | &quot;admin&quot; |
| SUPPORT_USER_MANAGEMENT | &quot;support_user_management&quot; |
| LEGAL | &quot;legal&quot; |



