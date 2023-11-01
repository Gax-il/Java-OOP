package org.gax.cv4.model;

public class Animal {
    protected String Name;
    protected int Age;
    protected String Species;

    public Animal(String name, int age, String species) {
        Name = name;
        Age = age;
        Species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Species='" + Species + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }
}

