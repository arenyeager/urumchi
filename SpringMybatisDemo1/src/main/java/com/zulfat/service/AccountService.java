package com.zulfat.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.zulfat.domain.Account;

@Component
public interface AccountService {

    void save(Account account);

    void delete(Integer id);

    void update(Account account);
    
    Account findById(Integer id);

    List<Account> findAll();


}
