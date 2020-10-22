package com.mocoitlabs.blog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @RequestMapping("/api/")
    public String index() {
        return "Hello welcome to this site";
    }
}
