package ru.netology.lesson18.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> s = new ArrayDeque<>();// работаем со стопкой здесь, а не Stack
        s.push("Petya");// не общий для всех add, а свой метод push - положить на стопку
        s.push("Olya");
        s.push("Tanya");

//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }
        for (String ss:s) {
            System.out.println(ss);
        }
    }
}
