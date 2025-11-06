package com.tonovarela.colecciones.map;

import java.util.*;

public class Person {

  private String name;

    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', dni='" + dni + "'}";
    }

    static void main() {
        System.out.println("Person main");
        Map<String,Person> persons = new HashMap<>();
        Person p1 = new Person("Tono", "1234");
        Person p2 = new Person("Ana", "1235");
        Person p3 = new Person("Maria", "456");

        persons.put(p1.dni,p1);
        persons.put(p2.dni,p2);
        persons.put(p3.dni,p3);

        for (String dni: persons.keySet()) {
            System.out.println("DNI: " + dni + " Person: " + persons.get(dni));
        }

    }
}
