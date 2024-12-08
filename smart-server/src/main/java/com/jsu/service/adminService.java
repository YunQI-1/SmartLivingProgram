package com.jsu.service;

import com.jsu.result.PageResult;
import com.jsu.vo.*;

import java.util.List;

public interface adminService {
    PageResult getStudentInformation();

    PageResult getStudentInformationByPage(Integer page, Integer pageSize);

    List<CourseVO> getCourses();

    List<AcademicPerformanceVO> getAcademicPerformance();

    List<EnglishLevelVO> getEnglishLevel();

    List<ProfessionalQualificationVO> getProfessionalQualifications();

    SoftwareDevelopmentCapabilityVO getSoftwareDevelopmentCapability();

    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities();

    List<SubjectCompetitionVO> getSubjectCompetition();

    List<PaperVO> getPaperInformation();

    List<ParticipateProjectVO> getParticipateProject();

    PageResult getAllScore();


}
