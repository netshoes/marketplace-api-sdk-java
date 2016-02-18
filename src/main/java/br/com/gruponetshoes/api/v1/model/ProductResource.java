package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.SkuResource;
import br.com.gruponetshoes.api.v1.model.Link;
import br.com.gruponetshoes.api.v1.model.AttributeResource;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductResource  {
	
	
	private String productId = null;
	private List<SkuResource> skus = new ArrayList<SkuResource>() ;
	private String department = null;
	private String productType = null;
	private String brand = null;
	private List<AttributeResource> attributes = new ArrayList<AttributeResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("productId")
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	/**
	 **/
	@JsonProperty("skus")
	public List<SkuResource> getSkus() {
		return skus;
	}
	
	public void setSkus(List<SkuResource> skus) {
		this.skus = skus;
	}
	
	/**
	 **/
	@JsonProperty("department")
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 **/
	@JsonProperty("productType")
	public String getProductType() {
		return productType;
	}
	
	public void setProductType(String productType) {
		this.productType = productType;
	}
	
	/**
	 **/
	@JsonProperty("brand")
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 **/
	@JsonProperty("attributes")
	public List<AttributeResource> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(List<AttributeResource> attributes) {
		this.attributes = attributes;
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
		sb.append("class ProductResource {\n");
		
		sb.append("  productId: ").append(productId).append("\n");
		sb.append("  skus: ").append(skus).append("\n");
		sb.append("  department: ").append(department).append("\n");
		sb.append("  productType: ").append(productType).append("\n");
		sb.append("  brand: ").append(brand).append("\n");
		sb.append("  attributes: ").append(attributes).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
