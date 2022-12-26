package controller;

import entity.Customer;
import entity.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CharacterEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;
import service.StoreService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private StoreService storeService;

//    @InitBinder
//    public void initBinder(WebDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
//    }

    @RequestMapping(value = {"/", "customers"}, method = RequestMethod.GET)
    public String getAllStudents(Model model) {
        List<Customer> customers = customerService.getAllCustomers();
        model.addAttribute("customers", customers);

        return "listCustomer";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String deleteCustomer(@RequestParam(name = "id") int id) {
        customerService.deleteStudentById(id);

        return "redirect:/";
    }

    @RequestMapping(value = "requestUpdateCustomer", method = RequestMethod.GET)
    public String requestAddCustomer(@RequestParam(name = "id", defaultValue = "0") int id, Model model) {
        if (id == 0) {
            model.addAttribute("customer", new Customer());
        } else {
            Customer customer = customerService.getCustomerById(id);
            model.addAttribute("customer", customer);
        }

        Map<Integer, String> storeMap = new HashMap<>();
        List<Store> stores = storeService.getAllStores();
        for (Store s : stores) {
            storeMap.put(s.getId(), s.getName());
        }
        model.addAttribute("stores", storeMap);

        return "addCustomer";
    }

    @RequestMapping(value = "saveCustomer", method = RequestMethod.POST, produces = "text/plain")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerService.addCustomer(customer);

        return "redirect:/";
    }

}