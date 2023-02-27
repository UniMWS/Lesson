package ru.netology.lesson18.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Petya");// offer не кидает исключения, а дает ответ да или нет при добавлении
        queue.offer("Olya");
        queue.offer("Tanya");

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }
    }
}
