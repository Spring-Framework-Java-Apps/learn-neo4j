package org.woehlke.learn.learnneo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@NodeEntity
public class Maintainer {

    @Id
    @GeneratedValue
    private Long id;

    @Index(unique=true)
    @Email
    @NotEmpty
    private String name;

    private String gitHub;

    public Maintainer() {
    }

    public Maintainer(String email, String gitHub) {
        this.name = email;
        this.gitHub = gitHub;
    }

    @Override
    public String toString() {
        return "Maintainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gitHub='" + gitHub + '\'' +
                '}';
    }
}
