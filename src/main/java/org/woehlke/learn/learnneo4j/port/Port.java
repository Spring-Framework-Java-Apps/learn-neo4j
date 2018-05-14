package org.woehlke.learn.learnneo4j.port;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.woehlke.learn.learnneo4j.variant.Variant;
import org.woehlke.learn.learnneo4j.category.Category;
import org.woehlke.learn.learnneo4j.license.License;
import org.woehlke.learn.learnneo4j.maintainer.Maintainer;
import org.woehlke.learn.learnneo4j.platform.Platform;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class Port {

    @Id
    @GeneratedValue
    private Long id;

    private String softwareTitle;
    private String version;
    private Category category;
    private Set<Variant> variants = new HashSet<>();
    private String description;
    private String homepage;
    private Set<Port> libraryDependencies = new HashSet<>();
    private Set<Platform> platforms = new HashSet<>();
    private License license;
    private Set<Maintainer> maintainers = new HashSet<>();
    private Boolean installed = false;
    private Boolean active = false;

    public Port() {
    }

    public Port(String softwareTitle, String version, Category category, Set<Variant> variants, String description, String homepage, Set<Port> libraryDependencies, Set<Platform> platforms, License license, Set<Maintainer> maintainers, Boolean installed, Boolean active) {
        this.softwareTitle = softwareTitle;
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
                ", softwareTitle='" + softwareTitle + '\'' +
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
