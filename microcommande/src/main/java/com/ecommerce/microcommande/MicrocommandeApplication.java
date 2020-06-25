package com.ecommerce.microcommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MicrocommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocommandeApplication.class, args);
	}
}
