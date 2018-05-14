package org.woehlke.learn.learnneo4j.platform;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlatformRepository extends Neo4jRepository<Platform,Long> {
}
