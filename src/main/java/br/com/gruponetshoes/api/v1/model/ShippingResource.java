package br.com.gruponetshoes.api.v1.model;

import br.com.gruponetshoes.api.v1.model.CustomerResource;
import br.com.gruponetshoes.api.v1.model.Link;
import br.com.gruponetshoes.api.v1.model.DevolutionItemResource;
import br.com.gruponetshoes.api.v1.model.OrderItemResource;
import br.com.gruponetshoes.api.v1.model.CustomerAddressResource;
import java.util.Date;
import br.com.gruponetshoes.api.v1.model.TransportResource;
import br.com.gruponetshoes.api.v1.model.IssuerResource;
import br.com.gruponetshoes.api.v1.model.InvoiceResource;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ShippingResource  {
	
	
	private Long shippingCode = null;
	private Date shippingEstimate = null;
	private String status = null;
	private Integer deliveryTime = null;
	private IssuerResource issuer = null;
	private CustomerResource customer = null;
	private CustomerAddressResource customerAddress = null;
	private List<OrderItemResource> items = new ArrayList<OrderItemResource>() ;
	private List<DevolutionItemResource> devolutionItems = new ArrayList<DevolutionItemResource>() ;
	private List<String> exchangeOrders = new ArrayList<String>() ;
	private InvoiceResource invoice = null;
	private String country = null;
	private String cancellationReason = null;
	private TransportResource transport = null;
	private Double freightAmount = null;
	private List<Link> links = new ArrayList<Link>() ;

	
	/**
	 **/
	@JsonProperty("shippingCode")
	public Long getShippingCode() {
		return shippingCode;
	}
	
	public void setShippingCode(Long shippingCode) {
		this.shippingCode = shippingCode;
	}
	
	/**
	 **/
	@JsonProperty("shippingEstimate")
	public Date getShippingEstimate() {
		return shippingEstimate;
	}
	
	public void setShippingEstimate(Date shippingEstimate) {
		this.shippingEstimate = shippingEstimate;
	}
	
	/**
	 **/
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 **/
	@JsonProperty("deliveryTime")
	public Integer getDeliveryTime() {
		return deliveryTime;
	}
	
	public void setDeliveryTime(Integer deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	/**
	 **/
	@JsonProperty("issuer")
	public IssuerResource getIssuer() {
		return issuer;
	}
	
	public void setIssuer(IssuerResource issuer) {
		this.issuer = issuer;
	}
	
	/**
	 **/
	@JsonProperty("customer")
	public CustomerResource getCustomer() {
		return customer;
	}
	
	public void setCustomer(CustomerResource customer) {
		this.customer = customer;
	}
	
	/**
	 **/
	@JsonProperty("customerAddress")
	public CustomerAddressResource getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(CustomerAddressResource customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	/**
	 **/
	@JsonProperty("items")
	public List<OrderItemResource> getItems() {
		return items;
	}
	
	public void setItems(List<OrderItemResource> items) {
		this.items = items;
	}
	
	/**
	 **/
	@JsonProperty("devolutionItems")
	public List<DevolutionItemResource> getDevolutionItems() {
		return devolutionItems;
	}
	
	public void setDevolutionItems(List<DevolutionItemResource> devolutionItems) {
		this.devolutionItems = devolutionItems;
	}
	
	/**
	 **/
	@JsonProperty("exchangeOrders")
	public List<String> getExchangeOrders() {
		return exchangeOrders;
	}
	
	public void setExchangeOrders(List<String> exchangeOrders) {
		this.exchangeOrders = exchangeOrders;
	}
	
	/**
	 **/
	@JsonProperty("invoice")
	public InvoiceResource getInvoice() {
		return invoice;
	}
	
	public void setInvoice(InvoiceResource invoice) {
		this.invoice = invoice;
	}
	
	/**
	 **/
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 **/
	@JsonProperty("cancellationReason")
	public String getCancellationReason() {
		return cancellationReason;
	}
	
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	
	/**
	 **/
	@JsonProperty("transport")
	public TransportResource getTransport() {
		return transport;
	}
	
	public void setTransport(TransportResource transport) {
		this.transport = transport;
	}
	
	/**
	 **/
	@JsonProperty("freightAmount")
	public Double getFreightAmount() {
		return freightAmount;
	}
	
	public void setFreightAmount(Double freightAmount) {
		this.freightAmount = freightAmount;
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
		sb.append("class ShippingResource {\n");
		
		sb.append("  shippingCode: ").append(shippingCode).append("\n");
		sb.append("  shippingEstimate: ").append(shippingEstimate).append("\n");
		sb.append("  status: ").append(status).append("\n");
		sb.append("  deliveryTime: ").append(deliveryTime).append("\n");
		sb.append("  issuer: ").append(issuer).append("\n");
		sb.append("  customer: ").append(customer).append("\n");
		sb.append("  customerAddress: ").append(customerAddress).append("\n");
		sb.append("  items: ").append(items).append("\n");
		sb.append("  devolutionItems: ").append(devolutionItems).append("\n");
		sb.append("  exchangeOrders: ").append(exchangeOrders).append("\n");
		sb.append("  invoice: ").append(invoice).append("\n");
		sb.append("  country: ").append(country).append("\n");
		sb.append("  cancellationReason: ").append(cancellationReason).append("\n");
		sb.append("  transport: ").append(transport).append("\n");
		sb.append("  freightAmount: ").append(freightAmount).append("\n");
		sb.append("  links: ").append(links).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
