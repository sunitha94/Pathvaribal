package com.example.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Yamuna on 24/05/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String details1() {
        return "index";
    }
    @RequestMapping(value = "/{name}/{city}")
    public String details(@PathVariable(value = "name") String name, @PathVariable(value = "city") String city, Model model) {
        model.addAttribute("msg", "I am"+"  "+ name +"  "+"from"+"   "+ city);
        return "index";
    }
}
