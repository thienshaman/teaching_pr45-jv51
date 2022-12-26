package helloworld;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepositoryImpl implements AccountRepository {
    @Override
    public Account getAccount() {
        Account account = new Account();
        account.setId(1);
        account.setOwnerName("Thien");
        account.setBalance(1000);

        return account;
    }
}
