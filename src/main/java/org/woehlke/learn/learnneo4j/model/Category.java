package org.woehlke.learn.learnneo4j.model;

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
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    @Index(unique=true)
    @NotEmpty
    private String name;

    public Category() {
    }

    public Category(String category) {
        this.name = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
