package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.util.Scanner;

public class MainZeroValueException {
    public static void main(String[] args) throws ZeroValueException {//потому что extends Exception
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int value1 = scanner.nextInt();
        if (value1 == 0) {
            throw new ZeroValueException("первое число");
        }
        System.out.println("Введите второе число:");
        int value2 = scanner.nextInt();
        if (value2 == 0) {
            throw new ZeroValueException("второе число");
        }
        System.out.println(value1 / value2);
    }
}
    /*Stacktrace можно вывести у любого объекта Throwable
    (и всех его потомков, например Exceptions) вызвав метод
    printStackTrace() или getStackTrace(), такое бывает нужно,
    если мы хотим гарантировать вывод stacktrace, например, в terminal или console.
    Вывод stacktrace позволяет быстро понять, в каком методе произошла ошибка
    без дополнительного вывода переменных, точек остановки программы и сообщений логирования.
    При возникновении ошибки стоит первым делом посмотреть, что было выведено в stacktrace.*/