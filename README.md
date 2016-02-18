#SDK Java - Marketplace Grupo Netshoes

Utilizando a SDK Java, � poss�vel realizar as integra��es necess�rias com o marketplace do Grupo Netshoes de forma �gil e simples.

##Configura��o das informa��es de acesso.

Antes de utilizar os recursos da API, � necess�rio realizar as configura��es de base path e tamb�m as credenciais para acesso.
Abaixo segue o c�digo de exemplo:

```java
ApiClient apiClient = new ApiClient();
apiClient.setBasePath("http://api-sandbox.netshoes.com.br/api/v1");
apiClient.setDebugging(true);

// Alterar a chave informada com o valor de client_id da sua APP
((ApiKeyAuth)apiClient.getAuthentication("client_id")).setApiKey("Xd2UvK0niRme");

// Alterar a chave informada com o valor de access_token dispon�vel
((ApiKeyAuth)apiClient.getAuthentication("access_token")).setApiKey("Kv6INdp01EvQ");

```

##Tratamento de Erro

Tratamento de estruturas de erros recebidas nas chamadas a API:

```java
private ErrorResource deserializeError(String errorJson, ApiClient apiClient) {

	ErrorResource error = null;
	try {

		error = (ErrorResource) apiClient.deserialize(errorJson, "", ErrorResource.class);

	} catch (ApiException e) {
		logger.log(Level.WARNING, "Doesn't containt errors structure.");
	}

	return error;

}
```

##Recursos Dispon�veis

A seguir, ser� apresentada a API e exemplos com as as principais opera��es do Marketplace do Grupo Netshoes.

###Product Template API

Cont�m os recursos utilizados para aux�lio na configura��o dos produtos que ser�o enciados ao marketplace.

####Lista de Departamentos
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	DepartmentListResource departmentListResource = productsTemplatesApi.listDepartments("NS");
	System.out.println(departmentListResource);
} catch (ApiException e) {
	e.printStackTrace();
}

```

####Lista de Tipos de Produtos
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	ProductTypeListResource productTypeListResource = productsTemplatesApi.listProductTypes(10);
	System.out.println(productTypeListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

####Lista de Marcas
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	BrandListResource brandListResource = productsTemplatesApi.listBrands();
	System.out.println(brandListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

####Lista de Tamanhos
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	SizeListResource sizeListResource = productsTemplatesApi.listSizes();
	System.out.println(sizeListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

####Lista de Sabores
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	FlavorListResource flavorListResource = productsTemplatesApi.listFlavors();
	System.out.println(flavorListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

####Lista de Cores
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	ColorListResource colorListResource = productsTemplatesApi.listColors();
	System.out.println(colorListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

####Lista de Templates
```java
ProductsTemplatesApi productsTemplatesApi = new ProductsTemplatesApi(apiClient);

try {
	TemplateListResource templateListResource = productsTemplatesApi.listTemplates(10, 4);
	System.out.println(templateListResource);
} catch (ApiException e) {
	e.printStackTrace();
}
```

###Products API

Cont�m os recursos utilizados para cria��o e altera��o de produtos enviados ao marketplace.

#### Cria��o de Novos Produtos

```java
ProductResource productResource = new ProductResource();
productResource.setProductId("12345");
productResource.setDepartment("Futebol");
productResource.setProductType("Agasalhos");
productResource.setBrand("Adidas");

AttributeResource attributeResource;

attributeResource = new AttributeResource();
attributeResource.setName("SEXO");
attributeResource.setValue("M");

productResource.getAttributes().add(attributeResource);

ImageResource imageResource;
SkuResource skuResource;

skuResource = new SkuResource();
skuResource.setSku("111-0457-289-35");
skuResource.setName("Agasalho Teste 01 Adidas");
skuResource.setDescription("Agasalho, Branco, Adidas");
skuResource.setColor("Branco");
skuResource.setGender("Homem");
skuResource.setSize("G");
skuResource.setEanIsbn("16598198");

imageResource = new ImageResource();
imageResource.setUrl("http://7-themes.com/data_images/out/42/6914793-tropical-beach-images.jpg");
skuResource.getImages().add(imageResource);

skuResource.setVideo("http://video/video1");
skuResource.setHeight(20D);
skuResource.setWidth(10D);
skuResource.setDepth(44D);
skuResource.setWeight(65D);

