package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StudentAward implements Serializable {
    //学业竞赛
    private int grades;

    private List<StudentAwardDetail> studentAwardDetails;

}
