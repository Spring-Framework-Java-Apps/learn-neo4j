package org.woehlke.learn.learnneo4j.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MaintainerServiceImpl implements MaintainerService {

    private final MaintainerRepository maintainerRepository;

    @Autowired
    public MaintainerServiceImpl(MaintainerRepository maintainerRepository) {
        this.maintainerRepository = maintainerRepository;
    }
}
