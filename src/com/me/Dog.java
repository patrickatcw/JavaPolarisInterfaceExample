package com.me;

public class Dog implements IAnimal{

    private String Name;
    private String soundAnimalMakes;

    public Dog(String name, String soundAnimalMakes) {
        this.Name = name;
        this.soundAnimalMakes = soundAnimalMakes;
    }

    @Override
    public String name() {
        return toString();
    }

    @Override
    public String getNameOfAnimal() {
        return toString();
    }

    @Override
    public Void setNameOfAnimal(String nameOfAnimal) {
        return null;
    }

    @Override
    public String soundAnimalMakes() {
        return toString();
    }

    /*@Override
    public String name() {
        return null;
    }

    @Override
    public String getNameOfAnimal() {
        return soundAnimalMakes;
    }

    @Override
    public Void setNameOfAnimal(String nameOfAnimal) {
         Name = nameOfAnimal;
    }

    @Override
    public String soundAnimalMakes() {
        return soundAnimalMakes;
    }*/
}
