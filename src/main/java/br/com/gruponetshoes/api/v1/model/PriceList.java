package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;
import br.com.gruponetshoes.api.v1.model.PriceScheduleResource;

import com.fasterxml.jackson.annotation.JsonProperty;


public class PriceList  {
	
	
	private List<PriceScheduleResource> items = new ArrayList<PriceScheduleResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("items")
	public List<PriceScheduleResource> getItems() {
		return items;
	}
	
	public void setItems(List<PriceScheduleResource> items) {
		this.items = items;
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
		sb.append("class PriceList {\n");
		
		sb.append("  items: ").append(items).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
