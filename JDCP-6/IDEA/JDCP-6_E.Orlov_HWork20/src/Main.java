import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-20 + Коллекции TreeMap и TreeSet\nЗадача 1:");
        System.out.println("1. У кого больше СЛОВ в фамилии, тот более знатен\n" +
                "2. Если количества СЛОВ в фамилии одинаковы, то знатен больше тот, кто старше\n");
        List<Person> people = new ArrayList<>();
        people.add(new Person("Донат", "Фон Типа Принц Польский", 19));
        people.add(new Person("Омар", "Шейх Мирза Тамерлан", 17));
        people.add(new Person("Гарри", "Поттер Фром Хогвардс Мимо Хагрид", 12));
        people.add(new Person("Али", "Баба Ибн Сорок Коллекторов", 16));
        // форматирование и вывод списка до сортировки
        String printPeople = people.toString()
                .replaceAll("\\[", "")  // удаление [
                .replaceAll("]", ""); // удаление ]
        System.out.printf("Список людей до сортировки:%s.\n", printPeople);
        System.out.println("\nЗадача 2: указывается максимальное количество слов в фамилии");
        // сортировка с компаратором и максимальным количеством СЛОВ в фамилии
        Collections.sort(people, new PersonsSurnameAgeComparator(4));// Задача 2
        // форматированный вывод списка
        System.out.printf("Список после сортировки:%s.\n", people.toString().replaceAll("\\[|\\]", ""));
    }
}