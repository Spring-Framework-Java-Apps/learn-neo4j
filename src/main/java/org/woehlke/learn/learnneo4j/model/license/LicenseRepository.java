package org.woehlke.learn.learnneo4j.model.license;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.License;

@Repository
public interface LicenseRepository extends Neo4jRepository<License,Long> {

    License findByName(String name);
}
