package com.jsu.vo;

import com.jsu.entity.DevelopmentPatent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevelopmentPatentVO implements Serializable {


    /**
     * 主键id
     */

    private Integer id;


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
    private String authorizationAnnouncementDate;

    //颁发部门
    private String issuingDepartment;

    private String photo;

}
