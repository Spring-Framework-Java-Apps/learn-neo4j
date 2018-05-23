package org.woehlke.learn.learnneo4j.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Component
@Validated
@ConfigurationProperties(prefix = "management")
public class MyManagementProperties {

    @NotNull
    private String address;

    @NotNull
    private String contextPath;

    @Valid
    private Security security = new Security();

    @Validated
    public static class Security {

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
            return "Security{" +
                "enabled=" + enabled +
                '}';
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "MyManagementProperties{" +
            "address='" + address + '\'' +
            ", contextPath='" + contextPath + '\'' +
            ", security=" + security +
            '}';
    }
}
