package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.Data;

import java.sql.Date;

@Data
public class SoftwareCopyright {
    //软著

    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;
    @ExcelExport(value = "软件名", sort = 2)
    private String softwareName;//软件名

    //完成时间
    @ExcelExport(value = "完成时间", sort = 3)
    private String completionDate;

    //权利获取方式
    @ExcelExport(value = "权利获取方式", sort = 4)
    private String howToObtainRights;

    //权利范围
    @ExcelExport(value = "权利范围", sort = 5)
    private String scopeOfRights;

    //登记号
    @ExcelExport(value = "登记号", sort = 6)
    private String registrationNumber;

    //颁发部门
    @ExcelExport(value = "颁发部门", sort = 7)
    private String issuingDepartment;

    //发布日期
    @ExcelExport(value = "发布日期", sort = 8)
    private Date issueDate;

    @ExcelExport(value = "照片", sort = 9)
    private String photo;
}
