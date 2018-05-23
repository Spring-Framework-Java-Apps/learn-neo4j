package org.woehlke.learn.learnneo4j.model.graph.maintainer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;

@Controller
@RequestMapping("/graph/maintainer")
public class MaintainerController implements GraphNodeController {


    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("all", maintainerService.findAll());
        model.addAttribute("title", "Maintainer.findAll");
        log.info("graph/maintainer/all");
        return "graph/maintainer/all";
    }


    private static final Log log = LogFactory.getLog(MaintainerController.class);

    @Autowired
    public MaintainerController(MaintainerService maintainerService) {
        this.maintainerService = maintainerService;
    }


    private final MaintainerService maintainerService;
}
