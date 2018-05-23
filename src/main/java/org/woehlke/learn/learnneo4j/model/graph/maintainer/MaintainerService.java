package org.woehlke.learn.learnneo4j.model.graph.maintainer;

import org.woehlke.learn.learnneo4j.model.graph.Maintainer;
import org.woehlke.learn.learnneo4j.model.common.Neo4jService;

public interface MaintainerService extends Neo4jService<Maintainer,Long>,MaintainerDelegate {
}
