package org.gax.cv3.model;

public class Car {
    private String Brand;
    private int Motor;
    private String Color;

    private int Year;

    public Car(String brand, int motor, String color, int year) {
        Brand = brand;
        Motor = motor;
        Color = color;
        Year = year;
    }


    public void changeColor(String color){
        Color=color;
    }

    @Override
    public String toString() {
        return String.format("Auto znacky %s s motorem o vykonu %d a barvou %s je z roku %d",Brand,Motor,Color, Year);
    }
}
