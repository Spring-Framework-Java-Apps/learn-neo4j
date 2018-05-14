package org.woehlke.learn.learnneo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Setter
@Getter
@NodeEntity
public class Maintainer {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String gitHub;

    public Maintainer() {
    }

    public Maintainer(String email, String gitHub) {
        this.email = email;
        this.gitHub = gitHub;
    }

    @Override
    public String toString() {
        return "Maintainer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", gitHub='" + gitHub + '\'' +
                '}';
    }
}
