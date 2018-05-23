package org.woehlke.learn.learnneo4j.configuration.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Component
@Validated
@ConfigurationProperties(prefix="spring")
public class SpringAppProperties {

    @NotNull
    private String profiles;

    @Valid
    private Datasource datasource = new Datasource();

    @Valid
    private Jpa jpa = new Jpa();

    @Valid
    private Session session = new Session();

    @Valid
    private Template template = new Template();

    @Valid
    private Thymeleaf thymeleaf = new Thymeleaf();

    @Validated
    public static class Datasource {

        @NotNull
        private String url;

        @NotNull
        private String driverClassName;

        @NotNull
        private String platform;

        @NotNull
        private Boolean continueOnError;

        @NotNull
        private String schema;

        @NotNull
        private Boolean generateUniqueName;

        @NotNull
        private String name;

        @NotNull
        private String type;

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getContinueOnError() {
            return continueOnError;
        }

        public void setContinueOnError(Boolean continueOnError) {
            this.continueOnError = continueOnError;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

        public Boolean getGenerateUniqueName() {
            return generateUniqueName;
        }

        public void setGenerateUniqueName(Boolean generateUniqueName) {
            this.generateUniqueName = generateUniqueName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Datasource{" +
                "url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", platform='" + platform + '\'' +
                ", continueOnError=" + continueOnError +
                ", schema='" + schema + '\'' +
                ", generateUniqueName=" + generateUniqueName +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
        }
    }

    @Validated
    public static class Jpa {

        @NotNull
        private Boolean generateDdl;

        @NotNull
        private Boolean showSql;

        @NotNull
        private Boolean openInView;

        @Valid
        private Hibernate hibernate = new Hibernate();

        @Valid
        private Properties properties = new Properties();

        @Validated
        public static class Hibernate {

            @NotNull
            private String ddlAuto;

            public String getDdlAuto() {
                return ddlAuto;
            }

            public void setDdlAuto(String ddlAuto) {
                this.ddlAuto = ddlAuto;
            }
        }

        @Validated
        public static class Properties {

            @Valid
            private Hibernate hibernate = new Hibernate();

            @Validated
            public static class Hibernate {

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
                    return "Hibernate{" +
                        "dialect='" + dialect + '\'' +
                        '}';
                }
            }

            public Hibernate getHibernate() {
                return hibernate;
            }

            public void setHibernate(Hibernate hibernate) {
                this.hibernate = hibernate;
            }

            @Override
            public String toString() {
                return "Properties{" +
                    "hibernate=" + hibernate +
                    '}';
            }
        }

        public Hibernate getHibernate() {
            return hibernate;
        }

        public void setHibernate(Hibernate hibernate) {
            this.hibernate = hibernate;
        }

        public Properties getProperties() {
            return properties;
        }

        public void setProperties(Properties properties) {
            this.properties = properties;
        }

        public Boolean getGenerateDdl() {
            return generateDdl;
        }

        public void setGenerateDdl(Boolean generateDdl) {
            this.generateDdl = generateDdl;
        }

        public Boolean getShowSql() {
            return showSql;
        }

        public void setShowSql(Boolean showSql) {
            this.showSql = showSql;
        }

        public Boolean getOpenInView() {
            return openInView;
        }

        public void setOpenInView(Boolean openInView) {
            this.openInView = openInView;
        }

        @Override
        public String toString() {
            return "Jpa{" +
                "generateDdl=" + generateDdl +
                ", showSql=" + showSql +
                ", openInView=" + openInView +
                ", hibernate=" + hibernate +
                ", properties=" + properties +
                '}';
        }
    }

    @Validated
    public static class Session {

        @NotNull
        private String storeType;

        @Valid
        private Jdbc jdbc = new Jdbc();

        @Validated
        public static class Jdbc {

            @Valid
            private Initializer initializer = new Initializer();

            @Validated
            public static class Initializer {

                @NotNull
                private Boolean enabled;

                public Boolean getEnabled() {
                    return enabled;
                }

                public void setEnabled(Boolean enabled) {
                    this.enabled = enabled;
                }

