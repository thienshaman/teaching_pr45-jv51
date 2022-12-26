package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.StoreService;

@Controller
public class StoreController {
    @Autowired
    private StoreService storeService;

    @RequestMapping(value = "listStore", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("stores", storeService.getAllStores());
        return "listStore";
    }
}
