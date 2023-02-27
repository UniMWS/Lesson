package ru.netology.lesson12.CreatingYourOwnErrors;

public class Mainbak4 {
    public static void main(String[] args) throws Exception {// можно аж сюда тоже пихнуть throws Exception

//        if (sameLength("Petrov Petya")) System.out.println("Yes");
        if (sameLength("Petrov")) System.out.println("Yes");
        else System.out.println("None");
    }

    //    public static boolean sameLength(String text) {//"Petrov Petya"
    public static boolean sameLength(String text) throws Exception {//"Petrov Petya"
        String[] parts = text.split(" ");//["petrov", "Petya"]
        if (parts.length != 2) {
//            throw new RuntimeException("В параметре надо указать имя и фамилию через пробел, а не " + text);
            throw new Exception("В параметре надо указать имя и фамилию через пробел, а не " + text);
        }
        return parts[0].length() == parts[1].length();
    }
}
