package controller;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AccountService;

@RestController
@RequestMapping(value = "account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Object hello() {
        return "Hello";
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Object getAccountById(@PathVariable(name = "id") int id) {
        return accountService.getAccountById(id);
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Object getAccountList() {
        return accountService.getAccounts();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Object addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Object updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public Object deleteAccount(@PathVariable(name = "id") int id) {
        return accountService.deleteAccount(id);
    }
}
