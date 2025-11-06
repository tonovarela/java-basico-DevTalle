package com.tonovarela.colecciones.sets.TreeSet;


import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person implements  Comparable<Person> {
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

     static void main() {

        Set<Person> persons = new TreeSet<>();
        Person p1 = new Person("Tono", "123");
        Person p2 = new Person("Ana", "1234");
        Person p3 = new Person("Maria", "456");
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        for (Person p: persons) {
            System.out.println(p);
        }
        System.out.println(persons.contains(new Person("Tono", "123")));

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', dni='" + dni + "'}";
    }

    @Override
    public int compareTo(Person o) {
        return this.dni.compareTo(o.dni);
    }
}
