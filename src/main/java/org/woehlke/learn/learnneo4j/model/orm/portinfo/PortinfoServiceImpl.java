package org.woehlke.learn.learnneo4j.model.orm.portinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.woehlke.learn.learnneo4j.model.common.JpaServiceImpl;
import org.woehlke.learn.learnneo4j.model.orm.Portinfo;

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

