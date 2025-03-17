package com.jsu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingCapabilitiesDTO {
    @ExcelImport(value = "学号")
    //学业情况-编程能力
    private String studentNumber;
    @ExcelImport(value = "学生姓名")
    private String studentName;
    @ExcelImport(value = "身份证号")
    private String idCard;
    @ExcelImport(value = "java代码量")
    private Long javaCodeVolume;//java代码量
    @ExcelImport(value = "数据结构代码量")
    private Long dataStructureCodeVolume;//数据结构代码量
    @ExcelImport(value = "javaWeb代码量")
    private Long javaWebCodeVolume;//javaWeb代码量
    @ExcelImport(value = "python代码量")
    private Long pythonCodeVolume;//python代码量
    @ExcelImport(value = "oj刷题数")
    private Integer ojPracticeNumber;//oj刷题数
    @ExcelImport(value = "其他刷题数")
    private Integer otherPracticeNumber;//其他刷题数
    @ExcelImport(value = "C语言代码量")
    @JsonProperty("cLanguageCodeVolume") // 确保与 JSON 字段名一致
    private Long cLanguageCodeVolume;//C语言代码量
}
