package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Course implements Serializable {
    private String courseModule;//课程模块

    private String studyMethod;//修读方式

    private String courseName;//课程名

    private String courseNumber;//课程编码

    private Integer credit;//学分

    private Integer studyTime;//学时

    private LocalDateTime courseStartDateTime;//开课日期

}
