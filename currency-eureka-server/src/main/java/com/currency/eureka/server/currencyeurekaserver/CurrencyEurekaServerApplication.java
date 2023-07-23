package com.currency.eureka.server.currencyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CurrencyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyEurekaServerApplication.class, args);
	}

}
