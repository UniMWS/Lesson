package ru.netology.lesson18.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();// Двусторонняя очередь
        deque.offerFirst("Petya");// работаем с первым концом
        System.out.println(deque.pollLast());// всё равно Petya, так как добавили Только с одного конца

        System.out.println(deque.poll());
    }
}
