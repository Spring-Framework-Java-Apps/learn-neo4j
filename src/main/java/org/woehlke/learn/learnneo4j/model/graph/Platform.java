package org.woehlke.learn.learnneo4j.model.graph;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NodeEntity
public class Platform {

    @Id
    @GeneratedValue
    private Long id;

    @Index(unique=true)
    @NotEmpty
    private String name;

    public Platform() {
    }

    public Platform(String platform) {
        this.name = platform;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
