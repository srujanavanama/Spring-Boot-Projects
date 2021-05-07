package com.srujana.sample.banking.samplebankingproject.repo;

import com.srujana.sample.banking.samplebankingproject.domain.Transaction;
import com.srujana.sample.banking.samplebankingproject.domain.TransactionDisplayDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    List<TransactionDisplayDetails> findByAccountNumber(Integer accountNumber);
}
