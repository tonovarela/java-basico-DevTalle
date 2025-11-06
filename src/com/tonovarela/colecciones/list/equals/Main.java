package com.tonovarela.colecciones.list.equals;

public class Main {

    static void main() {
      Integer a = 127;
      Integer b = 127;
        System.out.println(a==b);
        if (a.equals(b)) {
            System.out.println("a and b are equal in value.");
        } else {
            System.out.println("a and b are not equal in value.");
        }
    }
}
