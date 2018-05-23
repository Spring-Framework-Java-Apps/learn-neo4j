package org.woehlke.learn.learnneo4j.frontend.control.open.home;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.woehlke.learn.learnneo4j.configuration.PageContentPopulator;
import org.woehlke.learn.learnneo4j.frontend.model.PageContent;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String home(Model model) {
        PageContent pageContent = pageContentPopulator.pageContentSetSTandardValues("/adm//portinfo/available/fetch");
        log.debug(pageContent.toString());
        model.addAttribute("pageContent", pageContent);
        return "open/welcome";
    }

    private final WelcomeService welcomeService;

    private final PageContentPopulator pageContentPopulator;

    @Autowired
    public WelcomeController(WelcomeService welcomeService, PageContentPopulator pageContentPopulator) {
        this.welcomeService = welcomeService;
        this.pageContentPopulator = pageContentPopulator;
    }


    private static final Log log = LogFactory.getLog(WelcomeController.class);

}
