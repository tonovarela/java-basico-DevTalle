package com.tonovarela.colecciones.list.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {
    static void main() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int elements = 100_000;
        long startTime = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayList add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList add time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        arrayList.get(elements /2);
        endTime =System.nanoTime();
        System.out.printf("ArrayList get time: %d ns%n", (endTime - startTime));

        startTime = System.nanoTime();
        linkedList.get(elements /2);
        endTime =System.nanoTime();
        System.out.printf("LinkedList get time: %d ns%n", (endTime - startTime));
    }
}
