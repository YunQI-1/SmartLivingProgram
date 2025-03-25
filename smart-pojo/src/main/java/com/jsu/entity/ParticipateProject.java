package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipateProject {

    /**
     * 主键id
     */

    private Integer id;

    @ExcelImport(value = "学号")
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelImport(value = "学生姓名")
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;
    @ExcelImport(value = "项目名")
    @ExcelExport(value = "项目名", sort = 2)
    //项目名
    private String projectName;
    //类型
    @ExcelImport(value = "类型")
    @ExcelExport(value = "类型", sort = 3)
    private String type;
    @ExcelImport(value = "项目来源")
    @ExcelExport(value = "项目来源", sort = 4)
    private String projectSource;
    @ExcelImport(value = "团队排名")
    @ExcelExport(value = "团队排名", sort = 5)
    private String teamRank;//团队排名
    @ExcelImport(value = "开发技术")
    @ExcelExport(value = "开发技术", sort = 6)
    private String developTechnology;
    @ExcelImport(value = "提交文档")
    @ExcelExport(value = "提交文档", sort = 7)
    private String signUpFile;
    @ExcelImport(value = "指导老师")
    @ExcelExport(value = "指导老师", sort = 8)
    private String instructor;
    @ExcelImport(value = "开发时间")
    @ExcelExport(value = "开发时间", sort = 9)
    private String developTime;
    @ExcelImport(value = "开发周期")
    @ExcelExport(value = "开发周期", sort = 10)
    private String duration;
    @ExcelImport(value = "有效代码量")
    @ExcelExport(value = "有效代码量", sort = 11)
    private Integer numberOfValidCodes;
    @ExcelImport(value = "主要创新点")
    @ExcelExport(value = "主要创新点", sort = 12)
    private String mainInnovations;
    @ExcelImport(value = "主要功能")
    @ExcelExport(value = "主要功能", sort = 13)
    private String mainFunction;
}
