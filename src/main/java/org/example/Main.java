package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a name for your animal");
        String newName = myScanner.nextLine();

        System.out.println("Enter a type of your animal {Lion, Chipmunk, Snake}");
        String newType = myScanner.nextLine();

        switch (newType.toLowerCase()){
            case "lion":{
                newZoo.addAnimal(new Lion(newName));
                break;
            }

            case "chipmunk":{
                newZoo.addAnimal(new Chipmunk(newName));
                break;
            }

            case "snake":{
                newZoo.addAnimal(new Snake(newName));
                break;
            }

            default:{
                System.out.println("Invalid type");
                break;
            }
        }

        newZoo.addAnimal(new Lion("Alex"));
        newZoo.addAnimal(new Snake("Spencer"));
        newZoo.addAnimal(new Chipmunk("Charlie"));
        System.out.println("Which animal would you like to make speak?");
        System.out.println("Options are " + newZoo.getNames() + " all");
        String givenName = myScanner.nextLine();

        if (givenName.toLowerCase().equals("all")){
            newZoo.speak();
        }
        else{
            newZoo.oneSpeak(givenName);
        }

    }
}