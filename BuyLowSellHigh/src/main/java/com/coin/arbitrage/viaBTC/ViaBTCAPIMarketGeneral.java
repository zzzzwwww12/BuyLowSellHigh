/**
 * 
 */
package com.coin.arbitrage.viaBTC;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.coin.arbitrage.viaBTC.domain.MarketResponse;


@SpringBootApplication
public class ViaBTCAPIMarketGeneral {

	private static final Logger log = LoggerFactory.getLogger(ViaBTCAPIMarketGeneral.class);

	public static void main(String args[]) {
		SpringApplication.run(ViaBTCAPIMarketGeneral.class);
		
		System.out.println("All steps run complete");
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	//TODO need to understand the mechanism
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			MarketResponse response = restTemplate.getForObject(
					"https://api.viabtc.com/v1/market/ticker?market=BTCCNY", MarketResponse.class);
			log.info(response.toString());
		};
	}
}
