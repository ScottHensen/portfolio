package com.hensen.toolbox.portfolio;

import java.util.Collection;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest		// this starts up the whole application context; could use a test slice
public class PortfolioClientTest {

	@Autowired
	PortfolioClient portfolioClient;
	
	@Test
	public void shouldReturnAllPortfolios() {
		
		Collection<Portfolio> collection = portfolioClient.getAllPortfolios();
		//Assertions.assertThat(collection).isNotEmpty();
		//TODO:  add the contract stubrunner and actually perform a test here
	}
}
