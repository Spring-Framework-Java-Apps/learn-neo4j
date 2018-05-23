package org.woehlke.learn.learnneo4j.model.graph.maintainer;

import org.woehlke.learn.learnneo4j.model.graph.Maintainer;

public interface MaintainerDelegate {

    Maintainer findByName(String name);
    Maintainer findByGitHub(String github);
    Maintainer findByNameAndGitHub(String name,String github);
}
