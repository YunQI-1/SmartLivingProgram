package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentPatent {

    @ExcelImport(value = "学号",required = true)
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelImport(value = "学生姓名",required = true)
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelImport(value = "专利名",required = true)
    @ExcelExport(value = "专利名", sort = 2)
    //专利名
    private String patentName;
    @ExcelImport(value = "专利号",required = true)
    @ExcelExport(value = "专利号", sort = 3)
    //专利号
    private String patentNumber;
    @ExcelImport(value = "专利申请时间",required = true)
    @ExcelExport(value = "专利申请时间", sort = 4)
    //专利申请时间
    private String patentApplicationTime;
    @ExcelImport(value = "专利权人",required = true)
    @ExcelExport(value = "专利权人", sort = 5)
    //专利权人
    private String patentee;
    @ExcelImport(value = "专利授权公告日期",required = true)
    @ExcelExport(value = "专利授权公告日期", sort = 6)
    //专利授权公告日期
    private Date authorizationAnnouncementDate;
    @ExcelImport(value = "颁发部门",required = true)
    @ExcelExport(value = "颁发部门", sort = 7)
    //颁发部门
    private String issuingDepartment;
    @ExcelImport(value = "证书图片")
    @ExcelExport(value = "证书图片", sort = 8)
    //证书图片
    private String photo;

}
