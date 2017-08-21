package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class MyzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyzuulApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
	
	@Bean
	public SimpleRouteFilter simpleRouteFilter() {
		return new SimpleRouteFilter();
	}
}
