package br.com.gruponetshoes.api.v1;

import br.com.gruponetshoes.api.v1.client.ApiException;
import br.com.gruponetshoes.api.v1.client.ApiClient;
import br.com.gruponetshoes.api.v1.client.Configuration;

import br.com.gruponetshoes.api.v1.model.*;

import java.util.*;

import br.com.gruponetshoes.api.v1.model.ProductListResource;
import br.com.gruponetshoes.api.v1.model.ProductResource;
import br.com.gruponetshoes.api.v1.model.AttributeListResource;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class ProductsApi {

	private ApiClient apiClient;

	public ProductsApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ProductsApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Get the list of products.
	 * 
	 * @param page 
	 * @param size 
	 * @param expand 
	 * @return ProductListResource
	 */
	public ProductListResource listProducts (Integer page, Integer size, String expand) throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/products".replaceAll("\\{format\\}","json");

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
				return (ProductListResource) apiClient.deserialize(response, "", ProductListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Create a new product.
	 * 
	 * @param body 
	 * @return ProductResource
	 */
	public ProductResource saveProduct (ProductResource body) throws ApiException {
		
		Object postBody = body;
		

		// create path and map variables
		String path = "/products".replaceAll("\\{format\\}","json");

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
				return (ProductResource) apiClient.deserialize(response, "", ProductResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the product by product id.
	 * 
	 * @param productId 
	 * @param expand 
	 * @return ProductResource
	 */
	public ProductResource getProduct (String productId, String expand) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling getProduct");
		}
		

		// create path and map variables
		String path = "/products/{productId}".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()));

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
				return (ProductResource) apiClient.deserialize(response, "", ProductResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Update the product.
	 * 
	 * @param productId 
	 * @param body 
	 * @return ProductResource
	 */
	public ProductResource updateProduct (String productId, ProductResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling updateProduct");
		}
		

		// create path and map variables
		String path = "/products/{productId}".replaceAll("\\{format\\}","json")
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
			String response = apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ProductResource) apiClient.deserialize(response, "", ProductResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Partialy update the product.
	 * 
	 * @param productId 
	 * @param body 
	 * @return ProductResource
	 */
	public ProductResource patchProduct (String productId, ProductResource body) throws ApiException {
		
		Object postBody = body;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling patchProduct");
		}
		

		// create path and map variables
		String path = "/products/{productId}".replaceAll("\\{format\\}","json")
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
			String response = apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
			
			if(response != null) {
				return (ProductResource) apiClient.deserialize(response, "", ProductResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of product attributes.
	 * 
	 * @param productId 
	 * @return AttributeListResource
	 */
	public AttributeListResource listProductAttributes (String productId) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'productId' is set
		if (productId == null) {
			throw new ApiException(400, "Missing the required parameter 'productId' when calling listProductAttributes");
		}
		

		// create path and map variables
		String path = "/products/{productId}/attributes".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "productId" + "\\}", apiClient.escapeString(productId.toString()));

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
				return (AttributeListResource) apiClient.deserialize(response, "", AttributeListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
