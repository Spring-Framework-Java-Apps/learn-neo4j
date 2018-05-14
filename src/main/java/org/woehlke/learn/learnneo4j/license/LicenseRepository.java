package org.woehlke.learn.learnneo4j.license;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends Neo4jRepository<License,Long> {

    License findByLicense(String license);
}
