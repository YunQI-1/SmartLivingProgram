package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Course implements Serializable {
    @ExcelImport(value = "课程模块",required = true)
    @ExcelExport(value = "课程模块", sort = 0)
    private String courseModule;//课程模块

    @ExcelImport(value = "修读方式",required = true)
    @ExcelExport(value = "修读方式", sort = 1)
    private String studyMethod;//修读方式

    @ExcelImport(value = "课程名",required = true)
    @ExcelExport(value = "课程名", sort = 2)
    private String courseName;//课程名

    @ExcelImport(value = "课程编码",required = true)
    @ExcelExport(value = "课程编码", sort = 3)
    private String courseNumber;//课程编码

    @ExcelImport(value = "学分",required = true)
    @ExcelExport(value = "学分", sort = 4)
    private Integer credit;//学分

    @ExcelImport(value = "学时",required = true)
    @ExcelExport(value = "学时", sort = 5)
    private Integer studyTime;//学时

    @ExcelImport(value = "开课日期",required = true)
    @ExcelExport(value = "开课日期", sort = 6)
    private Date courseStartDateTime;//开课日期

}