productResource.getSkus().add(skuResource);

skuResource = new SkuResource();
skuResource.setSku("111-0457-289-36");
skuResource.setName("Agasalho Teste 01 Adidas");
skuResource.setDescription("Agasalho, Branco, Adidas");
skuResource.setColor("Branco");
skuResource.setGender("Homem");
skuResource.setSize("M");
skuResource.setEanIsbn("16598198");

imageResource = new ImageResource();
imageResource.setUrl("http://7-themes.com/data_images/out/42/6914793-tropical-beach-images.jpg");
skuResource.getImages().add(imageResource);

skuResource.setVideo("http://video/video1");
skuResource.setHeight(20D);
skuResource.setWidth(10D);
skuResource.setDepth(44D);
skuResource.setWeight(65D);		

productResource.getSkus().add(skuResource);

ProductsApi productsApi = new ProductsApi(apiClient);
try {
	ProductResource productResponse = productsApi.saveProduct(productResource);
	System.out.println(productResponse);
} catch (ApiException e) {
	ErrorResource errorResource = deserializeError(e.getResponseBody(), apiClient);
	if (errorResource == null) {
		e.printStackTrace();
	} else {
		System.err.println(errorResource);
	}
}
```

###SKUs API

Cont�m os recursos utilizados para checagem de SKUs relacionados aos produtos submetidos ao marketplace.

####Verifica��o do Status de Sincroniza��o Com o Marketplace

Ap�s fazer o envio dos seus produtos no exemplo anterior, voc� poder� fazer a verifica��o de sincroniza��o com o marketplace:

```java
SkusApi skusApi = new SkusApi(apiClient);

try {
	BusinessUnitResponse businessUnitResponse = skusApi.getStatus("111-0457-289-35", "NS");
	System.out.println(businessUnitResponse);
} catch (ApiException e) {
	e.printStackTrace();
}
```

Isso indica que seus produtos j� podem ser comercializados no portal de venda.
Mas antes, � necess�rio realizar os procedimentos de atualiza��o de estoque, pre�o e status, conforme exibido nos exemploas abaixo:

####Configura��o de Estoque

```Java
SkusApi skusApi = new SkusApi(apiClient);

StockResource stockResource = new StockResource();
stockResource.setAvailable(new Long(20L));
stockResource.setCountry("BR");

try {
	StockResponse stockResponse = skusApi.updateStock("111-0457-289-35", stockResource);
	System.out.println(stockResponse);
} catch (ApiException e) {
	System.out.println(e.getResponseBody());
	e.printStackTrace();
}
```

####Configura��o de Pre�o

```java
SkusApi skusApi = new SkusApi(apiClient);

PriceResource priceResource = new PriceResource();
priceResource.setPrice(new Double(100D));

try {
	PriceResource priceResponse = skusApi.updatePrice("111-0457-289-35", priceResource);
	System.out.println(priceResponse);
} catch (ApiException e) {
	System.out.println(e.getResponseBody());
	e.printStackTrace();
}
```

####Ativa��o do Produto para Venda

```java
SkusApi skusApi = new SkusApi(apiClient);

BusinessUnitResource businessUnitResource = new BusinessUnitResource();
businessUnitResource.setActive(Boolean.TRUE);

try {
	BusinessUnitResource businessUnitResponse = skusApi.updateStatus("111-0457-289-35", "NS", businessUnitResource);
	System.out.println(businessUnitResponse);
} catch (ApiException e) {
	System.out.println(e.getResponseBody());
	e.printStackTrace();
}
```

###Orders API

Agora que os produtos j� est�o dispon�veis para venda, � poss�vel fazer a consulta de ordens geradas nos portais de venda Netshoes e Zattini.

```java
OrdersApi ordersApi = new OrdersApi(apiClient);

try {
	
	OrderListResource orderListResource = ordersApi.listOrders(0, 20, null,
			new Date((new Date()).getTime() - 86400000L), new Date(), 
			OrderResource.StatusEnum.Faturado.toString(),
			OrderResource.OrderTypeEnum.Venda.toString());
	
	System.out.println(orderListResource);

} catch (ApiException e) {
	ErrorResource errorResource = deserializeError(e.getResponseBody(), apiClient);
	if (errorResource == null) {
		e.printStackTrace();
	} else {
		System.err.println(errorResource);
	}
}
```
