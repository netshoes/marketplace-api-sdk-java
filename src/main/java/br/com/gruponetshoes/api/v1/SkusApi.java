package br.com.gruponetshoes.api.v1;

import br.com.gruponetshoes.api.v1.client.ApiException;
import br.com.gruponetshoes.api.v1.client.ApiClient;
import br.com.gruponetshoes.api.v1.client.Configuration;

import br.com.gruponetshoes.api.v1.model.*;

import java.util.*;

import br.com.gruponetshoes.api.v1.model.SkuListResource;
import br.com.gruponetshoes.api.v1.model.SkuResource;
import br.com.gruponetshoes.api.v1.model.ImageListResource;
import br.com.gruponetshoes.api.v1.model.BusinessUnitResponse;
import br.com.gruponetshoes.api.v1.model.BusinessUnitResource;
import br.com.gruponetshoes.api.v1.model.PriceList;
import br.com.gruponetshoes.api.v1.model.PriceScheduleResource;
import br.com.gruponetshoes.api.v1.model.PriceResource;
import br.com.gruponetshoes.api.v1.model.StockResponse;
import br.com.gruponetshoes.api.v1.model.StockResource;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class SkusApi {

	private ApiClient apiClient;

	public SkusApi() {
		this(Configuration.getDefaultApiClient());
	}

	public SkusApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Get the list of product skus.
	 * 
	 * @param productId 
	 * @param page 
	 * @param size 
	 * @param expand 
	 * @return SkuListResource
	 */
	public SkuListResource listProductSkus (String productId, Integer page, Integer size, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling listProductSkus");
		}
		

		// create path and map variables
		String path = "/products/{productId}/skus".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		if (page != null)
			queryParams.put("page", apiClient.parameterToString(page));
		if (size != null)
			queryParams.put("size", apiClient.parameterToString(size));
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
				return (SkuListResource) apiClient.deserialize(response, "", SkuListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Create a new sku for a product.
	 * 
	 * @param productId 
	 * @param body 
	 * @return SkuResource
	 */
	public SkuResource saveProductSku (String productId, SkuResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling saveProductSku");
		}
		

		// create path and map variables
		String path = "/products/{productId}/skus".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (SkuResource) apiClient.deserialize(response, "", SkuResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the a sku by product Id and sku Id.
	 * 
	 * @param productId 
	 * @param sku 
	 * @param expand 
	 * @return SkuResource
	 */
	public SkuResource getProductSku (String productId, String sku, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling getProductSku");
		}
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling getProductSku");
		}
		

		// create path and map variables
		String path = "/products/{productId}/skus/{sku}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()))
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

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
				return (SkuResource) apiClient.deserialize(response, "", SkuResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Update a product based on SKU.
	 * 
	 * @param productId 
	 * @param sku 
	 * @param body 
	 * @return SkuResource
	 */
	public SkuResource updateProductSku (String productId, String sku, SkuResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling updateProductSku");
		}
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling updateProductSku");
		}
		

		// create path and map variables
		String path = "/products/{productId}/skus/{sku}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()))
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

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
				return (SkuResource) apiClient.deserialize(response, "", SkuResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of sku images.
	 * 
	 * @param productId 
	 * @param sku 
	 * @return ImageListResource
	 */
	public ImageListResource listSkuImages (String productId, String sku) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling listSkuImages");
		}
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling listSkuImages");
		}
		

		// create path and map variables
		String path = "/products/{productId}/skus/{sku}/images".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()))
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

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
				return (ImageListResource) apiClient.deserialize(response, "", ImageListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get product status.
	 * 
	 * @param sku 
	 * @param buId 
	 * @return BusinessUnitResponse
	 */
	public BusinessUnitResponse getStatus (String sku, String buId) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling getStatus");
		}
		
		// verify the required parameter 'buId' is set
		if (buId == null) {
			throw new ApiException(400, "Missing the required parameter 'buId' when calling getStatus");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/bus/{buId}/status".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()))
			.replaceAll("\\{" + "buId" + "\\}", apiClient.escapeString(buId.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (BusinessUnitResponse) apiClient.deserialize(response, "", BusinessUnitResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Enable or disable sku for sale.
	 * 
	 * @param sku 
	 * @param buId 
	 * @param body 
	 * @return BusinessUnitResource
	 */
	public BusinessUnitResource updateStatus (String sku, String buId, BusinessUnitResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling updateStatus");
		}
		
		// verify the required parameter 'buId' is set
		if (buId == null) {
			throw new ApiException(400, "Missing the required parameter 'buId' when calling updateStatus");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/bus/{buId}/status".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()))
			.replaceAll("\\{" + "buId" + "\\}", apiClient.escapeString(buId.toString()));

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
				return (BusinessUnitResource) apiClient.deserialize(response, "", BusinessUnitResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get a list of price schedules.
	 * 
	 * @param sku 
	 * @return PriceList
	 */
	public PriceList listSchedules (String sku) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling listSchedules");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/priceSchedules".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

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
				return (PriceList) apiClient.deserialize(response, "", PriceList.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Save a price schedule.
	 * 
	 * @param sku 
	 * @param body 
	 * @return PriceScheduleResource
	 */
	public PriceScheduleResource saveSchedule (String sku, PriceScheduleResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling saveSchedule");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/priceSchedules".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (PriceScheduleResource) apiClient.deserialize(response, "", PriceScheduleResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get a base price.
	 * 
	 * @param sku 
	 * @return PriceResource
	 */
	public PriceResource listPrices (String sku) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling listPrices");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/prices".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

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
				return (PriceResource) apiClient.deserialize(response, "", PriceResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Save a base price.
	 * 
	 * @param sku 
	 * @param body 
	 * @return PriceResource
	 */
	public PriceResource updatePrice (String sku, PriceResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling updatePrice");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/prices".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

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
				return (PriceResource) apiClient.deserialize(response, "", PriceResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get stock info by sku.
	 * 
	 * @param sku 
	 * @return StockResponse
	 */
	public StockResponse getStock (String sku) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling getStock");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/stocks".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		

		

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
				return (StockResponse) apiClient.deserialize(response, "", StockResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Update stock quantity by sku.
	 * 
	 * @param sku 
	 * @param body 
	 * @return StockResponse
	 */
	public StockResponse updateStock (String sku, StockResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'sku' is set
		if (sku == null) {
			throw new ApiException(400, "Missing the required parameter 'sku' when calling updateStock");
		}
		

		// create path and map variables
		String path = "/skus/{sku}/stocks".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "sku" + "\\}", apiClient.escapeString(sku.toString()));

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
				return (StockResponse) apiClient.deserialize(response, "", StockResponse.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
