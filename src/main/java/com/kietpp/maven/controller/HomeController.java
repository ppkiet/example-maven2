/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kietpp.maven.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * @author PC
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(ModelMap model) {
        model.addAttribute("name", "sdasda");
        return "index";
    }

}
