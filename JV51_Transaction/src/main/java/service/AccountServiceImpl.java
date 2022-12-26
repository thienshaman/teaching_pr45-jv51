package service;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.AccountRepository;


@Service(value = "accountService") // accountServiceImpl
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Transactional
    @Override
    public String transfer(int fromAccountId, int toAccountId, double amount) throws Exception {

        if (!accountRepository.existsById(fromAccountId)) {
            return "From acc id is not existed!";
        }

        if (!accountRepository.existsById(toAccountId)) {
            return "To acc id is not existed!";
        }

        Account accountFrom = (Account) accountRepository.findById(fromAccountId).get();
        Account accountTo = (Account) accountRepository.findById(toAccountId).get();
        if (accountFrom.getBalance() < amount) {
            return "Amount transfer is invalid!";
        }

        double newFromAccountBalance = accountFrom.getBalance() - amount;
        accountFrom.setBalance(newFromAccountBalance);
        accountRepository.save(accountFrom);

        double newToAccountBalance = accountTo.getBalance() + amount;
        accountTo.setBalance(newToAccountBalance);
        accountRepository.save(accountTo);

        return "Success!";
    }

    @Override
    public String withdraw(int accountId, double amount) {
        if (!accountRepository.existsById(accountId)) {
            return "Acc id is not existed!";
        }

        Account account = (Account) accountRepository.findById(accountId).get();
        if (account.getBalance() < amount) {
            return "Amount withdraw is invalid!";
        }
        account.setBalance(account.getBalance() - amount);
        accountRepository.save(account);

        return "Success";
    }
}
