package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BusinessUnitResponse  {
	
	
	private Boolean active = null;
	private Boolean skuSynchronized = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("active")
	public Boolean getActive() {
		return active;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	/**
	 **/
	@JsonProperty("skuSynchronized")
	public Boolean getSkuSynchronized() {
		return skuSynchronized;
	}
	
	public void setSkuSynchronized(Boolean skuSynchronized) {
		this.skuSynchronized = skuSynchronized;
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
		sb.append("class BusinessUnitResponse {\n");
		
		sb.append("  active: ").append(active).append("\n");
		sb.append("  skuSynchronized: ").append(skuSynchronized).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
