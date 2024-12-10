package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

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
    //颁发部门
    private String issuingDepartment;

    private Date getTime;
    private  String photo;
}
