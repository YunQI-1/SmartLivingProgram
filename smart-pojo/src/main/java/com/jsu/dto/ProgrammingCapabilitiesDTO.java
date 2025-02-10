package com.jsu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingCapabilitiesDTO {
    //学业情况-编程能力
    private String studentNumber;

    private String studentName;

    private String idCard;

    private Long javaCodeVolume;//java代码量

    private Long dataStructureCodeVolume;//数据结构代码量

    private Long javaWebCodeVolume;//javaWeb代码量

    private Long pythonCodeVolume;//python代码量

    private Integer ojPracticeNumber;//oj刷题数

    private Integer otherPracticeNumber;//其他刷题数

    @JsonProperty("cLanguageCodeVolume") // 确保与 JSON 字段名一致
    private Long cLanguageCodeVolume;//C语言代码量
}
