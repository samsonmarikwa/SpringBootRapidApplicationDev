package com.samsonmarikwa.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {
   
   @Bean("datasource")
   @Profile("development")
   DataSource devDataSource() {
      return new DataSource("my-development-url", 9999);
   }
   
   @Bean("datasource")
   @Profile("production")
   DataSource prodDataSource() {
      return new DataSource("my-production-url", 9999);
   }
}
