package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Score implements Serializable {
    private String studentNumber;//学号

    private String studentName;//学生名

    private String courseNumber;//课程编码

    private Double courseScore;//课程考试分数

    private Double courseCredit;//获得的课程学分

}
