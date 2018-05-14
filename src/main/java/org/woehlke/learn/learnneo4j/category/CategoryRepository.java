package org.woehlke.learn.learnneo4j.category;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends Neo4jRepository<Category,Long> {

    Category findByCategory(String category);
}
