package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class IssuerResource  {
	
	
	private String supplierCnpj = null;
	private Long sellerCode = null;
	private String sellerName = null;
	private String supplierName = null;

	
	/**
	 **/
	@JsonProperty("supplierCnpj")
	public String getSupplierCnpj() {
		return supplierCnpj;
	}
	
	public void setSupplierCnpj(String supplierCnpj) {
		this.supplierCnpj = supplierCnpj;
	}
	
	/**
	 **/
	@JsonProperty("sellerCode")
	public Long getSellerCode() {
		return sellerCode;
	}
	
	public void setSellerCode(Long sellerCode) {
		this.sellerCode = sellerCode;
	}
	
	/**
	 **/
	@JsonProperty("sellerName")
	public String getSellerName() {
		return sellerName;
	}
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	/**
	 **/
	@JsonProperty("supplierName")
	public String getSupplierName() {
		return supplierName;
	}
	
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class IssuerResource {\n");
		
		sb.append("  supplierCnpj: ").append(supplierCnpj).append("\n");
		sb.append("  sellerCode: ").append(sellerCode).append("\n");
		sb.append("  sellerName: ").append(sellerName).append("\n");
		sb.append("  supplierName: ").append(supplierName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
