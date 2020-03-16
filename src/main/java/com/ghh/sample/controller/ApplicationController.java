package com.ghh.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationController {
    private final static Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping("/test1")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("test");
        logger.info("---------test 123 logger");
        return mv;
    }

    @GetMapping("/test")
    public String testApi() {
        logger.info("process request {}", System.currentTimeMillis());
        return "success";
    }

}
