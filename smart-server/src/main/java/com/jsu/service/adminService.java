package com.jsu.service;

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

    SoftwareDevelopmentCapabilityVO getSoftwareDevelopmentCapability();

    PageResult getProgrammingCapabilities(Integer page, Integer pageSize);

    PageResult getSubjectCompetition(Integer page, Integer pageSize);

    PageResult getPaperInformation(Integer page, Integer pageSize);

    PageResult getParticipateProject(Integer page, Integer pageSize);

    PageResult getAllScore(Integer page, Integer pageSize);


}
