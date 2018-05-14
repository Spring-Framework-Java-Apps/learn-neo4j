package org.woehlke.learn.learnneo4j.model.license;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.License;
import org.woehlke.learn.learnneo4j.model.common.Neo4jServiceImpl;

@Service
@Transactional
public class LicenseServiceImpl extends Neo4jServiceImpl<License,Long> implements LicenseService {

    @Autowired
    public LicenseServiceImpl(LicenseRepository licenseRepository) {
        super(licenseRepository);
    }

    protected LicenseRepository getRepository(){
        return (LicenseRepository) super.getRepository();
    }

}
