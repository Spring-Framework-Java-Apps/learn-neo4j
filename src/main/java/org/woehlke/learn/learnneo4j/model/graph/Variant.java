package org.woehlke.learn.learnneo4j.model.graph;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@NodeEntity
public class Variant {

    @Id
    @GeneratedValue
    private Long id;

    @Index(unique=true)
    @NotEmpty
    private String name;

    private String description;

    public Variant() {
    }

    public Variant(String variant, String description) {
        this.name = variant;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
