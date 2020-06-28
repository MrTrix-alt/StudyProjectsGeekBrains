package com.firstHW.demo.meon;


import java.util.Map;

interface DataBase
{
    void add(Cars car);
    Map<String, Cars> getCars();
}
