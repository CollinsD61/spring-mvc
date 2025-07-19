package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext huyhoang = SpringApplication.run(DemoApplication.class, args);
		for (String s : huyhoang.getBeanDefinitionNames()) {
			System.out.println(s);

		}
	}

}
