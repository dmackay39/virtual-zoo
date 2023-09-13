package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.addAnimal(new Lion("Alex"));
        newZoo.addAnimal(new Snake("Spencer"));
        newZoo.addAnimal(new Chipmunk("Charlie"));

        boolean correct = false;

        while (!correct) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Would you like to add an animal or make one speak?");
            System.out.println("Options: {add, speak}");
            String choice = myScanner.nextLine();

            if (choice.toLowerCase().equals("add")) {
                System.out.println("Enter a name for your animal");
                String newName = myScanner.nextLine();

                System.out.println("Enter a type of your animal {Lion, Chipmunk, Snake}");
                String newType = myScanner.nextLine();

                switch (newType.toLowerCase()) {
                    case "lion": {
                        newZoo.addAnimal(new Lion(newName));
                        break;
                    }

                    case "chipmunk": {
                        newZoo.addAnimal(new Chipmunk(newName));
                        break;
                    }

                    case "snake": {
                        newZoo.addAnimal(new Snake(newName));
                        break;
                    }

                    default: {
                        System.out.println("Invalid type");
                        correct = true;
                        break;
                    }
                }
            } else if (choice.toLowerCase().equals("speak")) {
                System.out.println("Which animal would you like to make speak?");
                System.out.println("Options are " + newZoo.getNames() + " all");
                String givenName = myScanner.nextLine();

                if (givenName.toLowerCase().equals("all")) {
                    newZoo.speak();
                } else {
                    newZoo.oneSpeak(givenName);
                }
            } else {
                System.out.println("Invalid");
                correct = true;
            }
        }
    }
}