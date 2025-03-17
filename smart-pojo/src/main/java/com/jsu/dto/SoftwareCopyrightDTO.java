package com.jsu.dto;

import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareCopyrightDTO {
    //软著
    @ExcelImport(value = "学号", required = true,maxLength = 20)
    private String studentNumber;

    @ExcelImport(value = "学生姓名", required = true)
    private String studentName;

    @ExcelImport(value = "软件名", required = true)
    private String softwareName;//软件名

    //完成时间
    @ExcelImport(value = "完成时间", required = true)
    private Date completionDate;

    //权利获取方式
    @ExcelImport(value = "权利获取方式", required = true)
    private String howToObtainRights;

    //权利范围
    @ExcelImport(value = "权利范围", required = true)
    private String scopeOfRights;

    //登记号
    @ExcelImport(value = "登记号", required = true)
    private String registrationNumber;

    //颁发部门
    @ExcelImport(value = "颁发部门", required = true)
    private String issuingDepartment;

    //发布日期
    @ExcelImport(value = "发布日期", required = true)
    private Date issueDate;

    @ExcelImport(value = "照片")
    private String photo;
}
