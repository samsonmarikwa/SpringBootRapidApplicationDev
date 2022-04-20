package com.samsonmarikwa.springprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootProfilesApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootProfilesApp.class, args);
		
		DataSource datasource = (DataSource) applicationContext.getBean("datasource");
		System.out.println();
		System.out.println(datasource.toString());
	}

}
