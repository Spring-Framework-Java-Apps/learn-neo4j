package org.woehlke.learn.learnneo4j.model.variant;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.Variant;

@Repository
public interface VariantRepository extends Neo4jRepository<Variant,Long> {

    Variant findByName(String name);
}
