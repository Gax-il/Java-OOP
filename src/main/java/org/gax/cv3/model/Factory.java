package org.gax.cv3.model;

import java.util.*;

public class Factory {
    private int Year;
    private String Name;
    List<Car> Cars = new ArrayList<Car>();

    public Factory(int year, String name) {
        Year = year;
        Name = name;
    }

    public void addCar(String manufacturer, int motor, String color){
        Cars.add(new Car(manufacturer, motor, color, Year));
    }

    @Override
    public String toString() {
        return String.format("Tovarna %s uz od roku %d vyrobila %d aut",Name,Year,Cars.size());
    }

    public String carsToString(){
        String returning = "";
        for (Car faro:Cars
             ) {
            returning += String.format("%s \n",faro);
        }
        return returning;
    }
}
