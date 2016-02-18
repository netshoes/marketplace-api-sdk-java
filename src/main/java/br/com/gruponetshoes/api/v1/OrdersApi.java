package br.com.gruponetshoes.api.v1;

import br.com.gruponetshoes.api.v1.client.ApiException;
import br.com.gruponetshoes.api.v1.client.ApiClient;
import br.com.gruponetshoes.api.v1.client.Configuration;

import br.com.gruponetshoes.api.v1.model.*;

import java.util.*;

import java.util.Date;
import br.com.gruponetshoes.api.v1.model.OrderListResource;
import br.com.gruponetshoes.api.v1.model.OrderResource;
import br.com.gruponetshoes.api.v1.model.ShippingListResource;
import br.com.gruponetshoes.api.v1.model.ShippingResource;
import br.com.gruponetshoes.api.v1.model.StatusResource;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class OrdersApi {

	private ApiClient apiClient;

	public OrdersApi() {
		this(Configuration.getDefaultApiClient());
	}

	public OrdersApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Get a list of Orders.
	 * 
	 * @param page 
	 * @param size 
	 * @param expand 
	 * @param orderStartDate 
	 * @param orderEndDate 
	 * @param orderStatus 
	 * @param orderType 
	 * @return OrderListResource
	 */
	public OrderListResource listOrders (Integer page, Integer size, String expand, Date orderStartDate, Date orderEndDate, String orderStatus, String orderType) throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/orders".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (page != null)
			queryParams.put("page", apiClient.parameterToString(page));
		if (size != null)
			queryParams.put("size", apiClient.parameterToString(size));
		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		if (orderStartDate != null)
			queryParams.put("orderStartDate", apiClient.parameterToString(orderStartDate));
		if (orderEndDate != null)
			queryParams.put("orderEndDate", apiClient.parameterToString(orderEndDate));
		if (orderStatus != null)
			queryParams.put("orderStatus", apiClient.parameterToString(orderStatus));
		if (orderType != null)
			queryParams.put("orderType", apiClient.parameterToString(orderType));
		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (OrderListResource) apiClient.deserialize(response, "", OrderListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * 
	 * 
	 * @param body 
	 * @return OrderResource
	 */
	public OrderResource saveOrder (OrderResource body) throws ApiException {
		
		Object postBody = body;
		

		// create path and map variables
		String path = "/orders".replaceAll("\\{format\\}","json");

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

		final String[] accepts = {
			
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (OrderResource) apiClient.deserialize(response, "", OrderResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get a order based on order number.
	 * 
	 * @param orderNumber 
	 * @param expand 
	 * @return OrderResource
	 */
	public OrderResource getOrder (String orderNumber, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'orderNumber' is set
		if (orderNumber == null) {
			throw new ApiException(400, "Missing the required parameter 'orderNumber' when calling getOrder");
		}
		

		// create path and map variables
		String path = "/orders/{orderNumber}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "orderNumber" + "\\}", apiClient.escapeString(orderNumber.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (OrderResource) apiClient.deserialize(response, "", OrderResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get a list of shippings by order number.
	 * 
	 * @param orderNumber 
	 * @param expand 
	 * @return ShippingListResource
	 */
	public ShippingListResource listOrderShippings (String orderNumber, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'orderNumber' is set
		if (orderNumber == null) {
			throw new ApiException(400, "Missing the required parameter 'orderNumber' when calling listOrderShippings");
		}
		

		// create path and map variables
		String path = "/orders/{orderNumber}/shippings".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "orderNumber" + "\\}", apiClient.escapeString(orderNumber.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ShippingListResource) apiClient.deserialize(response, "", ShippingListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get a shipping based on order number and shipping code.
	 * 
	 * @param orderNumber 
	 * @param shippingCode 
	 * @param expand 
	 * @return ShippingResource
	 */
	public ShippingResource getOrderShipping (String orderNumber, Long shippingCode, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'orderNumber' is set
		if (orderNumber == null) {
			throw new ApiException(400, "Missing the required parameter 'orderNumber' when calling getOrderShipping");
		}
		
		// verify the required parameter 'shippingCode' is set
		if (shippingCode == null) {
			throw new ApiException(400, "Missing the required parameter 'shippingCode' when calling getOrderShipping");
		}
		

		// create path and map variables
		String path = "/orders/{orderNumber}/shippings/{shippingCode}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "orderNumber" + "\\}", apiClient.escapeString(orderNumber.toString()))
			.replaceAll("\\{" + "shippingCode" + "\\}", apiClient.escapeString(shippingCode.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (expand != null)
			queryParams.put("expand", apiClient.parameterToString(expand));
		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ShippingResource) apiClient.deserialize(response, "", ShippingResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Update status of item.
	 * 
	 * @param orderNumber 
	 * @param shippingCode 
	 * @param idItem 
	 * @param body 
	 * @return StatusResource
	 */
	public StatusResource updateShippingItemStatus (String orderNumber, Long shippingCode, Long idItem, StatusResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'orderNumber' is set
		if (orderNumber == null) {
			throw new ApiException(400, "Missing the required parameter 'orderNumber' when calling updateShippingItemStatus");
		}
		
		// verify the required parameter 'shippingCode' is set
		if (shippingCode == null) {
			throw new ApiException(400, "Missing the required parameter 'shippingCode' when calling updateShippingItemStatus");
		}
		
		// verify the required parameter 'idItem' is set
		if (idItem == null) {
			throw new ApiException(400, "Missing the required parameter 'idItem' when calling updateShippingItemStatus");
		}
		

		// create path and map variables
		String path = "/orders/{orderNumber}/shippings/{shippingCode}/item/{idItem}/status".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "orderNumber" + "\\}", apiClient.escapeString(orderNumber.toString()))
			.replaceAll("\\{" + "shippingCode" + "\\}", apiClient.escapeString(shippingCode.toString()))
			.replaceAll("\\{" + "idItem" + "\\}", apiClient.escapeString(idItem.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			"application/json"
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (StatusResource) apiClient.deserialize(response, "", StatusResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Update status of shipping.
	 * 
	 * @param orderNumber 
	 * @param shippingCode 
	 * @param body 
	 * @return StatusResource
	 */
	public StatusResource updateShippingStatus (String orderNumber, Long shippingCode, StatusResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'orderNumber' is set
		if (orderNumber == null) {
			throw new ApiException(400, "Missing the required parameter 'orderNumber' when calling updateShippingStatus");
		}
		
		// verify the required parameter 'shippingCode' is set
		if (shippingCode == null) {
			throw new ApiException(400, "Missing the required parameter 'shippingCode' when calling updateShippingStatus");
		}
		

		// create path and map variables
		String path = "/orders/{orderNumber}/shippings/{shippingCode}/status".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "orderNumber" + "\\}", apiClient.escapeString(orderNumber.toString()))
			.replaceAll("\\{" + "shippingCode" + "\\}", apiClient.escapeString(shippingCode.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

		final String[] accepts = {
			"application/json"
		};

		final String accept = apiClient.selectHeaderAccept(accepts);

		final String[] contentTypes = {
			"application/json"
		};
    
		final String contentType = apiClient.selectHeaderContentType(contentTypes);

		if(contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			
			if(hasFields)
				postBody = mp;
		
		} else {
			
		}

		try {
		
			String[] authNames = new String[] { "client_id", "access_token" };
			String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (StatusResource) apiClient.deserialize(response, "", StatusResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
