package com.jsu.vo;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreVO implements Serializable {
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;//学号

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;//学生名

    @ExcelExport(value = "专业", sort = 2)
    private String major;//专业

    @ExcelExport(value = "年级", sort = 3)
    private String grade;//年级

    @ExcelExport(value = "班级", sort = 4)
    private String classes;//班级

    @ExcelExport(value = "课程名", sort = 5)
    private String courseName;//课程名

    @ExcelExport(value = "课程编码", sort = 6)
    private String courseNumber;//课程编码

    //通过成绩表里的课程编码到课程表获取
    @ExcelExport(value = "课程模块", sort = 7)
    private String courseModule;//课程模块

    @ExcelExport(value = "考试分数", sort = 8)
    private Double courseScore;//课程考试分数

    @ExcelExport(value = "课程学分", sort = 9)
    private Double courseCredit;//获得的课程学分

    @ExcelExport(value = "修读方式", sort = 10)
    private String studyMethod;//修读方式

    @ExcelExport(value = "开课日期", sort = 11)
    private String courseStartDateTime;//开课日期
}
