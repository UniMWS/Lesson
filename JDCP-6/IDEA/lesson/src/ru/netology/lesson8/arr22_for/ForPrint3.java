package ru.netology.lesson8.arr22_for;

import java.util.Arrays;

public class ForPrint3 {
    public static void main(String[] args) {
        int[][] arr2 = {
                {1},
                {22, 222},
                {333, 345, 478}
        };
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int[][][] arr3 = new int[10][20][5];
        System.out.println(Arrays.deepToString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
