package org.woehlke.learn.learnneo4j.model.graph.port;

import org.woehlke.learn.learnneo4j.model.graph.Port;
import org.woehlke.learn.learnneo4j.model.common.Neo4jService;

public interface PortService extends Neo4jService<Port,Long>,PortDelegate {
}
