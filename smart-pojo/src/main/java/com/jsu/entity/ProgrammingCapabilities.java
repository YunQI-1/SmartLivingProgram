package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class ProgrammingCapabilities implements Serializable {
    //学业情况-编程能力
    private String studentNumber;

    private String studentName;

    private String idCard;

    private Long cLanguageCodeVolume;//C语言代码量

    private Long javaCodeVolume;//java代码量

    private Long dataStructureCodeVolume;//数据结构代码量

    private Long javaWebCodeVolume;//javaWeb代码量

    private Long pythonCodeVolume;//python代码量

    private Integer ojPracticeNumber;//oj刷题数

    private Integer otherPracticeNumber;//其他刷题数
}
