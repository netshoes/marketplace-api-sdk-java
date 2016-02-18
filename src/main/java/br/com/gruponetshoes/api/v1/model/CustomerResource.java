package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerResource  {
	
	
	private String document = null;
	private String stateInscription = null;
	private String customerName = null;
	private String recipientName = null;
	private String tradeName = null;
	private String cellPhone = null;
	private String landline = null;
	private String receiverName = null;

	
	/**
	 **/
	@JsonProperty("document")
	public String getDocument() {
		return document;
	}
	
	public void setDocument(String document) {
		this.document = document;
	}
	
	/**
	 **/
	@JsonProperty("stateInscription")
	public String getStateInscription() {
		return stateInscription;
	}
	
	public void setStateInscription(String stateInscription) {
		this.stateInscription = stateInscription;
	}
	
	/**
	 **/
	@JsonProperty("customerName")
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	/**
	 **/
	@JsonProperty("recipientName")
	public String getRecipientName() {
		return recipientName;
	}
	
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	
	/**
	 **/
	@JsonProperty("tradeName")
	public String getTradeName() {
		return tradeName;
	}
	
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	/**
	 **/
	@JsonProperty("cellPhone")
	public String getCellPhone() {
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	
	/**
	 **/
	@JsonProperty("landline")
	public String getLandline() {
		return landline;
	}
	
	public void setLandline(String landline) {
		this.landline = landline;
	}
	
	/**
	 **/
	@JsonProperty("receiverName")
	public String getReceiverName() {
		return receiverName;
	}
	
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerResource {\n");
		
		sb.append("  document: ").append(document).append("\n");
		sb.append("  stateInscription: ").append(stateInscription).append("\n");
		sb.append("  customerName: ").append(customerName).append("\n");
		sb.append("  recipientName: ").append(recipientName).append("\n");
		sb.append("  tradeName: ").append(tradeName).append("\n");
		sb.append("  cellPhone: ").append(cellPhone).append("\n");
		sb.append("  landline: ").append(landline).append("\n");
		sb.append("  receiverName: ").append(receiverName).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
