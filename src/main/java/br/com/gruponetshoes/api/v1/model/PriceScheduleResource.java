package br.com.gruponetshoes.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PriceScheduleResource  {
	
	
	private String sku = null;
	private Double priceFrom = null;
	private Double priceTo = null;
	private Date dateInit = null;
	private Date dateEnd = null;

	
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
	@JsonProperty("priceFrom")
	public Double getPriceFrom() {
		return priceFrom;
	}
	
	public void setPriceFrom(Double priceFrom) {
		this.priceFrom = priceFrom;
	}
	
	/**
	 **/
	@JsonProperty("priceTo")
	public Double getPriceTo() {
		return priceTo;
	}
	
	public void setPriceTo(Double priceTo) {
		this.priceTo = priceTo;
	}
	
	/**
	 **/
	@JsonProperty("dateInit")
	public Date getDateInit() {
		return dateInit;
	}
	
	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}
	
	/**
	 **/
	@JsonProperty("dateEnd")
	public Date getDateEnd() {
		return dateEnd;
	}
	
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class PriceScheduleResource {\n");
		
		sb.append("  sku: ").append(sku).append("\n");
		sb.append("  priceFrom: ").append(priceFrom).append("\n");
		sb.append("  priceTo: ").append(priceTo).append("\n");
		sb.append("  dateInit: ").append(dateInit).append("\n");
		sb.append("  dateEnd: ").append(dateEnd).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
