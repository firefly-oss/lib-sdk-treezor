

# UpdateSupportUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**username** | **String** | The identifier the user will use for logging in to the Dashboard or your own backoffice.  We strongly recommend not to change the username once set (you won&#39;t be able to do it from the Dashboard).  |  [optional] |
|**password** | **String** | The password the user will use for logging in to the Dashboard or your own backoffice. Expected in cleartext. |  [optional] |
|**scope** | [**List&lt;ScopeEnum&gt;**](#List&lt;ScopeEnum&gt;) | Set of permissions for your Support User. Learn more in the [Scope &amp; Permissions](/guide/api-basics/authentication.html#scopes-permissions) article.  |  [optional] |
|**samlKey** | **String** | Optional key to link automatically a Support User to a [Dashboard](/guide/dashboard/introduction.html) OAuth2 client.  |  [optional] |



## Enum: List&lt;ScopeEnum&gt;

| Name | Value |
|---- | -----|
| READ_WRITE | &quot;read_write&quot; |
| READ_ONLY | &quot;read_only&quot; |
| ADMIN | &quot;admin&quot; |
| SUPPORT_USER_MANAGEMENT | &quot;support_user_management&quot; |
| LEGAL | &quot;legal&quot; |



