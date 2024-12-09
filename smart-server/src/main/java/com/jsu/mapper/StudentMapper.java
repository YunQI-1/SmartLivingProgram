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

    List<CourseVO> getCourses(Integer offset,Integer limit);

    Long getCoursesCount();

    List<AcademicPerformanceVO> getAcademicPerformance(Integer offset,Integer limit);

    Long getAcademicPerformanceCount();

    List<EnglishLevelVO> getEnglishLevel(Integer offset,Integer limit);

    Long getEnglishLevelCount();

    List<ProfessionalQualificationVO> getProfessionalQualifications(Integer offset,Integer limit);

    Long getProfessionalQualificationsCount();


    @Select("select student_number,student_name,software_name,invention_patent from software_copyright")
    List<SoftwareCopyrightVO> getSoftwareCopyright();

    @Select("select student_number, student_name, " +
            "software_system_name, " +
            "software_system_display_diagram1, " +
            "software_system_display_diagram2, " +
            "software_system_display_diagram3, " +
            "development_documents from software_system")
    List<SoftwareSystemVO> SoftwareSystem();

    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities(Integer offset,Integer limit);

    Long getProgrammingCapabilitiesCount();


    List<SubjectCompetitionVO> getSubjectCompetition(Integer offset,Integer limit);

    Long getSubjectCompetitionCount();


    @Select("select * from paper")
    List<PaperVO> getPaperInformation(Integer offset,Integer limit);

    @Select("select * from participate_project")
    List<ParticipateProjectVO> getParticipateProject(Integer offset,Integer limit);

    List<ScoreVO> getAllScore(Integer offset,Integer limit);

    Long getScoreCount();
}
