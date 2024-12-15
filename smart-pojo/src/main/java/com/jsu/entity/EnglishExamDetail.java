package com.jsu.entity;

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
public class EnglishExamDetail implements Serializable {
    private String studentNumber;
    private String studentName;
    private String idCard;
    //类型名
    private String typeName;

    //证书编号
    private String certificateNumber;

    //得分
    private int score;

    //颁发部门
    private String issuingDepartment;

    //获取时间
    private Date getTime;

    //学校
    private String school;

    //专业
    private String major;

    //准考证号
    private String examinationCertificateNumber;

    //照片
    private  String photo;

    private String college;

    private String major;

    private String examinationCertificateNumber;
}
