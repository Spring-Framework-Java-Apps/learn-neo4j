package org.woehlke.learn.learnneo4j.components;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.woehlke.learn.learnneo4j.model.Category;

public interface CategoryService {
    
    Iterable<Category> findAll();

    //Page<Category> findAll(Pageable pageable);
}
