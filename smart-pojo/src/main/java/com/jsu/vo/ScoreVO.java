package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreVO implements Serializable {
    private String studentNumber;//学号

    private String studentName;//学生名

    private String courseNumber;//课程编码

    private Double courseScore;//课程考试分数

    private Double courseCredit;//获得的课程学分

    //通过成绩表里的课程编码到课程表获取
    private String courseModule;//课程模块

    private String studyMethod;//修读方式

    private String courseName;//课程名

}
