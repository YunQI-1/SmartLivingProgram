package com.jsu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCompetition {
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    //证书名
    @ExcelExport(value = "证书名", sort = 2)
    private String certificateName;
    //证书编号
    @ExcelExport(value = "证书编号", sort = 3)
    private String certificateNumber;

    //证书id
    @ExcelExport(value = "证书id", sort = 4)
    private String certificateId;
    //举办单位
    @ExcelExport(value = "举办单位", sort = 5)
    private String organizer;
    //获奖级别student_information
    @ExcelExport(value = "获奖级别", sort = 6)
    private String awardLevel;
    //参加形式
    @ExcelExport(value = "参加形式", sort = 7)
    private String participationForm;
    //排名
    @TableField("`rank`") // 使用反引号括起来
    @ExcelExport(value = "排名", sort = 8)
    private String rank;
    //获取时间
    @ExcelExport(value = "获取时间", sort = 9)
    private Date getTime;
    //证书照片
    @ExcelExport(value = "证书照片", sort = 10)
    private String certificatePhoto;
    //参赛文件
    @ExcelExport(value = "参赛文件", sort = 11)
    private String signUpFile;

}
