package org.woehlke.learn.learnneo4j.components;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.woehlke.learn.learnneo4j.model.Category;


public interface CategoryRepository extends Neo4jRepository<Category,Long> {

    Category findByCategory(String category);
}
