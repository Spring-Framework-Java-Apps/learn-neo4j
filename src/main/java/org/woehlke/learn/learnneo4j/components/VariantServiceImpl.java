package org.woehlke.learn.learnneo4j.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class VariantServiceImpl implements VariantService {

    private final VariantRepository variantRepository;

    @Autowired
    public VariantServiceImpl(VariantRepository variantRepository) {
        this.variantRepository = variantRepository;
    }
}
