package ru.netology.lesson7.arr4_foreach;

public class Main4_1 {
    public static void main(String[] args) {
        String[] names = {
                "Petya",
                "Olya",
                "Anya",
                "Pavel",
                "Oleg"
        };
        if(!names[0].startsWith("P")) {
            System.out.println(names[0]);
        }
        if(!names[1].startsWith("P")) {
            System.out.println(names[1]);
        }
        if(!names[2].startsWith("P")) {
            System.out.println(names[2]);
        }
        if(!names[3].startsWith("P")) {
            System.out.println(names[3]);
        }
        if(!names[4].startsWith("P")) {
            System.out.println(names[4]);
        }
    }
}
