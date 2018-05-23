package org.woehlke.learn.learnneo4j.model.graph.maintainer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/maintainer")
public class MaintainerController {

    private static final Log log = LogFactory.getLog(MaintainerController.class);

    @Autowired
    public MaintainerController(MaintainerService maintainerService) {
        this.maintainerService = maintainerService;
    }


    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("/all")
    public String greeting(Model model) {
        model.addAttribute("all", maintainerService.findAll());
        log.info("graph/maintainer/all");
        return "node/maintainer/all";
    }

    private final MaintainerService maintainerService;
}
