package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Account;
import com.example.springbootdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = {"/"})
    public String index(Model model) {
        model.addAttribute("accounts", accountService.getAccounts());
        return "index";
    }

    @RequestMapping(value = "demo")
    public String demo(Model model) {
        model.addAttribute("name", "Nguyen Thi Anh");
        return "demo";
    }

    @RequestMapping("add")
    public String add(Model model) {
        model.addAttribute("account", new Account());
        return "add";
    }
}
