package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAwardDetail {

    private String studentNumber;

    private String studentName;

    //奖项名
    private String awardName;

    private String college;

    private String major;

    //证书编号
    private String certificateNumber;

    //获取时间
    private Date getTime;

    //颁发部门
    private String issuingDepartment;

    //获奖级别
    private String classification;

    //参加形式
    private String participateForm;

    //排名
    private String ranks;

    //photo
    private String photo;

}
