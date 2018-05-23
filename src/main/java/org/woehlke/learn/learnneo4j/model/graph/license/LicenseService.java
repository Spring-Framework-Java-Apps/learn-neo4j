package org.woehlke.learn.learnneo4j.model.graph.license;

import org.woehlke.learn.learnneo4j.model.graph.License;
import org.woehlke.learn.learnneo4j.model.common.Neo4jService;

public interface LicenseService extends Neo4jService<License,Long>, LicenseDelegate {

}
