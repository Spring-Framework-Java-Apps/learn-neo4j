package org.woehlke.learn.learnneo4j.model.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.Category;
import org.woehlke.learn.learnneo4j.common.Neo4jServiceImpl;

@Service
@Transactional
public class CategoryServiceImpl extends Neo4jServiceImpl<Category,Long> implements CategoryService {

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }

    protected CategoryRepository getRepository(){
        return (CategoryRepository) super.getRepository();
    }

}
