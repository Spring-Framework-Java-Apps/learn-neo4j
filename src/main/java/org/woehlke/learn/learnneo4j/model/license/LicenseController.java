package org.woehlke.learn.learnneo4j.model.license;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/license/")
public class LicenseController {

    private final LicenseService licenseService;

    @Autowired
    public LicenseController(LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @ModelAttribute("title")
    public String getTitle(){
        return "all Licenses";
    }

    @GetMapping("all")
    public String greeting(Model model) {
        model.addAttribute("all", licenseService.findAll());
        return "node/license/all";
    }
}
