package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

@Controller
public class HelloController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("hello2/{name}")
    public String hello2(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(value = "userRegis", method = RequestMethod.GET)
    public String regist(Model model) {
        model.addAttribute("user", new User());
        return "regist";
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User userAbc) {
        return "result";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "listCustomer";
    }
}
