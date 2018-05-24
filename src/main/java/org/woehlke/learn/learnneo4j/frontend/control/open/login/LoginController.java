package org.woehlke.learn.learnneo4j.frontend.control.open.login;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.woehlke.learn.learnneo4j.configuration.PageContentPopulator;
import org.woehlke.learn.learnneo4j.frontend.control.open.home.WelcomeController;
import org.woehlke.learn.learnneo4j.frontend.model.PageContent;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        PageContent pageContent = pageContentPopulator.pageContentSetSTandardValues("open/login");
        log.debug(pageContent.toString());
        model.addAttribute("pageContent", pageContent);
        return "open/login";
    }

    private final PageContentPopulator pageContentPopulator;

    @Autowired
    public LoginController(PageContentPopulator pageContentPopulator) {
        this.pageContentPopulator = pageContentPopulator;
    }

    private static final Log log = LogFactory.getLog(WelcomeController.class);
}
