package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectCompetition {
    private String studentNumber;
    private String studentName;

    //证书名
    private String certificateName;
    //证书编号
    private String certificateNumber;

    //证书id
    private String certificationId;
    //举办单位
    private String organizer;
    //获奖级别
    private String awardLevel;
    //参加形式
    private String participationForm;
    //排名
    private String rank;
    //获取时间
    private Date getTime;
    //证书照片
    private String certificationPhoto;
    //参赛文件
    private String signUpFile;

}
