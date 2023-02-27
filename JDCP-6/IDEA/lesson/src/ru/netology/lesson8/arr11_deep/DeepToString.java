package ru.netology.lesson8.arr11_deep;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[][] arr2 = new int[3][];
        arr2[0] = new int[1];
        arr2[1] = new int[4];
        arr2[2] = new int[2];
        arr2[1][3] = 15;
        System.out.println(Arrays.deepToString(arr2));
        int[][] arr3 = new int[3][5];
        arr3[1][3] = 15;
        System.out.println(Arrays.deepToString(arr3));
        int[][] arr4 = {
                new int[1],
                new int[4],
                new int[2]
        };
        arr4[1][3] = 15;
        System.out.println(Arrays.deepToString(arr4));
        int[][] arr5 = {
                {1},
                {22, 222, 2222},
                {333, 345, 478}
        };
        System.out.println(Arrays.deepToString(arr5));
        arr5[1][2] = 15;
        System.out.println(Arrays.deepToString(arr5));
    }
}
