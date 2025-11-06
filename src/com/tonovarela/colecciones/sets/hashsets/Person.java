package com.tonovarela.colecciones.sets.hashsets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
       Person nullPerson = null;
        Set<Person> persons = new HashSet<>();
        Person p1 = new Person("Tono", "123");
        Person p2 = new Person("Ana", "123");
        Person p3 = new Person("Maria", "456");
        //System.out.println(p1.equals(p2));  // true because same DNI
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.remove(p1);
        // persons.add(nullPerson);
        // System.out.println(persons);
        for (Person p: persons) {
            System.out.println(p);
        }

    }
}
