package org.woehlke.learn.learnneo4j.model.graph.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.Port;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;
import org.woehlke.learn.learnneo4j.model.graph.variant.VariantRepository;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryRepository;
import org.woehlke.learn.learnneo4j.model.graph.license.LicenseRepository;
import org.woehlke.learn.learnneo4j.model.graph.maintainer.MaintainerRepository;
import org.woehlke.learn.learnneo4j.model.graph.platform.PlatformRepository;

@Service
@Transactional
public class PortServiceImpl extends Neo4jServiceImpl<Port,Long> implements PortService {

    private final CategoryRepository categoryRepository;

    private final LicenseRepository licenseRepository;

    private final PlatformRepository platformRepository;

    private final MaintainerRepository maintainerRepository;

    private final VariantRepository variantRepository;

    @Autowired
    public PortServiceImpl(PortRepository portRepository, CategoryRepository categoryRepository, LicenseRepository licenseRepository, PlatformRepository platformRepository, MaintainerRepository maintainerRepository, VariantRepository variantRepository) {
        super(portRepository);
        this.categoryRepository = categoryRepository;
        this.licenseRepository = licenseRepository;
        this.platformRepository = platformRepository;
        this.maintainerRepository = maintainerRepository;
        this.variantRepository = variantRepository;
    }

    protected PortRepository getRepository(){
        return (PortRepository) super.getRepository();
    }


}
