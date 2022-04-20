package com.samsonmarikwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		MyAppConfig myAppConfig = (MyAppConfig) context.getBean("myAppConfig");
		System.out.println();
		System.out.println(myAppConfig.toString());
		
	}

}
