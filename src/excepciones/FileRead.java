
package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
    static void main(String[] args) {
        BufferedReader reader =null;
        try {
            reader = new BufferedReader(new FileReader("src/excepciones/example.txt"));
           String line;
            while ((line = reader.readLine()) != null){
                IO.println(line);
            }
        } catch (FileNotFoundException e){
            IO.println("Error al leer el archivo: " + e.getMessage());
        }
        catch (IOException e ){
            IO.println("Error genérico: " + e.getMessage());
        }
        finally {
            try {
                if (reader!= null){
                    reader.close();
                    IO.println("El archivo se ha cerrado correctamente.");
                }

            } catch (IOException e) {
                IO.println("Error al cerrar el archivo: " + e.getMessage());
            }

        }




    }
}
