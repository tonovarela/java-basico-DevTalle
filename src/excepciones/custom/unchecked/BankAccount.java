package excepciones.custom.unchecked;

public class BankAccount {

    private double balance ;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new NegativeBalanceException("Fondos insuficientes: " + balance + ", intento de retiro: " + amount);
        }
        balance -= amount;
        System.out.println("Retiro exitoso: " + amount + ", saldo restante: " + balance);
    }

    public double getBalance(){
        return balance;
    }

    static void main() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
            System.out.println(account.getBalance());
        } catch (NegativeBalanceException e) {
            System.out.println("Error al retirar fondos: " + e.getMessage());
        }
    }



}
