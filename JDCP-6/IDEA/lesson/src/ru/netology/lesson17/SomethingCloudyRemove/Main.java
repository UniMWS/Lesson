package ru.netology.lesson17.SomethingCloudyRemove;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Russia");
        countries.add("France");
        countries.add("Italy");
        countries.add("Spain");
        Iterator<String> iter = countries.iterator();
        while (iter.hasNext()) {
            String currentCountry = iter.next();
            System.out.println(currentCountry);
            if (currentCountry.equals("Italy")) {
                iter.remove();
            }
        }
        System.out.println(countries);
    }
}
