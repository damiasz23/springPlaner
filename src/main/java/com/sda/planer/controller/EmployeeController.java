package com.sda.planer.controller;

import com.sda.planer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ModelAndView getAllEmployees() {
        ModelAndView modelAndView = new ModelAndView("allEmployees");
        modelAndView.addObject("employees",employeeService.getAllEmployees());
        return modelAndView;
    }
}
