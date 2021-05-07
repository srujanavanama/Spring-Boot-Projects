package com.srujana.sample.banking.samplebankingproject.domain;

import java.util.Date;

public interface TransactionDisplayDetails {

    Account getAccount();
    interface Account {
        Integer getNumber();
        String getName();
    }
    Date getDate();
    String getCurrency();
    Double getDebitAmount();
    Double getCreditAmount();
    String getType();
    String getNarrative();
}
