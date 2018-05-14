package org.woehlke.learn.learnneo4j.model.maintainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.Maintainer;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;

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

}
