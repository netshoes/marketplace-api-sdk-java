package br.com.gruponetshoes.api.v1.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ErrorResource  {
	
	
	public enum TypeEnum {
		 Parameter_Error,  Bad_Request_Error,  Business_Logic_Error,  Resource_Not_Found,  Internal_Architecture_Error,  List_Not_Found,  Method_Not_Allowed, 
	};
	
	private TypeEnum type = null;
	private String description = null;
	private List<String> notifications = new ArrayList<String>() ;

	
	/**
	 **/
	@JsonProperty("type")
	public TypeEnum getType() {
		return type;
	}
	
	public void setType(TypeEnum type) {
		this.type = type;
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
	@JsonProperty("notifications")
	public List<String> getNotifications() {
		return notifications;
	}
	
	public void setNotifications(List<String> notifications) {
		this.notifications = notifications;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResource {\n");
		
		sb.append("  type: ").append(type).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  notifications: ").append(notifications).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
