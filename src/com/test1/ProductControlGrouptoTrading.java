package com.test1;

public class ProductControlGrouptoTrading {
	private Integer productControlCode;
	private Integer dataCustodianId;
	private Integer tradeId;
	private String preTradeApplicable;
	private Integer businessIndicator;
	private boolean userCode;
	private boolean countryCode;
	private String unitName;
	private String frtbdataCustodianMappingId;
	private String creationCr;
	private String modifiedCr;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ProductControlGrouptoTrading() {

	}

	public ProductControlGrouptoTrading(Integer productControlCode, Integer dataCustodianId, Integer tradeId,
			String preTradeApplicable, Integer businessIndicator, boolean userCode, boolean countryCode,
			String unitName, String frtbdataCustodianMappingId, String creationCr, String modifiedCr,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.productControlCode = productControlCode;
		this.dataCustodianId = dataCustodianId;
		this.tradeId = tradeId;
		this.preTradeApplicable = preTradeApplicable;
		this.businessIndicator = businessIndicator;
		this.userCode = userCode;
		this.countryCode = countryCode;
		this.unitName = unitName;
		this.frtbdataCustodianMappingId = frtbdataCustodianMappingId;
		this.creationCr = creationCr;
		this.modifiedCr = modifiedCr;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getProductControlCode() {
		return productControlCode;
	}

	public void setProductControlCode(Integer productControlCode) {
		this.productControlCode = productControlCode;
	}

	public Integer getDataCustodianId() {
		return dataCustodianId;
	}

	public void setDataCustodianId(Integer dataCustodianId) {
		this.dataCustodianId = dataCustodianId;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getPreTradeApplicable() {
		return preTradeApplicable;
	}

	public void setPreTradeApplicable(String preTradeApplicable) {
		this.preTradeApplicable = preTradeApplicable;
	}

	public Integer getBusinessIndicator() {
		return businessIndicator;
	}

	public void setBusinessIndicator(Integer businessIndicator) {
		this.businessIndicator = businessIndicator;
	}

	public boolean isUserCode() {
		return userCode;
	}

	public void setUserCode(boolean userCode) {
		this.userCode = userCode;
	}

	public boolean isCountryCode() {
		return countryCode;
	}

	public void setCountryCode(boolean countryCode) {
		this.countryCode = countryCode;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getFrtbdataCustodianMappingId() {
		return frtbdataCustodianMappingId;
	}

	public void setFrtbdataCustodianMappingId(String frtbdataCustodianMappingId) {
		this.frtbdataCustodianMappingId = frtbdataCustodianMappingId;
	}

	public String getCreationCr() {
		return creationCr;
	}

	public void setCreationCr(String creationCr) {
		this.creationCr = creationCr;
	}

	public String getModifiedCr() {
		return modifiedCr;
	}

	public void setModifiedCr(String modifiedCr) {
		this.modifiedCr = modifiedCr;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
