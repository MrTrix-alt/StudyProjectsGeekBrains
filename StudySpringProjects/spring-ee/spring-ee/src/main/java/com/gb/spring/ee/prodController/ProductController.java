package com.gb.spring.ee.prodController;

import com.gb.spring.ee.model.Product;
import com.gb.spring.ee.services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
    private MarketService marketService;

    @Autowired
    public ProductController(MarketService marketService) {
        this.marketService = marketService;
    }

    @GetMapping
    public String showAllProducts(Model model) {
        List<Product> products = marketService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }


    @GetMapping("/add")
    public String showAddForm() {
        return "add_product_form";
    }

    // public String saveNewProduct(@RequestParam Long id, @RequestParam String name, @RequestParam int score) {
    @PostMapping("/add")
    public String saveNewProduct(@ModelAttribute Product newProduct) {
        marketService.saveOrUpdateProduct(newProduct);
        return "redirect:/products/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        model.addAttribute("product", marketService.findById(id));
        return "edit_product_form";
    }

    @PostMapping("/edit")
    public String modifyProduct(@ModelAttribute Product modifiedProd) {
        marketService.saveOrUpdateProduct(modifiedProd);
        return "redirect:/products/";
    }

    @GetMapping("/json/{id}")
    @ResponseBody
    public Product showJsonProd(@PathVariable Integer id) {
        return marketService.findById(id);
    }
}

