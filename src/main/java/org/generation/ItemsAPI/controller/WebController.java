package org.generation.ItemsAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String home() {
        return "index";
    }
    @RequestMapping(value = "/about")
    public String About2() {
        return "about";
    }
    @RequestMapping(value = "/product_catalog")
    public String product_catalog() {
        return "product_catalog";
    }
    @RequestMapping(value = "/login")
    public String logIn() {
        return "login";
    }
    @RequestMapping(value = "/contact")
    public String contactUs() {
        return "contact";
    }
    @RequestMapping(value = "/itemform")
    public String itemForm() {
        return "itemform";
    }
}
