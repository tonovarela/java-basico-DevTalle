package excepciones.custom.resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResources {
    static void main() {
         try (
                 BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"));
                 BufferedReader reader2 = new BufferedReader(new FileReader("src/example1.txt"));
         ) {
            String line ;
            while ((line = reader.readLine()) != null){
                IO.println(line);
            }
             System.out.println("--- Segundo archivo ---");
             while ((line = reader2.readLine()) != null){
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
