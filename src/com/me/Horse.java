package com.me;

public class Horse implements IAnimal {

    private String name;
    private String soundAnimalMakes;


    public Horse(String name, String soundAnimalMakes) {
        this.name = name;
        this.soundAnimalMakes = soundAnimalMakes;
    }

    @Override
    public String name() {
        return name;
    }

    /*@Override
    public String getNameOfAnimal() {
        return toString();
    }

    @Override
    public String setNameOfAnimal(String nameOfAnimal) {
        return toString();
    }*/

    @Override
    public String soundAnimalMakes() {
        return soundAnimalMakes;
    }
}
