package com.jpa;

import com.github.javafaker.Faker;
import com.jpa.entity.Author;
import com.jpa.entity.Video;
import com.jpa.repo.AuthorRepo;
import com.jpa.repo.VideoRepo;
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
	
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepo authorRepo,
			VideoRepo videoRepo
	){
		return args -> {
			for (int i = 0; i < 50; i++){
				Faker faker =new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(String.valueOf(faker.number().numberBetween(15, 45)))
						.email(faker.name().username() + "@gmail.com")
						.build();
				authorRepo.save(author);
		}
		
//			update author with ID =2
			var author = Author.builder()
					.id(2l)
					.firstName("Ramesh")
					.lastName("Poudel")
					.age(String.valueOf(23))
					.email("ramesh@gmail.com")
					.build();
					authorRepo.save(author);
			
			
			
			
			/*var video = Video.builder()
					.name("Nepal")
					.length(5l)
					.build();
			videoRepo.save(video);*/
			
			
//			update all author age
//			authorRepo.updateAuthorsAge(99);
			
//			// update Author a set a.age=22 where a.id =1
			authorRepo.updateAuthor(70, 1l);

		};
	}
}
