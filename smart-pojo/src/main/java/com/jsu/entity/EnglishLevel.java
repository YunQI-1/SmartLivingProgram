package com.jsu.entity;

import lombok.Data;

@Data
public class EnglishLevel {
    private String studentName;

    private String studentNumber;

    private String cet4;//4级分数

    private String cet6;//6级分数

    private String toefl;            // TOEFL iBT 分数
    private String ielts;            // IELTS 分数
    private String toeic;            // TOEIC 分数
    private String cambridge;        // 剑桥英语考试（如：FCE, CAE等）
    private String greVerbal;        // GRE Verbal 分数
    private String gmatVerbal;       // GMAT Verbal 分数
    private String pteAcademic;      // PTE Academic 分数
    private String satReadingWriting;// SAT 阅读和写作部分分数
    private String duolingo;         // Duolingo English Test 分数
    private String celpip;           // CELPIP 分数
}
