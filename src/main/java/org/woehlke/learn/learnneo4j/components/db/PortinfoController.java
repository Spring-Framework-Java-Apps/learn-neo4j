package org.woehlke.learn.learnneo4j.components.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.platform.PlatformController;

@Controller
@RequestMapping("/db/Portinfo/")
public class PortinfoController {

    private static Logger log = LoggerFactory.getLogger(PlatformController.class.getName());

    @ModelAttribute("title")
    public String getTitle(){
        return "Portinfo";
    }

    @GetMapping("all")
    public String greeting(Model model) {
        model.addAttribute("all", portinfoService.findAll());
        log.info("db/portinfo/all");
        return "db/portinfo/all";
    }

    private final PortinfoService portinfoService;

    @Autowired
    public PortinfoController(PortinfoService portinfoService) {
        this.portinfoService = portinfoService;
    }

}
