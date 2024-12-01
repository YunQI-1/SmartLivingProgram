package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ProfessionalQualifications implements Serializable {
    //学业情况-职业资格
    private String studentNumber;

    private String credentialsName;//证书名

    private String classification;//等级(院/校/市/省)

    private String ranks;//排名

    private LocalDateTime obtainingTime;//获得时间

    private String issuingDepartment;//颁发部门

    private String photo1;//证书照片1

    private String photo2;//证书照片2

    private String photo3;//证书照片3

    private String photo4;//证书照片4

}
