package com.codejava.lambok.model;

import lombok.Cleanup;
import lombok.val;
import lombok.var;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;
import java.util.Random;

@RunWith(JUnit4.class)
public class ProductTest {

    @Test
    public void valDemo() {
        val product = new Product("xyzsd123","laptop","PC",67L);
        //cannot assign value to fial variable product
        //product = new Product("yty","phone", "nokia",50L); // val makes it final
        System.out.println(product);
    }

    @Test
    public void varDemo() {
        var product = new Product("xyz","tablet","tab",140L);
        //allows to reassign value to variable // non-final variablw
        product = new Product("xyzsd123","laptop","PC",250L);
        System.out.println(product.hashCode());

    }

    @Test(expected = IllegalArgumentException.class)
    public void nonNullDemo(){
        Product product = new Product("xyz","mouse","mouse description",null);
    }

}
