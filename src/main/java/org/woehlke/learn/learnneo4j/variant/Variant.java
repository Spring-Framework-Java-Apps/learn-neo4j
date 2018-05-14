package org.woehlke.learn.learnneo4j.variant;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Variant {

    @Id
    @GeneratedValue
    private Long id;

    private String variant;
    
    private String description;

    public Variant() {
    }

    public Variant(String variant, String description) {
        this.variant = variant;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "id=" + id +
                ", variant='" + variant + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
