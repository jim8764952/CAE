package com.example.cae;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RetainingWall {
    private Double heightOfRetainingWall; //H 擋土牆高度
    private Double widthOfBase;//L 底板寬度
    private Double thicknessOfBase; //D 底板厚度
    private Double widthOfToe; //B 牆趾寬度
    private Double stemThicknessAtBottom; //C 懸臂頂部厚度
    private Double stemThicknessAtTop; //T 懸臂底部厚度
}
