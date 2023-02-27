package ru.netology.lesson12.ExceptionsStacktrace.Prez;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class MainThrows {//Пример объявления checked-исключения throws - жопа какая-то

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дату в формате 'dd MM yyyy'");
            String inputDate = scanner.nextLine();
            Date date = parseDate(inputDate);
            System.out.println(date);
        } catch (ParseException exception) {
            System.out.println("Ошибка разбора даты");
        }
    }

    private static Date parseDate(String inputDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        return dateFormat.parse(inputDate);
    }
}