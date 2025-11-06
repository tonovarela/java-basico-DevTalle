package collecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
public class Listas {

    static void main() {
        System.out.println("Listas");

        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        lista.forEach(System.out::println);

        Set<String> nombreUnicos = new HashSet<>();
        nombreUnicos.add("Ana");
        nombreUnicos.add("Luis");
        nombreUnicos.add("Ana"); // Duplicado, no se añadirá
        nombreUnicos.forEach(System.out::println);

    }
}
