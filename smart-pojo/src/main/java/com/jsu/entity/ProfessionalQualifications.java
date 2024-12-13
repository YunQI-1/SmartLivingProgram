package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class ProfessionalQualifications implements Serializable {
    //学业情况-职业资格
    private String studentName;

    private String studentNumber;

    //身份证号
    private String idCard;

    private String credentialsName;//证书名

    //证书编号
    private String certificateNumber;

    private String classification;//等级(院/校/市/省)

    private Date obtainingTime;//获得时间

    private String issuingDepartment;//颁发部门

    private String photo;//证书照片1


}
