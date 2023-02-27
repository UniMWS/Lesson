package ru.netology.lesson17.ArrayListClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//      [0, 1, 2, _, _, _, ...]
        ArrayList<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");
        System.out.println(list);
        System.out.println(list.size());
        list.set(0, "Kolya");
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1, "Pasha");
        System.out.println(list);
        System.out.println("проверяем наличие Olya: " + list.contains("Olya"));
        // получить индекс первого элемента с указанным значением, если не найдено, то -1
        int pos = list.indexOf("Mark");
        System.out.println(pos);
        // получить индекс последнего элемента с указанным значением, если не найдено то -1
        pos = list.lastIndexOf("Tanya");
        System.out.println(pos);
        // получить все элементы списка в виде массива
        String[] peopleArray = list.toArray(new String[0]);
        System.out.println(Arrays.toString(peopleArray));
        System.out.println(peopleArray[1]);
        // получить часть массива
        ArrayList<String> people =new ArrayList<>(list.subList(1, 3));
        System.out.println(people);
    }
}
