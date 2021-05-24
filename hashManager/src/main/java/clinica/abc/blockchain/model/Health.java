package clinica.abc.blockchain.model;

import java.math.BigInteger;
import java.util.List;

public class Health {
    List<String> accounts;
    String owner;
    BigInteger balance;
    String transacciones;

    public Health() {
    }

    public Health(List<String> accounts, String owner, BigInteger balance, String transacciones) {
        this.accounts = accounts;
        this.owner = owner;
        this.balance = balance;
        this.transacciones = transacciones;
    }

    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "{\"Health\":{"
                + "\"accounts\":" + accounts
                + ", \"owner\":\"" + owner + "\""
                + ", \"balance\":\"" + balance + "\""
                + ", \"transacciones\":\"" + transacciones + "\""
                + "}}";
    }
}
