package org.woehlke.learn.learnneo4j.model.graph.platform;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.Platform;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;


@Service
@Transactional
public class PlatformServiceImpl extends Neo4jServiceImpl<Platform,Long> implements PlatformService {

    @Autowired
    public PlatformServiceImpl(PlatformRepository platformRepository) {
        super(platformRepository);
    }

    protected PlatformRepository getRepository(){
        return (PlatformRepository) super.getRepository();
    }

    private static final Log log = LogFactory.getLog(PlatformServiceImpl.class);

    @Override
    public Platform findByName(String name) {
        return getRepository().findByName(name);
    }
}
