package org.woehlke.learn.learnneo4j.model.graph.platform;

import org.woehlke.learn.learnneo4j.model.graph.Platform;

public interface PlatformDelegate {

    Platform findByName(String name);
}
