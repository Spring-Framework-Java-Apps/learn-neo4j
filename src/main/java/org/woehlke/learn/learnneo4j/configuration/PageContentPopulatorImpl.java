package org.woehlke.learn.learnneo4j.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.woehlke.learn.learnneo4j.frontend.model.JumbotronImage;
import org.woehlke.learn.learnneo4j.frontend.model.PageContent;

@Component
public class PageContentPopulatorImpl implements PageContentPopulator {

    @Override
    public PageContent pageContentSetSTandardValues(String templatePath){
        String infoText = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
        String pageTitle = "My default pageTitle";
        String pageSubTitle = "This is my default pageSubTitle";
        String pageSymbol ="<i class=\"fa fa-play-circle\" aria-hidden=\"true\"></i>";
        String pagerUrl = templatePath;

        String googleMapsApiKey = myApplicationProperties.getSeo().getGoogleMapsApiKey();
        String googleAnalyticsKey = myApplicationProperties.getSeo().getGoogleAnalyticsKey();
        String twitterCardSite = myApplicationProperties.getSeo().getTwitterCardSite();
        String twitterCardCreator = myApplicationProperties.getSeo().getTwitterCardCreator();
        String msvalidateKey = myApplicationProperties.getSeo().getMsvalidateKey();
        String googleSiteVerification = myApplicationProperties.getSeo().getGoogleSiteVerification();
        String facebookAppId = myApplicationProperties.getSeo().getFacebookAppId();

        JumbotronImage imageCss = JumbotronImage.REICHSTAG_01;
        PageContent pc = new PageContent(infoText,pageTitle,pageSubTitle,pageSymbol,googleMapsApiKey,googleAnalyticsKey,pagerUrl,twitterCardSite,twitterCardCreator,imageCss,msvalidateKey,googleSiteVerification,facebookAppId);
        return pc;
    }


    private static final Log log = LogFactory.getLog(PageContentPopulatorImpl.class);

    private final MyApplicationProperties myApplicationProperties;

    @Autowired
    public PageContentPopulatorImpl(MyApplicationProperties myApplicationProperties) {
        this.myApplicationProperties = myApplicationProperties;
    }

}
