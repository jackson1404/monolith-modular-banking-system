package com.jackson.testing_monolith_single_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TestingMonolithSingleMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingMonolithSingleMavenApplication.class, args);
	}

}
