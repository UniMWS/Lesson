package ru.netology.lesson7.arr1_int;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 15;
        arr[3] = 100;
        arr[4] = 1;
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 3, 15, 100, 1};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr == arr2);
        System.out.println(arr.equals(arr2));
        System.out.println(Arrays.equals(arr, arr2));
    }
}
