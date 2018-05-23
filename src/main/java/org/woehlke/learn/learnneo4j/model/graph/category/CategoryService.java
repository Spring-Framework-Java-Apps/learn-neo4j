package org.woehlke.learn.learnneo4j.model.graph.category;

import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.common.Neo4jService;

public interface CategoryService extends Neo4jService<Category,Long>, CategoryDelegate {

}
