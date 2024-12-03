package com.jsu.service;

import com.jsu.result.PageResult;
import com.jsu.vo.*;

import java.util.List;

public interface adminService {
    PageResult getStudentInformation();

    List<CourseVO> getCourses();

    List<AcademicPerformanceVO> getAcademicPerformance();

    List<EnglishLevelVO> getEnglishLevel();

    List<ProfessionnalQualificationVO> getProfessionalQualifications();

    SoftwareDevelopmentCapabilityVO getSoftwareDevelopmentCapability();

    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities();

    List<SubjectCompetitionVO> getSubjectCompetition();

    List<PaperVO> getPaperInformation();

    List<ParticipateProjectVO> getParticipateProject();
}
