package com.tonovarela.colecciones.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {

    static void main() {
    List<String> cities = new LinkedList<>();
    cities.add("New York");
    cities.add("Los Angeles");
    cities.add("Chicago");

    cities.add("Toronto");
    cities.addFirst("Vancouver");
    cities.addLast("Montreal");
    cities.set(0, "Calgary");

    System.out.println(cities);
    cities.removeFirst();
    cities.removeLast();
    System.out.println(cities);

    String searchedCity = "Chicago";
    if (cities.contains(searchedCity.trim())) {
        System.out.println("The city " + searchedCity + " is in the list.");
    } else {
        System.out.println("The city " + searchedCity + " is not in the list.");
    }



    }

}
