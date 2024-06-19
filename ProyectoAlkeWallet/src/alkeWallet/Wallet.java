package alkeWallet;

import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private User user;
    private List<Transaction> transactions;

    public Wallet(User user) {
        this.user = user;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount, String currency) {
        Transaction transaction = new Transaction(generateId(), amount, "deposit", currency);
        transactions.add(transaction);
        user.setBalance(user.getBalance() + amount);
    }

    public void withdraw(double amount, String currency) {
        if (user.getBalance() >= amount) {
            Transaction transaction = new Transaction(generateId(), amount, "withdraw", currency);
            transactions.add(transaction);
            user.setBalance(user.getBalance() - amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return user.getBalance();
    }

    public void convertCurrency(String fromCurrency, String toCurrency, double amount) {
        // Implement conversion logic here
    }

    private String generateId() {
        return "TXN" + System.currentTimeMillis();
    }
}

