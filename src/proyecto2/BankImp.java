package proyecto2;

public class BankImp {
    static void main() {
        BankAccount account = new BankAccount("123456789", 500.0);
        BankApp app = new BankApp(account);
        app.start();
    }

}
