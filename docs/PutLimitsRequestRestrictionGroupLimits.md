

# PutLimitsRequestRestrictionGroupLimits

Group of limits based on Restriction Groups. For now, only Restaurant Payment Vouchers with `paymentDailyLimit` can use this field. Furthermore, one of `mccRestrictionGroups`, `countryRestrictionGroups` or `merchantIdRestrictionGroups` must bepresent (i.e., `paymentDailyLimit` can't be alone). 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mccRestrictionGroups** | **Set&lt;Long&gt;** | List of MCC (Merchant Category Code) Restriction Groups. |  |
|**countryRestrictionGroups** | **Set&lt;Long&gt;** | List of Country Restriction Groups. |  |
|**merchantIdRestrictionGroups** | **Set&lt;Long&gt;** | List of Merchant ID Restriction Groups. |  |



