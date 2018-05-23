package org.woehlke.learn.learnneo4j.model.graph.category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;

@Service
@Transactional
public class CategoryServiceImpl extends Neo4jServiceImpl<Category,Long> implements CategoryService {

    @Override
    public Category findByName(String name) {
        return this.getRepository().findByName(name);
    }

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }

    protected CategoryRepository getRepository(){
        return (CategoryRepository) super.getRepository();
    }

    private static final Log log = LogFactory.getLog(CategoryServiceImpl.class);

}
