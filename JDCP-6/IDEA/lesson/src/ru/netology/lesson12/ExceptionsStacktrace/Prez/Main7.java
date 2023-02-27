package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.Scanner;

public class Main7 {//Но обратное расположение допустимо и часто используется - прям супер получилось;)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            String value1 = scanner.nextLine();
            System.out.println("Введите второе число:");
            String value2 = scanner.nextLine();
            int parseValue1 = Integer.parseInt(value1);
            int parseValue2 = Integer.parseInt(value2);
            System.out.println(parseValue1 / parseValue2);
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль");
        } catch (RuntimeException exception) {
            System.out.println("Введенные данные не корректны");
        } finally {
            scanner.close();
        }
    }
}
