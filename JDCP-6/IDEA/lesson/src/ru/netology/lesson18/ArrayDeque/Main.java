package ru.netology.lesson18.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        // 789___123456

        Deque<String> deque = new ArrayDeque<>();// массив
        deque.offerFirst("Petya");// работаем с первым концом
        System.out.println(deque.pollLast());// всё равно Petya, так как добавили Только с одного конца

        System.out.println(deque.poll());
    }
}
