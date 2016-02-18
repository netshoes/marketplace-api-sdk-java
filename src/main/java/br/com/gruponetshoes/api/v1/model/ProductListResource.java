package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import br.com.gruponetshoes.api.v1.model.ProductResource;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductListResource  {
	
	
	private List<ProductResource> items = new ArrayList<ProductResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("items")
	public List<ProductResource> getItems() {
		return items;
	}
	
	public void setItems(List<ProductResource> items) {
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
		sb.append("class ProductListResource {\n");
		
		sb.append("  items: ").append(items).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
