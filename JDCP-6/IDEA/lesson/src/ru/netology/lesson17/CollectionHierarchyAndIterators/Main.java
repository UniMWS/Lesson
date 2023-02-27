package ru.netology.lesson17.CollectionHierarchyAndIterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      [0, 1, 2, _, _, _, ...]
        List<String> list = new ArrayList<>();// по правилам полиморфизма
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");

//      обычный способ из массивов
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("или так");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Итерирование по List");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Grapefruit", "Grapes", "Lemon");
        System.out.println("Обычный цикл");
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println("fruit: " + fruit);
        }
        System.out.println("foreach цикл");
        for (String fruit : fruits) {
            System.out.println("fruit: " + fruit);
        }
        System.out.println("Обычный цикл с итератором");
        for (Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
            String fruit = it.next();
            System.out.println("fruit: " + fruit);
        }
        System.out.println("Итератор с циклом while");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println("fruit: " + fruit);
        }

//      А вот это прям совсем интересно - что это?
        System.out.println("Stream forEach из Java 8");
        fruits.stream()
                .filter(fruit -> !fruit.equals("Potato"))
                .forEach(fruit -> System.out.println("fruit: " + fruit));

        System.out.println("for each из Java 8");
        fruits.forEach(fruit -> System.out.println("fruit: " + fruit));
    }
}
