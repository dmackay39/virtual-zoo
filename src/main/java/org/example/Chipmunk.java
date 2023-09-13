package org.example;

public class Chipmunk extends Animal{
    public Chipmunk(String inputName) {
        super(inputName, "Chipmunk");
    }

    @Override
    public void speak() {
        System.out.println("High pitched squeak");
    }
}
