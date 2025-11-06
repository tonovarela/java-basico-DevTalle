package entradas;

import java.util.Scanner;

public class Entrada{

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese un valor entero:");
        int valorEntero = scanner.nextInt();
        System.out.println("Por favor, ingrese el segundo valor entero:");
        int segundoEntero = scanner.nextInt();

        int sum = valorEntero + segundoEntero;
        System.out.println("La suma de los dos valores enteros es: " + sum);
        int diff = valorEntero - segundoEntero;
        System.out.println("La resta de los dos valores enteros es: " + diff);

       String mensaje =valorEntero>segundoEntero?"El primer valor es mayor que el segundo.":"El primer valor no es mayor que el segundo.";
        System.out.println(mensaje);


    }





}
