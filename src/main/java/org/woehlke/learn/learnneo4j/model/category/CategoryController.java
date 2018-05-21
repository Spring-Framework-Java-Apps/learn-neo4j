package org.woehlke.learn.learnneo4j.model.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/node/category/")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }
    
    @GetMapping("all")
    public String all(Model model) {
        model.addAttribute("all", categoryService.findAll());
        return "node/category/all";
    }
}
