package com.firstHW.demo.meon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class CarService {

    private DataBase dataBase;

    @Autowired // заинжектить bean
    public void setCarDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void showCar()
    {
        Map<String, Cars> cars = dataBase.getCars();
        for(Map.Entry<String, Cars> car: cars.entrySet())
        {
            System.out.println(car);
        }
    }


}
