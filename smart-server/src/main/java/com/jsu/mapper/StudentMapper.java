package com.jsu.mapper;

import com.jsu.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    List<StudentVO> getStudentInformation();

    Long getStudentInformationCount();

    List<StudentVO> getStudentInformationByPage(Integer offset,Integer limit);

    @Select("select * from course")
    List<CourseVO> getCourses();

    @Select("select student_number,student_name,classes from academic_performance")
    List<AcademicPerformanceVO> getAcademicPerformance();


    @Select("select * from english_level")
    List<EnglishLevelVO> getEnglishLevel();

    @Select("select * from professional_qualifications")
    List<ProfessionalQualificationVO> getProfessionalQualifications();

    @Select("select student_number,student_name,software_name,invention_patent from software_copyright")
    List<SoftwareCopyrightVO> getSoftwareCopyright();

    @Select("select student_number, student_name, " +
            "software_system_name, " +
            "software_system_display_diagram1, " +
            "software_system_display_diagram2, " +
            "software_system_display_diagram3, " +
            "development_documents from software_system")
    List<SoftwareSystemVO> SoftwareSystem();

    @Select("select * from programming_capabilities")
    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities();

    @Select("select * from subject_competition")
    List<SubjectCompetitionVO> getSubjectCompetition();

    @Select("select * from paper")
    List<PaperVO> getPaperInformation();

    @Select("select * from participate_project")
    List<ParticipateProjectVO> getParticipateProject();

    List<ScoreVO> getAllScore();

    Long getScoreCount();
}
