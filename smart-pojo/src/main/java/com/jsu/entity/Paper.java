package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import com.jsu.annotation.ExcelImport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    @ExcelImport(value = "学号")
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;
    @ExcelImport(value = "学生姓名")
    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;
    @ExcelImport(value = "论文名")
    @ExcelExport(value = "论文名", sort = 2)
    //论文名
    private String paperName;
    @ExcelImport(value = "期刊名")
    @ExcelExport(value = "期刊名", sort = 3)
    //期刊名
    private String journalName;
    @ExcelImport(value = "发表时间")
    @ExcelExport(value = "发表时间", sort = 4)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //发布时间
    private String yearOfPublication;
    @ExcelImport(value = "卷号")
    @ExcelExport(value = "卷号", sort = 5)
    //卷号
    private int volumeNumber;
    @ExcelImport(value = "期号")
    @ExcelExport(value = "期号", sort = 6)
    //期号
    private int issue;
    @ExcelImport(value = "文章页面")
    @ExcelExport(value = "文章页面", sort = 7)
    //文章页面
    private String articlePage;
    @ExcelImport(value = "DOI")
    @ExcelExport(value = "DOI", sort = 8)
    //doi
    private String doi;
    @ExcelImport(value = "编辑排名")
    @ExcelExport(value = "编辑排名", sort = 9)
    //编辑排名
    private String editorRanking;
    @ExcelImport(value = "指导老师")
    @ExcelExport(value = "指导老师", sort = 10)
    //指导老师
    private String instructor;
    @ExcelImport(value = "论文文档")
    @ExcelExport(value = "论文文档", sort = 11)
    private String file;

}
