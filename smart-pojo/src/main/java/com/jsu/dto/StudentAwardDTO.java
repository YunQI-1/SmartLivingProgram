package com.jsu.dto;

import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAwardDTO {
    @ExcelImport(value = "学号", required = true ,maxLength = 20)
    private String studentNumber;
    @ExcelImport(value = "学生姓名", required = true)
    private String studentName;
    //奖项名
    @ExcelImport(value = "奖项名", required = true)
    private String awardName;

    @ExcelImport(value = "学院", required = true)
    private String college;

    @ExcelImport(value = "专业", required = true)
    private String major;

    //证书编号
    @ExcelImport(value = "证书编号", required = true)
    private String certificateNumber;

    //获取时间
    @ExcelImport(value = "获取时间", required = true)
    private Date getTime;

    //颁发部门
    @ExcelImport(value = "颁发部门", required = true)
    private String issuingDepartment;

    //获奖级别
    @ExcelImport(value = "获奖级别", required = true)
    private String classification;

    //参加形式
    @ExcelImport(value = "参加形式", required = true)
    private String participateForm;

    //排名
    @ExcelImport(value = "排名", required = true)
    private String ranks;

    //photo
    @ExcelImport(value = "证明照片", required = true)
    private String photo;
}
