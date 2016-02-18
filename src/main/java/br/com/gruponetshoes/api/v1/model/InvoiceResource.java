package br.com.gruponetshoes.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class InvoiceResource  {
	
	
	private String accessKey = null;
	private Date date = null;
	private Date shipDate = null;
	private String url = null;

	
	/**
	 **/
	@JsonProperty("accessKey")
	public String getAccessKey() {
		return accessKey;
	}
	
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	
	/**
	 **/
	@JsonProperty("date")
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 **/
	@JsonProperty("shipDate")
	public Date getShipDate() {
		return shipDate;
	}
	
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
	
	/**
	 **/
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvoiceResource {\n");
		
		sb.append("  accessKey: ").append(accessKey).append("\n");
		sb.append("  date: ").append(date).append("\n");
		sb.append("  shipDate: ").append(shipDate).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
