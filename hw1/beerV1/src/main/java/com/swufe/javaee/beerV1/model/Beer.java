package com.swufe.javaee.beerV1.model;

public class Beer {
    private String name;
    private String brand;
    private double size;
    private int year_of_birth;


    public Beer(String name, String brand, double size, int year_of_birth) {
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.year_of_birth = year_of_birth;
    }

    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", size=" + size + '\'' +
                ", year of birth=" + year_of_birth +
                '}';
    }
}
