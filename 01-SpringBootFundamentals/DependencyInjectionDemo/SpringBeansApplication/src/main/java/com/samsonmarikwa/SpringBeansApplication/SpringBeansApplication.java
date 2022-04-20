package com.samsonmarikwa.SpringBeansApplication;

import com.samsonmarikwa.annetmarikwa.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.samsonmarikwa.SpringBeansApplication", "com.samsonmarikwa.annetmarikwa"})
@SpringBootApplication
public class SpringBeansApplication {
	
	// Creates a bean of type User with the name userBean
	@Bean
	public User userBean() {
		return new User("Samson", "Marikwa", "sam@outlook.com");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBeansApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		// Pull the bean from the ApplicationContext and use it
		System.out.println(ctx.getBean("userBean").toString());
	}

}
