package controller;

import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.impl.ProductServiceImpl;

import java.util.List;

@Controller
public class DemoController {
    ProductServiceImpl productService = new ProductServiceImpl();
    @GetMapping("/hello")
    public ModelAndView say(){
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("hi");
        modelAndView.addObject("list", productList);
        return modelAndView;
    }

    @PostMapping("/ha")
    public ModelAndView hungMom(@RequestParam String x) {
        ModelAndView modelAndView = new ModelAndView("hi");
        modelAndView.addObject("x", x);
        return modelAndView;
    }
}
