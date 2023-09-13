package org.example;

public class Snake extends Animal{
    public Snake(String inputName) {
        super(inputName, "Snake");
    }

    @Override
    public void speak() {
        System.out.println("Ssssssss");
    }
}
