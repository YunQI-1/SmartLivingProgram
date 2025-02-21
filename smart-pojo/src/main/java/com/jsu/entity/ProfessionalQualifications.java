package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
public class ProfessionalQualifications implements Serializable {
    //学业情况-职业资格
    @ExcelExport(value = "学生姓名", sort = 0)
    private String studentName;

    @ExcelExport(value = "学号", sort = 1)
    private String studentNumber;

    @ExcelExport(value = "身份证号", sort = 2)
    //身份证号
    private String idCard;

    @ExcelExport(value = "证书名", sort = 3)
    private String credentialsName;//证书名

    @ExcelExport(value = "证书编号", sort = 4)
    //证书编号
    private String certificateNumber;

    @ExcelExport(value = "等级", sort = 5)
    private String classification;//等级(院/校/市/省)

    @ExcelExport(value = "获得时间", sort = 6)
    private Date obtainingTime;//获得时间

    @ExcelExport(value = "颁发部门", sort = 7)
    private String issuingDepartment;//颁发部门

    @ExcelExport(value = "照片", sort = 8)
    private String photo;//证书照片1

    //准考证号
    @ExcelExport(value = "准考证号", sort = 9)
    private String examinationCertificateNumber;

}
