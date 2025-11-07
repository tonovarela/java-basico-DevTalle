package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    static void main() {
        System.out.println("Manejo de archivos");
        try {
            readFile("src/excepciones/example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

    }

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        System.out.println("El archivo se ha leído correctamente.");
        reader.close();
    }

}
