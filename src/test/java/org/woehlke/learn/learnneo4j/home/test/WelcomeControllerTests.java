package org.woehlke.learn.learnneo4j.home.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.woehlke.learn.learnneo4j.model.orm.portinfo.PortinfoServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomeControllerTests {

    private static final Log log = LogFactory.getLog(PortinfoServiceImpl.class);

    @Test
    public void contextLoads() {
        log.info("contextLoads");
    }
}
