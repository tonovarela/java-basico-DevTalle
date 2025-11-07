package excepciones.custom.resources;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main() {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/excepciones/example.txt"))) {
            String line ;
            while ((line = reader.readLine()) != null){
                IO.println(line);
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("El archivo no existe: " + ex.getMessage());
        }
        catch (IOException e ){
            IO.println("Error genérico: " + e.getMessage());
        }

    }

}
