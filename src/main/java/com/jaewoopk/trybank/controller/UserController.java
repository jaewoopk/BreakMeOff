package com.jaewoopk.trybank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/signup")
    public String create() {
        return "user/signup";
    }

    //@RequestMapping("/idcheck")


}
