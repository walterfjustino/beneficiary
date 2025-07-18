package com.management.beneficiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.management.beneficiary.*")
@SpringBootApplication
public class BeneficiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficiaryApplication.class, args);
	}

}
