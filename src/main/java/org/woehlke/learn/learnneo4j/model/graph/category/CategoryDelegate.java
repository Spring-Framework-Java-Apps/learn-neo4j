package org.woehlke.learn.learnneo4j.model.graph.category;

import org.woehlke.learn.learnneo4j.model.graph.Category;

public interface CategoryDelegate {

    Category findByName(String name);
}
