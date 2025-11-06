package com.tonovarela.colecciones.sets.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {


    static void main() {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        numbers.remove(3);

        System.out.println("numbers  = " + numbers);

        numbers.add(50);
        System.out.println("numbers  = " + numbers);
        System.out.println( numbers.contains(1));
    }
}
