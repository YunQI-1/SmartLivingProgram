package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingCapabilitiesVO implements Serializable {
    //学业情况-编程能力
    private String studentNumber;

    private String studentName;

    private String idCard;

    private Long CLanguageCodeVolume;//C语言代码量

    private Long JavaCodeVolume;//java代码量

    private Long dataStructureCodeVolume;//数据结构代码量

    private Long javaWebCodeVolume;//javaWeb代码量

    private Long pythonCodeVolume;//python代码量


    private Integer OjPracticeNumber;//oj刷题数

    private Integer OtherPracticeNumber;//其他刷题数

}
