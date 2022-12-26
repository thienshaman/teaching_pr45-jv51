package service;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountRepository;

import java.util.List;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getAccountById(int id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public List<Account> getAccounts() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public String addAccount(Account account) {
        accountRepository.save(account);
        return "Success";
    }

    @Override
    public String updateAccount(Account account) {
        accountRepository.save(account);
        return "Success";
    }

    @Override
    public String deleteAccount(int id) {
        accountRepository.deleteById(id);
        return "Success";
    }
}
