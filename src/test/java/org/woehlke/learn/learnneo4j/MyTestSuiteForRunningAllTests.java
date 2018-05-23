package org.woehlke.learn.learnneo4j;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.woehlke.learn.learnneo4j.model.graph.category.test.CategoryControllerTests;
import org.woehlke.learn.learnneo4j.home.test.WelcomeControllerTests;
import org.woehlke.learn.learnneo4j.model.graph.licens.test.LicenseControllerTests;
import org.woehlke.learn.learnneo4j.model.graph.maintainer.test.MaintainerConrollerTests;
import org.woehlke.learn.learnneo4j.model.graph.platform.test.PlatformControllerTests;
import org.woehlke.learn.learnneo4j.model.graph.port.test.PortControllerTests;
import org.woehlke.learn.learnneo4j.model.graph.variant.test.VariantControllerTests;

@Suite.SuiteClasses({
    LearnNeo4jApplicationTests.class,
    CategoryControllerTests.class,
    WelcomeControllerTests.class,
    LicenseControllerTests.class,
    MaintainerConrollerTests.class,
    PlatformControllerTests.class,
    PortControllerTests.class,
    VariantControllerTests.class
})
@RunWith(Suite.class)
public class MyTestSuiteForRunningAllTests {
}
