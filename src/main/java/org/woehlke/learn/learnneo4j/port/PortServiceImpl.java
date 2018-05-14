package org.woehlke.learn.learnneo4j.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.category.CategoryRepository;
import org.woehlke.learn.learnneo4j.license.LicenseRepository;
import org.woehlke.learn.learnneo4j.maintainer.MaintainerRepository;
import org.woehlke.learn.learnneo4j.platform.PlatformRepository;
import org.woehlke.learn.learnneo4j.variant.VariantRepository;

@Service
@Transactional
public class PortServiceImpl implements PortService {

    private final PortRepository portRepository;

    private final CategoryRepository categoryRepository;

    private final LicenseRepository licenseRepository;

    private final PlatformRepository platformRepository;

    private final MaintainerRepository maintainerRepository;

    private final VariantRepository variantRepository;

    @Autowired
    public PortServiceImpl(PortRepository portRepository, CategoryRepository categoryRepository, LicenseRepository licenseRepository, PlatformRepository platformRepository, MaintainerRepository maintainerRepository, VariantRepository variantRepository) {
        this.portRepository = portRepository;
        this.categoryRepository = categoryRepository;
        this.licenseRepository = licenseRepository;
        this.platformRepository = platformRepository;
        this.maintainerRepository = maintainerRepository;
        this.variantRepository = variantRepository;
    }
}
