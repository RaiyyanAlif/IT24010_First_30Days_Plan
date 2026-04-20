class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolder + " deposited $" + amount);
    }

    void displayBalance() {
        System.out.println(accountHolder + "'s Current Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount userA = new BankAccount();
        userA.accountHolder = "Alice";
        userA.deposit(500.0);

        BankAccount userB = new BankAccount();
        userB.accountHolder = "Bob";
        userB.deposit(1200.0);

        userA.displayBalance();
        userB.displayBalance();
    }
}