package org.woehlke.learn.learnneo4j;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.woehlke.learn.learnneo4j.model.graph.category.test.CategoryControllerTests;
import org.woehlke.learn.learnneo4j.home.test.WelcomeControllerTests;

@Suite.SuiteClasses({
    LearnNeo4jApplicationTests.class,
    CategoryControllerTests.class,
    WelcomeControllerTests.class
})
@RunWith(Suite.class)
public class MyTestSuiteForTravis {
}
