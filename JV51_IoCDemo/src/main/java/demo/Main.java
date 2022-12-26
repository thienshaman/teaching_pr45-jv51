package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AccountRepository accountRepository = new AccountRepository();
//        AccountService accountService = new AccountService();
//        accountService.setAccountRepository(accountRepository);
//        accountService.showAccount();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AccountService accountService = (AccountService) context.getBean("accountService");
//        accountService.showAccount();
        Account account = (Account) context.getBean("account");
        account.setOwnerName("Minh Hoang");
        System.out.println("Name:" + account.getOwnerName());

        Account account2= (Account) context.getBean("account");
        System.out.println("Name:" + account2.getOwnerName());

    }
}
