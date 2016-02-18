package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ColorResource  {
	
	
	private Integer code = null;
	private String name = null;
	private String externalCode = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("code")
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	/**
	 **/
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 **/
	@JsonProperty("externalCode")
	public String getExternalCode() {
		return externalCode;
	}
	
	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
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
		sb.append("class ColorResource {\n");
		
		sb.append("  code: ").append(code).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  externalCode: ").append(externalCode).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
