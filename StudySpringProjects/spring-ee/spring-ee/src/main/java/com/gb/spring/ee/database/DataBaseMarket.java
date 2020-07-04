package com.gb.spring.ee.database;

import com.gb.spring.ee.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class DataBaseMarket
{
    List<Product> products;
    private Integer maxId;

    @PostConstruct
    public void init()
    {
        this.products = new ArrayList<>();
        this.products.add(new Product(1, "Nike Air Force", 8500));
        this.products.add(new Product(2, "Adidas Nite Jogger", 9500));
        this.maxId = 2;
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Product saveOrUpdateProduct(Product product) {
        if (product.getId() == null) {
            maxId++;
            product.setId(maxId);
            products.add(product);
            return product;
        } else {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(product.getId())) {
                    products.set(i, product);
                    return product;
                }
            }
        }
        throw new RuntimeException(" ! --> Exception <-- ! ");
    }

    public Product findById(Integer id) {
        for (Product prod : products) {
            if (prod.getId().equals(id)) {
                return prod;
            }
        }
        throw new RuntimeException("Product not found");
    }

}
