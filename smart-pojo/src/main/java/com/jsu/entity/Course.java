package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Course implements Serializable {

    @ExcelExport(value = "学号", sort = 0)
    private String courseModule;//课程模块

    @ExcelExport(value = "修读方式", sort = 1)
    private String studyMethod;//修读方式

    @ExcelExport(value = "课程名", sort = 2)
    private String courseName;//课程名

    @ExcelExport(value = "课程编码", sort = 3)
    private String courseNumber;//课程编码

    @ExcelExport(value = "学分", sort = 4)
    private Integer credit;//学分

    @ExcelExport(value = "学时", sort = 5)
    private Integer studyTime;//学时

    @ExcelExport(value = "开课日期", sort = 6)
    private String courseStartDateTime;//开课日期

}
