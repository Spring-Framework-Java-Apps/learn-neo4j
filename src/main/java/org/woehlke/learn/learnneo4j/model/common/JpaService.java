package org.woehlke.learn.learnneo4j.model.common;

import java.io.Serializable;

public interface JpaService<T, ID extends Serializable> extends PagingAndSortingService<T, ID> {

}
