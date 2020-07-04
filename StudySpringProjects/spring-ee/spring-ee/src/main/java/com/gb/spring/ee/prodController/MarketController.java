package com.gb.spring.ee.prodController;

import com.gb.spring.ee.model.Product;
import com.gb.spring.ee.services.MarketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/market")
public class MarketController {

    @GetMapping
    public String showCatalog() {
        return "sneakerShop/catalog/catalog";
    }
}

