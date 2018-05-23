package org.woehlke.learn.learnneo4j.frontend.control.open.home;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.model.graph.maintainer.MaintainerRepository;
import org.woehlke.learn.learnneo4j.model.graph.platform.PlatformRepository;
import org.woehlke.learn.learnneo4j.model.graph.port.PortRepository;
import org.woehlke.learn.learnneo4j.model.graph.variant.VariantRepository;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryRepository;
import org.woehlke.learn.learnneo4j.model.graph.license.LicenseRepository;

@Service
public class WelcomeServiceImpl implements WelcomeService {

    private final PortRepository portRepository;

    private final CategoryRepository categoryRepository;

    private final LicenseRepository licenseRepository;

    private final PlatformRepository platformRepository;

    private final MaintainerRepository maintainerRepository;

    private final VariantRepository variantRepository;

    @Autowired
    public WelcomeServiceImpl(PortRepository portRepository, CategoryRepository categoryRepository, LicenseRepository licenseRepository, PlatformRepository platformRepository, MaintainerRepository maintainerRepository, VariantRepository variantRepository) {
        this.portRepository = portRepository;
        this.categoryRepository = categoryRepository;
        this.licenseRepository = licenseRepository;
        this.platformRepository = platformRepository;
        this.maintainerRepository = maintainerRepository;
        this.variantRepository = variantRepository;
    }

}
