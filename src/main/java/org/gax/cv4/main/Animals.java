package org.gax.cv4.main;

import org.gax.cv4.model.Dog;

public class Animals {
    public static void main(String[] args) {
        Dog alfred = new Dog("Alfred", 5);
        System.out.println(alfred);
        alfred.sound();
    }
}
