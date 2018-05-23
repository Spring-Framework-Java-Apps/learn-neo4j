package org.woehlke.learn.learnneo4j.frontend.control.open.home;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String home(Model model) {
        model.addAttribute("title", "Home");
        return "open/welcome";
    }

    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }


    private static final Log log = LogFactory.getLog(WelcomeController.class);

}
