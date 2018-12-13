package com.company;


import java.util.Random;

public abstract class Human {
    boolean sex;
    String name;
    String surname;
    float height;
    float weight;


    public Human(String name, String surname, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean talk(Human human) {
        if (this.sex == false && human.sex == false)
            return true;
        else if (this.sex != human.sex)
            return true;
        else return (new Random().nextBoolean());
    }

    public boolean endureSoсiety(Human human) {
        if (this.sex == false && human.sex == false)
            return (new Random().nextBoolean());
        else if (this.sex != human.sex)
            return (Math.random() < .7);
        else return (Math.random() < .56);
    }

    public boolean spentTime(Human human) {
        if (this.height / human.height >= 1.1 || human.height / this.height >= 1.1) {
            return (Math.random() < .85);
        } else return (Math.random() < .95);
    }

    public Human haveRelationships(Human human) {
        boolean[] conditions = {this.talk(human), this.endureSoсiety(human), this.spentTime(human)};
        System.out.println(this.name + " и " + human.name + " "
                + (conditions[0] ? "могут" : "не могут")
                + " говорить, " + (conditions[1] ? "могут" : "не могут")
                + " терпеть общество друг друга и "
                + (conditions[2] ? "могут" : "не могут")
                + " проводить время вместе.");
        if (conditions[0] && conditions[1] && conditions[2] && this.sex != human.sex) {
            System.out.println("Соответственно " + this.name + " и " + human.name + " могут иметь отношения, и конечно же заведут ребенка.");
            if (this.sex == false) {
                return this.giveBirth(human);
            } else {
                return human.giveBirth(this);
            }
        } else {
            System.out.println("Ничего не вышло, разбежались :(");
            return null;
        }
    }

    protected abstract Human giveBirth(Human human);
}



