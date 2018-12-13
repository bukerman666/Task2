package com.company;

import java.util.Random;
import java.util.Scanner;

public class Women extends Human {
    public Women(String name, String surname, float height, float weight) {
        super(name, surname, height, weight);
        this.sex = false;
    }

    @Override
    public Human giveBirth(Human human) {
        if (this.sex != human.sex) {
            if (new Random().nextBoolean()) {
                System.out.println("Введите имя мальчика: ");
                Scanner scan = new Scanner(System.in);
                String childName = scan.next();
                scan.close();
                float childHeight = human.height + 0.1f * (this.height - human.height);
                float childWeight = human.weight + 0.1f * (this.weight - human.weight);
                System.out.print("Ребенок ");
                return new Man(childName, human.surname, childHeight, childWeight);
            } else {
                System.out.println("Введите имя девочки: ");
                Scanner scan = new Scanner(System.in);
                String childName = scan.next();
                scan.close();
                float childHeight = this.height + 0.1f * (human.height - this.height);
                float childWeight = this.weight + 0.1f * (human.weight - this.weight);
                System.out.print("Ребенок ");
                return new Women(childName, human.surname, childHeight, childWeight);
            }
        } else return null;
    }

    @Override
    public String toString() {
        return "Женщина: " +
                name + " " +
                surname + ", " +
                "ростом " + height + "см. и весом "
                + weight + "кг.";
    }
}
