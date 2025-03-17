package com.jsu.dto;

import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO {
    @ExcelImport(value = "学号", required = true ,maxLength = 20)
    private String studentNumber;//学号

    @ExcelImport(value = "学生姓名", required = true)
    private String studentName;//学生名

    @ExcelImport(value = "课程编码", required = true)
    private String courseNumber;//课程编码

    @ExcelImport(value = "考试分数", required = true)
    private Double courseScore;//课程考试分数

    @ExcelImport(value = "学分", required = true)
    private Double courseCredit;//获得的课程学分

    @ExcelImport(value = "开课日期")
    private String courseStartDateTime;//开课日期

}