                @Override
                public String toString() {
                    return "Initializer{" +
                        "enabled=" + enabled +
                        '}';
                }
            }

            public Initializer getInitializer() {
                return initializer;
            }

            public void setInitializer(Initializer initializer) {
                this.initializer = initializer;
            }

            @Override
            public String toString() {
                return "Jdbc{" +
                    "initializer=" + initializer +
                    '}';
            }
        }

        public String getStoreType() {
            return storeType;
        }

        public void setStoreType(String storeType) {
            this.storeType = storeType;
        }

        public Jdbc getJdbc() {
            return jdbc;
        }

        public void setJdbc(Jdbc jdbc) {
            this.jdbc = jdbc;
        }

        @Override
        public String toString() {
            return "Session{" +
                "storeType='" + storeType + '\'' +
                ", jdbc=" + jdbc +
                '}';
        }
    }

    @Validated
    public static class Template {

        @NotNull
        private Boolean cache;

        public Boolean getCache() {
            return cache;
        }

        public void setCache(Boolean cache) {
            this.cache = cache;
        }

        @Override
        public String toString() {
            return "Template{" +
                "cache=" + cache +
                '}';
        }
    }

    @Validated
    public static class Thymeleaf {

        @NotNull
        private Boolean cache;

        public Boolean getCache() {
            return cache;
        }

        public void setCache(Boolean cache) {
            this.cache = cache;
        }

        @Override
        public String toString() {
            return "Thymeleaf{" +
                "cache=" + cache +
                '}';
        }
    }

    public Datasource getDatasource() {
        return datasource;
    }

    public void setDatasource(Datasource datasource) {
        this.datasource = datasource;
    }

    public Jpa getJpa() {
        return jpa;
    }

    public void setJpa(Jpa jpa) {
        this.jpa = jpa;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Thymeleaf getThymeleaf() {
        return thymeleaf;
    }

    public void setThymeleaf(Thymeleaf thymeleaf) {
        this.thymeleaf = thymeleaf;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }


    @Override
    public String toString() {
        return "SpringAppProperties{" +
            "profiles='" + profiles + '\'' +
            ", datasource=" + datasource +
            ", jpa=" + jpa +
            ", session=" + session +
            ", template=" + template +
            ", thymeleaf=" + thymeleaf +
            '}';
    }

    public String toString2() {
        List<String> outputLines = new ArrayList<>();
        outputLines.add("spring.profiles =                                     "+this.getProfiles());
        outputLines.add("spring.template.cache =                               "+this.getTemplate().getCache());
        outputLines.add("spring.thymeleaf.cache =                              "+this.getThymeleaf().getCache());
        outputLines.add("spring.jpa.open-in-view =                             "+this.getJpa().getOpenInView());
        outputLines.add("spring.jpa.hibernate.ddl-auto =                       "+this.getJpa().getHibernate().getDdlAuto());
        outputLines.add("spring.jpa.properties.hibernate.dialect =             "+this.getJpa().getProperties().getHibernate().getDialect());
        outputLines.add("spring.jpa.show-sql =                                 "+this.getJpa().getShowSql());
        outputLines.add("spring.session.store-type =                           "+this.getSession().getStoreType());
        outputLines.add("spring.session.jdbc.initializer.enabled =             "+this.getSession().getJdbc().getInitializer().getEnabled());
        outputLines.add("spring.datasource.driverClassName =                   "+this.getDatasource().getDriverClassName());
        outputLines.add("spring.datasource.platform =                          "+this.getDatasource().getPlatform());
        outputLines.add("spring.datasource.continue-on-error =                 "+this.getDatasource().getContinueOnError());
        outputLines.add("spring.datasource.schema =                            "+this.getDatasource().getSchema());
        outputLines.add("spring.datasource.url =                               "+this.getDatasource().getUrl());
        StringBuffer sb = new StringBuffer();
        for(String outputLine:outputLines){
            sb.append(" ");
            sb.append(outputLine);
            sb.append("\n");
        }
        return sb.toString();
    }
}
