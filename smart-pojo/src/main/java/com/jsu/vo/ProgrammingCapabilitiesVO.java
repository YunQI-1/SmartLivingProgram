package com.jsu.vo;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProgrammingCapabilitiesVO implements Serializable {
    //学业情况-编程能力
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelExport(value = "身份证", sort = 2)
    private String idCard;

    @ExcelExport(value = "C语言代码量", sort = 3)
    private Long CLanguageCodeVolume;//C语言代码量

    @ExcelExport(value = "Java代码量", sort = 4)
    private Long JavaCodeVolume;//java代码量

    @ExcelExport(value = "数据结构代码量", sort = 5)
    private Long dataStructureCodeVolume;//数据结构代码量

    @ExcelExport(value = "JavaWeb代码量", sort = 6)
    private Long javaWebCodeVolume;//javaWeb代码量

    @ExcelExport(value = "Python代码量", sort = 7)
    private Long pythonCodeVolume;//python代码量

    @ExcelExport(value = "OJ刷题数", sort = 8)

    private Integer OjPracticeNumber;//oj刷题数

    @ExcelExport(value = "其他刷题数", sort = 9)
    private Integer OtherPracticeNumber;//其他刷题数

}
