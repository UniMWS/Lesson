package ru.netology.lesson9.kviz.OrcsAndHumans;

public class Player {
    protected String name;
    protected int health;
    protected int hitPoints;

    public Player(String name, int health, int hitPoints) {
        this.name = name;
        this.health = health;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public boolean decreaseHealth(int damage) {
        health -= damage;
        return health <= 0;
    }

    public boolean isAlive() {
        return health > 0;
    }

    protected static boolean prob(int percents) {
        return Math.random() < percents / 100.;
    }

    @Override
    public String toString() {
        return getHitPoints() + "/" + getHealth() + " " + getName();
    }
}