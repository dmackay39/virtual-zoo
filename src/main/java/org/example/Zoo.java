package org.example;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Speaking{
    private List<Animal> animals;

    public Zoo (){
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal inputAnimal){
        animals.add(inputAnimal);
    }
    @Override
    public void speak(){
        for (Animal a: animals){
            a.speak();
        }
    };
}
