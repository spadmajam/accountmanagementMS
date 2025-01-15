package com.tekarch.accountmanagementMS.Services.Interfaces;

import com.tekarch.accountmanagementMS.Models.Account;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(Long accountId);
    Account addAccount(Account accounts);
    void deleteAccount(Long accountId);
    Account updateAccount(Account accounts);
}
