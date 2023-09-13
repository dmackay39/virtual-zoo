package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Zoo implements Speaking{
    private List<Animal> animals;
    private HashMap<String, Animal> animalsHashMap;

    public Zoo (){
        this.animals = new ArrayList<>();
        this.animalsHashMap = new HashMap<>();
    }

    private List<Animal> getAnimals() {
        return animals;
    }

    public Animal getAnimal(String animalName){
        return animalsHashMap.get(animalName);
    }

    public void addAnimal(Animal inputAnimal){
        animals.add(inputAnimal);
        animalsHashMap.put(inputAnimal.getName(), inputAnimal);
    }
    @Override
    public void speak() {
        for (Animal a : animals) {
            a.speak();
        }
    }

    public void oneSpeak(String name){
        animalsHashMap.get(name).speak();
    }

    public String getNames(){
        String names = "";
        for (Animal a: animals){
            names += a.getName() + ", ";
        }
        return names;
    }

}
