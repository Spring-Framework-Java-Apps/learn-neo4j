package org.woehlke.learn.learnneo4j.configuration;

import org.woehlke.learn.learnneo4j.frontend.model.PageContent;

public interface PageContentPopulator {

    PageContent pageContentSetSTandardValues(String templatePath);
}
