package org.woehlke.learn.learnneo4j.components.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Portinfo {

    @Id
    @GeneratedValue
    private Long id;
    private String port;
    private String info;
    private String rdeps;
    private String dependents;
    private String deps;
    private String variants;

}
