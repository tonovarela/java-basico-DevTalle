package com.tonovarela.colecciones.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Tono");
        names.add("Ana");
        names.add("Maria");


        Iterator<String> iterator = names .iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            }

        List<String> otherNames = Arrays.asList("Pepe", "Luis", "Carlos");
        Iterator<String> otherIterator = otherNames.iterator();


    }


}
