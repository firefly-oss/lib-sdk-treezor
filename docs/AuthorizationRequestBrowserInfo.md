

# AuthorizationRequestBrowserInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**javaEnabled** | **Boolean** | Represents the ability of the device&#39;s browser to run Java, when applicable  |  [optional] |
|**javascriptEnabled** | **Boolean** | Represents the ability for the client&#39;s browser to run JavaScript  |  [optional] |
|**ipaddr** | **String** | The IP address of the end user making a top-up |  [optional] |
|**httpAccept** | **String** | This element must include the exact content of the HTTP Accept header, as sent to the Treezor customer from the end user  |  [optional] |
|**httpUserAgent** | **String** | This element must include the exact content of the User_Agent HTTP header, as sent to the Treezor customer from the end user  |  [optional] |
|**language** | **String** | Value representing the client&#39;s browser language as defined in IETF-BCP47  |  [optional] |
|**colorDepth** | [**ColorDepthEnum**](#ColorDepthEnum) | Value representing the depth of the color palette to display an image, in bits/pixel  |  [optional] |
|**screenHeight** | **Integer** | Total height of the device screen (in pixels), when applicable |  [optional] |
|**screenWidth** | **Integer** | Total width of the end user screen (in pixels) |  [optional] |
|**timezone** | **String** | Time difference in minutes between UTC and cardholder&#39;s browser local time  |  [optional] |
|**deviceFingerprint** | **String** |  |  [optional] |



## Enum: ColorDepthEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_4 | 4 |
| NUMBER_8 | 8 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_32 | 32 |
| NUMBER_48 | 48 |



