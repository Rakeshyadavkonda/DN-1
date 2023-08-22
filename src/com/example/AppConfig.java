package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component(value = "com.example") // Replace with your package name
public class AppConfig {

	
	  @Bean
	  public Movie movieBean() {
	  
	  return new Movie(); }
	 

}
