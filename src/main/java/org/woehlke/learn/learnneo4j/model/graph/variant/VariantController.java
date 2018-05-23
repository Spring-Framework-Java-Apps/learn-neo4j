package org.woehlke.learn.learnneo4j.model.graph.variant;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.configuration.PageContentPopulator;
import org.woehlke.learn.learnneo4j.frontend.model.PageContent;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;

@Controller
@RequestMapping("/graph/variant/")
public class VariantController implements GraphNodeController {


    @GetMapping("all")
    public String findAll(Model model) {
        model.addAttribute("all", variantService.findAll());
        model.addAttribute("title", "Variant.findAll");
        PageContent pageContent = pageContentPopulator.pageContentSetSTandardValues("/adm//portinfo/available/fetch");
        log.debug(pageContent.toString());
        model.addAttribute("pageContent", pageContent);
        log.info("graph/variant/all");
        return "graph/variant/all";
    }


    private static final Log log = LogFactory.getLog(VariantController.class);

    private final VariantService variantService;


    private final PageContentPopulator pageContentPopulator;

    @Autowired
    public VariantController(VariantService variantService, PageContentPopulator pageContentPopulator) {
        this.variantService = variantService;
        this.pageContentPopulator = pageContentPopulator;
    }
}
