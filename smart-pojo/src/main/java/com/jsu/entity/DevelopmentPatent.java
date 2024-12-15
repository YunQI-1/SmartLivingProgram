package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentPatent {
    private String studentNumber;

    private String studentName;

    //专利名
    private String patentName;

    //专利号
    private String patentNumber;

    //专利申请时间
    private String patentApplicationTime;

    //专利权人
    private String patentee;

    //专利授权公告日期
    private Date authorizationAnnouncementDate;

    //颁发部门
    private String issuingDepartment;

}
