package com.springframework.guru;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import com.springframework.guru.conf.CustomerClient;
import com.springframework.guru.model.Customer;

@SpringBootTest
class CustomerClientTest {

	@Autowired
	CustomerClient customerClient;
	
	@Test
	void postCustomer() {
		Customer customer = new Customer("John", "Cena");
		Customer c = customerClient.postCustomer(customer);
		Assert.isTrue(c.equals(customer),"No Equals");
	}


	@Test
	void putCustomer() {
		Customer customer = new Customer("John", "Cena");
		customerClient.updateCustomer(customer, (long) 1);
	}
	
	@Test
	void deleteCustomer() {
		customerClient.deleteCustomer((long) 1);
	}
}
