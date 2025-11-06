package com.tonovarela.colecciones.sets.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    static void main() {

        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(8);
        System.out.println(numbers);
        numbers.remove(8);

        System.out.println("numbers  = " + numbers);

        numbers.add(90);
        System.out.println("numbers  = " + numbers);
        System.out.println( numbers.contains(1));

    }

}
