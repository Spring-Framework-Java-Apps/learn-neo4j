package org.woehlke.learn.learnneo4j.model.graph.variant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.frontend.control.open.home.WelcomeServiceImpl;
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

    private static final Log log = LogFactory.getLog(VariantServiceImpl.class);
}
