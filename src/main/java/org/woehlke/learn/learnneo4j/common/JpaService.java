package org.woehlke.learn.learnneo4j.common;

import java.io.Serializable;

public interface JpaService<T, ID extends Serializable> extends PagingAndSortingService<T, ID> {

}
