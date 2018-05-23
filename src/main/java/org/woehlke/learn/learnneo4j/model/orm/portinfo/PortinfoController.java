package org.woehlke.learn.learnneo4j.model.orm.portinfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.DbEntityController;

@Controller
@RequestMapping("/db/portinfo")
public class PortinfoController implements DbEntityController {

    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("all", portinfoService.findAll());
        model.addAttribute("title","Portinfo.findAll");
        log.info("db/portinfo/all");
        return "db/portinfo/all";
    }

    private final PortinfoService portinfoService;

    @Autowired
    public PortinfoController(PortinfoService portinfoService) {
        this.portinfoService = portinfoService;
    }

    private static final Log log = LogFactory.getLog(PortinfoController.class);

}
