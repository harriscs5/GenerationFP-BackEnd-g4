package org.generation.ItemsAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }
    @RequestMapping(value = "/About2")
    public String About2() {
        return "About2";
    }
    @RequestMapping(value = "/product_catalog")
    public String product_catalog() {
        return "product_catalog";
    }
    @RequestMapping(value = "/logIn")
    public String logIn() {
        return "logIn";
    }
    @RequestMapping(value = "/contactUs")
    public String contactUs() {
        return "contactUs";
    }
    @RequestMapping(value = "/item-form")
    public String item-form() {
        return "item-form";
    }
}
