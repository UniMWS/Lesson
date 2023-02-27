package ru.netology.lesson18.PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();// будет выдавать сравнивая, а не в порядке добавления
        queue.offer("Petya");// offer не кидает исключения, а дает ответ да или нет при добавлении
        queue.offer("Olya");
        queue.offer("Tanya");

        queue.remove("Olya");

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }
    }
}
