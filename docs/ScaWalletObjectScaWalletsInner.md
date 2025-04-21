

# ScaWalletObjectScaWalletsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**subStatus** | [**SubStatusEnum**](#SubStatusEnum) |  |  [optional] |
|**passcodeStatus** | [**PasscodeStatusEnum**](#PasscodeStatusEnum) |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**lockReasons** | [**List&lt;LockReasonsEnum&gt;**](#List&lt;LockReasonsEnum&gt;) |  |  [optional] |
|**lockMessage** | **String** |  |  [optional] |
|**settingsProfile** | [**SettingsProfileEnum**](#SettingsProfileEnum) |  |  [optional] |
|**mobileWallet** | [**ScaWalletObjectScaWalletsInnerMobileWallet**](ScaWalletObjectScaWalletsInnerMobileWallet.md) |  |  [optional] |
|**activationCode** | **String** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**deletionDate** | **OffsetDateTime** |  |  [optional] |
|**activationCodeExpiryDate** | **OffsetDateTime** |  |  [optional] |
|**authenticationMethods** | **List&lt;Object&gt;** |  |  [optional] |
|**invalidActivationAttempts** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**scaWalletTag** | **String** |  |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**activationDate** | **OffsetDateTime** |  |  [optional] |
|**lockDate** | **OffsetDateTime** | The date and time at which the SCA Wallet was locked.  |  [optional] |
|**unlockDate** | **OffsetDateTime** | The date and time at which the SCA Wallet was unlocked.  |  [optional] |
|**resetPinDate** | **OffsetDateTime** | The date and time at which the SCA Wallet PIN was reset.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;CREATING&quot; |
| CREATED | &quot;CREATED&quot; |
| INITIALIZING | &quot;INITIALIZING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: SubStatusEnum

| Name | Value |
|---- | -----|
| CREATING_IN_PROGRESS | &quot;CREATING_IN_PROGRESS&quot; |
| CREATED_BLOCKED | &quot;CREATED_BLOCKED&quot; |
| CREATED_READY | &quot;CREATED_READY&quot; |
| INITIALIZING_MOBILE | &quot;INITIALIZING_MOBILE&quot; |
| ACTIVATED_LOGGED_IN | &quot;ACTIVATED_LOGGED_IN&quot; |
| ACTIVATED_LOGGED_OUT | &quot;ACTIVATED_LOGGED_OUT&quot; |
| DELETED_BY_ISSUER | &quot;DELETED_BY_ISSUER&quot; |
| DELETED_UNINSTALLED | &quot;DELETED_UNINSTALLED&quot; |



## Enum: PasscodeStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| NOT_SET | &quot;NOT_SET&quot; |
| SET | &quot;SET&quot; |
| TO_BE_CHANGED | &quot;TO_BE_CHANGED&quot; |



## Enum: List&lt;LockReasonsEnum&gt;

| Name | Value |
|---- | -----|
| FRAUDULENT_USE_SUSPECTED_BY_CLIENT | &quot;FRAUDULENT_USE_SUSPECTED_BY_CLIENT&quot; |
| FRAUDULENT_USE_SUSPECTED_BY_ISSUER | &quot;FRAUDULENT_USE_SUSPECTED_BY_ISSUER&quot; |
| INCIDENT | &quot;INCIDENT&quot; |
| ISSUER | &quot;ISSUER&quot; |
| LOST_DEVICE | &quot;LOST_DEVICE&quot; |
| STOLEN_DEVICE | &quot;STOLEN_DEVICE&quot; |
| TERMINATE_SERVICE | &quot;TERMINATE_SERVICE&quot; |



## Enum: SettingsProfileEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| WEBAUTHN | &quot;webauthn&quot; |



