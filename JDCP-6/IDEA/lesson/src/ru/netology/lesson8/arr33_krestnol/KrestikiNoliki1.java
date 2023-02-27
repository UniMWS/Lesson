package ru.netology.lesson8.arr33_krestnol;

import java.util.Scanner;

public class KrestikiNoliki1 {
    public static final int SIZE = 3;
    public static final char EMPTY = '-';

    public static void main(String[] args) {
        //ячейка поля 3 состояния, поэтому char, а не boolean!
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
                //System.out.print(field[i][j] + " ");
            }
            //System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи координаты");
        printField(field);//в методе 2-массив и передать надо ИМЯ 2-массива БЕЗ кв-скоб!
        String input = scanner.nextLine();// "1 2"
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]) - 1;
        int y = Integer.parseInt(parts[1]) - 1;
        if (field[x][y] !=EMPTY){
            // TODO переходить
        }
        field[x][y]='x';
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
