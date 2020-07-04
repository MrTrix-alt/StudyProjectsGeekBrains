package com.gb.spring.ee.model;

public class Product
{
    private Integer id;
    private String title;
    private Integer cost;

    public Product(Integer id, String title, Integer cost)
    {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }



}
