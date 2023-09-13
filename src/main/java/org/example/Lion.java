package org.example;

public class Lion extends Animal{
    public Lion(String inputName) {
        super(inputName,"Lion");
    }

    @Override
    public void speak() {
        System.out.println("Roar");
    }
}
