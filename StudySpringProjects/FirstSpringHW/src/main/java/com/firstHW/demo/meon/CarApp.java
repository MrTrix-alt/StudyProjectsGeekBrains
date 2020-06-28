package com.firstHW.demo.meon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarAppConfig.class);

        CarService carService = context.getBean("carService", CarService.class);

        carService.showCar();
    }

}
