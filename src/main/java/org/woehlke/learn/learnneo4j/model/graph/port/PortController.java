package org.woehlke.learn.learnneo4j.model.graph.port;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;

@Controller
@RequestMapping("/graph/port")
public class PortController implements GraphNodeController {


    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("all", portService.findAll());
        model.addAttribute("title", "Port.findAll");
        log.info("graph/port/all");
        return "graph/port/all";
    }


    private static final Log log = LogFactory.getLog(PortController.class);

    private final PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }
}
