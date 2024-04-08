package com.example.cae;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetainingWallController {
    @Autowired
    private
    @RequestMapping("/retaining-wall")
    public String test(){
        System.out.println("Hi!");
        return "HEY";
    }
}
