package com.jsu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paper {
    private String studentNumber;

    private String studentName;
    //论文名
    private String paperName;

    //期刊名
    private String journalName;

    //发布时间
    private String yearOfPublication;

    //卷号
    private int volumeNumber;

    //期号
    private int issue;

    //文章页面
    private int year;

    //doi
    private String doi;

    //编辑排名
    private String editorRanking;

    //指导老师
    private String instructor;


}
