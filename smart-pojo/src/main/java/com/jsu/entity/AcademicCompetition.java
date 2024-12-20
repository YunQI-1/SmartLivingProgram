package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AcademicCompetition implements Serializable {
    //学业情况-学科竞赛
    private String studentNumber;

    private String studentName;

    private String idCard;

    private String major;//专业

    private String honorableName;//荣誉名

    private LocalDateTime obtainingTime;//获得时间

    private String classification;//等级(院/校/市/省)

    private String ranks;//排名

    private String issuingDepartment;//颁发部门

    private String photo1;//证书照片1

    private String photo2;//证书照片2

    private String photo3;//证书照片3

    private String photo4;//证书照片4

    private String CompetitionRegistrationDocuments;//参赛报名文件
}
