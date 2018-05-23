package org.woehlke.learn.learnneo4j.configuration.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableSpringDataWebSupport
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/welcome");
        registry.addViewController("/adm").setViewName("redirect:/adm/overview");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/*").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/icon/*").addResourceLocations("classpath:/static/icon/");
        registry.addResourceHandler("/icon/**").addResourceLocations("classpath:/static/icon/");
        registry.addResourceHandler("/img/*").addResourceLocations("classpath:/static/img/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
        registry.addResourceHandler("/js/*").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/map-icons/*").addResourceLocations("classpath:/static/map-icons/");
        registry.addResourceHandler("/map-icons/**").addResourceLocations("classpath:/static/map-icons/");
        registry.addResourceHandler("/webjars/*").addResourceLocations("/webjars/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("/webjars/");
    }

    @Bean
    MethodValidationPostProcessor methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}