package com.qinkuai.msdzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGatewayApplication.class, args);
	}

}
