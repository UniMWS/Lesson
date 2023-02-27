package ru.netology.lesson9.Inheritance;

public class Singer extends Person {
//        public Singer(String name, int age) {
//        super(name, age); // super значит обратиться к полям предка!
//    }
    public int rating;

    public void sing(String verse) {
        System.out.println("Я пою " + verse);
    }

    @Override // мы точно указали, что МЕНЯЕМ версию предка, а не создаём свою другую!
    public void happyBirthDay() {
        super.happyBirthDay();// super. взять версию предка
        //своя версия:
//        age++;//напрямую, если public, protected или default
        int age = getAge() + 1;// если private и можно использовать super.
        super.setAge(age);// если private и можно не использовать super.
        System.out.println("Happy Birth Day, " + super.getName() + "! - уже " + age + " лет!");// super. взять версию предка
    }

    @Override
    public String toString() {
        return "[" + rating + "] " + getName() + " (" + getAge() + " лет)";
    }

    @Override
    public void printRating() {
        //super.printRating();
        System.out.println(rating);
    }
}
