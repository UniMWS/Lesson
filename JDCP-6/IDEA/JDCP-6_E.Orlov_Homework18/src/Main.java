import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("JDCP-6 + Евгений Орлов + ДЗ-18 + Коллекции Queue");
        System.out.println();
//        System.out.println("Список: " + generateClients());// для контроля
        Deque<Person> attraction = new ArrayDeque<>();// создание очереди на аттракцион
        for (Person nextPerson : generateClients()) {// заполнение очереди на аттракцион
            attraction.offerLast(nextPerson);
        }
        while (!attraction.isEmpty()) {// собственно покатушки по очереди
            Person nextClient = attraction.pollFirst();
            nextClient.setTickets(nextClient.getTickets() - 1);
            System.out.print(nextClient.getName() + " " + nextClient.getLastName() + " - прокатили на аттракционе, ");
            System.out.println(nextClient.getTickets() > 0 ? ("осталось билетов: " + nextClient.getTickets()) : "билеты кончились.");
            if (nextClient.getTickets() > 0) {
                attraction.offerLast(nextClient);
            }
//            System.out.println(attraction.isEmpty() ? "Очередь пуста." : ("В очереди: " + attraction));// для контроля
        }
    }

    public static List<Person> generateClients() {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Саша", "Кроткий", 2));
        listPerson.add(new Person("Вася", "Наглый", 6));
        listPerson.add(new Person("Маша", "Неотложка", 4));
        listPerson.add(new Person("Петя", "Левый", 5));
        listPerson.add(new Person("Даша", "Обыкновенная", 3));
        return listPerson;
    }
}