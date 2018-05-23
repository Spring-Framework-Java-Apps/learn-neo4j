package org.woehlke.learn.learnneo4j.frontend.control.closed.terminal;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.woehlke.learn.learnneo4j.configuration.PageContentPopulator;
import org.woehlke.learn.learnneo4j.frontend.model.PageContent;

@Controller
@RequestMapping("/adm/")
public class TerminalController {

    @GetMapping("/portinfo/available/fetch")
    public String fetch(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        String result = "DONE";
        terminalService.getAllAvailablePorts();
        model.addAttribute("result", result);
        PageContent pageContent = pageContentPopulator.pageContentSetSTandardValues("/adm//portinfo/available/fetch");
        log.debug(pageContent.toString());
        model.addAttribute("pageContent", pageContent);
        return "adm/portinfo/available/fetch";
    }

    private static final Log log = LogFactory.getLog(TerminalController.class);

    private final TerminalService terminalService;

    private final PageContentPopulator pageContentPopulator;

    @Autowired
    public TerminalController(TerminalService terminalService, PageContentPopulator pageContentPopulator) {
        this.terminalService = terminalService;
        this.pageContentPopulator = pageContentPopulator;
    }

}
