package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageResource  {
	
	
	private String url = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
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
		sb.append("class ImageResource {\n");
		
		sb.append("  url: ").append(url).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
