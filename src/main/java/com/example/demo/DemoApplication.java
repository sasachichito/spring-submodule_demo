package com.example.demo;

import demo.Library;
import org.apache.olingo.client.api.ODataClient;
import org.apache.olingo.client.core.ODataClientFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Library getLibrary(ODataClient oDataClient) {
		return new Library(oDataClient);
	}

	@Bean
	public ODataClient getODataClient() {
		return ODataClientFactory.getClient();
	}
}
