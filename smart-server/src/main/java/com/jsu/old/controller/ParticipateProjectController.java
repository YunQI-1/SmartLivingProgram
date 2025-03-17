package com.jsu.old.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jsu.dto.ExportConfigDTO;
import com.jsu.dto.PageDTO;
import com.jsu.dto.QueryDTO;
import com.jsu.entity.ParticipateProject;
import com.jsu.old.service.ParticipateProjectService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.ParticipateProjectVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/admin")
@Slf4j
@CrossOrigin(origins = "*")
public class ParticipateProjectController {



    @Autowired
    private ParticipateProjectService participateProjectService;

    /**
     * 获取所有学生的参加项目的情况
     * @return
     */
    @GetMapping("/getAcademicPerformance/getParticipateProject")
    public Result<PageDTO<ParticipateProjectVO>> getParticipateProject(PageQuery pageQuery){
        log.info("管理端查询学生参加项目的情况");
        return Result.success(participateProjectService.getParticipateProject(pageQuery));
    }

    /**
     * 获取学生参加项目的详细信息
     */
    @PostMapping("/getAcademicPerformance/getParticipateProjectDetail")
    public Result getParticipateProjectDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端根据学生学号和项目名称查询学生参加项目的详细信息");
        return Result.success(participateProjectService.getParticipateProjectDetail(queryDTO));
    }
    /**
     * 新增学生参加项目
     */
    @PostMapping("/getAcademicPerformance/createParticipateProject")
    public Result createParticipateProject(@RequestBody ParticipateProject participateProject){
        log.info("管理端新增学生参加项目");
        participateProjectService.save(participateProject);
        return Result.success();
    }

    /**
     * 修改学生参加项目情况
     */
    @PutMapping("/getAcademicPerformance/updateParticipateProject")
    public Result updateParticipateProject(@RequestBody ParticipateProject participateProject){
        log.info("管理端修改学生参加项目");
        participateProjectService.updateByStudentNumberAndProjectName(participateProject);
        return Result.success();
    }

    /**
     * 删除学生参加项目
     */
    @DeleteMapping("/getAcademicPerformance/deleteParticipateProject")
    public Result deleteParticipateProject(@RequestParam String studentNumber,@RequestParam String projectName){
        log.info("管理端删除学生参加项目");
        participateProjectService.remove(new QueryWrapper<ParticipateProject>().eq("student_number",studentNumber).eq("project_name",projectName));
        return Result.success();
    }

    /**
     * 导入学习参加项目信息
     */
    @PostMapping("/getAcademicPerformance/importParticipateProject")
    public Result importParticipateProject(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("管理端导入学生参加项目信息");
        participateProjectService.importParticipateProject(file);
        return Result.success("导入成功");
    }

    /**
     * 导出学生参加项目信息
     */
    @PostMapping("/getAcademicPerformance/exportParticipateProject")
    public Result exportParticipateProject(HttpServletResponse response, @RequestBody ExportConfigDTO<ParticipateProject> exportConfigDTO){
        participateProjectService.exportParticipateProject(response,exportConfigDTO);
        return Result.success();
    }

}
