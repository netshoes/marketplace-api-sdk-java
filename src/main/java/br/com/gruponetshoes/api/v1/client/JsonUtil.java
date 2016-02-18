package br.com.gruponetshoes.api.v1.client;

import com.fasterxml.jackson.databind.*;

import com.fasterxml.jackson.datatype.joda.*;

public class JsonUtil {

	public static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.registerModule(new JodaModule());
	}

	public static ObjectMapper getJsonMapper() {
		return mapper;
	}
	
}
