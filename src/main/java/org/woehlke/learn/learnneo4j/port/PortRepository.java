package org.woehlke.learn.learnneo4j.port;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PortRepository extends Neo4jRepository<Port,Long> {
}
