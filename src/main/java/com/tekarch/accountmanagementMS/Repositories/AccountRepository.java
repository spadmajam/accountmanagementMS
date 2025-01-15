package com.tekarch.accountmanagementMS.Repositories;

import com.tekarch.accountmanagementMS.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long>{
}
