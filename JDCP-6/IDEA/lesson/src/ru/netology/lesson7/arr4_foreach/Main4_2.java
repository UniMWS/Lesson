package ru.netology.lesson7.arr4_foreach;

public class Main4_2 {
    public static void main(String[] args) {
        String[] names = {
                "Petya",
                "Olya",
                "Anya",
                "Pavel",
                "Oleg"
        };
        for (int i = 0; i < names.length; i++) {
        //for (int i = 0; i < 5; i++) {
            if (!names[i].startsWith("P")) {
                System.out.println(names[i]);
            }
        }
        System.out.println();
        for (String name : names) {
            if (!name.startsWith("P")) {
                System.out.println(name);
            }
        }
    }
}
