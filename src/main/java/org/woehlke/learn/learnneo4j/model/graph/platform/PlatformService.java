package org.woehlke.learn.learnneo4j.model.graph.platform;

import org.woehlke.learn.learnneo4j.model.graph.Platform;
import org.woehlke.learn.learnneo4j.model.common.Neo4jService;

public interface PlatformService extends Neo4jService<Platform,Long>,PlatformDelegate {
}
