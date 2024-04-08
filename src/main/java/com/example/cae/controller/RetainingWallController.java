package com.example.cae.controller;

import com.example.cae.model.RetainingWall;
import com.example.cae.service.RetainingWallService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "擋土牆")
@RestController
public class RetainingWallController {

    @Autowired
    private RetainingWallService retainingWallService;
    @PostMapping ("/retaining-wall")
    public String getArea(@RequestBody RetainingWall retainingWall ){
        Double area = retainingWallService.getArea(retainingWall);
        return area.toString();
    }
}
