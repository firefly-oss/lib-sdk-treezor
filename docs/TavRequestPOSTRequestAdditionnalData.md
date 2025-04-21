

# TavRequestPOSTRequestAdditionnalData

This parameter is required in the case of `APPLE` tokenRequestor 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**certificates** | **List&lt;String&gt;** | The certificate chain. Required when tokenRequestor is APPLE. The first element of array is the leaf certificate and the last should be the root certificate. There can be 0 or several sub certificates inbetween the first element of array and the last. All certificates are of type string (base64 encoded of DER format)  |  [optional] |
|**nonce** | **String** | The nonce as provided by the Apple SDK. Required when tokenRequestor is &#x60;APPLE&#x60;  |  [optional] |
|**nonceSignature** | **byte[]** | The nonce signature as provided by the Apple SDK. Required when tokenRequestor is &#x60;APPLE&#x60;  |  [optional] |



