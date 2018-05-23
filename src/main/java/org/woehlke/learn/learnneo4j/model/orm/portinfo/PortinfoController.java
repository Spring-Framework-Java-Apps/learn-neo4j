package org.woehlke.learn.learnneo4j.model.orm.portinfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/db/portinfo")
public class PortinfoController {

    private static Logger log = LoggerFactory.getLogger(PortinfoController.class.getName());

    @GetMapping("/all")
    public String greeting(Model model) {
        model.addAttribute("all", portinfoService.findAll());
        model.addAttribute("title","Portinfo");
        log.info("orm/portinfo/all");
        return "orm/portinfo/all";
    }

    private final PortinfoService portinfoService;

    @Autowired
    public PortinfoController(PortinfoService portinfoService) {
        this.portinfoService = portinfoService;
    }

}
