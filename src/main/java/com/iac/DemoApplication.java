package com.iac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.iac.controller.AanbiedingController;
import com.iac.controller.AccountController;
//@SpringBootApplication(scanBasePackages={
//		"com.iac.controller", "com.iac.model","com.iac.repository","com.iac.service"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
