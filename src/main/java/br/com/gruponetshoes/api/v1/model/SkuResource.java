package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import br.com.gruponetshoes.api.v1.model.ImageResource;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SkuResource  {
	
	
	private String sku = null;
	private String name = null;
	private String description = null;
	private String color = null;
	private String flavor = null;
	private String size = null;
	private String gender = null;
	private String eanIsbn = null;
	private List<ImageResource> images = new ArrayList<ImageResource>() ;
	private String video = null;
	private Double height = null;
	private Double width = null;
	private Double depth = null;
	private Double weight = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
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
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 **/
	@JsonProperty("color")
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 **/
	@JsonProperty("flavor")
	public String getFlavor() {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	/**
	 **/
	@JsonProperty("size")
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	/**
	 **/
	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 **/
	@JsonProperty("eanIsbn")
	public String getEanIsbn() {
		return eanIsbn;
	}
	
	public void setEanIsbn(String eanIsbn) {
		this.eanIsbn = eanIsbn;
	}
	
	/**
	 **/
	@JsonProperty("images")
	public List<ImageResource> getImages() {
		return images;
	}
	
	public void setImages(List<ImageResource> images) {
		this.images = images;
	}
	
	/**
	 **/
	@JsonProperty("video")
	public String getVideo() {
		return video;
	}
	
	public void setVideo(String video) {
		this.video = video;
	}
	
	/**
	 **/
	@JsonProperty("height")
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	/**
	 **/
	@JsonProperty("width")
	public Double getWidth() {
		return width;
	}
	
	public void setWidth(Double width) {
		this.width = width;
	}
	
	/**
	 **/
	@JsonProperty("depth")
	public Double getDepth() {
		return depth;
	}
	
	public void setDepth(Double depth) {
		this.depth = depth;
	}
	
	/**
	 **/
	@JsonProperty("weight")
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
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
		sb.append("class SkuResource {\n");
		
		sb.append("  sku: ").append(sku).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  color: ").append(color).append("\n");
		sb.append("  flavor: ").append(flavor).append("\n");
		sb.append("  size: ").append(size).append("\n");
		sb.append("  gender: ").append(gender).append("\n");
		sb.append("  eanIsbn: ").append(eanIsbn).append("\n");
		sb.append("  images: ").append(images).append("\n");
		sb.append("  video: ").append(video).append("\n");
		sb.append("  height: ").append(height).append("\n");
		sb.append("  width: ").append(width).append("\n");
		sb.append("  depth: ").append(depth).append("\n");
		sb.append("  weight: ").append(weight).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
