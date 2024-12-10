package com.jsu.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class AcademicCompetition implements Serializable {
    //学业竞赛

    private int grades;

    private List<AcademicCompetitionDetail> academicCompetitionDetails;

}
