package ru.netology.lesson7.arr5_sort;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        String[] names = {
                "Petya",
                "Olya",
                "Anya",
                "Pavel",
                "Oleg"
        };
        //Arrays.sort(names);
        //System.out.println(Arrays.toString(names));
        String[] names2 = names.clone();
        names2[0] = null;
        //Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));
    }
}
