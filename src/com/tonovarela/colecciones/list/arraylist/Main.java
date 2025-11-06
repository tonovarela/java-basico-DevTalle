package com.tonovarela.colecciones.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {
      List<String> students = new ArrayList<>();

      students.add("Ana");
      students.add("Luis");
      students.add("Fernando");
      students.add("Maria");
      students.add("Felipe");
      System.out.println(students);

      System.out.println(students.get(0));
      students.remove(0);
      students.set(0, "Camila");
      students.add(0, "Andrea");
      System.out.println(students);





    }
}
