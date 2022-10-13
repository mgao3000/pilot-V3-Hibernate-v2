package com.devmountain.training.dao;

import com.devmountain.training.entity.Account;
import com.devmountain.training.entity.Employee;

import java.util.List;

public interface AccountDao {
    Account save(Account account, Employee employee);
    List<Account> getAccounts();
    Account getAccountById(Long id);
}
