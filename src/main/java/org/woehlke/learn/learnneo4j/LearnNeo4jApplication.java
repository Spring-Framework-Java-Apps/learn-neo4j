package org.woehlke.learn.learnneo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.woehlke.learn.learnneo4j.model.Category;
import org.woehlke.learn.learnneo4j.model.category.CategoryRepository;

@EnableNeo4jRepositories({"org.woehlke.learn.learnneo4j.model","org.woehlke.learn.learnneo4j.components"})
@EnableTransactionManagement
@ComponentScan({"org.woehlke.learn.learnneo4j.model","org.woehlke.learn.learnneo4j.model"})
@SpringBootApplication
public class LearnNeo4jApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(LearnNeo4jApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.categoryRepository.deleteAll();
		this.categoryRepository.save(new Category("www"));
		this.categoryRepository.save(new Category("qt4"));
		this.categoryRepository.save(new Category("qt5"));
		// fetch all Categories
		System.out.println("Categories found with findAll():");
		System.out.println("--------------------------------");
		for (Category category : this.categoryRepository.findAll()) {
			System.out.println(category);
		}
		System.out.println();
		// fetch an individual Category
		System.out.println("Category found with findByCategory('www'):");
		System.out.println("--------------------------------");
		System.out.println(this.categoryRepository.findByName("www"));
	}
}
