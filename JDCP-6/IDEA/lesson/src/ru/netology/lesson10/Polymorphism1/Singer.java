package ru.netology.lesson10.Polymorphism1;

public class Singer extends Person {
    public Singer(String name, int age, int rating) {
        super(name, age); // super значит обратиться В НАЧАЛЕ к полям предка!
        this.rating = rating;// потому что!
    }

    public int rating;

    public void sing(String verse) {
        System.out.println("Я пою " + verse);
    }

    @Override // мы точно указали, что МЕНЯЕМ версию предка, а не создаём свою другую!
    public void happyBirthDay() {// не ниже предка!
        System.out.println("v/s+super");
        super.happyBirthDay();// super. взять версию предка
        //своя версия:
        System.out.println("Happy Birth Day, " + name + "! - тебе уже " + age + " лет! (v/s)");
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + name + " (" + age + " лет)";
    }

    @Override
    public void printRating() {
        //super.printRating();
        System.out.println(rating);
    }
}
