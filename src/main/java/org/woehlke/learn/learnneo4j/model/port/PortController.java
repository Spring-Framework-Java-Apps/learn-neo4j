package org.woehlke.learn.learnneo4j.model.port;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/port/")
public class PortController {

    private final PortService portService;

    @Autowired
    public PortController(PortService portService) {
        this.portService = portService;
    }

    @GetMapping("all")
    public String all(Model model) {
        model.addAttribute("all", portService.findAll());
        return "node/port/all";
    }
}
