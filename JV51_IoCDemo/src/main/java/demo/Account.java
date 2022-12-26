package demo;

public class Account {
    private int id;
    private String ownerName;
    private int balance;

    public Account() {
    }

    public Account(int id, String ownerName, int balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
