package ru.netology.lesson12.CreatingYourOwnErrors;

public class NameInputMismatchException extends RuntimeException {
    public NameInputMismatchException(String text) {//создаем конструктор, который передает ЭТОТ текст выше
        super("В параметре надо указать \"Имя Фамилия\" через пробел, а не " + text);
    }
}
