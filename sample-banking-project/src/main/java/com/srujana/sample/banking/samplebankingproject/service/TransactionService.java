package com.srujana.sample.banking.samplebankingproject.service;

import com.srujana.sample.banking.samplebankingproject.domain.TransactionDisplayDetails;
import com.srujana.sample.banking.samplebankingproject.repo.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<TransactionDisplayDetails> lookupTransactions(Integer accountNumber) {
        return transactionRepository.findByAccountNumber(accountNumber);
    }

}
