package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class ProgrammingCapabilities implements Serializable {
    //学业情况-编程能力
    private String studentNumber;

    private String studentName;

    private String idCard;

    private Long CLanguageCodeVolume;//C语言代码量

    private Long JavaCodeVolume;//java代码量

    private Long dataStructureCodeVolume;//数据结构代码量

    private Long javaWebCodeVolume;//javaWeb代码量

    private Long pythonCodeVolume;//python代码量

    private Integer CLanguageProjectCount;//C语言项目数

    private Integer JavaProjectCount;//java项目数

    private Integer dataStructureProjectCount;//数据结构项目数

    private Integer javaWebProjectCount;//javaWeb项目数

    private Integer pythonProjectCount;//python项目数

    private Integer OjPracticeNumber;//oj刷题数
}
