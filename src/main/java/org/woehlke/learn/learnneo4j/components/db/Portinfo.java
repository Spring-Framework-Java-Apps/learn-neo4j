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

    @Override
    public String toString() {
        return "Portinfo{" +
                "id=" + id +
                ", port='" + port + '\'' +
                ", version='" + version + '\'' +
                ", category='" + category + '\'' +
                ", variants='" + variants + '\'' +
                ", description='" + description + '\'' +
                ", homepage='" + homepage + '\'' +
                ", license='" + license + '\'' +
                ", maintainers='" + maintainers + '\'' +
                ", platforms='" + platforms + '\'' +
                ", info='" + info + '\'' +
                ", deps='" + deps + '\'' +
                ", rdeps='" + rdeps + '\'' +
                ", dependents='" + dependents + '\'' +
                ", variantsInDetail='" + variantsInDetail + '\'' +
                ", portfile='" + portfile + '\'' +
                '}';
    }
}
