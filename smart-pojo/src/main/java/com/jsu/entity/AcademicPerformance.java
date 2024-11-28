package com.jsu.entity;

import lombok.Data;

@Data
public class AcademicPerformance {
    //学业情况(总体)
    private ProfessionalQualifications professionalQualifications;//职业资格

    private AcademicCompetition academicCompetition;//学科竞赛

    private ProgrammingCapabilities programmingCapabilities;//编程能力
}
