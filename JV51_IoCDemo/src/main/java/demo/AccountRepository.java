package demo;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {
    public Account getAccount() {
        return new Account(1, "Hoang", 1000);
    }
}
