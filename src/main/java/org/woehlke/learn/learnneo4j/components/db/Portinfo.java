package org.woehlke.learn.learnneo4j.components.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@Entity
public class Portinfo {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Column(unique = true)
    private String port;
    private String version;
    private String category;
    private String variants;
    private String description;
    private String homepage;
    private String license;
    private String maintainers;
    private String platforms;

    @Lob
    private String info;

    @Lob
    private String deps;

    @Lob
    private String rdeps;

    @Lob
    private String dependents;

    @Lob
    private String variantsInDetail;

    @Lob
    private String portfile;
}
