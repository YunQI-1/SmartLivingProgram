package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.dto.StudentDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.AdminService;
import com.jsu.service.StudentInformationService;
import com.jsu.vo.StudentAwardVO;
import com.jsu.vo.StudentInformationVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        log.info("管理端查询所有学生信息数据");
        return Result.success(studentInformationService.getStudentInformation(pageQuery));
    }


    /**
     * 新增学生信息
     * @param studentDTO
     * @return
     */
    @PostMapping("/admin/getStudentInformation/createStudentInformation")
    public Result createStudentInformation(@RequestBody StudentDTO studentDTO){
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
    public Result updateStudentInformation(@RequestBody StudentDTO studentDTO){
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

}
