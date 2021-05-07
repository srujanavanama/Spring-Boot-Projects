package com.srujana.sample.banking.samplebankingproject.service;

import com.srujana.sample.banking.samplebankingproject.domain.Account;
import com.srujana.sample.banking.samplebankingproject.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    public AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> lookupAll() {
        return accountRepository.findAll();
    }
}
