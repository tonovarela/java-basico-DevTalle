package excepciones.custom.checked;

public class AgeValidator {
    static void main() {
        try {
            Person person = Person.createPerson("Tono", 25);
            System.out.println("Persona creada: " + person);
        }
        catch (AgeValidationException e) {
            System.out.println("Error al crear la persona: " + e.getMessage());
        }

    }

}
