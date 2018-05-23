package org.woehlke.learn.learnneo4j.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@Component
@Validated
@ConfigurationProperties(prefix="info.application")
public class MyInfoProperties {

    @NotNull
    private String groupId;

    @NotNull
    private String artifactId;

    @NotNull
    private String version;

    @NotNull
    private String name;

    @NotNull
    private String description;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyInfoProperties{" +
            "groupId='" + groupId + '\'' +
            ", artifactId='" + artifactId + '\'' +
            ", version='" + version + '\'' +
            ", name='" + name + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
