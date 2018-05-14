package org.woehlke.learn.learnneo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.*;

import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NodeEntity
public class Port {

    @Id
    @GeneratedValue
    private Long id;

    @Index
    @NotEmpty
    private String name;
    private String version;

    @Relationship(type="IS_IN")
    private Category category;

    @Relationship(type="HAS")
    private Set<Variant> variants = new HashSet<>();
    private String description;
    private String homepage;

    @Relationship(type="DEPENDS_ON")
    private Set<Port> libraryDependencies = new HashSet<>();

    @Relationship(type="IS_FOR")
    private Set<Platform> platforms = new HashSet<>();
    private License license;

    @Relationship(type="MAINTAINED_BY")
    private Set<Maintainer> maintainers = new HashSet<>();
    
    private Boolean installed = false;
    private Boolean active = false;

    public Port() {
    }

    public Port(String softwareTitle, String version, Category category, Set<Variant> variants, String description, String homepage, Set<Port> libraryDependencies, Set<Platform> platforms, License license, Set<Maintainer> maintainers, Boolean installed, Boolean active) {
        this.name = softwareTitle;
        this.version = version;
        this.category = category;
        this.variants = variants;
        this.description = description;
        this.homepage = homepage;
        this.libraryDependencies = libraryDependencies;
        this.platforms = platforms;
        this.license = license;
        this.maintainers = maintainers;
        this.installed = installed;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Port{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                ", category=" + category +
                ", variants=" + variants +
                ", description='" + description + '\'' +
                ", homepage='" + homepage + '\'' +
                ", libraryDependencies=" + libraryDependencies +
                ", platforms=" + platforms +
                ", license=" + license +
                ", maintainers=" + maintainers +
                ", installed=" + installed +
                ", active=" + active +
                '}';
    }
}
