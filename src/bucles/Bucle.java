package bucles;
import java.util.ArrayList;
import java.util.List;
public class Bucle {

    static void main() {
        for(int i = 1; i <= 10; i++)
            IO.println("Iteración número: " + i);
        int contador = 1;
        while(contador <= 10) {
            IO.println("Contador es: " + contador);
            contador++;
        }
  }
    }
