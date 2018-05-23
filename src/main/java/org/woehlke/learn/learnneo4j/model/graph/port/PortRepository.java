package org.woehlke.learn.learnneo4j.model.graph.port;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.graph.Port;


@Repository
public interface PortRepository extends Neo4jRepository<Port,Long>,PortDelegate {
}
