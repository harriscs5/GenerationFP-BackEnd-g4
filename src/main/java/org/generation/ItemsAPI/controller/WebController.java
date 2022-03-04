package org.generation.ItemsAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
    @RequestMapping(value = "/about")
    public String about() {
        return "about";
    }
    @RequestMapping(value = "/product_catalog")
    public String product_catalog() {
        return "product_catalog";
    }
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/contact")
    public String contactus() {
        return "contact";
    }
    @RequestMapping(value = "/itemform")
    public String itemform() {
        return "itemform";
    }
}
