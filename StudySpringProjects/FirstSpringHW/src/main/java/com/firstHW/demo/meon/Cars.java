package com.firstHW.demo.meon;

public class Cars
{
    private Long id;
    private String modelCar;
    private Integer price;

    Cars(Long id, String modelCar, Integer price)
    {
        this.id = id;
        this.modelCar = modelCar;
        this.price = price;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getModelCar()
    {
        return modelCar;
    }

    public void setModelCar(String modelCar)
    {
        this.modelCar = modelCar;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
}
