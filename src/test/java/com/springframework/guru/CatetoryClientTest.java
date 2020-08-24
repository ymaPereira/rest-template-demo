package com.springframework.guru;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.springframework.guru.conf.CatetoryClient;

@SpringBootTest
class CatetoryClientTest {

	@Autowired
	CatetoryClient categoryClient;
	
	@Test
	void test() {
		categoryClient.getCategories().getCategories().stream().forEach(System.out::println);
	}

}
