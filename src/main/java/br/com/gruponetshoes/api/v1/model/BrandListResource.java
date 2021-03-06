package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.BrandResource;
import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class BrandListResource  {
	
	
	private List<BrandResource> items = new ArrayList<BrandResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("items")
	public List<BrandResource> getItems() {
		return items;
	}
	
	public void setItems(List<BrandResource> items) {
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
		sb.append("class BrandListResource {\n");
		
		sb.append("  items: ").append(items).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
