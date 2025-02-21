package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnglishLevel implements Serializable {

    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelExport(value = "身份证", sort = 2)
    private String idCard;

    @ExcelExport(value = "证书类型", sort = 3)
    //类型名
    private String typeName;

    @ExcelExport(value = "证书编号", sort = 4)
    //证书编号
    private String certificateNumber;

    @ExcelExport(value = "得分", sort = 5)
    //得分
    private int score;

    @ExcelExport(value = "颁发部门", sort = 6)
    //颁发部门
    private String issuingDepartment;

    @ExcelExport(value = "获取时间", sort = 7)
    //获取时间
    private Date getTime;

    @ExcelExport(value = "学校", sort = 8)
    //学校
    private String school;

    @ExcelExport(value = "专业", sort = 9)
    //专业
    private String major;

    @ExcelExport(value = "准考证号", sort = 10)
    //准考证号
    private String examinationCertificateNumber;

    @ExcelExport(value = "照片", sort = 11)
    //照片
    private  String photo;

    @ExcelExport(value = "学院", sort = 12)
    private String college;

}
