package ru.netology.lesson16.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ru.netology.lesson16.quiz.products.Product;

public class Shop<P extends Product> {
    private List<P> items = new ArrayList<>();
    private Random random = new Random();

    public void add(P product) {
        items.add(product);
    }

    public P getRandom() {
        return items.get(random.nextInt(items.size()));
    }

    public P getCheapest() {
        int minIndex = 0;
        for (int i = 1; i < items.size(); i++) {
            if (items.get(minIndex).getPrice() > items.get(i).getPrice()) {
                minIndex = i;
            }
        }
        return items.get(minIndex);
    }
}