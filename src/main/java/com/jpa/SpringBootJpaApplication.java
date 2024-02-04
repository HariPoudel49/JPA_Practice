package com.jpa;

import com.jpa.entity.Author;
import com.jpa.repo.AuthorRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class SpringBootJpaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepo authorRepo
	){
		return args -> {
		var author=Author.builder()
				.firstname("Smith")
				.lastName("poudel")
				.age(String.valueOf(22))
				.email("smith@gmail.com")
				.build();
		authorRepo.save(author);
		};
	}*/
}
