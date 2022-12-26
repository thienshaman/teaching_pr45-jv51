package service;

import entity.Account;

import java.util.List;

public interface AccountService {
    public Account getAccountById(int id);
    public List<Account> getAccounts();
    public String addAccount(Account account);
    public String updateAccount(Account account);
    public String deleteAccount(int id);

}
