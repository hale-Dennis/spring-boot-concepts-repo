package com.example.thymeleafpdemo.controllers;

import com.example.thymeleafpdemo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("details")
    public String details(Model model){
        User me = new User(0, "F", 70.0, "test");
        List<User> users = new ArrayList<>();
        users.add(new User(1,"B", 67.0, "Dennis"));
        users.add(new User(2,"A", 90.0, "Owusu"));
        users.add(new User(3,"C", 59.0, "Kwabena"));
        users.add(new User(4,"D", 50.0, "DOK"));
        model.addAttribute("users", users);
        model.addAttribute("testUser", me);

        return "details";
    }
}
