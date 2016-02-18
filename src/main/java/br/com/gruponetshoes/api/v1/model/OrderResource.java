package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.Link;
import java.util.Date;
import java.util.*;
import br.com.gruponetshoes.api.v1.model.ShippingResource;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderResource  {
	
	
	private Date agreedDate = null;
	private Date paymentData = null;
	private Date orderDate = null;
	private String number = null;
	private String originNumber = null;
	private Integer totalQuantity = null;
	private String originSite = null;
	private String businessUnit = null;
	public enum StatusEnum {
		 Cancelado,  Cadastrado,  Aprovado,  Faturado,  Enviado,  Entregue, 
	};
	
	private StatusEnum status = null;
	public enum OrderTypeEnum {
		 Venda,  Troca, 
	};
	
	private OrderTypeEnum orderType = null;
	private Boolean devolutionRequested = null;
	private Boolean exchangeRequested = null;
	private Double totalGross = null;
	private Double totalCommission = null;
	private Double totalDiscount = null;
	private Double totalFreight = null;
	private Double totalNet = null;
	private List<ShippingResource> shippings = new ArrayList<ShippingResource>() ;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("agreedDate")
	public Date getAgreedDate() {
		return agreedDate;
	}
	
	public void setAgreedDate(Date agreedDate) {
		this.agreedDate = agreedDate;
	}
	
	/**
	 **/
	@JsonProperty("paymentData")
	public Date getPaymentData() {
		return paymentData;
	}
	
	public void setPaymentData(Date paymentData) {
		this.paymentData = paymentData;
	}
	
	/**
	 **/
	@JsonProperty("orderDate")
	public Date getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	/**
	 **/
	@JsonProperty("number")
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 **/
	@JsonProperty("originNumber")
	public String getOriginNumber() {
		return originNumber;
	}
	
	public void setOriginNumber(String originNumber) {
		this.originNumber = originNumber;
	}
	
	/**
	 **/
	@JsonProperty("totalQuantity")
	public Integer getTotalQuantity() {
		return totalQuantity;
	}
	
	public void setTotalQuantity(Integer totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	/**
	 **/
	@JsonProperty("originSite")
	public String getOriginSite() {
		return originSite;
	}
	
	public void setOriginSite(String originSite) {
		this.originSite = originSite;
	}
	
	/**
	 **/
	@JsonProperty("businessUnit")
	public String getBusinessUnit() {
		return businessUnit;
	}
	
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	/**
	 **/
	@JsonProperty("status")
	public StatusEnum getStatus() {
		return status;
	}
	
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	/**
	 **/
	@JsonProperty("orderType")
	public OrderTypeEnum getOrderType() {
		return orderType;
	}
	
	public void setOrderType(OrderTypeEnum orderType) {
		this.orderType = orderType;
	}
	
	/**
	 **/
	@JsonProperty("devolutionRequested")
	public Boolean getDevolutionRequested() {
		return devolutionRequested;
	}
	
	public void setDevolutionRequested(Boolean devolutionRequested) {
		this.devolutionRequested = devolutionRequested;
	}
	
	/**
	 **/
	@JsonProperty("exchangeRequested")
	public Boolean getExchangeRequested() {
		return exchangeRequested;
	}
	
	public void setExchangeRequested(Boolean exchangeRequested) {
		this.exchangeRequested = exchangeRequested;
	}
	
	/**
	 **/
	@JsonProperty("totalGross")
	public Double getTotalGross() {
		return totalGross;
	}
	
	public void setTotalGross(Double totalGross) {
		this.totalGross = totalGross;
	}
	
	/**
	 **/
	@JsonProperty("totalCommission")
	public Double getTotalCommission() {
		return totalCommission;
	}
	
	public void setTotalCommission(Double totalCommission) {
		this.totalCommission = totalCommission;
	}
	
	/**
	 **/
	@JsonProperty("totalDiscount")
	public Double getTotalDiscount() {
		return totalDiscount;
	}
	
	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	
	/**
	 **/
	@JsonProperty("totalFreight")
	public Double getTotalFreight() {
		return totalFreight;
	}
	
	public void setTotalFreight(Double totalFreight) {
		this.totalFreight = totalFreight;
	}
	
	/**
	 **/
	@JsonProperty("totalNet")
	public Double getTotalNet() {
		return totalNet;
	}
	
	public void setTotalNet(Double totalNet) {
		this.totalNet = totalNet;
	}
	
	/**
	 **/
	@JsonProperty("shippings")
	public List<ShippingResource> getShippings() {
		return shippings;
	}
	
	public void setShippings(List<ShippingResource> shippings) {
		this.shippings = shippings;
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
		sb.append("class OrderResource {\n");
		
		sb.append("  agreedDate: ").append(agreedDate).append("\n");
		sb.append("  paymentData: ").append(paymentData).append("\n");
		sb.append("  orderDate: ").append(orderDate).append("\n");
		sb.append("  number: ").append(number).append("\n");
		sb.append("  originNumber: ").append(originNumber).append("\n");
		sb.append("  totalQuantity: ").append(totalQuantity).append("\n");
		sb.append("  originSite: ").append(originSite).append("\n");
		sb.append("  businessUnit: ").append(businessUnit).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  orderType: ").append(orderType).append("\n");
		sb.append("  devolutionRequested: ").append(devolutionRequested).append("\n");
		sb.append("  exchangeRequested: ").append(exchangeRequested).append("\n");
		sb.append("  totalGross: ").append(totalGross).append("\n");
		sb.append("  totalCommission: ").append(totalCommission).append("\n");
		sb.append("  totalDiscount: ").append(totalDiscount).append("\n");
		sb.append("  totalFreight: ").append(totalFreight).append("\n");
		sb.append("  totalNet: ").append(totalNet).append("\n");
		sb.append("  shippings: ").append(shippings).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
