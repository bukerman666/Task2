package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] parameters = new String[10];
        String[] captions = {"Введите данные первого человека\nПол: ", "Имя: ", "Фамилия: ", "Рост: ", "Вес: ", "Введите данные второго человека\nПол: ", "Имя: ", "Фамилия: ", "Рост: ", "Вес: "};
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(captions[i]);
            parameters[i] = scan.next();
        }
        Human hum1 = null, hum2 = null;

        if (parameters[0].equalsIgnoreCase("м")) {
            hum1 = new Man(parameters[1], parameters[2], Float.parseFloat(parameters[3]), Float.parseFloat(parameters[4]));
        } else if (parameters[0].equalsIgnoreCase("ж")) {
            hum1 = new Women(parameters[1], parameters[2], Float.parseFloat(parameters[3]), Float.parseFloat(parameters[4]));
        } else {
            System.out.println("Возможный пол человека М или Ж, попвторите ввод");
        }

        if (parameters[5].equalsIgnoreCase("м")) {
            hum2 = new Man(parameters[6], parameters[7], Float.parseFloat(parameters[8]), Float.parseFloat(parameters[9]));
        } else if (parameters[5].equalsIgnoreCase("ж")) {
            hum2 = new Women(parameters[6], parameters[7], Float.parseFloat(parameters[8]), Float.parseFloat(parameters[9]));
        } else {
            System.out.println("Возможный пол человека М или Ж, попвторите ввод");
        }

        System.out.println(hum1.toString());
        System.out.println(hum2.toString());
        compatibilityTest(hum1, hum2);

    }

    private static Human compatibilityTest(Human hum1, Human hum2) {
        Human hum3 = hum1.haveRelationships(hum2);
        if (hum3 != null) {
            System.out.println(hum3);
            return hum3;
        } else
            return hum3;
    }


}
