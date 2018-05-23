package org.woehlke.learn.learnneo4j.model.common;

import org.springframework.data.repository.Repository;

import java.io.Serializable;

public abstract class CommonServiceImpl<T, ID extends Serializable> implements CommonService<T, ID>  {

    private Repository<T, ID> repository;

    protected CommonServiceImpl(Repository<T, ID> repository){
        this.repository=repository;
    }

    protected Repository<T, ID> getRepository(){
        return this.repository;
    }
}
