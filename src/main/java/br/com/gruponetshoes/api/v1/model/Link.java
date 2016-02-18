package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Link  {
	
	
	private String rel = null;
	private String href = null;

	
	/**
	 **/
	@JsonProperty("rel")
	public String getRel() {
		return rel;
	}
	
	public void setRel(String rel) {
		this.rel = rel;
	}
	
	/**
	 **/
	@JsonProperty("href")
	public String getHref() {
		return href;
	}
	
	public void setHref(String href) {
		this.href = href;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class Link {\n");
		
		sb.append("  rel: ").append(rel).append("\n");
		sb.append("  href: ").append(href).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
