package com.srujana.sample.banking.samplebankingproject.repo;

import com.srujana.sample.banking.samplebankingproject.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
