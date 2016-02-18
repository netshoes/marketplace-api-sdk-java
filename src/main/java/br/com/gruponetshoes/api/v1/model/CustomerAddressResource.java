package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerAddressResource  {
	
	
	private String neighborhood = null;
	private String postalCode = null;
	private String city = null;
	private String complement = null;
	private String state = null;
	private String street = null;
	private String number = null;
	private String reference = null;

	
	/**
	 **/
	@JsonProperty("neighborhood")
	public String getNeighborhood() {
		return neighborhood;
	}
	
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	/**
	 **/
	@JsonProperty("postalCode")
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	/**
	 **/
	@JsonProperty("city")
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 **/
	@JsonProperty("complement")
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	/**
	 **/
	@JsonProperty("state")
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 **/
	@JsonProperty("street")
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 **/
	@JsonProperty("number")
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 **/
	@JsonProperty("reference")
	public String getReference() {
		return reference;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomerAddressResource {\n");
		
		sb.append("  neighborhood: ").append(neighborhood).append("\n");
		sb.append("  postalCode: ").append(postalCode).append("\n");
		sb.append("  city: ").append(city).append("\n");
		sb.append("  complement: ").append(complement).append("\n");
		sb.append("  state: ").append(state).append("\n");
		sb.append("  street: ").append(street).append("\n");
		sb.append("  number: ").append(number).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
