package com.springframework.guru.conf;

import org.springframework.stereotype.Component;
import com.springframework.guru.model.Customer;

@Component
public class CustomerClient {

	private static final String CUSTOMER_URI = "/customers/";
	private final RestTemplateConfig restTemplate;
	private final ApiProperties apiProperties;
	
	public CustomerClient(RestTemplateConfig restTemplate, ApiProperties apiProperties) {
		super();
		this.restTemplate = restTemplate;
		this.apiProperties = apiProperties;
	}

	private String apiUri() {
		return apiProperties.getApiUrl()+CUSTOMER_URI;
	}
	
	public Customer postCustomer(Customer customer) {
		return restTemplate.getRestTemplate().postForObject(apiUri(), customer, Customer.class);
	}
	
	public void updateCustomer(Customer customer, Long id) {
		restTemplate.getRestTemplate().put(apiUri()+id, customer);
	}
	
	public void deleteCustomer(Long id) {
		restTemplate.getRestTemplate().delete(apiUri()+id);
	}
}
