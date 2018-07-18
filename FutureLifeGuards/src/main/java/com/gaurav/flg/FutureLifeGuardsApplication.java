package com.gaurav.flg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.gaurav.flg"})
public class FutureLifeGuardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutureLifeGuardsApplication.class, args);
	}
}
