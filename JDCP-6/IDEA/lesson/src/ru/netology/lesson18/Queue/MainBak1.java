package ru.netology.lesson18.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainBak1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Petya");// offer не кидает исключения, а дает ответ да или нет при добавлении
        queue.offer("Olya");
        queue.offer("Tanya");

        System.out.println(queue.peek());// peek только Показывает элемент в очереди не Извлекая
        System.out.println(queue.poll());// pool Извлекает эелемент или null
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());// проверка пустоты Только через isEmpty
    }
}
