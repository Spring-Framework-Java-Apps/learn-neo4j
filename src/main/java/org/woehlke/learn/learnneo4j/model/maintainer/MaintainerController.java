package org.woehlke.learn.learnneo4j.model.maintainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("node/maintainer/")
public class MaintainerController {

    private static Logger log = LoggerFactory.getLogger(MaintainerController.class.getName());

    @Autowired
    public MaintainerController(MaintainerService maintainerService) {
        this.maintainerService = maintainerService;
    }

    
    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("all")
    public String greeting(Model model) {
        model.addAttribute("all", maintainerService.findAll());
        log.info("node/maintainer/all");
        return "node/maintainer/all";
    }

    private final MaintainerService maintainerService;
}
