package service;

public interface AccountService {
    public String transfer(int fromAccountId, int toAccountId, double amount) throws Exception;

    public String withdraw(int accountId, double amount);
}
