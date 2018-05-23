package org.woehlke.learn.learnneo4j.model.graph.license;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.woehlke.learn.learnneo4j.model.graph.License;
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

    private static final Log log = LogFactory.getLog(LicenseServiceImpl.class);

}
