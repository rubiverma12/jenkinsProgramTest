package com.example.basedomains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//testing for deployment using jenkins
@SpringBootApplication
public class BaseDomainsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseDomainsApplication.class, args);
		
		System.out.println("Project build");
	}

}
