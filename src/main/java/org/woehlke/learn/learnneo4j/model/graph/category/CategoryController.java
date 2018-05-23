package org.woehlke.learn.learnneo4j.model.graph.category;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.woehlke.learn.learnneo4j.model.common.GraphNodeController;
import org.woehlke.learn.learnneo4j.model.graph.Category;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/graph/category")
public class CategoryController implements GraphNodeController {


    @GetMapping("/all")
    public String findAll(Model model) {
        List<Category> all = new ArrayList<Category>();
        for (Category category : categoryService.findAll()) {
            all.add(category);
            log.info(category.toString());
        }
        model.addAttribute("all", all);
        model.addAttribute("tizle", "Category.findAll");
        log.info("graph/category/all");
        return "graph/category/all";
    }


    private static final Log log = LogFactory.getLog(CategoryController.class);

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}
