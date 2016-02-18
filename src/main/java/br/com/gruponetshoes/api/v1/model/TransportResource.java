package br.com.gruponetshoes.api.v1.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class TransportResource  {
	
	
	private String trackingNumber = null;
	private String trackingLink = null;
	private Date trackingShipDate = null;
	private Date deliveryDate = null;
	private Date shipDate = null;
	private String deliveryService = null;
	private String carrier = null;

	
	/**
	 **/
	@JsonProperty("trackingNumber")
	public String getTrackingNumber() {
		return trackingNumber;
	}
	
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	
	/**
	 **/
	@JsonProperty("trackingLink")
	public String getTrackingLink() {
		return trackingLink;
	}
	
	public void setTrackingLink(String trackingLink) {
		this.trackingLink = trackingLink;
	}
	
	/**
	 **/
	@JsonProperty("trackingShipDate")
	public Date getTrackingShipDate() {
		return trackingShipDate;
	}
	
	public void setTrackingShipDate(Date trackingShipDate) {
		this.trackingShipDate = trackingShipDate;
	}
	
	/**
	 **/
	@JsonProperty("deliveryDate")
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
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
	@JsonProperty("deliveryService")
	public String getDeliveryService() {
		return deliveryService;
	}
	
	public void setDeliveryService(String deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	/**
	 **/
	@JsonProperty("carrier")
	public String getCarrier() {
		return carrier;
	}
	
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransportResource {\n");
		
		sb.append("  trackingNumber: ").append(trackingNumber).append("\n");
		sb.append("  trackingLink: ").append(trackingLink).append("\n");
		sb.append("  trackingShipDate: ").append(trackingShipDate).append("\n");
		sb.append("  deliveryDate: ").append(deliveryDate).append("\n");
		sb.append("  shipDate: ").append(shipDate).append("\n");
		sb.append("  deliveryService: ").append(deliveryService).append("\n");
		sb.append("  carrier: ").append(carrier).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
