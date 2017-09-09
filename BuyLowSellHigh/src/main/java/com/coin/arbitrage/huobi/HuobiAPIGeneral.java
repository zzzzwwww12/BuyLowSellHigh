/**
 * 
 */
package com.coin.arbitrage.huobi;

import static com.coin.arbitrage.huobi.util.HuobiConstants.BTC;
import static com.coin.arbitrage.huobi.util.HuobiConstants.HISTORY_MIDDLE;
import static com.coin.arbitrage.huobi.util.HuobiConstants.HISTORY_PREFIX;
import static com.coin.arbitrage.huobi.util.HuobiConstants.HISTORY_SUFFIX;
import static com.coin.arbitrage.huobi.util.HuobiConstants.RECORD_COUNT;
import static com.coin.arbitrage.huobi.util.HuobiConstants._1_MINUTE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.coin.arbitrage.huobi.domain.HistoryDetails;


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
			HistoryDetails details = restTemplate.getForObject(
					HISTORY_PREFIX + BTC + HISTORY_MIDDLE + _1_MINUTE + HISTORY_SUFFIX + RECORD_COUNT + "1" + "?Content-Type:application/json", HistoryDetails.class);
			log.info(details.toString());
		};
	}
}
