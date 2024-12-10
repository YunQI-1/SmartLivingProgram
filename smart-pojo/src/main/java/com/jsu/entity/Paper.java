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
    //论文编号
    private String paperNumber;
    //论文名
    private String paperName;
    //获奖等级
    private int awardLevel;
    //获取时间
    private Date getTime;
}
