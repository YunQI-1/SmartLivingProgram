package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipateProject {
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelExport(value = "项目名", sort = 2)
    //项目名
    private String projectName;
    //类型
    @ExcelExport(value = "类型", sort = 3)
    private String type;

    @ExcelExport(value = "项目来源", sort = 4)
    private String projectSource;

    @ExcelExport(value = "团队排名", sort = 5)
    private String teamRank;//团队排名

    @ExcelExport(value = "开发技术", sort = 6)
    private String developTechnology;

    @ExcelExport(value = "团队成员", sort = 7)
    private String signUpFile;

    @ExcelExport(value = "指导老师", sort = 8)
    private String instructor;

    @ExcelExport(value = "开发时间", sort = 9)
    private LocalDateTime developTime;

    @ExcelExport(value = "开发周期", sort = 10)
    private String duration;

    @ExcelExport(value = "有效代码量", sort = 11)
    private Integer numberOfValidCodes;

    @ExcelExport(value = "主要创新点", sort = 12)
    private String mainInnovations;

    @ExcelExport(value = "主要功能", sort = 13)
    private String mainFunction;
}
