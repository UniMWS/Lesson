package ru.netology.lesson9.kviz.OrcsAndHumans;

public class Human extends Player {
    public static final int LEARN_PROBABILITY = 30;
    public static final int LEARN_HITPOINTS_COEF = 7;

    public Human(String name, int health, int hitPoints) {
        super(name, health, hitPoints);
    }

    public boolean learnFrom(Human human) {
        if (prob(LEARN_PROBABILITY)) {
            System.out.println(this + " ~~~~~перенял опыт от~~~~~ " + human);
            hitPoints += human.hitPoints / LEARN_HITPOINTS_COEF;
            return true;
        } else {
            return false;
        }
    }

    public void hit(Orc orc) {
        System.out.println(this + " -----VS----- " + orc);
        orc.decreaseHealth(hitPoints);
    }

    @Override
    public String toString() {
        return "[Альянс] " + super.toString();
    }
}