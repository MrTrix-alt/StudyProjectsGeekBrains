package com.firstHW.demo.meon;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class inDataBaseOfAllCars implements DataBase
{
    private Map<String, Cars> carsMap;

    @PostConstruct // метод вызывается при создании bean'a.
    public void initBean()
    {
        this.carsMap = new HashMap<String, Cars>();
        this.carsMap.put("Toyota", new Cars(1L, "Camry", 50000));
        this.carsMap.put("Mazda", new Cars(2L, "RX-8", 55500));
        this.carsMap.put("Skoda", new Cars(3L, "Rapid", 35000));
    }

    @Override
    public void add(Cars car)
    {

    }

    @Override
    public Map<String, Cars> getCars() {
        return carsMap;
    }

}
