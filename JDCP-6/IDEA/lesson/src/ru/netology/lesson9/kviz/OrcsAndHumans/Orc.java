package ru.netology.lesson9.kviz.OrcsAndHumans;

public class Orc extends Player {
    public static final int FOLLOW_PROBABILITY = 30;
    public static final int RAGE_COEF = 2;

    protected Orc battleLeader;

    public Orc(String name, int health, int hitPoints) {
        super(name, health, hitPoints);
    }

    public void follow(Orc orc) {
        if (battleLeader == null && prob(FOLLOW_PROBABILITY)) {
            this.battleLeader = orc;
            System.out.println(this + " ~~~~~стал последователем~~~~~ " + orc);
        }
    }

    public void hit(Human human) {
        if (battleLeader != null && !battleLeader.isAlive()) {
            System.out.println(this + " ---RAAAGE--- " + human);
            human.decreaseHealth(RAGE_COEF * hitPoints);
            battleLeader = null;
        } else {
            System.out.println(this + " -----VS----- " + human);
            human.decreaseHealth(hitPoints);
        }
    }

    @Override
    public String toString() {
        return "[Орда] " + super.toString();
    }
}