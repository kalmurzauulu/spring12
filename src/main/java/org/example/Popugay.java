package org.example;

public class Popugay implements Animal{

    private String name;

    private String colour;

    private String breed;

    public Popugay() {
    }

    public Popugay(String name, String colour, String breed) {
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
        return "Popugay{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void animalplus() {
        System.out.println("az tamak jeyt");

    }

    @Override
    public void animalminus() {
        System.out.println("akcha tappayt");
    }

}
