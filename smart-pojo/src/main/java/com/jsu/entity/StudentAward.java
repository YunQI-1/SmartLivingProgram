package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAward {

    /**
     * 主键id
     */
    private Integer id;


    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;
    //奖项名
    @ExcelExport(value = "奖项名", sort = 2)
    private String awardName;
    @ExcelExport(value = "学院", sort = 3)
    private String college;
    @ExcelExport(value = "专业", sort = 4)
    private String major;

    //证书编号
    @ExcelExport(value = "证书编号", sort = 5)
    private String certificateNumber;

    //获取时间
    @ExcelExport(value = "获取时间", sort = 6)
    private String getTime;

    //颁发部门
    @ExcelExport(value = "颁发部门", sort = 7)
    private String issuingDepartment;

    //获奖级别
    @ExcelExport(value = "获奖级别", sort = 8)
    private String classification;


    @ExcelExport(value = "获奖等级", sort = 9)
    private  String awardLevel;
    //参加形式
    @ExcelExport(value = "参加形式", sort = 10)
    private String participateForm;

    //排名
    @ExcelExport(value = "排名", sort = 11)
    private String ranks;

    //photo
    @ExcelExport(value = "证明照片", sort = 12)
    private String photo;


}
