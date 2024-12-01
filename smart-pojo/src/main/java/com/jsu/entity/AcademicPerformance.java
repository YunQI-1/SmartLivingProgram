package com.jsu.entity;

import lombok.Data;

import java.util.List;

@Data
public class AcademicPerformance {
    //学业情况(总体)
    private String studentNumber;

    private String studentName;

    private String idCard;

    private String major;//专业

    private List<ProfessionalQualifications> professionalQualifications;//职业资格

    private List<AcademicCompetition> academicCompetition;//学科竞赛

    private ProgrammingCapabilities programmingCapabilities;//编程能力

    private EnglishLevel englishLevel;//英语等级


}
