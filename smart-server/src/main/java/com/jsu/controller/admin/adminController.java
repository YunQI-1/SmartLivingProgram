package com.jsu.controller.admin;

import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.adminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
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
     * 分页查询所有学生基本信息
     *
     * @return
     */
    @GetMapping("/admin/getStudentInformationByPage")
    public Result<PageResult> getStudentInformationByPage(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端分页查询所有学生基本信息");
        return Result.success(adminService.getStudentInformationByPage(page,pageSize));
    }
    /**
     *
     * 获取所有课程信息
     */
//    @GetMapping("/admin/getCourses")
//    public Result<PageResult> getCourses(@RequestParam Integer page, @RequestParam Integer pageSize){
//        log.info("管理端查询所有课程信息");
//        return Result.success(adminService.getCourses(page,pageSize));
//    }

    @GetMapping("/admin/getCourses")
    public Result<PageResult> getCourses(){
        log.info("管理端查询所有课程信息");
        return Result.success(adminService.getCourses(1,1));
    }

    /**
     * 获取学生成绩，其中的课程信息，通过用获取课程信息的接口获取课程信息，然后根据成绩实体类里的课程编号映射
     *
     * @return
     */
    @GetMapping("/admin/getStudentsGrade")
    public Result<PageResult> getStudentsGrade(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端分页查询所有学生成绩");
        return Result.success(adminService.getAllScore(page,pageSize));
    }

    /**
     * 管理端查询所有学生的学科竞赛
     */
    @GetMapping("/admin/getAcademicCompetition")
    public Result<PageResult> getAcademicCompetition(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询所有学生的学科竞赛");
        return Result.success(adminService.getAcademicCompetition(page,pageSize));
    }


    /**
     * 获取所有学生的学业情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance")
    public Result<PageResult> getAcademicPerformance(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查看所有学生的学业新情况");
        return Result.success(adminService.getAcademicPerformance(page,pageSize));
    }


    /**
     * 获取所有学生英语等级水平
     *
     * @return
     */
    @GetMapping("/admin/getEnglishLevel")
    public Result getEnglishLevel(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询所有学生的英语水平");
        return Result.success(adminService.getEnglishLevel(page,pageSize));
    }

    /**
     * 获取所有学生的职业资格情况
     *
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getProfessionalQualifications")
    public Result getProfessionalQualifications(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查看所有学生的职业资格");
        return Result.success(adminService.getProfessionalQualifications(page,pageSize));
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
    public Result getProgrammingCapabilities(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询所有学生的编程能力");
        return Result.success(adminService.getProgrammingCapabilities(page,pageSize));

    }

    /**
     * 查询所有学生的学科竞赛
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getSubjectCompetition")
    public Result getSubjectCompetition(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询所有学生的学科竞赛");
        return Result.success(adminService.getSubjectCompetition(page,pageSize));
    }


    /**
     * 获取所有学生的论文情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getPaperInformation")
    public Result getPaperInformation(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询学生论文情况");
        return Result.success(adminService.getPaperInformation(page,pageSize));
    }

    /**
     * 获取所有学生的参加项目的情况
     * @return
     */
    @GetMapping("/admin/getAcademicPerformance/getParticipateProject")
    public Result getParticipateProject(@RequestParam Integer page, @RequestParam Integer pageSize){
        log.info("管理端查询学生参加项目的情况");
        return Result.success(adminService.getParticipateProject(page,pageSize));
    }

}