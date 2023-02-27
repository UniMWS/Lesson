package ru.netology.lesson7.arr3_string;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] arr = {"Petya", "Olya", "Tanya"};
        System.out.println(Arrays.toString(arr));

        Singer[] arr2 = {
                new Singer("Petya", 8),
                new Singer("Tanya", 15, 4)
        };
        //System.out.println(Arrays.toString(arr2));
        //System.out.println(Arrays.stream(arr2).toArray());
        System.out.println(arr2.length);

        //System.out.println(Arrays.deepToString(arr2));//???
        //Singer[][] arr3 = new Singer[][]{arr2};//???
        //System.out.println(Arrays.deepToString(arr3));//???

        for (Singer name : arr2) {
            System.out.println(name);
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        Singer arr4 = arr2[1];
        System.out.println(arr4.name + " " + arr4.age + " " + arr4.rating);
        String arr5 = arr2[1].name;
        System.out.println(arr5.toCharArray());
        System.out.println();
        System.out.println(arr2[1].name + " " + arr2[1].age + " " + arr2[1].rating);
        System.out.printf("%s -- %d -- %d \n", arr2[1].name, arr2[1].age, arr2[1].rating);
        System.out.println();
        String[] arr6 = {arr2[0].name, arr2[1].name};
        System.out.println(Arrays.deepToString(arr6));
    }
}
