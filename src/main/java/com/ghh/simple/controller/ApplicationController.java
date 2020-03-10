package com.ghh.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {

    @GetMapping("/test")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/test");
        return mv;
    }
}
