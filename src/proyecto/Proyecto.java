package proyecto;

import java.util.Scanner;

public class Proyecto {

     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la edad del usuario:");
        int edad = scanner.nextInt();
        Usuario usuario = new Usuario(edad);
        System.out.println("Ingrese las calificaciones del usuario (ingrese -1 para terminar):");
        while (true) {
            int calificacion = scanner.nextInt();
            if (calificacion == -1) {
                break;
            }
            usuario.agregarCalificacion(calificacion);
            System.out.println("Calificación agregada: " + calificacion);
        }
        System.out.println("Usuario creado: " + usuario.toString());
        scanner.close();
    }
}


