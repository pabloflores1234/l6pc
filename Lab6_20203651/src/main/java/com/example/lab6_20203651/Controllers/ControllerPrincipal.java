package com.example.lab6_20203651.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPrincipal {

    @GetMapping("/")
    public String paginaprincipal(){
        return "VistaPrincipal";
    }


}
