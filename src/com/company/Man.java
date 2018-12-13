package com.company;


public class Man extends Human {

    public Man(String name, String surname, float height, float weight) {
        super(name, surname, height, weight);
        this.sex = true;
    }

    @Override
    protected Human giveBirth(Human human) {
        System.out.println("Мужики не рожают, они даже взрослеют с трудом.");
        return null;
    }


    @Override
    public String toString() {
        return "Мужчина: " +
                name + " " +
                surname + ", " +
                "ростом " + height + "см. и весом "
                + weight + "кг.";
    }

}
