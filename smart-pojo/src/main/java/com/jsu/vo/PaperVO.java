package com.jsu.vo;

import com.jsu.entity.Paper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaperVO implements Serializable {
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
    private String articlePage;

    //doi
    private String doi;

    //编辑排名
    private String editorRanking;

    //指导老师
    private String instructor;
}
