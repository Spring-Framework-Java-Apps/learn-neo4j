package org.woehlke.learn.learnneo4j.model.graph.port;

import org.woehlke.learn.learnneo4j.model.graph.Port;

public interface PortDelegate {

    Port findByName(String name);

}
