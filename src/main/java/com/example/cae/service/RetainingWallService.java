package com.example.cae.service;

import com.example.cae.model.RetainingWall;
import org.springframework.stereotype.Component;

@Component
public class RetainingWallService {
    public Double getArea(RetainingWall retainingWall){
        return retainingWall.getHeightOfRetainingWall();
    }
}
