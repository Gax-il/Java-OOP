package org.gax.cv5.model;

public class Ochcavka extends Car implements BehavioralPattern {
    protected int Price;
    protected String Motor;

    public Ochcavka(String color, int year, int numberOfWheels, int price, String motor) {
        super(color, year, numberOfWheels);
        Price = price;
        Motor = motor;
    }

    public Ochcavka(String color, int year, int numberOfWheels, String motor) {
        super(color, year, numberOfWheels);
        Motor = motor;
    }

    @Override
    public String favoriteToy(){
        return "dsaasd";
    }

    @Override
    public void sound() {
        System.out.println("sxddsd");
    }

    @Override
    public String returnColor(){
        return String.format("Ochcavka v čipu má %s barvu",Color);
    }
}
