package com.jsu.entity;

import com.jsu.annotation.ExcelExport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    @ExcelExport(value = "学号", sort = 0)
    private String studentNumber;

    @ExcelExport(value = "学生姓名", sort = 1)
    private String studentName;

    @ExcelExport(value = "论文名", sort = 2)
    //论文名
    private String paperName;

    @ExcelExport(value = "期刊名", sort = 3)
    //期刊名
    private String journalName;

    @ExcelExport(value = "发表时间", sort = 4)
    //发布时间
    private String yearOfPublication;

    @ExcelExport(value = "卷号", sort = 5)
    //卷号
    private int volumeNumber;

    @ExcelExport(value = "期号", sort = 6)
    //期号
    private int issue;

    @ExcelExport(value = "文章页面", sort = 7)
    //文章页面
    private String articlePage;

    @ExcelExport(value = "DOI", sort = 8)
    //doi
    private String doi;

    @ExcelExport(value = "编辑排名", sort = 9)
    //编辑排名
    private String editorRanking;

    @ExcelExport(value = "指导老师", sort = 10)
    //指导老师
    private String instructor;

    @ExcelExport(value = "证书图片", sort = 11)
    private String photo;

}
