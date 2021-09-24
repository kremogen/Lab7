package com.kremogen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия");
        System.out.println(states.get(1));
        states.set(1, "Дания");
        System.out.printf("В списке %d элемента(ов) \n", states.size());
        for (String state : states) {
            System.out.println(state);
        }
        if (states.contains("Германия")) {
            System.out.println("Список содержит государство Германия");
            Object[] countries = states.toArray();
            for (Object country : countries) {
                System.out.println(country);
            }
        }
    }
}