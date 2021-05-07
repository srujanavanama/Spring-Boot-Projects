package com.srujana.sample.banking.samplebankingproject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private Integer number;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private Date balanceDate;

    @Column
    private String currency;

    @Column
    private Double balance;

    protected Account() {

    }

    public Account(Integer number, String name, String type, Date balanceDate, String currency, Double balance) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.balanceDate = balanceDate;
        this.currency = currency;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number) &&
                Objects.equals(name, account.name) &&
                Objects.equals(type, account.type) &&
                Objects.equals(balanceDate, account.balanceDate) &&
                Objects.equals(currency, account.currency) &&
                Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, type, balanceDate, currency, balance);
    }
}
