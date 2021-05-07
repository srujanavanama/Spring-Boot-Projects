package com.srujana.sample.banking.samplebankingproject.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "account_number")
    private Account account;

    @Column
    private Date date;

    @Column
    private String type;

    @Column
    private String currency;

    @Column
    private Double creditAmount;

    @Column
    private Double debitAmount;

    @Column
    private String narrative;

    protected Transaction() {

    }

    public Transaction(Integer id, Account account, Date date, String type, String currency, Double creditAmount, Double debitAmount, String narrative) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.type = type;
        this.currency = currency;
        this.creditAmount = creditAmount;
        this.debitAmount = debitAmount;
        this.narrative = narrative;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(account, that.account) &&
                Objects.equals(date, that.date) &&
                Objects.equals(type, that.type) &&
                Objects.equals(currency, that.currency) &&
                Objects.equals(creditAmount, that.creditAmount) &&
                Objects.equals(debitAmount, that.debitAmount) &&
                Objects.equals(narrative, that.narrative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, date, type, currency, creditAmount, debitAmount, narrative);
    }
}
