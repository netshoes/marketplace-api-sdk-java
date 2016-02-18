package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class StockResponse  {
	
	
	private String country = null;
	private Long available = null;
	private Long total = null;
	private Long reserved = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 **/
	@JsonProperty("available")
	public Long getAvailable() {
		return available;
	}
	
	public void setAvailable(Long available) {
		this.available = available;
	}
	
	/**
	 **/
	@JsonProperty("total")
	public Long getTotal() {
		return total;
	}
	
	public void setTotal(Long total) {
		this.total = total;
	}
	
	/**
	 **/
	@JsonProperty("reserved")
	public Long getReserved() {
		return reserved;
	}
	
	public void setReserved(Long reserved) {
		this.reserved = reserved;
	}
	
	/**
	 **/
	@JsonProperty("links")
	public List<Link> getLinks() {
		return links;
	}
	
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class StockResponse {\n");
		
		sb.append("  country: ").append(country).append("\n");
		sb.append("  available: ").append(available).append("\n");
		sb.append("  total: ").append(total).append("\n");
		sb.append("  reserved: ").append(reserved).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
