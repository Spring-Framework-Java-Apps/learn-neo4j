package org.woehlke.learn.learnneo4j.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Component
@Validated
@ConfigurationProperties(prefix = "hibernate")
public class MyHibernateProperties {

    @NotNull
    private String dialect;

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    @Override
    public String toString() {
        return "MyHibernateProperties{" +
            "dialect='" + dialect + '\'' +
            '}';
    }
}
