package org.woehlke.learn.learnneo4j.variant;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantRepository extends Neo4jRepository<Variant,Long> {

    Variant findByVariant(String variant);
}
