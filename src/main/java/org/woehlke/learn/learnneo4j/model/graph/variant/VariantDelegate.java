package org.woehlke.learn.learnneo4j.model.graph.variant;

import org.woehlke.learn.learnneo4j.model.graph.Variant;

public interface VariantDelegate {

    Variant findByName(String name);
}
