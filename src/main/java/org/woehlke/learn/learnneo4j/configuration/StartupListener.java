package org.woehlke.learn.learnneo4j.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.woehlke.learn.learnneo4j.configuration.properties.MyAppProperties;
import org.woehlke.learn.learnneo4j.configuration.properties.OtherAppProperties;
import org.woehlke.learn.learnneo4j.configuration.properties.SpringAppProperties;
import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryRepository;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Log log = LogFactory.getLog(StartupListener.class);

    private final CategoryRepository categoryRepository;

    private final MyAppProperties myAppProperties;

    private final OtherAppProperties otherAppProperties;

    private final SpringAppProperties springAppProperties;

    @Autowired
    public StartupListener(CategoryRepository categoryRepository, MyAppProperties myAppProperties, OtherAppProperties otherAppProperties, SpringAppProperties springAppProperties) {
        this.categoryRepository = categoryRepository;
        this.myAppProperties = myAppProperties;
        this.otherAppProperties = otherAppProperties;
        this.springAppProperties = springAppProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(" =========================== ");
        log.info(" === Application Started === ");
        log.info(" =========================== ");
        this.categoryRepository.deleteAll();
        this.categoryRepository.save(new Category("www"));
        this.categoryRepository.save(new Category("qt4"));
        this.categoryRepository.save(new Category("qt5"));
        // fetch all Categories
        log.info("Categories found with findAll():");
        log.info("--------------------------------");
        for (Category category : this.categoryRepository.findAll()) {
            log.info(category.toString());
        }
        System.out.println();
        log.info("fetch an individual Category: ");
        log.info("Category found with findByCategory('www'):");
        log.info("--------------------------------");
        log.info(this.categoryRepository.findByName("www").toString());
        log.info("--------------------------------");
        log.info(myAppProperties.toString());
        log.info("--------------------------------");
        log.info(otherAppProperties.toString());
        log.info("--------------------------------");
        log.info(springAppProperties.toString());
        log.info("--------------------------------");
    }
}
