package proyecto5;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        StudenRegistrationSystem registrationSystem = new StudenRegistrationSystem();
        boolean running = true;
        while (running) {
            MostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del estudiante: ");
                    String id = scanner.nextLine();
                    System.out.print("Ingrese nombre del estudiante: ");
                    String name = scanner.nextLine();

                    System.out.print("Ingrese la edad del estudiante: ");
                    Integer edad = scanner.nextInt();
                    Student student = new Student(id, name,edad);
                    try {
                        registrationSystem.AddStudent(student);
                        System.out.println("Estudiante agregado exitosamente.");
                    } catch (proyecto5.excepciones.DuplicateStudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Ingrese ID del estudiante a buscar: ");
                    String searchId = scanner.nextLine();
                    try {
                        Student foundStudent = registrationSystem.findStudentById(searchId);
                        System.out.println("Estudiante encontrado: " + foundStudent);
                    } catch (proyecto5.excepciones.StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Lista de todos los estudiantes:");
                    for (Student s : registrationSystem.getAllStudents()) {
                        System.out.println(s);
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }


    }

    static void MostrarMenu(){

        System.out.println("1. Agregar estudiante");
        System.out.println("2. Buscar estudiante por ID");
        System.out.println("3. Mostrar todos los estudiantes");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

    }
}
