package com.adopgroup.pixer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

    @GetMapping("")
    public String viewIndex() {
        return "mains/index";
    }

    @GetMapping("about-us")
    public String viewAboutUs() {
        return "mains/about-us";
    }

}
