package com.kswkev;

public class Salary {

    private String currency;
    private long amount;

    public Salary(String currency, long amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}
