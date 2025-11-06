package com.tonovarela.colecciones.map;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    static void main() {
        System.out.println("ExampleTreeMap");
        Map<String,Integer> productPrices = new TreeMap<>();
        productPrices.put("Keyboard", 20);
        productPrices.put("Apple", 1);
        productPrices.put("Banana", 2);
        productPrices.put("Smartphone", 300);
        productPrices.put("Laptop", 5000);
        System.out.println("Product Prices: " + productPrices);

        System.out.println("Price of Apple: " + productPrices.get("Apple"));
        productPrices.put("Apple", 3); // Update price
        System.out.println("Updated Product Prices: " + productPrices);
        productPrices.remove("Banana");
        System.out.println("After removing Banana: " + productPrices);

    }
}
