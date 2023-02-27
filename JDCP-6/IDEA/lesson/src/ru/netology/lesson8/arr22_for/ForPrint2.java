package ru.netology.lesson8.arr22_for;

import java.util.Arrays;

public class ForPrint2 {
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
    }
}
