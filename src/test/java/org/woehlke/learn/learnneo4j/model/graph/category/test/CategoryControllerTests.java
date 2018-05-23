package org.woehlke.learn.learnneo4j.model.graph.category.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.woehlke.learn.learnneo4j.model.graph.Category;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryController;
import org.woehlke.learn.learnneo4j.model.graph.category.CategoryService;
import org.woehlke.learn.learnneo4j.model.orm.portinfo.PortinfoServiceImpl;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
public class CategoryControllerTests {

    private static final Log log = LogFactory.getLog(PortinfoServiceImpl.class);

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CategoryService categoryService;

    @Test
    public void testExample() throws Exception {
        log.info("testExample Start");
        Iterable<Category> result =  this.categoryService.findAll();

        given(this.categoryService.findAll())
            .willReturn(result);
        this.mvc.perform(get("/graph/category/alll").accept(MediaType.TEXT_HTML))
            .andExpect(status().isOk()).andExpect(content().string("My default pageTitle"));

        log.info("testExample Done");
    }

}
