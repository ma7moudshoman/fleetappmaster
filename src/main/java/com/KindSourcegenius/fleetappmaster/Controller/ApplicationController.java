package com.KindSourcegenius.fleetappmaster.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

  //  GET http://localhost:8080/index

    @GetMapping("/index")
public String Hom(){
    return "index";
}
}
