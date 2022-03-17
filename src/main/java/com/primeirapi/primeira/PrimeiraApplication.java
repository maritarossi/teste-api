package com.primeirapi.primeira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PrimeiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiraApplication.class, args);
	}

}
