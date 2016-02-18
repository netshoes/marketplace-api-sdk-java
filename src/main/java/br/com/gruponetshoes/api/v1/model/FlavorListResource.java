package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import br.com.gruponetshoes.api.v1.model.FlavorResource;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FlavorListResource  {
	
	
	private List<FlavorResource> items = new ArrayList<FlavorResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("items")
	public List<FlavorResource> getItems() {
		return items;
	}
	
	public void setItems(List<FlavorResource> items) {
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
		sb.append("class FlavorListResource {\n");
		
		sb.append("  items: ").append(items).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
