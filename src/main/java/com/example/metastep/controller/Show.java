package com.example.metastep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show {

@RequestMapping("index")
public String showIndex(){
    return "demo-1";
}

}
