package com.springframework.guru.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springframework.guru.model.CategoryList;

@Component
public class CatetoryClient {

	private static final String CATEGORY_URI = "/categories/";
	private final ApiProperties apiProperties;
	private final RestTemplateConfig restTemplate;
	
	@Autowired
	public CatetoryClient(ApiProperties apiProperties, RestTemplateConfig restTemplate) {
		super();
		this.apiProperties = apiProperties;
		this.restTemplate = restTemplate;
	}

	private String apiUri() {
		return apiProperties.getApiUrl()+CATEGORY_URI;
	}
	
	public CategoryList getCategories(){
		return  restTemplate.getRestTemplate().getForObject(apiUri(), CategoryList.class);
	}

	
}
