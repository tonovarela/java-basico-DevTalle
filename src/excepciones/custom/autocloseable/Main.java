package excepciones.custom.autocloseable;

public class Main {
    static void main() {
        try (FakeDatabaseConnection connection = new FakeDatabaseConnection()) {
            connection.query("SELECT * FRO M users");

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
