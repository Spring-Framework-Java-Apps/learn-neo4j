package org.woehlke.learn.learnneo4j.model.graph.variant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.Variant;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;

@Service
@Transactional
public class VariantServiceImpl extends Neo4jServiceImpl<Variant,Long> implements VariantService {

    @Autowired
    public VariantServiceImpl(VariantRepository variantRepository) {
        super(variantRepository);
    }

    protected VariantRepository getRepository(){
        return (VariantRepository) super.getRepository();
    }
}
