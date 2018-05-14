package org.woehlke.learn.learnneo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Setter
@Getter
@NodeEntity
public class License {


    @Id
    @GeneratedValue
    private Long id;
    
    private String license;

    
    public License() {
    }

    public License(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "License{" +
                "license='" + license + '\'' +
                '}';
    }
}
