package org.woehlke.learn.learnneo4j.model.graph.category;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.graph.Category;

@Repository
public interface CategoryRepository extends Neo4jRepository<Category,Long> {

    Category findByName(String name);
}
