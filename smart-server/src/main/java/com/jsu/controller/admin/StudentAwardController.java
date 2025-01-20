package com.jsu.controller.admin;


import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.PageResult;
import com.jsu.result.Result;
import com.jsu.service.StudentAwardService;
import com.jsu.vo.StudentAwardVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/admin")
public class StudentAwardController {

    @Autowired
    private StudentAwardService studentAwardService;

    /**
     * 管理端查找学生的荣誉信息
     * @return
     */
    @GetMapping("/getAcademicPerformance/getStudentAward")
    public Result<PageDTO<StudentAwardVO>> getStudentAward(PageQuery pageQuery){
        log.info("管理端查询所有学生的荣誉情况");
        return Result.success(studentAwardService.getStudentAward(pageQuery));
    }
}
