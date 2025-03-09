package com.jsu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryDTO implements Serializable {

    /**
     * 姓名
     */
    private String studentName;

    /**
     * 学号
     */
    private String studentNumber;

    /**
     * 班级
     */
    private String classes;

    /**
     * 年级
     */
    private String grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 学院
     */
    private String college;
}
