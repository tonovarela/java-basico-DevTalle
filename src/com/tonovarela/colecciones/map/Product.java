package com.tonovarela.colecciones.map;

import java.util.Map;
import java.util.TreeMap;

public class Product  implements  Comparable<Product>{

    private  int id;
    private String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    static void main() {
        Map<Product,Double> pricesMap = new TreeMap<>();
        pricesMap.put(new Product(191,"Laptop"),1500.0);
        pricesMap.put(new Product(145,"Smartphone"),800.0);
        pricesMap.put(new Product(123,"Tablet"),400.0);


        System.out.println(pricesMap);
//        for (Product p: pricesMap.keySet()) {
//            System.out.println("Product: " + p + " Price: " + pricesMap.get(p));
//        }

    }
}
