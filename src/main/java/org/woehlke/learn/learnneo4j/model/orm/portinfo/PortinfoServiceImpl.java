package org.woehlke.learn.learnneo4j.model.orm.portinfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.model.common.JpaServiceImpl;
import org.woehlke.learn.learnneo4j.model.orm.Portinfo;

import javax.transaction.Transactional;

@Service
@Transactional
public class PortinfoServiceImpl extends JpaServiceImpl<Portinfo, Long> implements PortinfoService {

    @Autowired
    public PortinfoServiceImpl(PortinfoRepository portinfoRepository) {
        super(portinfoRepository);
    }

    protected PortinfoRepository getRepository(){
        return (PortinfoRepository) super.getRepository();
    }

    private static final Log log = LogFactory.getLog(PortinfoServiceImpl.class);
}

