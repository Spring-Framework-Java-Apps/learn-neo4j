package org.woehlke.learn.learnneo4j.model.common;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;


public abstract class JpaServiceImpl<T, ID extends Serializable> extends PagingAndSortingServiceImpl<T, ID> implements JpaService<T, ID> {

    protected JpaServiceImpl(JpaRepository<T,ID> repository){
        super(repository);
    }

    protected JpaRepository<T, ID> getRepository(){
        return (JpaRepository<T, ID>) super.getRepository();
    }
}
