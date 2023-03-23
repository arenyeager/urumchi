package com.zulfat.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zulfat.dao.AccountDao;
import com.zulfat.domain.Account;
import com.zulfat.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public void update(Account account){
        accountDao.update(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public Account findById(Integer id) {
        return accountDao.findByID(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
