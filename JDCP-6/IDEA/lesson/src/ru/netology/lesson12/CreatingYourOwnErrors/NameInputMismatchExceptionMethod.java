package ru.netology.lesson12.CreatingYourOwnErrors;

public class NameInputMismatchExceptionMethod extends RuntimeException {
    public NameInputMismatchExceptionMethod(String text) {//создаем конструктор, который передает ЭТОТ текст выше
//        super("В параметре надо указать \"Имя Фамилия\" через пробел, а не " + text);
        super(String.format("В параметре надо указать \"Имя Фамилия\" через пробел, а не '%s'", text));
        System.out.println(String.format("В параметре надо указать \"Имя Фамилия\" через пробел, а не '%s'", text));
    }
}
