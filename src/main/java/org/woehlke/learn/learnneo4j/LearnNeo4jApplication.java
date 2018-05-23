package org.woehlke.learn.learnneo4j;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.woehlke.learn.learnneo4j.model.Category;
import org.woehlke.learn.learnneo4j.model.category.CategoryRepository;
*/
/*
@ComponentScan({"org.woehlke.learn.learnneo4j.model","org.woehlke.learn.learnneo4j.components"})
@EnableJpaRepositories({"org.woehlke.learn.learnneo4j.components.db"})
@EnableNeo4jRepositories({"org.woehlke.learn.learnneo4j.model","org.woehlke.learn.learnneo4j.components"})
@EnableAutoConfiguration
@EnableWebMvc
@EnableTransactionManagement
@EnableSpringDataWebSupport
*/
@SpringBootApplication
public class LearnNeo4jApplication {


	public static void main(String[] args) {
		SpringApplication.run(LearnNeo4jApplication.class, args);
	}

}
