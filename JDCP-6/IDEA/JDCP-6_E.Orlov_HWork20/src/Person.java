import java.util.*;

public class Person {
    private String name;
    private String surname;
    private int age;
    List<String> surnameSet = new ArrayList<>();// все СЛОВА фамилии в список для получения количества

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        Collections.addAll(this.surnameSet, surname.split("\\P{IsAlphabetic}+"));
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> getSurnameSet() {
        return surnameSet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("\n%s %s - %d лет", getName(), getSurname(), getAge());
    }
}
