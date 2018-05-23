package org.woehlke.learn.learnneo4j.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryRepository;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger log = LoggerFactory.getLogger(StartupListener.class.getName());

    private final CategoryRepository categoryRepository;

    @Autowired
    public StartupListener(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
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
    }
}
