package com.tekarch.accountmanagementMS.Services;

import com.tekarch.accountmanagementMS.Models.Account;
import com.tekarch.accountmanagementMS.Repositories.AccountRepository;
import com.tekarch.accountmanagementMS.Services.Interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountsRepository;


    @Override
    public List<Account> getAllAccounts() {
        return accountsRepository.findAll();
    }

    @Override
    public Account getAccountById(Long accountId) {
        return accountsRepository.findById(accountId).orElse(null);
    }

    @Override
    public Account addAccount(Account accounts) {
        return accountsRepository.save(accounts);
    }

    @Override
    public void deleteAccount(Long accountId) {
        accountsRepository.deleteById(accountId);
    }

    @Override
    public Account updateAccount(Account accounts) {
        return accountsRepository.save(accounts);
    }
}

