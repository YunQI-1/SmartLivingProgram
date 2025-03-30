package com.jsu.old.controller;

import com.jsu.dto.*;
import com.jsu.old.service.AdminService;
import com.jsu.old.service.StudentInformationService;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;

import com.jsu.vo.StudentInformationVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class StudentInformationController {

    @Autowired
    private AdminService adminService;


    @Autowired
    private StudentInformationService studentInformationService;

    /**
     * 管理端查找学生的基本信息
     * @return
     */
    @GetMapping("/getStudentInformation")
    public Result<PageDTO<StudentInformationVO>> getStudentInformation(PageQuery pageQuery){
        log.info("管理端查询所有学生信息数据"+pageQuery );
        return Result.success(studentInformationService.getStudentInformation(pageQuery));
    }

    /**
     * 查询学生详细信息
     */
    @PostMapping("/getStudentInformation/getStudentInformationDetail")
    public Result getStudentInformationDetail(@RequestBody QueryDTO queryDTO){
        log.info("管理端根据学生学号查询学生详细信息"+queryDTO);
        return Result.success(studentInformationService.getStudentInformationDetail(queryDTO));
    }


    /**
     * 新增学生信息
     * @param studentDTO
     * @return
     */
    @PostMapping("/admin/getStudentInformation/createStudentInformation")
    public Result createStudentInformation(@RequestBody StudentInformationDTO studentDTO){
        adminService.createStudentInformation(studentDTO);
        return Result.success();
    }

    /*

     修改功能

     */

    /**
     * 修改学生信息
     * @param studentDTO
     * @return
     */

    @PutMapping("/admin/getStudentInformation/updateStudentInformation")
    public Result updateStudentInformation(@RequestBody StudentInformationDTO studentDTO){
        log.info("修改单个学生信息");
        log.info("修改学生信息:{}",studentDTO);
        adminService.updateStudentInformation(studentDTO);
        return Result.success();
    }

    /**
     * 删除单个学生信息
     *
     * @param studentNumber
     * @return
     */
    @DeleteMapping("/admin/deleteStudentInformation")
    public Result deleteStudentInformation(@RequestParam String studentNumber){
        log.info("删除单个学生信息");
        adminService.deleteStudentInformation(studentNumber);
        return Result.success();
    }

    /**
     * 导入学生信息表
     * @param file
     * @return
     * @throws Exception
     */

    @PostMapping("/importStudentInformation")
    public Result importStudentInformation(@RequestParam("file") MultipartFile file) throws Exception {
        log.info("导入学生基本信息表");
        studentInformationService.importStudentInformation(file);
        return Result.success();
    }

    /**
     * 导出学生信息表
     * @param response
     * @param exportConfigDTO
     * @return
     */
    @PostMapping("/exportStudentInformation")
    public Result exportStudentInformation(HttpServletResponse response, @RequestBody ExportConfigDTO<StudentInformationDTO> exportConfigDTO){
        studentInformationService.exportStudentInformation(response,exportConfigDTO);
        return Result.success();
    }
}
