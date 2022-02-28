package org.example;

public class Cat implements Animal{
    private String name;

    private String colour;

    private String breed;

    public Cat() {
    }

    public Cat(String name, String colour, String breed) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }


    @Override
    public  void animalplus() {
        System.out.println("Чычкан кармайт");
    }

    @Override
    public void animalminus() {
        System.out.println("Коп уктайт");
    }
}

