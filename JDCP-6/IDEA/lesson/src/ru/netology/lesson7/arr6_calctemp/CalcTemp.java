package ru.netology.lesson7.arr6_calctemp;

import java.util.Arrays;
import java.util.Scanner;

public class CalcTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temps = new int[30];
        //Arrays.fill(temps, -1_000_000);
        boolean[] isFilled = new boolean[30];
        while (true) {
            System.out.println("Вееди два числа: дата температура");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] parts = input.split(" ");
            int day = Integer.parseInt(parts[0]) - 1;
            int t = Integer.parseInt(parts[1]);
            //System.out.println(day + " " + t);
            temps[day] = t;
            isFilled[day] = true;
            double sum = 0;
            for (int tt : temps) {
                sum += tt;
            }
            int cnt = 0;
            for (boolean f : isFilled) {
                if (f) {
                    cnt++;
                }
            }
            System.out.println("Средняя температура: " + (sum / cnt));
        }
    }
}
