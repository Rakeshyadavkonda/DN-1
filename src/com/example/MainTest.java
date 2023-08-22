package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Movie movie = context.getBean(Movie.class);
        System.out.println(movie);
        
        context.close();

	}

}
