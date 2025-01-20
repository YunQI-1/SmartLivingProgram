package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.entity.StudentInformation;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.StudentInformationService;
import com.jsu.vo.StudentAwardVO;
import com.jsu.vo.StudentInformationVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class StudentInformationController {


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
}
