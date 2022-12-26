package controller;

import entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        return "hello";
    }

    @RequestMapping(value = "welcome/{name}/{city}", method = RequestMethod.GET)
    public String welcome(@PathVariable(name = "name") String name, @PathVariable(name = "city") String address, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("address", address);
        return "hello";
    }

    @RequestMapping(value = "addStudent", method = RequestMethod.GET)
    public String addStudent(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @RequestMapping(value = "registStudent", method = RequestMethod.POST)
    public String registStudent(@ModelAttribute Student student) {
        return "studentDetail";
    }
}
