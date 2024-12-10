package com.jsu.service.impl;

import com.jsu.entity.EnglishExamDetail;
import com.jsu.mapper.StudentMapper;
import com.jsu.result.PageResult;

import com.jsu.service.adminService;
import com.jsu.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List list = studentMapper.getCourses(offset,pageSize);
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
        List<String> studentNumberList =studentMapper.getStudentNumbersByACP(offset,pageSize);
        List<AcademicCompetitionVO> list = new ArrayList<>();
        if(studentNumberList.size()>0 && studentNumberList != null){
            studentNumberList.forEach(studentNumber -> {
                //获得每个学生的考试详细信息并添加到list中
                AcademicCompetitionVO academicCompetitionVO = new AcademicCompetitionVO();
                academicCompetitionVO.setAcademicCompetitionDetails(studentMapper.getAcademicCompetitionDetail(studentNumber));
                academicCompetitionVO.setAwards(studentMapper.getStudentExamNumberByACP(studentNumber));
                list.add(academicCompetitionVO);
            });
        }
        Long total = 100L;
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生的英语水平
     * @return
     */
    @Override
    public PageResult getEnglishLevel(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<String> studentNumberList=studentMapper.getStudentNumbers(offset,pageSize);
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

        Long total= 100L;
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
        Long total= 100L;
        return new PageResult(total, list);
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
    public PageResult getProgrammingCapabilities(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<ProgrammingCapabilitiesVO> list = studentMapper.getProgrammingCapabilities(offset,pageSize);
        Long total= 100L;
        return new PageResult(total, list);
    }

    /**
     * 查询学生的学科竞赛
     * @return
     */
    @Override
    public PageResult getSubjectCompetition(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<SubjectCompetitionVO> list = studentMapper.getSubjectCompetition(offset,pageSize);
        Long total= 100L;
        return new PageResult(total, list);
    }

    /**
     * 查询所有学生的论文情况
     * @return
     */
    @Override
    public PageResult getPaperInformation(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<PaperVO> list = studentMapper.getPaperInformation(offset,pageSize);
        Long total= 100L;
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生参加项目的情况
     * @return
     */
    @Override
    public PageResult getParticipateProject(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List<ParticipateProjectVO> list = studentMapper.getParticipateProject(offset,pageSize);
        Long total= 100L;
        return new PageResult(total, list);
    }

    /**
     * 获取所有学生成绩信息，将来更改为分页查询
     *
     * @return
     */
    @Override
    public PageResult getAllScore(Integer page, Integer pageSize) {
        Integer offset =(page-1)*pageSize;
        List list=studentMapper.getAllScore(offset,pageSize);
        Long total=studentMapper.getScoreCount();
        return new PageResult(total, list);
    }




}
