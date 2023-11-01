package org.gax.cv4.model;

import org.gax.cv5.model.Animal;

public class Dog extends Animal implements AnimalInt{

    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    @Override
    public void sound(){
        System.out.println("Haf haf");
    }
}
