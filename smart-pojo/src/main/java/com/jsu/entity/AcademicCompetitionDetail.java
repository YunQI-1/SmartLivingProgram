package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcademicCompetitionDetail {

    private String studentNumber;

    private String studentName;

    //奖项名
    private String awardName;

    //获取时间
    private Date getTime;

    //颁发部门
    private String issuingDepartment;

    //获奖等级
    private String classification;

    //排名
    private String ranks;

    //photo
    private String photo;

}
