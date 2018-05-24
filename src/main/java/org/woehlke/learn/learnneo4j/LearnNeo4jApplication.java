package org.woehlke.learn.learnneo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.woehlke.learn.learnneo4j.configuration.MyApplicationProperties;
import org.woehlke.learn.learnneo4j.configuration.properties.*;

@SpringBootApplication
@EnableConfigurationProperties({
    MyApplicationProperties.class,
    MyHibernateProperties.class,
    MyInfoProperties.class,
    MyManagementProperties.class,
    MyServerProperties.class,
    MySpringBootProperties.class
})
public class LearnNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnNeo4jApplication.class, args);
	}
}
