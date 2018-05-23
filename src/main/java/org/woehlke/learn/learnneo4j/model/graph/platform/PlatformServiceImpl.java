package org.woehlke.learn.learnneo4j.model.graph.platform;

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

}
