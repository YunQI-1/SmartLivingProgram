package com.jsu.service.impl;

import com.jsu.dto.StudentDTO;
import com.jsu.entity.Student;
import com.jsu.exception.BaseException;
import com.jsu.mapper.StudentMapper;
import com.jsu.result.PageResult;

import com.jsu.service.adminService;
import com.jsu.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class adminServiceImpl implements adminService {
    @Autowired
    StudentMapper studentMapper;

    /**
     * 获取所有学生信息
     * @return
     */
    @Override
    public PageResult getStudentInformation() {
        List<StudentVO> list=studentMapper.getStudentInformation();
        Long total=studentMapper.getStudentInformationCount();
        return new PageResult(total, list);
    }

    @Override
    public PageResult getStudentInformationByPage(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<StudentVO> list=studentMapper.getStudentInformationByPage(offset,pageSize);
        Long total=studentMapper.getStudentInformationCount();
        return new PageResult(total, list);
    }

    /**
     * 获取所有课程数据
     * @return
     */
    @Override
    public PageResult getCourses(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
//        List list = studentMapper.getCourses(offset,pageSize);
        List list=studentMapper.getCourse();
        log.info(list.toString());
        Long total=studentMapper.getCoursesCount();
        return new PageResult(total, list);
    }

    /**
     * 获取学生学业情况
     * @return
     */
    @Override
    public PageResult getAcademicPerformance(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<AcademicPerformanceVO> list = studentMapper.getAcademicPerformance(offset,pageSize);
        Long total=studentMapper.getAcademicPerformanceCount();
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生的学科竞赛
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageResult getAcademicCompetition(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList =studentMapper.getStudentNumbersBySA(offset,pageSize);
        List<StudentAwardVO> list = new ArrayList<>();
        if(studentNumberList.size()>0 && studentNumberList != null){
            studentNumberList.forEach(studentNumber -> {
                //获得每个学生的考试详细信息并添加到list中
                StudentAwardVO studentAwardVO = new StudentAwardVO();
                studentAwardVO.setStudentAwardDetails(studentMapper.getStudentAwardDetail(studentNumber));
                studentAwardVO.setAwards(studentMapper.getStudentExamNumberBySA(studentNumber));
                list.add(studentAwardVO);
            });
        }
        Long total= studentMapper.getStudentAwardCount();
        return new PageResult(total, list);
    }

    @Override
    public PageResult getDevelopmentPatent(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList =studentMapper.getStudentNumbersByDEP(offset,pageSize);
        List<DevelopmentPatentVO> list = new ArrayList<>();
        if(studentNumberList.size()>0 && studentNumberList != null){
            studentNumberList.forEach(s -> {
                //获得每个学生的考试详细信息并添加到list中
                DevelopmentPatentVO developmentPatentVO = new DevelopmentPatentVO();
                developmentPatentVO.setDevelopmentPatents(studentMapper.getDevelopmentPatents(s));
                developmentPatentVO.setDevelopmentPatentNumbers(studentMapper.getDevelopmentPatentCount(s));
                list.add(developmentPatentVO);
            });
        }
        Long total= studentMapper.getDEPCount();
        return new PageResult(total, list);
    }


    /**
     * 获取所有学生的英语水平
     * @return
     */
    @Override
    public PageResult getEnglishLevel(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList=studentMapper.getStudentNumbersByEnglish(offset,pageSize);
        List<EnglishLevelVO> list = new ArrayList<>();
        if (studentNumberList != null && studentNumberList.size() > 0) {
            studentNumberList.forEach(s -> {
                // 获取每个学生的考试详细信息并添加到 list 中
                EnglishLevelVO englishLevelVO=new EnglishLevelVO();
                englishLevelVO.setEnglishExamDetails(studentMapper.getEnglishExamDetail(s));
                englishLevelVO.setExamNumber(studentMapper.getStudentExamNumber(s));
                list.add(englishLevelVO);
            });
        }
        Long total= studentMapper.getEnglishLevelCount();
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生的职业资格情况
     * @return
     */
    @Override
    public PageResult getProfessionalQualifications(Integer page, Integer pageSize) {
        Integer offset = (page - 1) * pageSize;
        List<String> studentNumberList =studentMapper.getStudentNumbersByPRQ(offset,pageSize);
        List<ProfessionalQualificationsVO> list = new ArrayList<>();
        if(studentNumberList != null && studentNumberList.size() > 0) {
            studentNumberList.forEach(s -> {
                //获取每个学生的详细信息并添加到list中
                ProfessionalQualificationsVO professionalQualificationsVO=new ProfessionalQualificationsVO();
                professionalQualificationsVO.setProfessionalQualificationsList(studentMapper.getProfessionalQualifications(s));
                professionalQualificationsVO.setProfessionalNumbers(studentMapper.getStudentExamNumberByPRQ(s));
                list.add(professionalQualificationsVO);
            });
        }
        Long total= studentMapper.getProfessionalQualificationsCount();
        return new PageResult(total, list);
    }

    /**
     * 获取学生的软著情况
     * @return
     */

    @Override
    public PageResult getSoftwareCopyright(Integer page, Integer pageSize) {
        Integer offset = (page - 1) * pageSize;
        List<String> studentNumberList =studentMapper.getStudentNumbersBySOC(offset,pageSize);
        List<SoftwareCopyrightVO> list = new ArrayList<>();
        if(studentNumberList != null && studentNumberList.size() > 0) {
            studentNumberList.forEach(s -> {
                //获取每个学生的详细信息并添加到list中
                SoftwareCopyrightVO softwareCopyrightVO=new SoftwareCopyrightVO();
                softwareCopyrightVO.setSoftwareCopyrights(studentMapper.getSoftwareCopyright(s));
                softwareCopyrightVO.setCopyrightNumbers(studentMapper.getSoftwareCopyrightCount(s));
                list.add(softwareCopyrightVO);
            });
        }
        Long total= studentMapper.getSOCCount();
        return new PageResult(total, list);
    }

    /**
     * 获取学生的编程能力
     * @return
     */
    @Override
    public PageResult getProgrammingCapabilities(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<ProgrammingCapabilitiesVO> list = studentMapper.getProgrammingCapabilities(offset,pageSize);
        Long total= studentMapper.getPCCount();
        return new PageResult(total, list);
    }

    /**
     * 查询学生的学科竞赛
     * @return
     */
    @Override
    public PageResult getSubjectCompetition(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList =studentMapper.getStudentNumbersBySUC(offset,pageSize);
        List<SubjectCompetitionVO> list = new ArrayList<>();
        if (studentNumberList != null && !studentNumberList.isEmpty()) {
            studentNumberList.forEach(s -> {
                // 获取每个学生的考试详细信息并添加到 list 中
                SubjectCompetitionVO subjectCompetitionVO=new SubjectCompetitionVO();
                subjectCompetitionVO.setSubjectCompetitions(studentMapper.getSubjectCompetition(s));
                subjectCompetitionVO.setCompetitionNumbers(studentMapper.getSubjectCompetitionCount(s));
                list.add(subjectCompetitionVO);
            });
        }
        Long total= studentMapper.getSUCCount();
        return new PageResult(total, list);
    }

    /**
     * 查询所有学生的论文情况
     * @return
     */
    @Override
    public PageResult getPaperInformation(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList=studentMapper.getStudentNumbersByPaper(offset,pageSize);
        List<PaperListVO> list = new ArrayList<>();
        if (studentNumberList != null && !studentNumberList.isEmpty()) {
            studentNumberList.forEach(s -> {
                // 获取每个学生的考试详细信息并添加到 list 中
                PaperListVO paperListVO=new PaperListVO();
                paperListVO.setPaperList(studentMapper.getPaperList(s));
                paperListVO.setPaperNumber(studentMapper.getStudentPaperCount(s));
                list.add(paperListVO);
            });
        }
        log.info("{}",list);
        Long total= studentMapper.getPaperCount();
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生参加项目的情况
     * @return
     */
    @Override
    public PageResult getParticipateProject(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList=studentMapper.getStudentNumberByParticipateProject(offset,pageSize);
        List<ParticipateProjectVO> list = new ArrayList<>();
        if (studentNumberList != null && !studentNumberList.isEmpty()) {
            studentNumberList.forEach(s -> {
                ParticipateProjectVO participateProjectVO=new ParticipateProjectVO();
                participateProjectVO.setParticipateProjectDetails(studentMapper.getParticipateProject(s));
                participateProjectVO.setProjectNumber(studentMapper.getProjectCount(s));
                list.add(participateProjectVO);
            });
        }
        log.info("{}",list);
        Long total= studentMapper.getPPCount();
        return new PageResult(total,list);
    }

    /**
     * 获取所有学生成绩信息
     *
     *
     */
    @Override
    public PageResult getAllScore(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List list=studentMapper.getAllScore(offset,pageSize);
        Long total=studentMapper.getScoreCount();
        log.info(list.toString());
        return new PageResult(total, list);
    }

    /**
     *
     * 新增学生信息
     * @param studentDTO
     */

    @Override
    @Transactional
    public void createStudentInformation(StudentDTO studentDTO) {
        log.info("新增学生信息：{}",studentDTO);
         StudentVO studentVO=studentMapper.getStudentInformationByStudentNumber(studentDTO.getStudentNumber());
         if(studentVO!=null){
             throw new BaseException("该学号学生已存在!");
         }
         Student student = new Student();
         BeanUtils.copyProperties(studentDTO,student);
         studentMapper.createStudentInformation(student);
    }



    @Override
    @Transactional
    public void updateStudentInformation(StudentDTO studentDTO) {
        log.info("修改学生信息:{}",studentDTO);
        StudentVO studentVO=studentMapper.getStudentInformationByStudentNumber(studentDTO.getStudentNumber());
        if(studentVO==null){
            throw new BaseException("该学号学生不存在!");
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO,student);
        studentMapper.updateStudentInformation(student);
    }


}
