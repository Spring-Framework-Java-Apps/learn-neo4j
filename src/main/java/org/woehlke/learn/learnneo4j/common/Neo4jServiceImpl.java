package org.woehlke.learn.learnneo4j.common;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.io.Serializable;

public abstract class Neo4jServiceImpl<T, ID extends Serializable> extends PagingAndSortingServiceImpl<T, ID> implements Neo4jService<T, ID> {

    protected Neo4jServiceImpl(Neo4jRepository<T,ID> repository){
        super(repository);
    }

    protected Neo4jRepository<T, ID> getRepository(){
        return (Neo4jRepository) super.getRepository();
    }
}
