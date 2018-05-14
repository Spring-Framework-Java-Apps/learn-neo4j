package org.woehlke.learn.learnneo4j.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.model.maintainer.MaintainerRepository;
import org.woehlke.learn.learnneo4j.model.platform.PlatformRepository;
import org.woehlke.learn.learnneo4j.model.port.PortRepository;
import org.woehlke.learn.learnneo4j.model.variant.VariantRepository;
import org.woehlke.learn.learnneo4j.model.category.CategoryRepository;
import org.woehlke.learn.learnneo4j.model.license.LicenseRepository;

@Service
public class HomeServiceImpl implements HomeService {

    private final PortRepository portRepository;

    private final CategoryRepository categoryRepository;

    private final LicenseRepository licenseRepository;

    private final PlatformRepository platformRepository;

    private final MaintainerRepository maintainerRepository;

    private final VariantRepository variantRepository;

    @Autowired
    public HomeServiceImpl(PortRepository portRepository, CategoryRepository categoryRepository, LicenseRepository licenseRepository, PlatformRepository platformRepository, MaintainerRepository maintainerRepository, VariantRepository variantRepository) {
        this.portRepository = portRepository;
        this.categoryRepository = categoryRepository;
        this.licenseRepository = licenseRepository;
        this.platformRepository = platformRepository;
        this.maintainerRepository = maintainerRepository;
        this.variantRepository = variantRepository;
    }

}
