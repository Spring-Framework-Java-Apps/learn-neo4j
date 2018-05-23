package org.woehlke.learn.learnneo4j.model.graph.license;

import org.woehlke.learn.learnneo4j.model.graph.License;

public interface LicenseDelegate {

    License findByName(String name);
}
