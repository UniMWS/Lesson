package ru.netology.lesson9.kviz.OrcsAndHumans;

import java.util.Random;

class Main {
    public static final int HUMANS_COUNT = 6;
    public static final Human[] HUMANS = new Human[HUMANS_COUNT];
    public static final int START_HUMAN_HEALTH = 100;
    public static final int START_HUMAN_HITS = 20;

    public static final int ORCS_COUNT = 3;
    public static final Orc[] ORCS = new Orc[ORCS_COUNT];
    public static final int START_ORC_HEALTH = 180;
    public static final int START_ORC_HITS = 30;

    private static final Random RANDOM = new Random();

    // Вывод поля на экран
    public static void printField() {
        StringBuilder field = new StringBuilder();
        for (Human h : HUMANS) {
            if (!h.isAlive()) {
                field.append("-");
            } else if (h.getHealth() < START_HUMAN_HEALTH / 2) {
                field.append("h");
            } else {
                field.append("H");
            }
            field.append(" ");
        }
        field.append("   ");
        for (Orc o : ORCS) {
            if (!o.isAlive()) {
                field.append("_");
            } else if (o.getHealth() < START_ORC_HEALTH / 2) {
                field.append("o");
            } else {
                field.append("O");
            }
            field.append(" ");
        }
        System.out.println(field);
    }

    // Проверка того закончилась ли битва
    public static boolean checkFinish() {
        boolean hasHumansAlive = false;
        for (Human human : HUMANS) {
            if (human.isAlive()) hasHumansAlive = true;
        }
        if (!hasHumansAlive) {
            System.out.println("ПОБЕДИЛА ОРДА!");
            return true;
        }

        boolean hasOrcsAlive = false;
        for (Orc orc : ORCS) {
            if (orc.isAlive()) hasOrcsAlive = true;
        }
        if (!hasOrcsAlive) {
            System.out.println("ПОБЕДИЛ АЛЬЯНС!");
            return true;
        }

        return false;
    }

    // Метод для случайного выбора живого орка
    public static Orc selectOrc() {
        while (true) {
            Orc orc = ORCS[RANDOM.nextInt(ORCS_COUNT)];
            if (orc.isAlive()) return orc;
        }
    }

    // Метод для случайного выбора живого человека
    public static Human selectHuman() {
        while (true) {
            Human human = HUMANS[RANDOM.nextInt(HUMANS_COUNT)];
            if (human.isAlive()) return human;
        }
    }

    public static void main(String[] args) throws Exception {
        // Заполняем массивы армий
        for (int i = 0; i < HUMANS_COUNT; i++) {
            HUMANS[i] = new Human("Чел-" + (i + 1), START_HUMAN_HEALTH, START_HUMAN_HITS);
        }
        for (int i = 0; i < ORCS_COUNT; i++) {
            ORCS[i] = new Orc("Орк-" + (i + 1), START_ORC_HEALTH, START_ORC_HITS);
        }

        int round = 1;
        while (!checkFinish()) {
            System.out.println();
            System.out.println("ROUND " + round++);
            // Люди учатся друг у друга
            for (Human human : HUMANS) {
                if (!human.isAlive()) continue;
                Human otherHuman = selectHuman();
                if (human == otherHuman) continue;
                human.learnFrom(otherHuman);
            }
            // Орки выбирают наставников
            for (Orc orc : ORCS) {
                if (!orc.isAlive()) continue;
                Orc otherOrc = selectOrc();
                if (orc == otherOrc) continue;
                orc.follow(otherOrc);
            }
            // Человек ли сейчас пойдёт в атаку?
            if (RANDOM.nextBoolean()) {
                Human attacker = selectHuman();
                Orc defender = selectOrc();
                attacker.hit(defender); // человек атакует
                if (defender.isAlive()) defender.hit(attacker); // орк атакует
            } else {
                Orc attacker = selectOrc();
                Human defender = selectHuman();
                attacker.hit(defender); // орк атакует
                if (defender.isAlive()) defender.hit(attacker); // человек атакует
            }
            printField();
            Thread.sleep(1000);
        }
    }
}