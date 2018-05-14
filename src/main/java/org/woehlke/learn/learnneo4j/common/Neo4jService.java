package org.woehlke.learn.learnneo4j.common;

import java.io.Serializable;

/**
 * Neo4j OGM specific extension of {@link org.springframework.data.repository.Repository}.
 */
public interface Neo4jService<T, ID extends Serializable> extends PagingAndSortingService<T, ID> {
}
