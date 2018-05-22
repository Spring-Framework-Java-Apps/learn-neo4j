package org.woehlke.learn.learnneo4j.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private static Logger log = LoggerFactory.getLogger(StartupListener.class.getName());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(" =========================== ");
        log.info(" === Application Started === ");
        log.info(" =========================== ");
    }
}
