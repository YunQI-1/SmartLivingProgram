package com.jsu.service;

import com.jsu.entity.SoftwareCopyright;
import com.jsu.result.PageResult;
import com.jsu.vo.*;

import java.util.List;

public interface adminService {
    PageResult getStudentInformation();

    PageResult getStudentInformationByPage(Integer page, Integer pageSize);

    PageResult getCourses(Integer page, Integer pageSize);

    PageResult getAcademicPerformance(Integer page, Integer pageSize);

    PageResult getEnglishLevel(Integer page, Integer pageSize);

    PageResult getProfessionalQualifications(Integer page, Integer pageSize);

    PageResult getSoftwareCopyright(Integer page, Integer pageSize);

    PageResult getProgrammingCapabilities(Integer page, Integer pageSize);

    PageResult getSubjectCompetition(Integer page, Integer pageSize);

    PageResult getPaperInformation(Integer page, Integer pageSize);

    PageResult getParticipateProject(Integer page, Integer pageSize);

    PageResult getAllScore(Integer page, Integer pageSize);


    PageResult getAcademicCompetition(Integer page, Integer pageSize);

    PageResult getDevelopmentPatent(Integer page, Integer pageSize);
}
