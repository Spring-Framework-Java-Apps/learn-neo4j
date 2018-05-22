package org.woehlke.learn.learnneo4j.model.platform;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/platform")
public class PlatformController {

    private static Logger log = LoggerFactory.getLogger(PlatformController.class.getName());


    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("/all")
    public String greeting(Model model) {
        model.addAttribute("all", platformService.findAll());
        log.info("node/platform/all");
        return "node/platform/all";
    }

    private final PlatformService platformService;

    @Autowired
    public PlatformController(PlatformService platformService) {
        this.platformService = platformService;
    }
}
