package com.tonovarela.colecciones.list.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }
    public static void main() {
      Person p1 = new Person("Alice");
      Person p2 = new Person("Alice");
        System.out.println(p1==p2);
        if (p1.equals(p2)) {
            System.out.println("p1 and p2 are equal in value.");
        } else {
            System.out.println("p1 and p2 are not equal in value.");
        }
    }


}
