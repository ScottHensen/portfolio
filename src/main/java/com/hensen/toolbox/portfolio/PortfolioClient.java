package com.hensen.toolbox.portfolio;

import java.util.Collection;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PortfolioClient {

	private final RestTemplate restTemplate;

	public PortfolioClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public Collection<Portfolio> getAllPortfolios() {

		ParameterizedTypeReference<Collection<Portfolio>> ptr = 
				new ParameterizedTypeReference<Collection<Portfolio>>() {};
				
		ResponseEntity<Collection<Portfolio>> responseEntity = this.restTemplate
				.exchange("http://localhost:8080/portfolios", HttpMethod.GET, null, ptr);
		
		return responseEntity.getBody();
		
	}

}
