package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Account;
import com.example.springbootdemo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAccounts() {
        return (List<Account>) accountRepository.findAll();
    }
}
