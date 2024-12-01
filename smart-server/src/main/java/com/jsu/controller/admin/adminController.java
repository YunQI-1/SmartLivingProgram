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
    @GetMapping("/getStudentInformation")
    public Result<PageResult> getStudentInformation(){
        log.info("管理端查询所有学生基本信息");
        return Result.success(adminService.getStudentInformation());
    }

}
