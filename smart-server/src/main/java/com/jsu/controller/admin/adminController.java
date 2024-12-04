package com.jsu.controller.admin;

import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.adminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping
public class adminController {
    @Autowired
    adminService adminService;
    /**
     * 获取所有学生基本信息
     *
     * */
    @GetMapping("/admin/getStudentInformation")
    public Result<PageResult> getStudentInformation(){
        log.info("管理端查询所有学生基本信息");
        return Result.success(adminService.getStudentInformation());
    }

    /**
     * 获取所有课程信息
     */
    @GetMapping("admin/getCourses")
    public Result getCourses(){
        log.info("管理端查询所有课程信息");
        return Result.success(adminService.getCourses());
    }

    //TODO:学习成绩分配后面写
    @GetMapping("admin/getStudentsGrade")
    public Result getStudentsGrade(){
        log.info("管理端查询所有学生成绩");
        return Result.success(1);
    }


    /**
     * 获取所有学生的学业情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance")
    public Result getAcademicPerformance(){
        log.info("管理端查看所有学生的学业新情况");
        return Result.success(adminService.getAcademicPerformance());
    }


    /**
     * 获取所有学生英语等级水平
     *
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getEnglishLevel")
    public Result getEnglishLevel(){
        log.info("管理端查询所有学生的英语水平");
        return Result.success(adminService.getEnglishLevel());
    }

    /**
     * 获取所有学生的职业资格情况
     *
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getProfessionalQualifications")
    public Result getProfessionalQualifications(){
        log.info("管理端查看所有学生的职业资格");
        return Result.success(adminService.getProfessionalQualifications());
    }


    /**
     * 查询所有学生的软件开发能力
     */
    @GetMapping("/admin/getAcademicPerformance/getSoftwareDevelopmentCapability")
    public Result getSoftwareDevelopmentCapability(){
        log.info("管理端查询所有学生的软件开发能力");
        return Result.success(adminService.getSoftwareDevelopmentCapability());
    }

    /**
     * 查询所有学生的编程能力* @return
     *
     */
    @GetMapping("/admin/getAcademicPerformance/getProgrammingCapabilities")
    public Result getProgrammingCapabilities(){
        log.info("管理端查询所有学生的编程能力");
        return Result.success(adminService.getProgrammingCapabilities());

    }

    /**
     * 查询所有学生的学科竞赛
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getSubjectCompetition")
    public Result getSubjectCompetition(){
        log.info("管理端查询所有学生的学科竞赛");
        return Result.success(adminService.getSubjectCompetition());
    }


    /**
     * 获取所有学生的论文情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getPaperInformation")
    public Result getPaperInformation(){
        log.info("管理端查询学生论文情况");
        return Result.success(adminService.getPaperInformation());
    }

    /**
     * 获取所有学生的参加项目的情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getParticipateProject")
    public Result getParticipateProject(){
        log.info("管理端查询学生参加项目的情况");
        return Result.success(adminService.getParticipateProject());
    }
}