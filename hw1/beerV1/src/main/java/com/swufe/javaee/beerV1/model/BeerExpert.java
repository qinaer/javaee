package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add(new Beer("n1","b1",1.0,2001));
            brands.add(new Beer("n2","b2",2.0,2002));
        } else {
            brands.add(new Beer("n3","b3",3.0,2003));
            brands.add(new Beer("n4","b4",4.0,2004));
        }
        return brands;
    }

    public List<Beer> getBeers(String color) {
        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer("A", "A1",10.0 ,10));
        beers.add(new Beer("B", "B1",20.0 ,20));
        return beers;
    }
}
