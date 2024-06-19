package alkeWallet;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private double amount;
    private String type;
    private String currency;
    private LocalDateTime timestamp;

    public Transaction(String id, double amount, String type, String currency) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.currency = currency;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
