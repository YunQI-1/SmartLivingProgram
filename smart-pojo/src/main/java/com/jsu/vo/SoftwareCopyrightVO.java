package com.jsu.vo;

import com.jsu.entity.SoftwareCopyright;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoftwareCopyrightVO implements Serializable {
    //软著

    private String studentNumber;

    private String studentName;

    private String softwareName;//软件名

    //完成时间
    private String completionDate;

    //权利获取方式
    private String howToObtainRights;

    //权利范围
    private String scopeOfRights;

    //登记号
    private String registrationNumber;

    //颁发部门
    private String issuingDepartment;

    //发布日期
    private Date issueDate;

}
