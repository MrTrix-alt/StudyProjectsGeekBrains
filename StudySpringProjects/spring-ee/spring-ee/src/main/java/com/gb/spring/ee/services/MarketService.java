package com.gb.spring.ee.services;

import com.gb.spring.ee.database.DataBaseMarket;
import com.gb.spring.ee.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    private DataBaseMarket dataBaseMarket;

    @Autowired
    public void setProductInDataBase(DataBaseMarket  dataBaseMarket) {
        this.dataBaseMarket = dataBaseMarket;
    }

    public List<Product> getAllProducts() {
        return dataBaseMarket.findAll();
    }

    public Product saveOrUpdateProduct(Product product) {
        return dataBaseMarket.saveOrUpdateProduct(product);
    }

    public Product findById(Integer id) {
        return dataBaseMarket.findById(id);
    }

    public void openCatalog() {

    }


}
