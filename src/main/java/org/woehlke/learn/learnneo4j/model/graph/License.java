package org.woehlke.learn.learnneo4j.model.graph;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NodeEntity
public class License {


    @Id
    @GeneratedValue
    private Long id;

    @Index(unique=true)
    @NotEmpty
    private String name;

    public License() {
    }

    public License(String license) {
        this.name = license;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
