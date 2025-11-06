package com.tonovarela.colecciones.sets.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println("HashSet contents: " + set);
        set.remove(50);
        System.out.println("After removing 50: " + set);
        set.add(100);
        System.out.println("After adding 100: " + set);



    }
}
