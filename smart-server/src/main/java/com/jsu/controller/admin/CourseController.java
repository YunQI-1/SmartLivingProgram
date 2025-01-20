package com.jsu.controller.admin;

import com.jsu.dto.PageDTO;
import com.jsu.query.PageQuery;
import com.jsu.result.Result;
import com.jsu.service.CourseService;
import com.jsu.vo.CourseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})

@RequestMapping("/admin")
public class CourseController {


    @Autowired
    private CourseService courseService;

    @RequestMapping("/getCourses")
    public Result<PageDTO<CourseVO>> getCourses(PageQuery pageQuery){
        log.info("管理端查询课表信息");
        return Result.success(courseService.getCourses(pageQuery));
    }
}
