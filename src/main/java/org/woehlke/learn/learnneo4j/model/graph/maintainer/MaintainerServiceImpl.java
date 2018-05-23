package org.woehlke.learn.learnneo4j.model.graph.maintainer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.Maintainer;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;
import org.woehlke.learn.learnneo4j.model.graph.platform.PlatformServiceImpl;

@Service
@Transactional
public class MaintainerServiceImpl extends Neo4jServiceImpl<Maintainer,Long> implements MaintainerService {

    @Autowired
    public MaintainerServiceImpl(MaintainerRepository maintainerRepository) {
        super(maintainerRepository);
    }

    protected MaintainerRepository getRepository(){
        return (MaintainerRepository) super.getRepository();
    }

    private static final Log log = LogFactory.getLog(MaintainerServiceImpl.class);

}
