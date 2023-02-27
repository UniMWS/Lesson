package ru.netology.lesson8.arr33_krestnol;

import java.util.Scanner;

public class KrestikiNoliki6 {
    public static final int SIZE = 3;
    public static final char EMPTY = '-';
    public static final char CROSS = 'x';
    public static final char ZERO = '0';

    public static void main(String[] args) {
        //ячейка поля 3 состояния, поэтому char, а не boolean!
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
        Scanner scanner = new Scanner(System.in);
        boolean isCrossTurn = true;

        System.out.println("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!");
        printField(field);//в методе 2-массив и передать надо ИМЯ 2-массива БЕЗ кв-скоб!
        String input = scanner.nextLine();// "1 2"
        String[] parts = input.split(" ");
        int x = Integer.parseInt(parts[0]) - 1;
        int y = Integer.parseInt(parts[1]) - 1;
        if (field[x][y] != EMPTY) {
            // TODO переходить
        }
        field[x][y] = isCrossTurn ? CROSS : ZERO;
        if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
            System.out.println("Выграли " + (isCrossTurn ? "крестики" : "нолики") + "!");
            // TODO завершить игру
        } else {
            // TODO ходит другой игрок
        }
    }

    //ВНИМАНИЕ, только 3х3!
    public static boolean isWin(char[][] field, char player) {
        //строки
        if (field[0][0] == player && field[0][1] == player && field[0][2] == player)
            return true;
        if (field[1][0] == player && field[1][1] == player && field[1][2] == player)
            return true;
        if (field[2][0] == player && field[2][1] == player && field[2][2] == player)
            return true;
        //столбцы
        if (field[0][0] == player && field[1][0] == player && field[2][0] == player)
            return true;
        if (field[0][1] == player && field[1][1] == player && field[2][1] == player)
            return true;
        if (field[0][2] == player && field[1][2] == player && field[2][2] == player)
            return true;
        //диагонали
        if (field[0][0] == player && field[1][1] == player && field[2][2] == player)
            return true;
        if (field[2][0] == player && field[1][1] == player && field[0][2] == player)
            return true;
        return false;
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
