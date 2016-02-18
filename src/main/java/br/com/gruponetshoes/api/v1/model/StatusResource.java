package br.com.gruponetshoes.api.v1.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public class StatusResource  {
	
	
	private String status = null;

	
	/**
	 **/
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString()  {
		StringBuilder sb = new StringBuilder();
		sb.append("class StatusResource {\n");
		
		sb.append("  status: ").append(status).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
