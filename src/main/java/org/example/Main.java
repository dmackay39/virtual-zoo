package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.addAnimal(new Lion("Alex"));
        newZoo.addAnimal(new Snake("Spencer"));
        newZoo.addAnimal(new Chipmunk("Charlie"));

        newZoo.speak();
    }
}