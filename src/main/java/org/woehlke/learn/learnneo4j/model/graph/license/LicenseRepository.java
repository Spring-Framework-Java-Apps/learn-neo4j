package org.woehlke.learn.learnneo4j.model.graph.license;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.graph.License;

@Repository
public interface LicenseRepository extends Neo4jRepository<License,Long>, LicenseDelegate {

}
