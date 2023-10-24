package org.gax.cv4.model;

public class Dog extends Animal implements AnimalInt{

    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    @Override
    public void sound(){
        System.out.println("Haf haf");
    }
}
