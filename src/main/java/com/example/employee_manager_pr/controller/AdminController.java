package com.example.employee_manager_pr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller


public class AdminController {
    @GetMapping
    public String test(){
        return "index";
    }
    @GetMapping("/123")
    public String test123(){
        return "page-list-product";
    }
}
