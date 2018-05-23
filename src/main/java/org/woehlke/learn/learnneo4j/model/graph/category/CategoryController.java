package org.woehlke.learn.learnneo4j.model.graph.category;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.graph.Category;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/node/category")
public class CategoryController {

    private static Logger log = LoggerFactory.getLogger(CategoryController.class.getName());

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ModelAttribute("title")
    public String getTitle(){
        return "all Categories";
    }

    @GetMapping("/all")
    public String all(Model model) {
        List<Category> all = new ArrayList<Category>();
        for (Category category : categoryService.findAll()) {
            all.add(category);
            log.info(category.toString());
        }
        model.addAttribute("all", all);
        log.info("graph/category/all");
        return "node/category/all";
    }
}
