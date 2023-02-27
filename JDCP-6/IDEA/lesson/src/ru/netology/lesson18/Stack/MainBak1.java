package ru.netology.lesson18.Stack;

import java.util.Stack;

public class MainBak1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();// стопка: первым вошёл - последним вышел
        stack.push("Petya");// не общий для всех add, а свой метод push - положить на стопку
        stack.push("Olya");
        stack.push("Tanya");

        System.out.println(stack.pop());// без параметров - он просто снимает элемент на стопке
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
