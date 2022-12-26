package controller;

import entity.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public Object sayHello() {
        Store store = new Store();
        store.setId(1);
        store.setName("DN Store");
        store.setAddress("01 Quang Trung");
        return store;
    }
}
