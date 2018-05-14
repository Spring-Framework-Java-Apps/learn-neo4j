package org.woehlke.learn.learnneo4j.category;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    
    private String category;

    public Category() {
    }

    public Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
