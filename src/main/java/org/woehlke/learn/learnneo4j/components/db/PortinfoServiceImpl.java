package org.woehlke.learn.learnneo4j.components.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.common.JpaServiceImpl;

@Service
public class PortinfoServiceImpl extends JpaServiceImpl<Portinfo, Long> implements PortinfoService {

    @Autowired
    public PortinfoServiceImpl(PortinfoRepository portinfoRepository) {
        super(portinfoRepository);
    }

    protected PortinfoRepository getRepository(){
        return (PortinfoRepository) super.getRepository();
    }
}

