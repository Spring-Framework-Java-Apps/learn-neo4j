package org.woehlke.learn.learnneo4j.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.woehlke.learn.learnneo4j.configuration.properties.*;
import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryRepository;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryService;
import org.woehlke.learn.learnneo4j.model.orm.portinfo.PortinfoService;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Log log = LogFactory.getLog(StartupListener.class);

    private final CategoryRepository categoryRepository;

    private final CategoryService categoryService;

    private final PortinfoService portinfoService;

    private final MyApplicationProperties myApplicationProperties;

    private final MyHibernateProperties myHibernateProperties;

    private final MyInfoProperties myInfoProperties;

    private final MyManagementProperties myManagementProperties;

    private final MyServerProperties myServerProperties;

    private final MySpringBootProperties mySpringBootProperties;

    @Autowired
    public StartupListener(CategoryRepository categoryRepository, CategoryService categoryService, PortinfoService portinfoService, MyApplicationProperties myApplicationProperties, MyHibernateProperties myHibernateProperties, MyInfoProperties myInfoProperties, MyManagementProperties myManagementProperties, MyServerProperties myServerProperties, MySpringBootProperties mySpringBootProperties) {
        this.categoryRepository = categoryRepository;
        this.categoryService = categoryService;
        this.portinfoService = portinfoService;
        this.myApplicationProperties = myApplicationProperties;
        this.myHibernateProperties = myHibernateProperties;
        this.myInfoProperties = myInfoProperties;
        this.myManagementProperties = myManagementProperties;
        this.myServerProperties = myServerProperties;
        this.mySpringBootProperties = mySpringBootProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(" ================================ ");
        log.info(" ===== Application Started ====== ");
        log.info(" ================================ ");
        if( this.myApplicationProperties.getCreateTestDataAtStartup()){
            this.categoryRepository.deleteAll();
            this.categoryRepository.save(new Category("www"));
            this.categoryRepository.save(new Category("qt4"));
            this.categoryRepository.save(new Category("qt5"));
            // fetch all Categories
            log.info(" Categories found with findAll(): ");
            log.info(" -------------------------------- ");
            for (Category category : this.categoryService.findAll()) {
                log.info(" category : "+category.toString());
            }
            log.info(" -------------------------------- ");
            log.info(" fetch an individual Category:    ");
            log.info(" findByCategory('www'):           ");
            log.info(" -------------------------------- ");
            log.info(this.categoryService.findByName("www").toString());
            log.info(" ================================ ");
        }
        log.info(" -------------------------------- ");
        log.info("          Properties              ");
        log.info(" -------------------------------- ");
        log.info(this.myApplicationProperties.toString());
        log.info(" -------------------------------- ");
        log.info(this.myInfoProperties.toString());
        log.info(" -------------------------------- ");
        log.info(this.myManagementProperties.toString());
        log.info(" -------------------------------- ");
        log.info(this.myServerProperties.toString());
        log.info(" -------------------------------- ");
        log.info(this.myHibernateProperties.toString());
        log.info(" -------------------------------- ");
        log.info(this.mySpringBootProperties.toString());
        log.info(" -------------------------------- ");
    }
}
