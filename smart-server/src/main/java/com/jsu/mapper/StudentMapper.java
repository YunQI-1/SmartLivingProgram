package com.jsu.mapper;

import com.jsu.entity.*;
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


    Long getEnglishLevelCount();

    /**
     * 获取学生职业资格证的详细记录
     * @param studentNumber
     * @return
     */
    List<ProfessionalQualifications> getProfessionalQualifications(String studentNumber);

    Long getProfessionalQualificationsCount();



    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities(Integer offset,Integer limit);

    Long getProgrammingCapabilitiesCount();


    List<SubjectCompetition> getSubjectCompetition(String studentNumber);

    @Select("select Count(student_number) from subject_competition where student_number = #{studentNumber} group by student_number")
    int getSubjectCompetitionCount(String studentNumber);


    List<PaperVO> getPaperInformation(Integer offset,Integer limit);

    List<ParticipateProjectVO> getParticipateProject(String studentNumber);

    List<ScoreVO> getAllScore(Integer offset,Integer limit);

    Long getScoreCount();

    List<EnglishExamDetail> getEnglishExamDetail(String studentNumber);

    List<String> getStudentNumbers(Integer offset,Integer limit);

    @Select("select Count(student_number) from english_level where student_number = #{s} group by student_number")
    int getStudentExamNumber(String s);


    /**
     *  获取英语等级考试中的有记录的学习列表
     * @param offset
     * @param pageSize
     * @return
     */
    List<String> getStudentNumbersByACP(Integer offset, Integer pageSize);


    List<AcademicCompetitionDetail> getAcademicCompetitionDetail(String studentNumber);

    @Select("select Count(student_number) from academic_competition where student_number = #{studentNumber} group by student_number")
    int getStudentExamNumberByACP(String studentNumber);

    /**
     *  获取符职业资格表中的有记录的学习列表
     * @param offset
     * @param pageSize
     * @return
     */
    List<String> getStudentNumbersByPRQ(Integer offset, Integer pageSize);

    /**
     * 获取某个学生能有多少个职业资格证
     * @param s
     * @return
     */
    @Select("select Count(student_number) from professional_qualifications where student_number = #{studentNumber} group by student_number")
    int getStudentExamNumberByPRQ(String s);

    List<String> getStudentNumbersByPaper(Integer offset, Integer limit);
    List<Paper> getPaperList(String studentNumber);
    @Select("select Count(student_number) from paper where student_number = #{studentNumber} group by student_number")
    Integer getStudentPaperCount(String s);

    List<String> getStudentNumbersBySUC(Integer offset, Integer limit);


    List<String> getStudentNumbersBySOC(Integer offset, Integer limit);


    List<SoftwareCopyright> getSoftwareCopyright(String s);

    @Select("select Count(student_number) from software_copyright where student_number = #{studentNumber} group by student_number")
    int getSoftwareCopyrightCount(String s);

    List<String> getStudentNumbersByDEP(Integer offset, Integer limit);

    List<DevelopmentPatent> getDevelopmentPatents(String s);

    @Select("select Count(student_number) from development_patent where student_number = #{studentNumber} group by student_number")
    int getDevelopmentPatentCount(String s);

}
