package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// implements CommandLineRunner :can override run methrd

@SpringBootApplication
public class DemoFirstApplication{

	@Autowired
	private ArticleRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoFirstApplication.class, args);
	}
	

	public void run(String... args) throws Exception {
		repository.save( new Article("title4","3","zzz","www.baidu.com",5, 1));
		
		System.out.println("Article found with findAll():");
		System.out.println("-------------------------------");
		for (Article article : repository.findAll()) {
			System.out.println(article);
		}
		System.out.println();
	}
}
