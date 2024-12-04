package com.jsu.service.impl;

import com.jsu.mapper.StudentMapper;
import com.jsu.result.PageResult;

import com.jsu.service.adminService;
import com.jsu.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /**
     * 获取所有课程数据
     * @return
     */
    @Override
    public List<CourseVO> getCourses() {
        List<CourseVO> ListCourses = studentMapper.getCourses();
        return ListCourses;
    }

    /**
     * 获取学生学业情况
     * @return
     */
    @Override
    public List<AcademicPerformanceVO> getAcademicPerformance() {
        List<AcademicPerformanceVO> List = studentMapper.getAcademicPerformance();
        return List;
    }

    /**
     * 获取所有学生的英语水平
     * @return
     */
    @Override
    public List<EnglishLevelVO> getEnglishLevel() {
        List<EnglishLevelVO> list = studentMapper.getEnglishLevel();
        return list;
    }

    /**
     * 获取所有学生的职业资格情况
     * @return
     */
    @Override
    public List<ProfessionnalQualificationVO> getProfessionalQualifications() {
        List<ProfessionnalQualificationVO> list = studentMapper.getProfessionalQualifications();
        return list;
    }


    /**
     * 获取学生软件开发能力
     * @return
     */

    @Override
    public SoftwareDevelopmentCapabilityVO getSoftwareDevelopmentCapability() {
        List<SoftwareCopyrightVO> list1 = studentMapper.getSoftwareCopyright();
        List<SoftwareSystemVO> list2 = studentMapper.SoftwareSystem();
        SoftwareDevelopmentCapabilityVO softwareDevelopmentCapabilityVO = new SoftwareDevelopmentCapabilityVO(list2,list1);
        return softwareDevelopmentCapabilityVO;
    }

    /**
     * 获取学生的编程能力
     * @return
     */
    @Override
    public List<ProgrammingCapabilitiesVO> getProgrammingCapabilities() {
        List<ProgrammingCapabilitiesVO> list = studentMapper.getProgrammingCapabilities();
        return list;
    }

    /**
     * 查询学生的学科竞赛
     * @return
     */
    @Override
    public List<SubjectCompetitionVO> getSubjectCompetition() {
        List<SubjectCompetitionVO> list = studentMapper.getSubjectCompetition();
        return list;
    }

    /**
     * 查询所有学生的论文情况
     * @return
     */
    @Override
    public List<PaperVO> getPaperInformation() {
        List<PaperVO> list = studentMapper.getPaperInformation();
        return list;
    }

    /**
     * 获取所有学生参加项目的情况
     * @return
     */
    @Override
    public List<ParticipateProjectVO> getParticipateProject() {
        List<ParticipateProjectVO> list = studentMapper.getParticipateProject();
        return list;
    }


}
