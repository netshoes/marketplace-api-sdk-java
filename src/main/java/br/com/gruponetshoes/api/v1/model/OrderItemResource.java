package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderItemResource  {
	
	
	private Long itemId = null;
	private String manufacturerCode = null;
	private String ean = null;
	private String brand = null;
	private String name = null;
	private Integer quantity = null;
	private String sku = null;
	private String status = null;
	private String departmentName = null;
	private Integer departmentCode = null;
	private Double totalGross = null;
	private Double totalCommission = null;
	private Double totalDiscount = null;
	private Double totalFreight = null;
	private Double totalNet = null;
	private Double grossUnitValue = null;
	private Double discountUnitValue = null;
	private Double netUnitValue = null;
	private String color = null;
	private String flavor = null;
	private String size = null;

	
	/**
	 **/
	@JsonProperty("itemId")
	public Long getItemId() {
		return itemId;
	}
	
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	/**
	 **/
	@JsonProperty("manufacturerCode")
	public String getManufacturerCode() {
		return manufacturerCode;
	}
	
	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}
	
	/**
	 **/
	@JsonProperty("ean")
	public String getEan() {
		return ean;
	}
	
	public void setEan(String ean) {
		this.ean = ean;
	}
	
	/**
	 **/
	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 **/
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 **/
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 **/
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	/**
	 **/
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 **/
	@JsonProperty("departmentName")
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	/**
	 **/
	@JsonProperty("departmentCode")
	public Integer getDepartmentCode() {
		return departmentCode;
	}
	
	public void setDepartmentCode(Integer departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	/**
	 **/
	@JsonProperty("totalGross")
	public Double getTotalGross() {
		return totalGross;
	}
	
	public void setTotalGross(Double totalGross) {
		this.totalGross = totalGross;
	}
	
	/**
	 **/
	@JsonProperty("totalCommission")
	public Double getTotalCommission() {
		return totalCommission;
	}
	
	public void setTotalCommission(Double totalCommission) {
		this.totalCommission = totalCommission;
	}
	
	/**
	 **/
	@JsonProperty("totalDiscount")
	public Double getTotalDiscount() {
		return totalDiscount;
	}
	
	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	
	/**
	 **/
	@JsonProperty("totalFreight")
	public Double getTotalFreight() {
		return totalFreight;
	}
	
	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}
	
	/**
	 **/
	@JsonProperty("totalNet")
	public Double getTotalNet() {
		return totalNet;
	}
	
	public void setTotalNet(Double totalNet) {
		this.totalNet = totalNet;
	}
	
	/**
	 **/
	@JsonProperty("grossUnitValue")
	public Double getGrossUnitValue() {
		return grossUnitValue;
	}
	
	public void setGrossUnitValue(Double grossUnitValue) {
		this.grossUnitValue = grossUnitValue;
	}
	
	/**
	 **/
	@JsonProperty("discountUnitValue")
	public Double getDiscountUnitValue() {
		return discountUnitValue;
	}
	
	public void setDiscountUnitValue(Double discountUnitValue) {
		this.discountUnitValue = discountUnitValue;
	}
	
	/**
	 **/
	@JsonProperty("netUnitValue")
	public Double getNetUnitValue() {
		return netUnitValue;
	}
	
	public void setNetUnitValue(Double netUnitValue) {
		this.netUnitValue = netUnitValue;
	}
	
	/**
	 **/
	@JsonProperty("color")
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 **/
	@JsonProperty("flavor")
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	/**
	 **/
	@JsonProperty("size")
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class OrderItemResource {\n");
		
		sb.append("  itemId: ").append(itemId).append("\n");
		sb.append("  manufacturerCode: ").append(manufacturerCode).append("\n");
		sb.append("  ean: ").append(ean).append("\n");
		sb.append("  brand: ").append(brand).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  quantity: ").append(quantity).append("\n");
		sb.append("  sku: ").append(sku).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  departmentName: ").append(departmentName).append("\n");
		sb.append("  departmentCode: ").append(departmentCode).append("\n");
		sb.append("  totalGross: ").append(totalGross).append("\n");
		sb.append("  totalCommission: ").append(totalCommission).append("\n");
		sb.append("  totalDiscount: ").append(totalDiscount).append("\n");
		sb.append("  totalFreight: ").append(totalFreight).append("\n");
		sb.append("  totalNet: ").append(totalNet).append("\n");
		sb.append("  grossUnitValue: ").append(grossUnitValue).append("\n");
		sb.append("  discountUnitValue: ").append(discountUnitValue).append("\n");
		sb.append("  netUnitValue: ").append(netUnitValue).append("\n");
		sb.append("  color: ").append(color).append("\n");
		sb.append("  flavor: ").append(flavor).append("\n");
		sb.append("  size: ").append(size).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
