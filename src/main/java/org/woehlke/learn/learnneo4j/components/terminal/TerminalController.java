package org.woehlke.learn.learnneo4j.components.terminal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/terminal/")
public class TerminalController {
    
    private final TerminalService terminalService;

    @Autowired
    public TerminalController(TerminalService terminalService) {
        this.terminalService = terminalService;
    }

    @GetMapping("/port/menu")
    public String menu(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "terminal/port/menu";
    }

    @GetMapping("/port/available/all")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String result = "DONE";
        terminalService.getAllAvailablePorts();
        model.addAttribute("result", result);
        return "terminal/port/available/all";
    }
}
