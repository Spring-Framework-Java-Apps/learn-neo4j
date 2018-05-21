package org.woehlke.learn.learnneo4j.model.port;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/port/")
public class PortController {
    
    private static Logger log = LoggerFactory.getLogger(PortController.class.getName());

    private final PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }


    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("all")
    public String all(Model model) {
        model.addAttribute("all", portService.findAll());
        log.info("node/port/all");
        return "node/port/all";
    }
}
