package org.gax.cv3.main;

import org.gax.cv3.model.Factory;

public class CarS {
    public static void main(String[] args) {
        Factory maven = new Factory(2000, "oidfsvnjovdfs");
        maven.addCar("Skoda",0,"Modra");
        maven.addCar("Mergl", 200, "Zelena");
//        System.out.println(maven);
        System.out.println(maven.carsToString());
    }
}
