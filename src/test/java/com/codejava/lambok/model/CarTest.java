package com.codejava.lambok.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CarTest {

    @Test
    public void testBuilder(){
        Car car = new Car.CarBuilder().carMake("mymake").carNumber("xyz").carName("carName").build();
        System.out.println(car);
    }
}
