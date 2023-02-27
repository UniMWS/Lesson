package ru.netology.lesson8.arr22_for;

import java.util.Arrays;

public class ForPrint {
    public static void main(String[] args) {
        int[][] arr2 = {
                {1},
                {22, 222},
                {333, 345, 478}
        };
        System.out.println(Arrays.deepToString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            int[] tmp = arr2[i];
            for (int j = 0; j < tmp.length; j++) {
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        }
    }
}
