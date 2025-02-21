package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentPatent {

    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelExport(value = "专利类型", sort = 2)
    //专利名
    private String patentName;

    @ExcelExport(value = "专利号", sort = 3)
    //专利号
    private String patentNumber;

    @ExcelExport(value = "专利申请时间", sort = 4)
    //专利申请时间
    private String patentApplicationTime;

    @ExcelExport(value = "专利权人", sort = 5)
    //专利权人
    private String patentee;

    @ExcelExport(value = "专利授权公告日期", sort = 6)
    //专利授权公告日期
    private Date authorizationAnnouncementDate;

    @ExcelExport(value = "颁发部门", sort = 7)
    //颁发部门
    private String issuingDepartment;

    @ExcelExport(value = "证书图片", sort = 8)
    //证书图片
    private String photo;

}
