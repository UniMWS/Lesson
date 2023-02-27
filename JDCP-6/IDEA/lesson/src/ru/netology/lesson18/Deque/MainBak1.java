package ru.netology.lesson18.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class MainBak1 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();// Двусторонняя очередь
        deque.offerFirst("Petya");// работаем с первым концом
        System.out.println(deque.pollFirst());

        System.out.println(deque.poll());
    }
}
