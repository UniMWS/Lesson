package ru.netology.lesson12.CreatingYourOwnErrors;

public class Mainbak3 {
    public static void main(String[] args) {

//        if (sameLength("Petrov Petya")) System.out.println("Yes");
        if (sameLength("Petrov")) System.out.println("Yes");
        else System.out.println("None");
    }

    public static boolean sameLength(String text) {//"Petrov Petya"
        String[] parts = text.split(" ");//["petrov", "Petya"]
        if (parts.length != 2) {
            throw new RuntimeException("В параметре надо указать имя и фамилию через пробел, а не " + text);
        }
        return parts[0].length() == parts[1].length();
    }
}
