package com.example.demo;

import com.example.demo.model.HelloDE;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner init(HelloRepository helloRepository){
		return args -> {
			Stream.of("Nombre1","Nombre2","Nombre3").forEach(firstName -> {
				HelloDE helloDE = new HelloDE(null,firstName, "Elapellido de " + firstName);
				helloRepository.save(helloDE);
			});
			helloRepository.findAll().forEach(System.out::println);
		};
	}
}
