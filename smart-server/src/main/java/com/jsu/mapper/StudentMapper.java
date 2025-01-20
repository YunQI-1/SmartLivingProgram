package com.jsu.mapper;

import com.jsu.entity.*;
import com.jsu.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper  {
    /**
     *
     * 查询功能Mapper
     * Research
     */
    List<StudentInformationVO> getStudentInformation();

    Long getStudentInformationCount();

    StudentInformationVO getStudentInformationByStudentNumber(String studentNumber);

    List<StudentInformationVO> getStudentInformationByPage(Integer offset, Integer limit);
    @Select("select * from course")
    List<CourseVO> getCourse();

    List<CourseVO> getCourses(Integer offset,Integer limit);

    Long getCoursesCount();



    /**
     * 获取学生职业资格证的详细记录
     * @param studentNumber
     * @return
     */
    List<ProfessionalQualifications> getProfessionalQualifications(String studentNumber);

    @Select("select COUNT(DISTINCT student_number) from professional_qualifications")
    Long getProfessionalQualificationsCount();



    List<ProgrammingCapabilitiesVO> getProgrammingCapabilities(Integer offset,Integer limit);
    @Select("select COUNT(DISTINCT student_number) from programming_capabilities")
    Long getPCCount();
    Long getProgrammingCapabilitiesCount();


    List<SubjectCompetition> getSubjectCompetition(String studentNumber);

    @Select("select Count(student_number) from subject_competition where student_number = #{studentNumber} group by student_number")
    int getSubjectCompetitionCount(String studentNumber);


    List<PaperVO> getPaperInformation(Integer offset,Integer limit);


    List<ScoreVO> getAllScore(Integer offset,Integer limit);

    Long getScoreCount();

    List<EnglishLevel> getEnglishExamDetail(String studentNumber);

    List<String> getStudentNumbersByEnglish(Integer offset, Integer limit);

    @Select("select Count(student_number) from english_level where student_number = #{s} group by student_number")
    int getStudentExamNumber(String s);

    @Select("select COUNT(DISTINCT student_number) from english_level")
    Long getEnglishLevelCount();

    /**
     *  获取英语等级考试中的有记录的学习列表
     * @param offset
     * @param pageSize
     * @return
     */
    List<String> getStudentNumbersBySA(Integer offset, Integer pageSize);

    @Select("select COUNT(DISTINCT student_number) from student_award")
    Long getStudentAwardCount();

    List<StudentAward> getStudentAwardDetail(String studentNumber);

    @Select("select Count(student_number) from student_award where student_number = #{studentNumber} group by student_number")
    int getStudentExamNumberBySA(String studentNumber);

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

    List<Paper> getPaperList(Integer offset, Integer limit);

    @Select("select COUNT(*) from paper")
    Long getPaperCount();

    List<String> getStudentNumbersBySUC(Integer offset, Integer limit);
    @Select("select COUNT(DISTINCT student_number) from subject_competition")
    Long getSUCCount();

    @Select("select COUNT(*) from software_copyright")
    Long getSOCCount();


    List<SoftwareCopyright> getSoftwareCopyright(Integer offset, Integer limit);

    List<DevelopmentPatent> getDevelopmentPatents(Integer offset, Integer limit);

    @Select("select COUNT(*) from development_patent")
    Long getDEPCount();

    @Select("select Count(student_number) from development_patent where student_number = #{studentNumber} group by student_number")
    int getDevelopmentPatentCount(String s);

    List<ParticipateProject> getParticipateProject(Integer offset, Integer limit);


    @Select("select COUNT(*) from participate_project")
    Long getPPCount();


    /**
     *
     * 增加数据功能Mapper
     *  Create
     */

    //新增学生信息(单条增加)
    void createStudentInformation(StudentInformation student);

    /**
     *
     * 修改数据功能Mapper
     *  Update
     */

    void updateStudentInformation(StudentInformation student);

    /**
     *
     *  删除数据功能Mapper
     *  Delete
     */
    void deleteStudentInformation(String studentNumber);
}
