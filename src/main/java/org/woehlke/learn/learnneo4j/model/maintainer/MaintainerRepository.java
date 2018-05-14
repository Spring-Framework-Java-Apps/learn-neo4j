package org.woehlke.learn.learnneo4j.model.maintainer;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import org.woehlke.learn.learnneo4j.model.Maintainer;


@Repository
public interface MaintainerRepository extends Neo4jRepository<Maintainer,Long> {

    Maintainer findByName(String name);
    Maintainer findByGitHub(String github);
    Maintainer findByNameAndGitHub(String name,String github);
}
