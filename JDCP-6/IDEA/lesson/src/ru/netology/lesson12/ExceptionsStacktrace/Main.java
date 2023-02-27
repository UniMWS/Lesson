package ru.netology.lesson12.ExceptionsStacktrace;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        /*Во время работы JVM в каждый момент времени хранит всю цепочку вызовов методов,
         складывая их в специальную коллекцию stack. Каждый новый метод, вызываемый JVM,
         попадает в этот stack до момента своего завершения и возвращения результата.
         В момент возникновения исключительной ситуации JVM возвращает значение этой коллекций stack,
         в котором можно увидеть класс и метод возникновения ошибки — эта коллекция называется stacktrace:*/

        try /*(или здесь в скобках перечисляем ресурсы, которые надо закрыть после try)*/ {
            String s = "Hello";
            char c = get10th(s);
            System.out.println("Ответ был: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("ОШИБКА 1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ОШИБКА 2");
        } catch (InputMismatchException e) {//для сканера
            System.out.println("ОШИБКА 3");
        } /*finally {// блок дополнительного кода
            System.out.println("Обычно в этом блоке происходит закрытие и освобождение ресурсов (файла, сетевого соединения и т. д.).");
        }*/

        System.out.println("Bay");
    }

    public static char get10th(String s) {
        System.out.println("Начинаем извлечение символа");
        char c = s.charAt(10);
        System.out.println("Вынули символ");
        return c;
    }
}
