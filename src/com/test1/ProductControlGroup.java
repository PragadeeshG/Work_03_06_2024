package com.test1;

public class ProductControlGroup {
	private Integer productControlCode;
	private Integer frtbEffective;
	private String frtbEffectiveDate;
	private String frtbproductControlDesc;
	private String frtbproductControlShortDesc;
	private Integer frtbDecimalpositions;
	private String frtbproductControlSymbol;
	private String frtbproductControlScale;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ProductControlGroup() {

	}

	public ProductControlGroup(Integer productControlCode, Integer frtbEffective, String frtbEffectiveDate,
			String frtbproductControlDesc, String frtbproductControlShortDesc, Integer frtbDecimalpositions,
			String frtbproductControlSymbol, String frtbproductControlScale, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.productControlCode = productControlCode;
		this.frtbEffective = frtbEffective;
		this.frtbEffectiveDate = frtbEffectiveDate;
		this.frtbproductControlDesc = frtbproductControlDesc;
		this.frtbproductControlShortDesc = frtbproductControlShortDesc;
		this.frtbDecimalpositions = frtbDecimalpositions;
		this.frtbproductControlSymbol = frtbproductControlSymbol;
		this.frtbproductControlScale = frtbproductControlScale;
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

	public Integer getFrtbEffective() {
		return frtbEffective;
	}

	public void setFrtbEffective(Integer frtbEffective) {
		this.frtbEffective = frtbEffective;
	}

	public String getFrtbEffectiveDate() {
		return frtbEffectiveDate;
	}

	public void setFrtbEffectiveDate(String frtbEffectiveDate) {
		this.frtbEffectiveDate = frtbEffectiveDate;
	}

	public String getFrtbproductControlDesc() {
		return frtbproductControlDesc;
	}

	public void setFrtbproductControlDesc(String frtbproductControlDesc) {
		this.frtbproductControlDesc = frtbproductControlDesc;
	}

	public String getFrtbproductControlShortDesc() {
		return frtbproductControlShortDesc;
	}

	public void setFrtbproductControlShortDesc(String frtbproductControlShortDesc) {
		this.frtbproductControlShortDesc = frtbproductControlShortDesc;
	}

	public Integer getFrtbDecimalpositions() {
		return frtbDecimalpositions;
	}

	public void setFrtbDecimalpositions(Integer frtbDecimalpositions) {
		this.frtbDecimalpositions = frtbDecimalpositions;
	}

	public String getFrtbproductControlSymbol() {
		return frtbproductControlSymbol;
	}

	public void setFrtbproductControlSymbol(String frtbproductControlSymbol) {
		this.frtbproductControlSymbol = frtbproductControlSymbol;
	}

	public String getFrtbproductControlScale() {
		return frtbproductControlScale;
	}

	public void setFrtbproductControlScale(String frtbproductControlScale) {
		this.frtbproductControlScale = frtbproductControlScale;
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
