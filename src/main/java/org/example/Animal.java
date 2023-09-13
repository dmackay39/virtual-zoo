package org.example;

public abstract class Animal implements Speaking {

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    private String name;
    private String type;
    public Animal(String inputName, String inputType){
        this.name = inputName;
        this.type = inputType;
    }


    public abstract void speak();


}
