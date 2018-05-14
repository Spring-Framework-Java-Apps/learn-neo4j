package org.woehlke.learn.learnneo4j.model.platform;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.Platform;


@Repository
public interface PlatformRepository extends Neo4jRepository<Platform,Long> {
    Platform findAllByName(String name);
}
