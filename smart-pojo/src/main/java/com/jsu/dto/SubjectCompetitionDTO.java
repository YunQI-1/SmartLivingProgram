package com.jsu.dto;

import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCompetitionDTO {
    @ExcelImport(value = "学号", required = true ,maxLength = 20)
    private String studentNumber;
    @ExcelImport(value = "学生姓名", required = true)
    private String studentName;
    //证书名
    @ExcelImport(value = "证书名", required = true)
    private String certificateName;
    //证书编号
    @ExcelImport(value = "证书编号", required = true)
    private String certificateNumber;

    //证书id
    @ExcelImport(value = "证书id", required = true)
    private String certificateId;
    //举办单位
    @ExcelImport(value = "举办单位", required = true)
    private String organizer;
    //获奖级别student_information
    @ExcelImport(value = "获奖级别", required = true)
    private String awardLevel;
    //参加形式
    @ExcelImport(value = "参加形式", required = true)
    private String participationForm;
    //排名
    @ExcelImport(value = "排名", required = true)
    private String rank;
    //获取时间
    @ExcelImport(value = "获取时间", required = true)
    private Date getTime;
    //证书照片
    @ExcelImport(value = "证书照片", required = true)
    private String certificationPhoto;
    //参赛文件
    @ExcelImport(value = "参赛文件", required = true)
    private String signUpFile;
}
