package excepciones.custom.autocloseable;

public class FakeDatabaseConnection implements  AutoCloseable {

    public FakeDatabaseConnection() {
        System.out.println("Opening fake database connection...");
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing fake database connection...");
    }


}
