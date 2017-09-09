/**
 * 
 */
package com.coin.arbitrage.huobi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.coin.arbitrage.huobi.domain.Kline;
import com.coin.arbitrage.huobi.domain.Response;


@SpringBootApplication
public class HuobiAPIGeneral {

	private static final Logger log = LoggerFactory.getLogger(HuobiAPIGeneral.class);

	public static void main(String args[]) {
		SpringApplication.run(HuobiAPIGeneral.class);
		
		System.out.println("All steps run complete");
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			@SuppressWarnings("unchecked")
			Response<Kline> response = restTemplate.getForObject(
					"https://be.huobi.com/market/history/kline?period=1day&size=200&symbol=ethcny", Response.class);
			log.info(response.toString());
		};
	}
}
