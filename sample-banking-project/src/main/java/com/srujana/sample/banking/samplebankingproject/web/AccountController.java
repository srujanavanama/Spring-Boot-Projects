package com.srujana.sample.banking.samplebankingproject.web;

import com.srujana.sample.banking.samplebankingproject.domain.Account;
import com.srujana.sample.banking.samplebankingproject.domain.TransactionDisplayDetails;
import com.srujana.sample.banking.samplebankingproject.service.AccountService;
import com.srujana.sample.banking.samplebankingproject.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionService transactionService;

    public AccountController(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    protected AccountController() {

    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.lookupAll();
    }

    @GetMapping(path="/{number}")
    public List<TransactionDisplayDetails> getAllTransactions(@PathVariable("number") Integer accountNumber) {
        List<TransactionDisplayDetails> transactions = transactionService.lookupTransactions(accountNumber);
        return transactions;
    }
}
