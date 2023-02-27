package ru.netology.lesson12.ExceptionsStacktrace.Prez;

public class ZeroValueException extends Exception {//кстати форматированный вывод!
    public ZeroValueException(String value) {
        super(String.format("Значение '%s' должно быть больше 0", value));
    }
}
