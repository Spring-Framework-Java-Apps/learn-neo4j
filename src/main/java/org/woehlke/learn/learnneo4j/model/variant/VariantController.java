package org.woehlke.learn.learnneo4j.model.variant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/variant/")
public class VariantController {

    private final VariantService variantService;

    @Autowired
    public VariantController(VariantService variantService) {
        this.variantService = variantService;
    }
    
    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("all")
    public String all(Model model) {
        model.addAttribute("all", variantService.findAll());
        return "node/variant/all";
    }
}
