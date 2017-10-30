package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.RandomGeneratorNumberService;
import com.sda.springjavapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.ModalExclude;

@Controller
public class UsersController {

    @Autowired
    private SomeService someService;
    @Qualifier("big")
    @Autowired
    private RandomGeneratorNumberService randomGeneratorNumberService;

    @GetMapping("/users")
    public ModelAndView users(){
        someService.someAction();
        return new ModelAndView("home");
    }
    @GetMapping("/contact_us")
    public ModelAndView contactUs(){
        System.out.println(randomGeneratorNumberService.generateNumber());
        return new ModelAndView("home");
    }
}
