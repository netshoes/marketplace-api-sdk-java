package br.com.gruponetshoes.api.v1;

import br.com.gruponetshoes.api.v1.client.ApiException;
import br.com.gruponetshoes.api.v1.client.ApiClient;
import br.com.gruponetshoes.api.v1.client.Configuration;

import br.com.gruponetshoes.api.v1.model.*;

import java.util.*;

import br.com.gruponetshoes.api.v1.model.BrandListResource;
import br.com.gruponetshoes.api.v1.model.DepartmentListResource;
import br.com.gruponetshoes.api.v1.model.ColorListResource;
import br.com.gruponetshoes.api.v1.model.ProductTypeListResource;
import br.com.gruponetshoes.api.v1.model.TemplateListResource;
import br.com.gruponetshoes.api.v1.model.FlavorListResource;
import br.com.gruponetshoes.api.v1.model.SizeListResource;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class ProductsTemplatesApi {

	private ApiClient apiClient;

	public ProductsTemplatesApi() {
		this(Configuration.getDefaultApiClient());
	}

	public ProductsTemplatesApi(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	public ApiClient getApiClient() {
		return apiClient;
	}

	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}

	
	/**
	 * Get the list of brands.
	 * 
	 * @return BrandListResource
	 */
	public BrandListResource listBrands () throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/brands".replaceAll("\\{format\\}","json");

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
				return (BrandListResource) apiClient.deserialize(response, "", BrandListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of departments.
	 * 
	 * @param buId 
	 * @return DepartmentListResource
	 */
	public DepartmentListResource listDepartments (String buId) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'buId' is set
		if (buId == null) {
			throw new ApiException(400, "Missing the required parameter 'buId' when calling listDepartments");
		}
		

		// create path and map variables
		String path = "/bus/{buId}/departments".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "buId" + "\\}", apiClient.escapeString(buId.toString()));

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
				return (DepartmentListResource) apiClient.deserialize(response, "", DepartmentListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of colors.
	 * 
	 * @return ColorListResource
	 */
	public ColorListResource listColors () throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/colors".replaceAll("\\{format\\}","json");

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
				return (ColorListResource) apiClient.deserialize(response, "", ColorListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of sizes.
	 * 
	 * @param departmentCode 
	 * @return ProductTypeListResource
	 */
	public ProductTypeListResource listProductTypes (Integer departmentCode) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'departmentCode' is set
		if (departmentCode == null) {
			throw new ApiException(400, "Missing the required parameter 'departmentCode' when calling listProductTypes");
		}
		

		// create path and map variables
		String path = "/department/{departmentCode}/productType".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "departmentCode" + "\\}", apiClient.escapeString(departmentCode.toString()));

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
				return (ProductTypeListResource) apiClient.deserialize(response, "", ProductTypeListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of attributes.
	 * 
	 * @param departmentCode 
	 * @param productTypeCode 
	 * @return TemplateListResource
	 */
	public TemplateListResource listTemplates (Integer departmentCode, Integer productTypeCode) throws ApiException {
		
		Object postBody = null;
		
		// verify the required parameter 'departmentCode' is set
		if (departmentCode == null) {
			throw new ApiException(400, "Missing the required parameter 'departmentCode' when calling listTemplates");
		}
		
		// verify the required parameter 'productTypeCode' is set
		if (productTypeCode == null) {
			throw new ApiException(400, "Missing the required parameter 'productTypeCode' when calling listTemplates");
		}
		

		// create path and map variables
		String path = "/department/{departmentCode}/productType/{productTypeCode}/templates".replaceAll("\\{format\\}","json")
			.replaceAll("\\{" + "departmentCode" + "\\}", apiClient.escapeString(departmentCode.toString()))
			.replaceAll("\\{" + "productTypeCode" + "\\}", apiClient.escapeString(productTypeCode.toString()));

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
				return (TemplateListResource) apiClient.deserialize(response, "", TemplateListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of flavors.
	 * 
	 * @return FlavorListResource
	 */
	public FlavorListResource listFlavors () throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/flavors".replaceAll("\\{format\\}","json");

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
				return (FlavorListResource) apiClient.deserialize(response, "", FlavorListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
	/**
	 * Get the list of sizes.
	 * 
	 * @return SizeListResource
	 */
	public SizeListResource listSizes () throws ApiException {
		
		Object postBody = null;
		

		// create path and map variables
		String path = "/sizes".replaceAll("\\{format\\}","json");

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
				return (SizeListResource) apiClient.deserialize(response, "", SizeListResource.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			throw ex;
		}
	}
	
}
