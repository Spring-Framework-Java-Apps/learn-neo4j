package org.woehlke.learn.learnneo4j;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@SpringBootApplication
@EnableSpringDataWebSupport
public class LearnNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnNeo4jApplication.class, args);
	}

}
