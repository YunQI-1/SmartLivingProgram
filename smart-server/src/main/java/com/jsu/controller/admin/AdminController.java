package com.jsu.controller.admin;

import com.jsu.dto.StudentDTO;
import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class AdminController {
    @Autowired
    AdminService adminService;


    /*

     增加功能

     */

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
     * 修改单个学生信息
     *
     * @return
     */

    @PutMapping("/admin/getStudentInformation/updateStudentInformation")
     public Result updateStudentInformation(@RequestBody StudentDTO studentDTO){
         log.info("修改单个学生信息");
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