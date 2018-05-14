package org.woehlke.learn.learnneo4j.maintainer;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MaintainerRepository extends Neo4jRepository<Maintainer,Long> {

    Maintainer findByEmail(String email);
    Maintainer findByGitHub(String github);
    Maintainer findByEmailAndGitHub(String email,String github);
}
