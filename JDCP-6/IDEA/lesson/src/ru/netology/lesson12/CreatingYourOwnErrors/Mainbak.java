package ru.netology.lesson12.CreatingYourOwnErrors;

public class Mainbak {
    public static void main(String[] args) {
//        System.out.println(sameLength("Petrov Petya"));
        if (sameLength("Petrov Petya")) System.out.println("Yes");
        else System.out.println("None");
    }

    public static boolean sameLength(String text) {//"Petrov Petya"
        String[] parts = text.split(" ");//["petrov", "Petya"]
//        String name = parts[1];
//        String lastName = parts[0];
//        return name.length() == lastName.length();
        return parts[0].length() == parts[1].length();
    }
}
